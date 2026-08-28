import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class bxi {
   private final Map<jq<bxe>, bxf> a;

   bxi(Map<jq<bxe>, bxf> $$0) {
      this.a = $$0;
   }

   private bxf d(jq<bxe> $$0) {
      bxf $$1 = this.a.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("Can't find attribute " + $$0.g());
      } else {
         return $$1;
      }
   }

   public double a(jq<bxe> $$0) {
      return this.d($$0).g();
   }

   public double b(jq<bxe> $$0) {
      return this.d($$0).b();
   }

   public double a(jq<bxe> $$0, alz $$1) {
      bxh $$2 = this.d($$0).a($$1);
      if ($$2 == null) {
         throw new IllegalArgumentException("Can't find modifier " + $$1 + " on attribute " + $$0.g());
      } else {
         return $$2.c();
      }
   }

   @Nullable
   public bxf a(Consumer<bxf> $$0, jq<bxe> $$1) {
      bxf $$2 = this.a.get($$1);
      if ($$2 == null) {
         return null;
      } else {
         bxf $$3 = new bxf($$1, $$0);
         $$3.a($$2);
         return $$3;
      }
   }

   public static bxi.a a() {
      return new bxi.a();
   }

   public boolean c(jq<bxe> $$0) {
      return this.a.containsKey($$0);
   }

   public boolean b(jq<bxe> $$0, alz $$1) {
      bxf $$2 = this.a.get($$0);
      return $$2 != null && $$2.a($$1) != null;
   }

   public static class a {
      private final Builder<jq<bxe>, bxf> a = ImmutableMap.builder();
      private boolean b;

      private bxf b(jq<bxe> $$0) {
         bxf $$1 = new bxf($$0, $$1x -> {
            if (this.b) {
               throw new UnsupportedOperationException("Tried to change value for default attribute instance: " + $$0.g());
            }
         });
         this.a.put($$0, $$1);
         return $$1;
      }

      public bxi.a a(jq<bxe> $$0) {
         this.b($$0);
         return this;
      }

      public bxi.a a(jq<bxe> $$0, double $$1) {
         bxf $$2 = this.b($$0);
         $$2.a($$1);
         return this;
      }

      public bxi a() {
         this.b = true;
         return new bxi(this.a.buildKeepingLast());
      }
   }
}
