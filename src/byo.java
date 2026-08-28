import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class byo {
   private final Map<jf<byk>, byl> a;

   byo(Map<jf<byk>, byl> $$0) {
      this.a = $$0;
   }

   private byl d(jf<byk> $$0) {
      byl $$1 = this.a.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("Can't find attribute " + $$0.g());
      } else {
         return $$1;
      }
   }

   public double a(jf<byk> $$0) {
      return this.d($$0).g();
   }

   public double b(jf<byk> $$0) {
      return this.d($$0).b();
   }

   public double a(jf<byk> $$0, alg $$1) {
      byn $$2 = this.d($$0).a($$1);
      if ($$2 == null) {
         throw new IllegalArgumentException("Can't find modifier " + $$1 + " on attribute " + $$0.g());
      } else {
         return $$2.b();
      }
   }

   @Nullable
   public byl a(Consumer<byl> $$0, jf<byk> $$1) {
      byl $$2 = this.a.get($$1);
      if ($$2 == null) {
         return null;
      } else {
         byl $$3 = new byl($$1, $$0);
         $$3.a($$2);
         return $$3;
      }
   }

   public static byo.a a() {
      return new byo.a();
   }

   public boolean c(jf<byk> $$0) {
      return this.a.containsKey($$0);
   }

   public boolean b(jf<byk> $$0, alg $$1) {
      byl $$2 = this.a.get($$0);
      return $$2 != null && $$2.a($$1) != null;
   }

   public static class a {
      private final Builder<jf<byk>, byl> a = ImmutableMap.builder();
      private boolean b;

      private byl b(jf<byk> $$0) {
         byl $$1 = new byl($$0, $$1x -> {
            if (this.b) {
               throw new UnsupportedOperationException("Tried to change value for default attribute instance: " + $$0.g());
            }
         });
         this.a.put($$0, $$1);
         return $$1;
      }

      public byo.a a(jf<byk> $$0) {
         this.b($$0);
         return this;
      }

      public byo.a a(jf<byk> $$0, double $$1) {
         byl $$2 = this.b($$0);
         $$2.a($$1);
         return this;
      }

      public byo a() {
         this.b = true;
         return new byo(this.a.buildKeepingLast());
      }
   }
}
