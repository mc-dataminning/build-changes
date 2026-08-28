import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class bwh {
   private final Map<jq<bwd>, bwe> a;

   bwh(Map<jq<bwd>, bwe> $$0) {
      this.a = $$0;
   }

   private bwe d(jq<bwd> $$0) {
      bwe $$1 = this.a.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("Can't find attribute " + $$0.g());
      } else {
         return $$1;
      }
   }

   public double a(jq<bwd> $$0) {
      return this.d($$0).g();
   }

   public double b(jq<bwd> $$0) {
      return this.d($$0).b();
   }

   public double a(jq<bwd> $$0, ali $$1) {
      bwg $$2 = this.d($$0).a($$1);
      if ($$2 == null) {
         throw new IllegalArgumentException("Can't find modifier " + $$1 + " on attribute " + $$0.g());
      } else {
         return $$2.c();
      }
   }

   @Nullable
   public bwe a(Consumer<bwe> $$0, jq<bwd> $$1) {
      bwe $$2 = this.a.get($$1);
      if ($$2 == null) {
         return null;
      } else {
         bwe $$3 = new bwe($$1, $$0);
         $$3.a($$2);
         return $$3;
      }
   }

   public static bwh.a a() {
      return new bwh.a();
   }

   public boolean c(jq<bwd> $$0) {
      return this.a.containsKey($$0);
   }

   public boolean b(jq<bwd> $$0, ali $$1) {
      bwe $$2 = this.a.get($$0);
      return $$2 != null && $$2.a($$1) != null;
   }

   public static class a {
      private final Builder<jq<bwd>, bwe> a = ImmutableMap.builder();
      private boolean b;

      private bwe b(jq<bwd> $$0) {
         bwe $$1 = new bwe($$0, $$1x -> {
            if (this.b) {
               throw new UnsupportedOperationException("Tried to change value for default attribute instance: " + $$0.g());
            }
         });
         this.a.put($$0, $$1);
         return $$1;
      }

      public bwh.a a(jq<bwd> $$0) {
         this.b($$0);
         return this;
      }

      public bwh.a a(jq<bwd> $$0, double $$1) {
         bwe $$2 = this.b($$0);
         $$2.a($$1);
         return this;
      }

      public bwh a() {
         this.b = true;
         return new bwh(this.a.buildKeepingLast());
      }
   }
}
