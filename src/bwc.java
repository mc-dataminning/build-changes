import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class bwc {
   private final Map<jp<bvy>, bvz> a;

   bwc(Map<jp<bvy>, bvz> $$0) {
      this.a = $$0;
   }

   private bvz d(jp<bvy> $$0) {
      bvz $$1 = this.a.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("Can't find attribute " + $$0.g());
      } else {
         return $$1;
      }
   }

   public double a(jp<bvy> $$0) {
      return this.d($$0).g();
   }

   public double b(jp<bvy> $$0) {
      return this.d($$0).b();
   }

   public double a(jp<bvy> $$0, alh $$1) {
      bwb $$2 = this.d($$0).a($$1);
      if ($$2 == null) {
         throw new IllegalArgumentException("Can't find modifier " + $$1 + " on attribute " + $$0.g());
      } else {
         return $$2.c();
      }
   }

   @Nullable
   public bvz a(Consumer<bvz> $$0, jp<bvy> $$1) {
      bvz $$2 = this.a.get($$1);
      if ($$2 == null) {
         return null;
      } else {
         bvz $$3 = new bvz($$1, $$0);
         $$3.a($$2);
         return $$3;
      }
   }

   public static bwc.a a() {
      return new bwc.a();
   }

   public boolean c(jp<bvy> $$0) {
      return this.a.containsKey($$0);
   }

   public boolean b(jp<bvy> $$0, alh $$1) {
      bvz $$2 = this.a.get($$0);
      return $$2 != null && $$2.a($$1) != null;
   }

   public static class a {
      private final Builder<jp<bvy>, bvz> a = ImmutableMap.builder();
      private boolean b;

      private bvz b(jp<bvy> $$0) {
         bvz $$1 = new bvz($$0, $$1x -> {
            if (this.b) {
               throw new UnsupportedOperationException("Tried to change value for default attribute instance: " + $$0.g());
            }
         });
         this.a.put($$0, $$1);
         return $$1;
      }

      public bwc.a a(jp<bvy> $$0) {
         this.b($$0);
         return this;
      }

      public bwc.a a(jp<bvy> $$0, double $$1) {
         bvz $$2 = this.b($$0);
         $$2.a($$1);
         return this;
      }

      public bwc a() {
         this.b = true;
         return new bwc(this.a.buildKeepingLast());
      }
   }
}
