import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class byh {
   private final Map<je<byd>, bye> a;

   byh(Map<je<byd>, bye> $$0) {
      this.a = $$0;
   }

   private bye d(je<byd> $$0) {
      bye $$1 = this.a.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("Can't find attribute " + $$0.g());
      } else {
         return $$1;
      }
   }

   public double a(je<byd> $$0) {
      return this.d($$0).g();
   }

   public double b(je<byd> $$0) {
      return this.d($$0).b();
   }

   public double a(je<byd> $$0, alg $$1) {
      byg $$2 = this.d($$0).a($$1);
      if ($$2 == null) {
         throw new IllegalArgumentException("Can't find modifier " + $$1 + " on attribute " + $$0.g());
      } else {
         return $$2.b();
      }
   }

   @Nullable
   public bye a(Consumer<bye> $$0, je<byd> $$1) {
      bye $$2 = this.a.get($$1);
      if ($$2 == null) {
         return null;
      } else {
         bye $$3 = new bye($$1, $$0);
         $$3.a($$2);
         return $$3;
      }
   }

   public static byh.a a() {
      return new byh.a();
   }

   public boolean c(je<byd> $$0) {
      return this.a.containsKey($$0);
   }

   public boolean b(je<byd> $$0, alg $$1) {
      bye $$2 = this.a.get($$0);
      return $$2 != null && $$2.a($$1) != null;
   }

   public static class a {
      private final Builder<je<byd>, bye> a = ImmutableMap.builder();
      private boolean b;

      private bye b(je<byd> $$0) {
         bye $$1 = new bye($$0, $$1x -> {
            if (this.b) {
               throw new UnsupportedOperationException("Tried to change value for default attribute instance: " + $$0.g());
            }
         });
         this.a.put($$0, $$1);
         return $$1;
      }

      public byh.a a(je<byd> $$0) {
         this.b($$0);
         return this;
      }

      public byh.a a(je<byd> $$0, double $$1) {
         bye $$2 = this.b($$0);
         $$2.a($$1);
         return this;
      }

      public byh a() {
         this.b = true;
         return new byh(this.a.buildKeepingLast());
      }
   }
}
