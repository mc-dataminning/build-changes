import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djp extends diw {
   public static final MapCodec<djp> a = b(djp::new);
   public static final dxm[] b = new dxm[]{dxl.o, dxl.p, dxl.q};
   protected static final fbs c = fbp.a(djk.a(1.0, 0.0, 1.0, 15.0, 2.0, 15.0), djk.a(7.0, 0.0, 7.0, 9.0, 14.0, 9.0));

   @Override
   public MapCodec<djp> a() {
      return a;
   }

   public djp(dwu.d $$0) {
      super($$0);
      this.l(this.F.b().b(b[0], Boolean.valueOf(false)).b(b[1], Boolean.valueOf(false)).b(b[2], Boolean.valueOf(false)));
   }

   @Override
   public dtx a(ji $$0, dwv $$1) {
      return new dua($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dtx> dty<T> a(dgg $$0, dwv $$1, dtz<T> $$2) {
      return $$0.C ? null : a($$2, dtz.m, dua::a);
   }

   @Override
   protected fbs a(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
      return c;
   }

   @Override
   protected bsi a(dwv $$0, dgg $$1, ji $$2, cov $$3, fau $$4) {
      if (!$$1.C && $$1.c_($$2) instanceof dua $$5) {
         $$3.a($$5);
         $$3.a(awj.aa);
      }

      return bsi.a;
   }

   @Override
   public void a(dwv $$0, dgg $$1, ji $$2, azg $$3) {
      double $$4 = (double)$$2.u() + 0.4 + (double)$$3.i() * 0.2;
      double $$5 = (double)$$2.v() + 0.7 + (double)$$3.i() * 0.3;
      double $$6 = (double)$$2.w() + 0.4 + (double)$$3.i() * 0.2;
      $$1.a(lt.ag, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   @Override
   protected void a(dwv $$0, dgg $$1, ji $$2, dwv $$3, boolean $$4) {
      bse.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected boolean c_(dwv $$0) {
      return true;
   }

   @Override
   protected int a(dwv $$0, dgg $$1, ji $$2) {
      return csa.a($$1.c_($$2));
   }

   @Override
   protected void a(dww.a<djk, dwv> $$0) {
      $$0.a(b[0], b[1], b[2]);
   }

   @Override
   protected boolean a(dwv $$0, etm $$1) {
      return false;
   }
}
