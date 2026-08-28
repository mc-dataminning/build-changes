import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djr extends diy {
   public static final MapCodec<djr> a = b(djr::new);
   public static final dxo[] b = new dxo[]{dxn.o, dxn.p, dxn.q};
   protected static final fbu c = fbr.a(djm.a(1.0, 0.0, 1.0, 15.0, 2.0, 15.0), djm.a(7.0, 0.0, 7.0, 9.0, 14.0, 9.0));

   @Override
   public MapCodec<djr> a() {
      return a;
   }

   public djr(dww.d $$0) {
      super($$0);
      this.l(this.F.b().b(b[0], Boolean.valueOf(false)).b(b[1], Boolean.valueOf(false)).b(b[2], Boolean.valueOf(false)));
   }

   @Override
   protected dpx a_(dwx $$0) {
      return dpx.c;
   }

   @Override
   public dtz a(ji $$0, dwx $$1) {
      return new duc($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dtz> dua<T> a(dgi $$0, dwx $$1, dub<T> $$2) {
      return $$0.C ? null : a($$2, dub.m, duc::a);
   }

   @Override
   protected fbu a(dwx $$0, dfn $$1, ji $$2, fbf $$3) {
      return c;
   }

   @Override
   protected bsj a(dwx $$0, dgi $$1, ji $$2, cox $$3, faw $$4) {
      if (!$$1.C && $$1.c_($$2) instanceof duc $$5) {
         $$3.a($$5);
         $$3.a(awk.aa);
      }

      return bsj.a;
   }

   @Override
   public void a(dwx $$0, dgi $$1, ji $$2, azh $$3) {
      double $$4 = (double)$$2.u() + 0.4 + (double)$$3.i() * 0.2;
      double $$5 = (double)$$2.v() + 0.7 + (double)$$3.i() * 0.3;
      double $$6 = (double)$$2.w() + 0.4 + (double)$$3.i() * 0.2;
      $$1.a(lt.ag, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   @Override
   protected void a(dwx $$0, dgi $$1, ji $$2, dwx $$3, boolean $$4) {
      bsf.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected boolean c_(dwx $$0) {
      return true;
   }

   @Override
   protected int a(dwx $$0, dgi $$1, ji $$2) {
      return csc.a($$1.c_($$2));
   }

   @Override
   protected void a(dwy.a<djm, dwx> $$0) {
      $$0.a(b[0], b[1], b[2]);
   }

   @Override
   protected boolean a(dwx $$0, eto $$1) {
      return false;
   }
}
