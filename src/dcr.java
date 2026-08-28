import com.mojang.serialization.Codec;

public record dcr(czk c) {
   public static final Codec<dcr> a = czk.b.xmap(dcr::new, dcr::a);
   public static final yw<wj, dcr> b = yw.a(czk.i, dcr::a, dcr::new);

   public czk a(czk $$0, int $$1, boolean $$2, dcr.a $$3) {
      if ($$2) {
         return $$0;
      } else if ($$0.M() >= $$1) {
         return $$0;
      } else {
         czk $$4 = this.c.v();
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
         dcr $$1 = (dcr)$$0;
         return czk.a(this.c, $$1.c);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return czk.b(this.c);
   }

   public czk a() {
      return this.c;
   }

   @FunctionalInterface
   public interface a {
      void apply(czk var1);
   }
}
