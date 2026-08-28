import com.mojang.serialization.Codec;

public record czv(cwp c) {
   public static final Codec<czv> a = cwp.a.xmap(czv::new, czv::a);
   public static final yn<wa, czv> b = yn.a(cwp.h, czv::a, czv::new);

   public cwp a(cwp $$0, int $$1, boolean $$2, czv.a $$3) {
      if ($$2) {
         return $$0;
      } else if ($$0.M() >= $$1) {
         return $$0;
      } else {
         cwp $$4 = this.c.v();
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
         czv $$1 = (czv)$$0;
         return cwp.a(this.c, $$1.c);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return cwp.a(this.c);
   }

   public cwp a() {
      return this.c;
   }

   @FunctionalInterface
   public interface a {
      void apply(cwp var1);
   }
}
