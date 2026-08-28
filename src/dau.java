import com.mojang.serialization.Codec;

public record dau(cxo c) {
   public static final Codec<dau> a = cxo.b.xmap(dau::new, dau::a);
   public static final zt<xg, dau> b = zt.a(cxo.i, dau::a, dau::new);

   public cxo a(cxo $$0, int $$1, boolean $$2, dau.a $$3) {
      if ($$2) {
         return $$0;
      } else if ($$0.L() >= $$1) {
         return $$0;
      } else {
         cxo $$4 = this.c.v();
         if ($$0.f()) {
            return $$4;
         } else {
            $$3.apply($$4);
            return $$0;
         }
      }
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         dau $$1 = (dau)$$0;
         return cxo.a(this.c, $$1.c);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return cxo.a(this.c);
   }

   public cxo a() {
      return this.c;
   }

   @FunctionalInterface
   public interface a {
      void apply(cxo var1);
   }
}
