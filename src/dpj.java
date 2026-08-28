import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dpj extends dkm implements dih, dpf {
   public static final MapCodec<dpj> c = b(dpj::new);
   private static final dwa g = dvz.C;
   public static final dwd d = dvz.R;
   protected static final float e = 6.0F;
   protected static final fah f = die.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<dpj> a() {
      return c;
   }

   public dpj(dvi.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, dwf.b).b(g, Boolean.valueOf(false)).b(d, jm.c));
   }

   @Override
   protected fah a(dvj $$0, deg $$1, jh $$2, ezs $$3) {
      return f;
   }

   @Override
   protected boolean b(dvj $$0, deg $$1, jh $$2) {
      return $$0.a(axa.by) || $$1.b_($$2.d()).a(erl.c) && super.b($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public dvj a(czs $$0) {
      dvj $$1 = super.a($$0);
      return $$1 != null ? c($$0.q(), $$0.a(), $$1.b(d, $$0.g().g())) : null;
   }

   @Override
   public void a(dfb $$0, jh $$1, dvj $$2, bva $$3, cwb $$4) {
      if (!$$0.y_()) {
         jh $$5 = $$1.d();
         dvj $$6 = dkm.c($$0, $$5, this.m().b(b, dwf.a).b(d, $$2.c(d)));
         $$0.a($$5, $$6, 3);
      }
   }

   @Override
   protected erk b_(dvj $$0) {
      return $$0.c(g) ? erl.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dvj $$0, dfe $$1, jh $$2) {
      if ($$0.c(b) == dwf.a) {
         return super.a($$0, $$1, $$2);
      } else {
         jh $$3 = $$2.e();
         dvj $$4 = $$1.a_($$3);
         return this.b($$4, $$1, $$3);
      }
   }

   @Override
   protected dvj a(dvj $$0, jm $$1, dvj $$2, dfc $$3, jh $$4, jh $$5) {
      if ($$0.c(g)) {
         $$3.a($$4, erl.c, erl.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dvk.a<die, dvj> $$0) {
      $$0.a(b, g, d);
   }

   @Override
   public boolean b(dfe $$0, jh $$1, dvj $$2) {
      return true;
   }

   @Override
   public boolean a(dfb $$0, azs $$1, jh $$2, dvj $$3) {
      return true;
   }

   @Override
   public void a(arn $$0, azs $$1, jh $$2, dvj $$3) {
      if ($$3.c(dkm.b) == dwf.b) {
         jh $$4 = $$2.d();
         $$0.a($$4, $$0.b_($$4).g(), 18);
         dib.a($$0, $$1, $$2, $$3.c(d));
      } else {
         jh $$5 = $$2.e();
         this.a($$0, $$1, $$5, $$0.a_($$5));
      }
   }

   @Override
   protected dvj a(dvj $$0, dor $$1) {
      return $$0.b(d, $$1.a($$0.c(d)));
   }

   @Override
   protected dvj a(dvj $$0, dna $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected float au_() {
      return 0.1F;
   }
}
