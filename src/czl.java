import com.mojang.serialization.Codec;

public record czl(cwf c) {
   public static final Codec<czl> a = cwf.b.xmap(czl::new, czl::a);
   public static final zj<ww, czl> b = zj.a(cwf.i, czl::a, czl::new);

   public cwf a(bve $$0, cwf $$1, int $$2) {
      boolean $$3 = $$0.fY();
      cwf $$4 = this.c.v();
      if ($$3) {
         return $$1;
      } else if ($$1.L() >= $$2) {
         return $$1;
      } else if ($$1.f()) {
         return $$4;
      } else {
         if (!$$0.dY().y_() && $$0 instanceof cor $$5 && !$$5.gl().f($$4)) {
            $$5.a($$4, false);
         }

         return $$1;
      }
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         czl $$1 = (czl)$$0;
         return cwf.a(this.c, $$1.c);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return cwf.a(this.c);
   }

   public cwf a() {
      return this.c;
   }
}
