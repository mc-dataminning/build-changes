import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class buy {
   private final Map<ji<buu>, buv> a;

   buy(Map<ji<buu>, buv> $$0) {
      this.a = $$0;
   }

   private buv d(ji<buu> $$0) {
      buv $$1 = this.a.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("Can't find attribute " + $$0.g());
      } else {
         return $$1;
      }
   }

   public double a(ji<buu> $$0) {
      return this.d($$0).f();
   }

   public double b(ji<buu> $$0) {
      return this.d($$0).b();
   }

   public double a(ji<buu> $$0, UUID $$1) {
      bux $$2 = this.d($$0).a($$1);
      if ($$2 == null) {
         throw new IllegalArgumentException("Can't find modifier " + $$1 + " on attribute " + $$0.g());
      } else {
         return $$2.d();
      }
   }

   @Nullable
   public buv a(Consumer<buv> $$0, ji<buu> $$1) {
      buv $$2 = this.a.get($$1);
      if ($$2 == null) {
         return null;
      } else {
         buv $$3 = new buv($$1, $$0);
         $$3.a($$2);
         return $$3;
      }
   }

   public static buy.a a() {
      return new buy.a();
   }

   public boolean c(ji<buu> $$0) {
      return this.a.containsKey($$0);
   }

   public boolean b(ji<buu> $$0, UUID $$1) {
      buv $$2 = this.a.get($$0);
      return $$2 != null && $$2.a($$1) != null;
   }

   public static class a {
      private final Builder<ji<buu>, buv> a = ImmutableMap.builder();
      private boolean b;

      private buv b(ji<buu> $$0) {
         buv $$1 = new buv($$0, $$1x -> {
            if (this.b) {
               throw new UnsupportedOperationException("Tried to change value for default attribute instance: " + $$0.g());
            }
         });
         this.a.put($$0, $$1);
         return $$1;
      }

      public buy.a a(ji<buu> $$0) {
         this.b($$0);
         return this;
      }

      public buy.a a(ji<buu> $$0, double $$1) {
         buv $$2 = this.b($$0);
         $$2.a($$1);
         return this;
      }

      public buy a() {
         this.b = true;
         return new buy(this.a.buildKeepingLast());
      }
   }
}
