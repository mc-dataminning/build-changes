import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dkr extends djy {
   public static final MapCodec<dkr> a = b(dkr::new);
   public static final dym[] b = new dym[]{dyl.k, dyl.l, dyl.m};
   protected static final fcs c = fcp.a(dkm.a(1.0, 0.0, 1.0, 15.0, 2.0, 15.0), dkm.a(7.0, 0.0, 7.0, 9.0, 14.0, 9.0));

   @Override
   public MapCodec<dkr> a() {
      return a;
   }

   public dkr(dxu.d $$0) {
      super($$0);
      this.l(this.F.b().b(b[0], Boolean.valueOf(false)).b(b[1], Boolean.valueOf(false)).b(b[2], Boolean.valueOf(false)));
   }

   @Override
   protected dqv a_(dxv $$0) {
      return dqv.c;
   }

   @Override
   public dux a(jh $$0, dxv $$1) {
      return new dva($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dux> duy<T> a(dhi $$0, dxv $$1, duz<T> $$2) {
      return $$0.C ? null : a($$2, duz.m, dva::a);
   }

   @Override
   protected fcs a(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
      return c;
   }

   @Override
   protected btj a(dxv $$0, dhi $$1, jh $$2, cpx $$3, fbu $$4) {
      if (!$$1.C && $$1.c_($$2) instanceof dva $$5) {
         $$3.a($$5);
         $$3.a(axp.aa);
      }

      return btj.a;
   }

   @Override
   public void a(dxv $$0, dhi $$1, jh $$2, bam $$3) {
      double $$4 = (double)$$2.u() + 0.4 + (double)$$3.i() * 0.2;
      double $$5 = (double)$$2.v() + 0.7 + (double)$$3.i() * 0.3;
      double $$6 = (double)$$2.w() + 0.4 + (double)$$3.i() * 0.2;
      $$1.a(ls.af, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   @Override
   protected void a(dxv $$0, dhi $$1, jh $$2, dxv $$3, boolean $$4) {
      btf.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected boolean c_(dxv $$0) {
      return true;
   }

   @Override
   protected int a(dxv $$0, dhi $$1, jh $$2) {
      return ctc.a($$1.c_($$2));
   }

   @Override
   protected void a(dxw.a<dkm, dxv> $$0) {
      $$0.a(b[0], b[1], b[2]);
   }

   @Override
   protected boolean a(dxv $$0, eum $$1) {
      return false;
   }
}
