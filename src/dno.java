import com.mojang.serialization.MapCodec;

public class dno extends dkh {
   public static final MapCodec<dno> b = b(dno::new);
   public static final dwa c = dvz.w;

   @Override
   public MapCodec<dno> a() {
      return b;
   }

   public dno(dvi.d $$0) {
      super($$0);
      this.l(this.F.b().b(a, jm.d).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dvk.a<die, dvj> $$0) {
      $$0.a(a, c);
   }

   @Override
   protected dvj a(dvj $$0, dor $$1) {
      return $$0.b(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dvj a(dvj $$0, dna $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dvj $$0, arn $$1, jh $$2, azs $$3) {
      if ($$0.c(c)) {
         $$1.a($$2, $$0.b(c, Boolean.valueOf(false)), 2);
      } else {
         $$1.a($$2, $$0.b(c, Boolean.valueOf(true)), 2);
         $$1.a($$2, this, 2);
      }

      this.a($$1, $$2, $$0);
   }

   @Override
   protected dvj a(dvj $$0, jm $$1, dvj $$2, dfc $$3, jh $$4, jh $$5) {
      if ($$0.c(a) == $$1 && !$$0.c(c)) {
         this.a($$3, $$4);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private void a(dfc $$0, jh $$1) {
      if (!$$0.y_() && !$$0.R().a($$1, this)) {
         $$0.a($$1, this, 2);
      }
   }

   protected void a(dfb $$0, jh $$1, dvj $$2) {
      jm $$3 = $$2.c(a);
      jh $$4 = $$1.a($$3.g());
      ess $$5 = eso.a($$0, $$3.g(), null);
      $$0.b($$4, this, $$5);
      $$0.a($$4, this, $$3, $$5);
   }

   @Override
   protected boolean f_(dvj $$0) {
      return true;
   }

   @Override
   protected int b(dvj $$0, deg $$1, jh $$2, jm $$3) {
      return $$0.a($$1, $$2, $$3);
   }

   @Override
   protected int a(dvj $$0, deg $$1, jh $$2, jm $$3) {
      return $$0.c(c) && $$0.c(a) == $$3 ? 15 : 0;
   }

   @Override
   protected void b(dvj $$0, dfb $$1, jh $$2, dvj $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if (!$$1.y_() && $$0.c(c) && !$$1.R().a($$2, this)) {
            dvj $$5 = $$0.b(c, Boolean.valueOf(false));
            $$1.a($$2, $$5, 18);
            this.a($$1, $$2, $$5);
         }
      }
   }

   @Override
   protected void a(dvj $$0, dfb $$1, jh $$2, dvj $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if (!$$1.C && $$0.c(c) && $$1.R().a($$2, this)) {
            this.a($$1, $$2, $$0.b(c, Boolean.valueOf(false)));
         }
      }
   }

   @Override
   public dvj a(czs $$0) {
      return this.m().b(a, $$0.d().g().g());
   }
}
