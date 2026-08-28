import com.mojang.serialization.MapCodec;
import java.util.function.ToIntFunction;

public class dmr extends die implements dpf {
   public static final MapCodec<dmr> a = b(dmr::new);
   public static final int b = 15;
   public static final dwj c = dvz.aP;
   public static final dwa d = dvz.C;
   public static final ToIntFunction<dvj> e = $$0 -> $$0.c(c);

   @Override
   public MapCodec<dmr> a() {
      return a;
   }

   public dmr(dvi.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Integer.valueOf(15)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dvk.a<die, dvj> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected bsd a(dvj $$0, dfb $$1, jh $$2, com $$3, ezj $$4) {
      if (!$$1.C && $$3.gH()) {
         $$1.a($$2, $$0.a(c), 2);
         return bsd.b;
      } else {
         return bsd.c;
      }
   }

   @Override
   protected fah a(dvj $$0, deg $$1, jh $$2, ezs $$3) {
      return $$3.a(cwf.hC) ? fae.b() : fae.a();
   }

   @Override
   protected boolean e_(dvj $$0) {
      return $$0.y().c();
   }

   @Override
   protected dok a_(dvj $$0) {
      return dok.a;
   }

   @Override
   protected float c(dvj $$0, deg $$1, jh $$2) {
      return 1.0F;
   }

   @Override
   protected dvj a(dvj $$0, jm $$1, dvj $$2, dfc $$3, jh $$4, jh $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, erl.c, erl.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected erk b_(dvj $$0) {
      return $$0.c(d) ? erl.c.a(false) : super.b_($$0);
   }

   @Override
   public cwb a(dfe $$0, jh $$1, dvj $$2) {
      return a(super.a($$0, $$1, $$2), $$2.c(c));
   }

   public static cwb a(cwb $$0, int $$1) {
      if ($$1 != 15) {
         $$0.b(ku.am, cyd.a.a(c, $$1));
      }

      return $$0;
   }
}
