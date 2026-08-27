import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class btv {
   private final Map<ix<btr>, bts> a;

   btv(Map<ix<btr>, bts> $$0) {
      this.a = $$0;
   }

   private bts d(ix<btr> $$0) {
      bts $$1 = this.a.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("Can't find attribute " + $$0.g());
      } else {
         return $$1;
      }
   }

   public double a(ix<btr> $$0) {
      return this.d($$0).f();
   }

   public double b(ix<btr> $$0) {
      return this.d($$0).b();
   }

   public double a(ix<btr> $$0, UUID $$1) {
      btu $$2 = this.d($$0).a($$1);
      if ($$2 == null) {
         throw new IllegalArgumentException("Can't find modifier " + $$1 + " on attribute " + $$0.g());
      } else {
         return $$2.d();
      }
   }

   @Nullable
   public bts a(Consumer<bts> $$0, ix<btr> $$1) {
      bts $$2 = this.a.get($$1);
      if ($$2 == null) {
         return null;
      } else {
         bts $$3 = new bts($$1, $$0);
         $$3.a($$2);
         return $$3;
      }
   }

   public static btv.a a() {
      return new btv.a();
   }

   public boolean c(ix<btr> $$0) {
      return this.a.containsKey($$0);
   }

   public boolean b(ix<btr> $$0, UUID $$1) {
      bts $$2 = this.a.get($$0);
      return $$2 != null && $$2.a($$1) != null;
   }

   public static class a {
      private final Builder<ix<btr>, bts> a = ImmutableMap.builder();
      private boolean b;

      private bts b(ix<btr> $$0) {
         bts $$1 = new bts($$0, $$1x -> {
            if (this.b) {
               throw new UnsupportedOperationException("Tried to change value for default attribute instance: " + $$0.g());
            }
         });
         this.a.put($$0, $$1);
         return $$1;
      }

      public btv.a a(ix<btr> $$0) {
         this.b($$0);
         return this;
      }

      public btv.a a(ix<btr> $$0, double $$1) {
         bts $$2 = this.b($$0);
         $$2.a($$1);
         return this;
      }

      public btv a() {
         this.b = true;
         return new btv(this.a.buildKeepingLast());
      }
   }
}
