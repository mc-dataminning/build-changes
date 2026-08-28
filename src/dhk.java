import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dhk extends dhq {
   public static final MapCodec<dhk> a = b(dhk::new);
   public static final dwd b = dvz.P;
   public static final dwa c = dvz.u;

   @Override
   public MapCodec<dhk> a() {
      return a;
   }

   public dhk(dvi.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jm.c).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected bsd a(dvj $$0, dfb $$1, jh $$2, com $$3, ezj $$4) {
      if (!$$1.C && $$1.c_($$2) instanceof dsf $$5) {
         $$3.a($$5);
         $$3.a(awv.ar);
         cnc.a($$3, true);
      }

      return bsd.a;
   }

   @Override
   protected void a(dvj $$0, dfb $$1, jh $$2, dvj $$3, boolean $$4) {
      brz.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(dvj $$0, arn $$1, jh $$2, azs $$3) {
      dsm $$4 = $$1.c_($$2);
      if ($$4 instanceof dsf) {
         ((dsf)$$4).k();
      }
   }

   @Nullable
   @Override
   public dsm a(jh $$0, dvj $$1) {
      return new dsf($$0, $$1);
   }

   @Override
   protected dok a_(dvj $$0) {
      return dok.c;
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
   protected dvj a(dvj $$0, dor $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dvj a(dvj $$0, dna $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dvk.a<die, dvj> $$0) {
      $$0.a(b, c);
   }

   @Override
   public dvj a(czs $$0) {
      return this.m().b(b, $$0.d().g());
   }
}
