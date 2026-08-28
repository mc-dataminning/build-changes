import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djs extends diz {
   public static final MapCodec<djs> a = b(djs::new);
   public static final dxp[] b = new dxp[]{dxo.o, dxo.p, dxo.q};
   protected static final fbv c = fbs.a(djn.a(1.0, 0.0, 1.0, 15.0, 2.0, 15.0), djn.a(7.0, 0.0, 7.0, 9.0, 14.0, 9.0));

   @Override
   public MapCodec<djs> a() {
      return a;
   }

   public djs(dwx.d $$0) {
      super($$0);
      this.l(this.F.b().b(b[0], Boolean.valueOf(false)).b(b[1], Boolean.valueOf(false)).b(b[2], Boolean.valueOf(false)));
   }

   @Override
   public dua a(ji $$0, dwy $$1) {
      return new dud($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dua> dub<T> a(dgj $$0, dwy $$1, duc<T> $$2) {
      return $$0.C ? null : a($$2, duc.m, dud::a);
   }

   @Override
   protected fbv a(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
      return c;
   }

   @Override
   protected bsl a(dwy $$0, dgj $$1, ji $$2, coy $$3, fax $$4) {
      if (!$$1.C && $$1.c_($$2) instanceof dud $$5) {
         $$3.a($$5);
         $$3.a(awk.aa);
      }

      return bsl.a;
   }

   @Override
   public void a(dwy $$0, dgj $$1, ji $$2, azh $$3) {
      double $$4 = (double)$$2.u() + 0.4 + (double)$$3.i() * 0.2;
      double $$5 = (double)$$2.v() + 0.7 + (double)$$3.i() * 0.3;
      double $$6 = (double)$$2.w() + 0.4 + (double)$$3.i() * 0.2;
      $$1.a(lt.ag, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   @Override
   protected void a(dwy $$0, dgj $$1, ji $$2, dwy $$3, boolean $$4) {
      bsh.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected boolean c_(dwy $$0) {
      return true;
   }

   @Override
   protected int a(dwy $$0, dgj $$1, ji $$2) {
      return csd.a($$1.c_($$2));
   }

   @Override
   protected void a(dwz.a<djn, dwy> $$0) {
      $$0.a(b[0], b[1], b[2]);
   }

   @Override
   protected boolean a(dwy $$0, etp $$1) {
      return false;
   }
}
