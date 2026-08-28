import com.mojang.serialization.Codec;

public record dav(cxp c) {
   public static final Codec<dav> a = cxp.a.xmap(dav::new, dav::a);
   public static final zt<xg, dav> b = zt.a(cxp.h, dav::a, dav::new);

   public cxp a(cxp $$0, int $$1, boolean $$2, dav.a $$3) {
      if ($$2) {
         return $$0;
      } else if ($$0.L() >= $$1) {
         return $$0;
      } else {
         cxp $$4 = this.c.v();
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
         dav $$1 = (dav)$$0;
         return cxp.a(this.c, $$1.c);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return cxp.a(this.c);
   }

   public cxp a() {
      return this.c;
   }

   @FunctionalInterface
   public interface a {
      void apply(cxp var1);
   }
}
