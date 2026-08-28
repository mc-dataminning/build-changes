import com.mojang.serialization.MapCodec;

public class dqw extends dmq {
   public static final MapCodec<dqw> a = b(dqw::new);
   public static final dym b = dyl.t;
   public static final dyu e = dyl.aB;

   @Override
   public MapCodec<dqw> a() {
      return a;
   }

   protected dqw(dxu.d $$0) {
      super($$0);
      this.l(this.F.b().b(aF, jm.c).b(e, Integer.valueOf(1)).b(b, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected btj a(dxv $$0, dhi $$1, jh $$2, cpx $$3, fbu $$4) {
      if (!$$3.gj().e) {
         return btj.e;
      } else {
         $$1.a($$2, $$0.a(e), 3);
         return btj.a;
      }
   }

   @Override
   protected int h(dxv $$0) {
      return $$0.c(e) * 2;
   }

   @Override
   public dxv a(dbg $$0) {
      dxv $$1 = super.a($$0);
      return $$1.b(b, Boolean.valueOf(this.c($$0.q(), $$0.a(), $$1)));
   }

   @Override
   protected dxv a(dxv $$0, dhl $$1, dhx $$2, jh $$3, jm $$4, jh $$5, dxv $$6, bam $$7) {
      if ($$4 == jm.a && !this.b($$1, $$5, $$6)) {
         return dko.a.m();
      } else {
         return !$$1.B_() && $$4.o() != $$0.c(aF).o() ? $$0.b(b, Boolean.valueOf(this.c($$1, $$3, $$0))) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Override
   public boolean c(dhl $$0, jh $$1, dxv $$2) {
      return this.a((dia)$$0, $$1, $$2) > 0;
   }

   @Override
   protected boolean b() {
      return true;
   }

   @Override
   public void a(dxv $$0, dhi $$1, jh $$2, bam $$3) {
      if ($$0.c(d)) {
         jm $$4 = $$0.c(aF);
         double $$5 = (double)$$2.u() + 0.5 + ($$3.j() - 0.5) * 0.2;
         double $$6 = (double)$$2.v() + 0.4 + ($$3.j() - 0.5) * 0.2;
         double $$7 = (double)$$2.w() + 0.5 + ($$3.j() - 0.5) * 0.2;
         float $$8 = -5.0F;
         if ($$3.h()) {
            $$8 = (float)($$0.c(e) * 2 - 1);
         }

         $$8 /= 16.0F;
         double $$9 = (double)($$8 * (float)$$4.j());
         double $$10 = (double)($$8 * (float)$$4.l());
         $$1.a(ln.b, $$5 + $$9, $$6, $$7 + $$10, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void a(dxw.a<dkm, dxv> $$0) {
      $$0.a(aF, e, b, d);
   }
}
