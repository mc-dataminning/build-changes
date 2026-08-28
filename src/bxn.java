import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class bxn {
   private final Map<jq<bxj>, bxk> a;

   bxn(Map<jq<bxj>, bxk> $$0) {
      this.a = $$0;
   }

   private bxk d(jq<bxj> $$0) {
      bxk $$1 = this.a.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("Can't find attribute " + $$0.g());
      } else {
         return $$1;
      }
   }

   public double a(jq<bxj> $$0) {
      return this.d($$0).g();
   }

   public double b(jq<bxj> $$0) {
      return this.d($$0).b();
   }

   public double a(jq<bxj> $$0, alz $$1) {
      bxm $$2 = this.d($$0).a($$1);
      if ($$2 == null) {
         throw new IllegalArgumentException("Can't find modifier " + $$1 + " on attribute " + $$0.g());
      } else {
         return $$2.c();
      }
   }

   @Nullable
   public bxk a(Consumer<bxk> $$0, jq<bxj> $$1) {
      bxk $$2 = this.a.get($$1);
      if ($$2 == null) {
         return null;
      } else {
         bxk $$3 = new bxk($$1, $$0);
         $$3.a($$2);
         return $$3;
      }
   }

   public static bxn.a a() {
      return new bxn.a();
   }

   public boolean c(jq<bxj> $$0) {
      return this.a.containsKey($$0);
   }

   public boolean b(jq<bxj> $$0, alz $$1) {
      bxk $$2 = this.a.get($$0);
      return $$2 != null && $$2.a($$1) != null;
   }

   public static class a {
      private final Builder<jq<bxj>, bxk> a = ImmutableMap.builder();
      private boolean b;

      private bxk b(jq<bxj> $$0) {
         bxk $$1 = new bxk($$0, $$1x -> {
            if (this.b) {
               throw new UnsupportedOperationException("Tried to change value for default attribute instance: " + $$0.g());
            }
         });
         this.a.put($$0, $$1);
         return $$1;
      }

      public bxn.a a(jq<bxj> $$0) {
         this.b($$0);
         return this;
      }

      public bxn.a a(jq<bxj> $$0, double $$1) {
         bxk $$2 = this.b($$0);
         $$2.a($$1);
         return this;
      }

      public bxn a() {
         this.b = true;
         return new bxn(this.a.buildKeepingLast());
      }
   }
}
