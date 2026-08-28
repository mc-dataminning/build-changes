import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class doj extends doi {
   public static final MapCodec<doj> h = b(doj::new);
   public static final dwd i = dlz.aF;
   public static final dwa j = doi.d;

   @Override
   public MapCodec<doj> a() {
      return h;
   }

   protected doj(dvi.d $$0) {
      super($$0);
      this.l(this.F.b().b(i, jm.c).b(j, Boolean.valueOf(true)));
   }

   @Override
   protected fah a(dvj $$0, deg $$1, jh $$2, ezs $$3) {
      return drg.o($$0);
   }

   @Override
   protected boolean a(dvj $$0, dfe $$1, jh $$2) {
      return drg.b($$1, $$2, $$0.c(i));
   }

   @Override
   protected dvj a(dvj $$0, jm $$1, dvj $$2, dfc $$3, jh $$4, jh $$5) {
      return $$1.g() == $$0.c(i) && !$$0.a($$3, $$4) ? dig.a.m() : $$0;
   }

   @Nullable
   @Override
   public dvj a(czs $$0) {
      dvj $$1 = dig.cq.a($$0);
      return $$1 == null ? null : this.m().b(i, $$1.c(i));
   }

   @Override
   public void a(dvj $$0, dfb $$1, jh $$2, azs $$3) {
      if ($$0.c(j)) {
         jm $$4 = $$0.c(i).g();
         double $$5 = 0.27;
         double $$6 = (double)$$2.u() + 0.5 + ($$3.j() - 0.5) * 0.2 + 0.27 * (double)$$4.j();
         double $$7 = (double)$$2.v() + 0.7 + ($$3.j() - 0.5) * 0.2 + 0.22;
         double $$8 = (double)$$2.w() + 0.5 + ($$3.j() - 0.5) * 0.2 + 0.27 * (double)$$4.l();
         $$1.a(lm.b, $$6, $$7, $$8, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected boolean a(dfb $$0, jh $$1, dvj $$2) {
      jm $$3 = $$2.c(i).g();
      return $$0.b($$1.a($$3), $$3);
   }

   @Override
   protected int a(dvj $$0, deg $$1, jh $$2, jm $$3) {
      return $$0.c(j) && $$0.c(i) != $$3 ? 15 : 0;
   }

   @Override
   protected dvj a(dvj $$0, dor $$1) {
      return $$0.b(i, $$1.a($$0.c(i)));
   }

   @Override
   protected dvj a(dvj $$0, dna $$1) {
      return $$0.a($$1.a($$0.c(i)));
   }

   @Override
   protected void a(dvk.a<die, dvj> $$0) {
      $$0.a(i, j);
   }

   @Nullable
   @Override
   protected ess a(dfb $$0, dvj $$1) {
      return eso.a($$0, $$1.c(i).g(), jm.b);
   }
}
