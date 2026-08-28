import com.mojang.serialization.MapCodec;

public class dka extends dgy implements dnf {
   public static final MapCodec<dka> a = b(dka::new);
   protected static final ezq b = dhm.a(0.0, 6.0, 0.0, 16.0, 12.0, 16.0);

   @Override
   public MapCodec<dka> a() {
      return a;
   }

   protected dka(dur.d $$0) {
      super($$0);
   }

   @Override
   public drv a(jf $$0, dus $$1) {
      return new dto($$0, $$1);
   }

   @Override
   protected ezq a(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      return b;
   }

   @Override
   protected void a(dus $$0, dej $$1, jf $$2, btr $$3) {
      if ($$3.o(false) && ezn.c(ezn.a($$3.cO().d((double)(-$$2.u()), (double)(-$$2.v()), (double)(-$$2.w()))), $$0.f($$1, $$2), eza.i)) {
         if (!$$1.B && $$1.ag() == dej.j && $$3 instanceof ark $$4 && !$$4.f) {
            $$4.q();
            return;
         }

         $$3.a(this, $$2);
      }
   }

   @Override
   public err a(arj $$0, btr $$1, jf $$2) {
      ald<dej> $$3 = $$0.ag() == dej.j ? dej.h : dej.j;
      arj $$4 = $$0.o().a($$3);
      if ($$4 == null) {
         return null;
      } else {
         boolean $$5 = $$3 == dej.j;
         jf $$6 = $$5 ? arj.a : $$4.W();
         eyw $$7 = $$6.c();
         float $$8 = $$1.dI();
         if ($$5) {
            eds.a($$4, jf.a((jy)$$7).e(), true);
            $$8 = jk.e.p();
            if ($$1 instanceof ark) {
               $$7 = $$7.a(0.0, 1.0, 0.0);
            }
         } else {
            if ($$1 instanceof ark $$9) {
               return $$9.a(false, err.a);
            }

            $$7 = $$1.a($$4, $$6).c();
         }

         return new err($$4, $$7, $$1.dv(), $$8, $$1.dK(), err.b.then(err.c));
      }
   }

   @Override
   public void a(dus $$0, dej $$1, jf $$2, azn $$3) {
      double $$4 = (double)$$2.u() + $$3.j();
      double $$5 = (double)$$2.v() + 0.8;
      double $$6 = (double)$$2.w() + $$3.j();
      $$1.a(lo.ae, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   @Override
   public cvs a(dem $$0, jf $$1, dus $$2) {
      return cvs.k;
   }

   @Override
   protected boolean a(dus $$0, eqs $$1) {
      return false;
   }
}
