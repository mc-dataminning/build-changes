import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class bwl {
   private final Map<jq<bwh>, bwi> a;

   bwl(Map<jq<bwh>, bwi> $$0) {
      this.a = $$0;
   }

   private bwi d(jq<bwh> $$0) {
      bwi $$1 = this.a.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("Can't find attribute " + $$0.g());
      } else {
         return $$1;
      }
   }

   public double a(jq<bwh> $$0) {
      return this.d($$0).g();
   }

   public double b(jq<bwh> $$0) {
      return this.d($$0).b();
   }

   public double a(jq<bwh> $$0, all $$1) {
      bwk $$2 = this.d($$0).a($$1);
      if ($$2 == null) {
         throw new IllegalArgumentException("Can't find modifier " + $$1 + " on attribute " + $$0.g());
      } else {
         return $$2.c();
      }
   }

   @Nullable
   public bwi a(Consumer<bwi> $$0, jq<bwh> $$1) {
      bwi $$2 = this.a.get($$1);
      if ($$2 == null) {
         return null;
      } else {
         bwi $$3 = new bwi($$1, $$0);
         $$3.a($$2);
         return $$3;
      }
   }

   public static bwl.a a() {
      return new bwl.a();
   }

   public boolean c(jq<bwh> $$0) {
      return this.a.containsKey($$0);
   }

   public boolean b(jq<bwh> $$0, all $$1) {
      bwi $$2 = this.a.get($$0);
      return $$2 != null && $$2.a($$1) != null;
   }

   public static class a {
      private final Builder<jq<bwh>, bwi> a = ImmutableMap.builder();
      private boolean b;

      private bwi b(jq<bwh> $$0) {
         bwi $$1 = new bwi($$0, $$1x -> {
            if (this.b) {
               throw new UnsupportedOperationException("Tried to change value for default attribute instance: " + $$0.g());
            }
         });
         this.a.put($$0, $$1);
         return $$1;
      }

      public bwl.a a(jq<bwh> $$0) {
         this.b($$0);
         return this;
      }

      public bwl.a a(jq<bwh> $$0, double $$1) {
         bwi $$2 = this.b($$0);
         $$2.a($$1);
         return this;
      }

      public bwl a() {
         this.b = true;
         return new bwl(this.a.buildKeepingLast());
      }
   }
}
