import com.mojang.serialization.Codec;

public record czc(cvs c) {
   public static final Codec<czc> a = cvs.b.xmap(czc::new, czc::a);
   public static final zc<wp, czc> b = zc.a(cvs.i, czc::a, czc::new);

   public cvs a(bun $$0, cvs $$1, int $$2) {
      boolean $$3 = $$0.fR();
      cvs $$4 = this.c.u();
      if ($$3) {
         return $$1;
      } else if ($$1.K() >= $$2) {
         return $$1;
      } else if ($$1.f()) {
         return $$4;
      } else {
         if (!$$0.dS().x_() && $$0 instanceof cnx $$5 && !$$5.gd().f($$4)) {
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
         czc $$1 = (czc)$$0;
         return cvs.a(this.c, $$1.c);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return cvs.a(this.c);
   }

   public cvs a() {
      return this.c;
   }
}
