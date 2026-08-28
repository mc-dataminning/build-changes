import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class bux {
   private final Map<ji<but>, buu> a;

   bux(Map<ji<but>, buu> $$0) {
      this.a = $$0;
   }

   private buu d(ji<but> $$0) {
      buu $$1 = this.a.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("Can't find attribute " + $$0.g());
      } else {
         return $$1;
      }
   }

   public double a(ji<but> $$0) {
      return this.d($$0).f();
   }

   public double b(ji<but> $$0) {
      return this.d($$0).b();
   }

   public double a(ji<but> $$0, UUID $$1) {
      buw $$2 = this.d($$0).a($$1);
      if ($$2 == null) {
         throw new IllegalArgumentException("Can't find modifier " + $$1 + " on attribute " + $$0.g());
      } else {
         return $$2.d();
      }
   }

   @Nullable
   public buu a(Consumer<buu> $$0, ji<but> $$1) {
      buu $$2 = this.a.get($$1);
      if ($$2 == null) {
         return null;
      } else {
         buu $$3 = new buu($$1, $$0);
         $$3.a($$2);
         return $$3;
      }
   }

   public static bux.a a() {
      return new bux.a();
   }

   public boolean c(ji<but> $$0) {
      return this.a.containsKey($$0);
   }

   public boolean b(ji<but> $$0, UUID $$1) {
      buu $$2 = this.a.get($$0);
      return $$2 != null && $$2.a($$1) != null;
   }

   public static class a {
      private final Builder<ji<but>, buu> a = ImmutableMap.builder();
      private boolean b;

      private buu b(ji<but> $$0) {
         buu $$1 = new buu($$0, $$1x -> {
            if (this.b) {
               throw new UnsupportedOperationException("Tried to change value for default attribute instance: " + $$0.g());
            }
         });
         this.a.put($$0, $$1);
         return $$1;
      }

      public bux.a a(ji<but> $$0) {
         this.b($$0);
         return this;
      }

      public bux.a a(ji<but> $$0, double $$1) {
         buu $$2 = this.b($$0);
         $$2.a($$1);
         return this;
      }

      public bux a() {
         this.b = true;
         return new bux(this.a.buildKeepingLast());
      }
   }
}
