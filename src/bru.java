import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class bru {
   private final Map<il<brq>, brr> a;

   bru(Map<il<brq>, brr> $$0) {
      this.a = $$0;
   }

   private brr d(il<brq> $$0) {
      brr $$1 = this.a.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("Can't find attribute " + $$0.g());
      } else {
         return $$1;
      }
   }

   public double a(il<brq> $$0) {
      return this.d($$0).f();
   }

   public double b(il<brq> $$0) {
      return this.d($$0).b();
   }

   public double a(il<brq> $$0, UUID $$1) {
      brt $$2 = this.d($$0).a($$1);
      if ($$2 == null) {
         throw new IllegalArgumentException("Can't find modifier " + $$1 + " on attribute " + $$0.g());
      } else {
         return $$2.c();
      }
   }

   @Nullable
   public brr a(Consumer<brr> $$0, il<brq> $$1) {
      brr $$2 = this.a.get($$1);
      if ($$2 == null) {
         return null;
      } else {
         brr $$3 = new brr($$1, $$0);
         $$3.a($$2);
         return $$3;
      }
   }

   public static bru.a a() {
      return new bru.a();
   }

   public boolean c(il<brq> $$0) {
      return this.a.containsKey($$0);
   }

   public boolean b(il<brq> $$0, UUID $$1) {
      brr $$2 = this.a.get($$0);
      return $$2 != null && $$2.a($$1) != null;
   }

   public static class a {
      private final Builder<il<brq>, brr> a = ImmutableMap.builder();
      private boolean b;

      private brr b(il<brq> $$0) {
         brr $$1 = new brr($$0, $$1x -> {
            if (this.b) {
               throw new UnsupportedOperationException("Tried to change value for default attribute instance: " + $$0.g());
            }
         });
         this.a.put($$0, $$1);
         return $$1;
      }

      public bru.a a(il<brq> $$0) {
         this.b($$0);
         return this;
      }

      public bru.a a(il<brq> $$0, double $$1) {
         brr $$2 = this.b($$0);
         $$2.a($$1);
         return this;
      }

      public bru a() {
         this.b = true;
         return new bru(this.a.buildKeepingLast());
      }
   }
}
