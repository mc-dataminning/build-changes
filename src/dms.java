import com.mojang.serialization.MapCodec;

public class dms extends don implements dpf {
   public static final MapCodec<dms> b = b(dms::new);
   public static final dwa c = dvz.C;
   public static final dwa d = dvz.w;
   private static final int k = 8;
   public static final int e = 128;
   private static final int l = 200;

   @Override
   public MapCodec<dms> a() {
      return b;
   }

   public dms(dvi.d $$0) {
      super($$0);
      this.l(this.F.b().b(a, jm.b).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   public dvj a(czs $$0) {
      erk $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == erl.c;
      return this.m().b(a, $$0.k()).b(c, Boolean.valueOf($$2));
   }

   @Override
   protected dvj a(dvj $$0, jm $$1, dvj $$2, dfc $$3, jh $$4, jh $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, erl.c, erl.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected erk b_(dvj $$0) {
      return $$0.c(c) ? erl.c.a(false) : super.b_($$0);
   }

   @Override
   protected int a(dvj $$0, deg $$1, jh $$2, jm $$3) {
      return $$0.c(d) ? 15 : 0;
   }

   @Override
   protected int b(dvj $$0, deg $$1, jh $$2, jm $$3) {
      return $$0.c(d) && $$0.c(a) == $$3 ? 15 : 0;
   }

   public void e(dvj $$0, dfb $$1, jh $$2) {
      $$1.a($$2, $$0.b(d, Boolean.valueOf(true)), 3);
      this.f($$0, $$1, $$2);
      $$1.a($$2, this, 8);
      $$1.c(3002, $$2, $$0.c(a).o().ordinal());
   }

   private void f(dvj $$0, dfb $$1, jh $$2) {
      jm $$3 = $$0.c(a).g();
      $$1.a($$2.a($$3), this, eso.a($$1, $$3, null));
   }

   @Override
   protected void a(dvj $$0, arn $$1, jh $$2, azs $$3) {
      $$1.a($$2, $$0.b(d, Boolean.valueOf(false)), 3);
      this.f($$0, $$1, $$2);
   }

   @Override
   public void a(dvj $$0, dfb $$1, jh $$2, azs $$3) {
      if ($$1.ad() && (long)$$1.A.a(200) <= $$1.aa() % 200L && $$2.v() == $$1.a(ebf.a.b, $$2.u(), $$2.w()) - 1) {
         azo.a($$0.c(a).o(), $$1, $$2, 0.125, lr.aT, bro.a(1, 2));
      }
   }

   @Override
   protected void a(dvj $$0, dfb $$1, jh $$2, dvj $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$0.c(d)) {
            this.f($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected void b(dvj $$0, dfb $$1, jh $$2, dvj $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$0.c(d) && !$$1.R().a($$2, this)) {
            $$1.a($$2, $$0.b(d, Boolean.valueOf(false)), 18);
         }
      }
   }

   @Override
   protected void a(dvk.a<die, dvj> $$0) {
      $$0.a(a, d, c);
   }

   @Override
   protected boolean f_(dvj $$0) {
      return true;
   }
}
