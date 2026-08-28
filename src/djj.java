import com.mojang.serialization.MapCodec;

public class djj extends dgh implements dmo {
   public static final MapCodec<djj> a = b(djj::new);
   protected static final eyx b = dgv.a(0.0, 6.0, 0.0, 16.0, 12.0, 16.0);

   @Override
   public MapCodec<djj> a() {
      return a;
   }

   protected djj(dtz.d $$0) {
      super($$0);
   }

   @Override
   public dre a(je $$0, dua $$1) {
      return new dsx($$0, $$1);
   }

   @Override
   protected eyx a(dua $$0, dcx $$1, je $$2, eyj $$3) {
      return b;
   }

   @Override
   protected void a(dua $$0, dds $$1, je $$2, btj $$3) {
      if ($$3.o(false) && eyu.c(eyu.a($$3.cO().d((double)(-$$2.u()), (double)(-$$2.v()), (double)(-$$2.w()))), $$0.f($$1, $$2), eyi.i)) {
         if (!$$1.B && $$1.ag() == dds.j && $$3 instanceof arh $$4 && !$$4.f) {
            $$4.q();
            return;
         }

         $$3.a(this, $$2);
      }
   }

   @Override
   public eqz a(arg $$0, btj $$1, je $$2) {
      ala<dds> $$3 = $$0.ag() == dds.j ? dds.h : dds.j;
      arg $$4 = $$0.o().a($$3);
      if ($$4 == null) {
         return null;
      } else {
         boolean $$5 = $$3 == dds.j;
         je $$6 = $$5 ? arg.a : $$4.W();
         eye $$7 = $$6.c();
         float $$8 = $$1.dI();
         if ($$5) {
            eda.a($$4, je.a((jx)$$7).e(), true);
            $$8 = jj.e.p();
            if ($$1 instanceof arh) {
               $$7 = $$7.a(0.0, 1.0, 0.0);
            }
         } else {
            if ($$1 instanceof arh $$9) {
               return $$9.a(false, eqz.a);
            }

            $$7 = $$1.a($$4, $$6).c();
         }

         return new eqz($$4, $$7, $$1.dv(), $$8, $$1.dK(), eqz.b.then(eqz.c));
      }
   }

   @Override
   public void a(dua $$0, dds $$1, je $$2, azk $$3) {
      double $$4 = (double)$$2.u() + $$3.j();
      double $$5 = (double)$$2.v() + 0.8;
      double $$6 = (double)$$2.w() + $$3.j();
      $$1.a(ln.ae, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   @Override
   public cvl a(ddv $$0, je $$1, dua $$2) {
      return cvl.k;
   }

   @Override
   protected boolean a(dua $$0, eqa $$1) {
      return false;
   }
}
