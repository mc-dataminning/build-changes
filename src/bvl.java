import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class bvl {
   private final Map<jn<bvh>, bvi> a;

   bvl(Map<jn<bvh>, bvi> $$0) {
      this.a = $$0;
   }

   private bvi d(jn<bvh> $$0) {
      bvi $$1 = this.a.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("Can't find attribute " + $$0.g());
      } else {
         return $$1;
      }
   }

   public double a(jn<bvh> $$0) {
      return this.d($$0).g();
   }

   public double b(jn<bvh> $$0) {
      return this.d($$0).b();
   }

   public double a(jn<bvh> $$0, alb $$1) {
      bvk $$2 = this.d($$0).a($$1);
      if ($$2 == null) {
         throw new IllegalArgumentException("Can't find modifier " + $$1 + " on attribute " + $$0.g());
      } else {
         return $$2.c();
      }
   }

   @Nullable
   public bvi a(Consumer<bvi> $$0, jn<bvh> $$1) {
      bvi $$2 = this.a.get($$1);
      if ($$2 == null) {
         return null;
      } else {
         bvi $$3 = new bvi($$1, $$0);
         $$3.a($$2);
         return $$3;
      }
   }

   public static bvl.a a() {
      return new bvl.a();
   }

   public boolean c(jn<bvh> $$0) {
      return this.a.containsKey($$0);
   }

   public boolean b(jn<bvh> $$0, alb $$1) {
      bvi $$2 = this.a.get($$0);
      return $$2 != null && $$2.a($$1) != null;
   }

   public static class a {
      private final Builder<jn<bvh>, bvi> a = ImmutableMap.builder();
      private boolean b;

      private bvi b(jn<bvh> $$0) {
         bvi $$1 = new bvi($$0, $$1x -> {
            if (this.b) {
               throw new UnsupportedOperationException("Tried to change value for default attribute instance: " + $$0.g());
            }
         });
         this.a.put($$0, $$1);
         return $$1;
      }

      public bvl.a a(jn<bvh> $$0) {
         this.b($$0);
         return this;
      }

      public bvl.a a(jn<bvh> $$0, double $$1) {
         bvi $$2 = this.b($$0);
         $$2.a($$1);
         return this;
      }

      public bvl a() {
         this.b = true;
         return new bvl(this.a.buildKeepingLast());
      }
   }
}
