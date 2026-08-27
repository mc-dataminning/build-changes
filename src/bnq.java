import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class bnq {
   private final Map<bnm, bnn> a;

   public bnq(Map<bnm, bnn> $$0) {
      this.a = ImmutableMap.copyOf($$0);
   }

   private bnn d(bnm $$0) {
      bnn $$1 = this.a.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("Can't find attribute " + kd.u.b($$0));
      } else {
         return $$1;
      }
   }

   public double a(bnm $$0) {
      return this.d($$0).f();
   }

   public double b(bnm $$0) {
      return this.d($$0).b();
   }

   public double a(bnm $$0, UUID $$1) {
      bnp $$2 = this.d($$0).a($$1);
      if ($$2 == null) {
         throw new IllegalArgumentException("Can't find modifier " + $$1 + " on attribute " + kd.u.b($$0));
      } else {
         return $$2.c();
      }
   }

   @Nullable
   public bnn a(Consumer<bnn> $$0, bnm $$1) {
      bnn $$2 = this.a.get($$1);
      if ($$2 == null) {
         return null;
      } else {
         bnn $$3 = new bnn($$1, $$0);
         $$3.a($$2);
         return $$3;
      }
   }

   public static bnq.a a() {
      return new bnq.a();
   }

   public boolean c(bnm $$0) {
      return this.a.containsKey($$0);
   }

   public boolean b(bnm $$0, UUID $$1) {
      bnn $$2 = this.a.get($$0);
      return $$2 != null && $$2.a($$1) != null;
   }

   public static class a {
      private final Map<bnm, bnn> a = Maps.newHashMap();
      private boolean b;

      private bnn b(bnm $$0) {
         bnn $$1 = new bnn($$0, $$1x -> {
            if (this.b) {
               throw new UnsupportedOperationException("Tried to change value for default attribute instance: " + kd.u.b($$0));
            }
         });
         this.a.put($$0, $$1);
         return $$1;
      }

      public bnq.a a(bnm $$0) {
         this.b($$0);
         return this;
      }

      public bnq.a a(bnm $$0, double $$1) {
         bnn $$2 = this.b($$0);
         $$2.a($$1);
         return this;
      }

      public bnq a() {
         this.b = true;
         return new bnq(this.a);
      }
   }
}
