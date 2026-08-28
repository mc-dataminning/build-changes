import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class bvq {
   private final Map<jn<bvm>, bvn> a;

   bvq(Map<jn<bvm>, bvn> $$0) {
      this.a = $$0;
   }

   private bvn d(jn<bvm> $$0) {
      bvn $$1 = this.a.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("Can't find attribute " + $$0.g());
      } else {
         return $$1;
      }
   }

   public double a(jn<bvm> $$0) {
      return this.d($$0).g();
   }

   public double b(jn<bvm> $$0) {
      return this.d($$0).b();
   }

   public double a(jn<bvm> $$0, alc $$1) {
      bvp $$2 = this.d($$0).a($$1);
      if ($$2 == null) {
         throw new IllegalArgumentException("Can't find modifier " + $$1 + " on attribute " + $$0.g());
      } else {
         return $$2.c();
      }
   }

   @Nullable
   public bvn a(Consumer<bvn> $$0, jn<bvm> $$1) {
      bvn $$2 = this.a.get($$1);
      if ($$2 == null) {
         return null;
      } else {
         bvn $$3 = new bvn($$1, $$0);
         $$3.a($$2);
         return $$3;
      }
   }

   public static bvq.a a() {
      return new bvq.a();
   }

   public boolean c(jn<bvm> $$0) {
      return this.a.containsKey($$0);
   }

   public boolean b(jn<bvm> $$0, alc $$1) {
      bvn $$2 = this.a.get($$0);
      return $$2 != null && $$2.a($$1) != null;
   }

   public static class a {
      private final Builder<jn<bvm>, bvn> a = ImmutableMap.builder();
      private boolean b;

      private bvn b(jn<bvm> $$0) {
         bvn $$1 = new bvn($$0, $$1x -> {
            if (this.b) {
               throw new UnsupportedOperationException("Tried to change value for default attribute instance: " + $$0.g());
            }
         });
         this.a.put($$0, $$1);
         return $$1;
      }

      public bvq.a a(jn<bvm> $$0) {
         this.b($$0);
         return this;
      }

      public bvq.a a(jn<bvm> $$0, double $$1) {
         bvn $$2 = this.b($$0);
         $$2.a($$1);
         return this;
      }

      public bvq a() {
         this.b = true;
         return new bvq(this.a.buildKeepingLast());
      }
   }
}
