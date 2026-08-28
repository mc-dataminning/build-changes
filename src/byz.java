import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class byz {
   private final Map<jf<byv>, byw> a;

   byz(Map<jf<byv>, byw> $$0) {
      this.a = $$0;
   }

   private byw d(jf<byv> $$0) {
      byw $$1 = this.a.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("Can't find attribute " + $$0.g());
      } else {
         return $$1;
      }
   }

   public double a(jf<byv> $$0) {
      return this.d($$0).g();
   }

   public double b(jf<byv> $$0) {
      return this.d($$0).b();
   }

   public double a(jf<byv> $$0, ali $$1) {
      byy $$2 = this.d($$0).a($$1);
      if ($$2 == null) {
         throw new IllegalArgumentException("Can't find modifier " + $$1 + " on attribute " + $$0.g());
      } else {
         return $$2.b();
      }
   }

   @Nullable
   public byw a(Consumer<byw> $$0, jf<byv> $$1) {
      byw $$2 = this.a.get($$1);
      if ($$2 == null) {
         return null;
      } else {
         byw $$3 = new byw($$1, $$0);
         $$3.a($$2);
         return $$3;
      }
   }

   public static byz.a a() {
      return new byz.a();
   }

   public boolean c(jf<byv> $$0) {
      return this.a.containsKey($$0);
   }

   public boolean b(jf<byv> $$0, ali $$1) {
      byw $$2 = this.a.get($$0);
      return $$2 != null && $$2.a($$1) != null;
   }

   public static class a {
      private final Builder<jf<byv>, byw> a = ImmutableMap.builder();
      private boolean b;

      private byw b(jf<byv> $$0) {
         byw $$1 = new byw($$0, $$1x -> {
            if (this.b) {
               throw new UnsupportedOperationException("Tried to change value for default attribute instance: " + $$0.g());
            }
         });
         this.a.put($$0, $$1);
         return $$1;
      }

      public byz.a a(jf<byv> $$0) {
         this.b($$0);
         return this;
      }

      public byz.a a(jf<byv> $$0, double $$1) {
         byw $$2 = this.b($$0);
         $$2.a($$1);
         return this;
      }

      public byz a() {
         this.b = true;
         return new byz(this.a.buildKeepingLast());
      }
   }
}
