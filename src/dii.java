import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dii extends dhq {
   public static final MapCodec<dii> a = b(dii::new);
   public static final dwa[] b = new dwa[]{dvz.k, dvz.l, dvz.m};
   protected static final fah c = fae.a(die.a(1.0, 0.0, 1.0, 15.0, 2.0, 15.0), die.a(7.0, 0.0, 7.0, 9.0, 14.0, 9.0));

   @Override
   public MapCodec<dii> a() {
      return a;
   }

   public dii(dvi.d $$0) {
      super($$0);
      this.l(this.F.b().b(b[0], Boolean.valueOf(false)).b(b[1], Boolean.valueOf(false)).b(b[2], Boolean.valueOf(false)));
   }

   @Override
   protected dok a_(dvj $$0) {
      return dok.c;
   }

   @Override
   public dsm a(jh $$0, dvj $$1) {
      return new dsp($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dsm> dsn<T> a(dfb $$0, dvj $$1, dso<T> $$2) {
      return $$0.C ? null : a($$2, dso.l, dsp::a);
   }

   @Override
   protected fah a(dvj $$0, deg $$1, jh $$2, ezs $$3) {
      return c;
   }

   @Override
   protected bsd a(dvj $$0, dfb $$1, jh $$2, com $$3, ezj $$4) {
      if (!$$1.C && $$1.c_($$2) instanceof dsp $$5) {
         $$3.a($$5);
         $$3.a(awv.aa);
      }

      return bsd.a;
   }

   @Override
   public void a(dvj $$0, dfb $$1, jh $$2, azs $$3) {
      double $$4 = (double)$$2.u() + 0.4 + (double)$$3.i() * 0.2;
      double $$5 = (double)$$2.v() + 0.7 + (double)$$3.i() * 0.3;
      double $$6 = (double)$$2.w() + 0.4 + (double)$$3.i() * 0.2;
      $$1.a(lr.ae, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   @Override
   protected void a(dvj $$0, dfb $$1, jh $$2, dvj $$3, boolean $$4) {
      brz.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected boolean c_(dvj $$0) {
      return true;
   }

   @Override
   protected int a(dvj $$0, dfb $$1, jh $$2) {
      return cro.a($$1.c_($$2));
   }

   @Override
   protected void a(dvk.a<die, dvj> $$0) {
      $$0.a(b[0], b[1], b[2]);
   }

   @Override
   protected boolean a(dvj $$0, erz $$1) {
      return false;
   }
}
