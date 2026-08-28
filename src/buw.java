import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class buw {
   private final Map<ji<bus>, but> a;

   buw(Map<ji<bus>, but> $$0) {
      this.a = $$0;
   }

   private but d(ji<bus> $$0) {
      but $$1 = this.a.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("Can't find attribute " + $$0.g());
      } else {
         return $$1;
      }
   }

   public double a(ji<bus> $$0) {
      return this.d($$0).f();
   }

   public double b(ji<bus> $$0) {
      return this.d($$0).b();
   }

   public double a(ji<bus> $$0, UUID $$1) {
      buv $$2 = this.d($$0).a($$1);
      if ($$2 == null) {
         throw new IllegalArgumentException("Can't find modifier " + $$1 + " on attribute " + $$0.g());
      } else {
         return $$2.d();
      }
   }

   @Nullable
   public but a(Consumer<but> $$0, ji<bus> $$1) {
      but $$2 = this.a.get($$1);
      if ($$2 == null) {
         return null;
      } else {
         but $$3 = new but($$1, $$0);
         $$3.a($$2);
         return $$3;
      }
   }

   public static buw.a a() {
      return new buw.a();
   }

   public boolean c(ji<bus> $$0) {
      return this.a.containsKey($$0);
   }

   public boolean b(ji<bus> $$0, UUID $$1) {
      but $$2 = this.a.get($$0);
      return $$2 != null && $$2.a($$1) != null;
   }

   public static class a {
      private final Builder<ji<bus>, but> a = ImmutableMap.builder();
      private boolean b;

      private but b(ji<bus> $$0) {
         but $$1 = new but($$0, $$1x -> {
            if (this.b) {
               throw new UnsupportedOperationException("Tried to change value for default attribute instance: " + $$0.g());
            }
         });
         this.a.put($$0, $$1);
         return $$1;
      }

      public buw.a a(ji<bus> $$0) {
         this.b($$0);
         return this;
      }

      public buw.a a(ji<bus> $$0, double $$1) {
         but $$2 = this.b($$0);
         $$2.a($$1);
         return this;
      }

      public buw a() {
         this.b = true;
         return new buw(this.a.buildKeepingLast());
      }
   }
}
