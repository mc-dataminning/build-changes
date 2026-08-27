import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class bnp {
   private final Map<bnl, bnm> a;

   public bnp(Map<bnl, bnm> $$0) {
      this.a = ImmutableMap.copyOf($$0);
   }

   private bnm d(bnl $$0) {
      bnm $$1 = this.a.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("Can't find attribute " + kd.u.b($$0));
      } else {
         return $$1;
      }
   }

   public double a(bnl $$0) {
      return this.d($$0).f();
   }

   public double b(bnl $$0) {
      return this.d($$0).b();
   }

   public double a(bnl $$0, UUID $$1) {
      bno $$2 = this.d($$0).a($$1);
      if ($$2 == null) {
         throw new IllegalArgumentException("Can't find modifier " + $$1 + " on attribute " + kd.u.b($$0));
      } else {
         return $$2.c();
      }
   }

   @Nullable
   public bnm a(Consumer<bnm> $$0, bnl $$1) {
      bnm $$2 = this.a.get($$1);
      if ($$2 == null) {
         return null;
      } else {
         bnm $$3 = new bnm($$1, $$0);
         $$3.a($$2);
         return $$3;
      }
   }

   public static bnp.a a() {
      return new bnp.a();
   }

   public boolean c(bnl $$0) {
      return this.a.containsKey($$0);
   }

   public boolean b(bnl $$0, UUID $$1) {
      bnm $$2 = this.a.get($$0);
      return $$2 != null && $$2.a($$1) != null;
   }

   public static class a {
      private final Map<bnl, bnm> a = Maps.newHashMap();
      private boolean b;

      private bnm b(bnl $$0) {
         bnm $$1 = new bnm($$0, $$1x -> {
            if (this.b) {
               throw new UnsupportedOperationException("Tried to change value for default attribute instance: " + kd.u.b($$0));
            }
         });
         this.a.put($$0, $$1);
         return $$1;
      }

      public bnp.a a(bnl $$0) {
         this.b($$0);
         return this;
      }

      public bnp.a a(bnl $$0, double $$1) {
         bnm $$2 = this.b($$0);
         $$2.a($$1);
         return this;
      }

      public bnp a() {
         this.b = true;
         return new bnp(this.a);
      }
   }
}
