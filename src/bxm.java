import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class bxm {
   private final Map<jq<bxi>, bxj> a;

   bxm(Map<jq<bxi>, bxj> $$0) {
      this.a = $$0;
   }

   private bxj d(jq<bxi> $$0) {
      bxj $$1 = this.a.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("Can't find attribute " + $$0.g());
      } else {
         return $$1;
      }
   }

   public double a(jq<bxi> $$0) {
      return this.d($$0).g();
   }

   public double b(jq<bxi> $$0) {
      return this.d($$0).b();
   }

   public double a(jq<bxi> $$0, alz $$1) {
      bxl $$2 = this.d($$0).a($$1);
      if ($$2 == null) {
         throw new IllegalArgumentException("Can't find modifier " + $$1 + " on attribute " + $$0.g());
      } else {
         return $$2.c();
      }
   }

   @Nullable
   public bxj a(Consumer<bxj> $$0, jq<bxi> $$1) {
      bxj $$2 = this.a.get($$1);
      if ($$2 == null) {
         return null;
      } else {
         bxj $$3 = new bxj($$1, $$0);
         $$3.a($$2);
         return $$3;
      }
   }

   public static bxm.a a() {
      return new bxm.a();
   }

   public boolean c(jq<bxi> $$0) {
      return this.a.containsKey($$0);
   }

   public boolean b(jq<bxi> $$0, alz $$1) {
      bxj $$2 = this.a.get($$0);
      return $$2 != null && $$2.a($$1) != null;
   }

   public static class a {
      private final Builder<jq<bxi>, bxj> a = ImmutableMap.builder();
      private boolean b;

      private bxj b(jq<bxi> $$0) {
         bxj $$1 = new bxj($$0, $$1x -> {
            if (this.b) {
               throw new UnsupportedOperationException("Tried to change value for default attribute instance: " + $$0.g());
            }
         });
         this.a.put($$0, $$1);
         return $$1;
      }

      public bxm.a a(jq<bxi> $$0) {
         this.b($$0);
         return this;
      }

      public bxm.a a(jq<bxi> $$0, double $$1) {
         bxj $$2 = this.b($$0);
         $$2.a($$1);
         return this;
      }

      public bxm a() {
         this.b = true;
         return new bxm(this.a.buildKeepingLast());
      }
   }
}
