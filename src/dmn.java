import com.mojang.serialization.MapCodec;
import java.util.OptionalInt;

public class dmn extends die implements dpf {
   public static final MapCodec<dmn> b = b(dmn::new);
   public static final int c = 7;
   public static final dwj d = dvz.aC;
   public static final dwa e = dvz.v;
   public static final dwa f = dvz.C;
   private static final int a = 1;

   @Override
   public MapCodec<? extends dmn> a() {
      return b;
   }

   public dmn(dvi.d $$0) {
      super($$0);
      this.l(this.F.b().b(d, Integer.valueOf(7)).b(e, Boolean.valueOf(false)).b(f, Boolean.valueOf(false)));
   }

   @Override
   protected fah b_(dvj $$0, deg $$1, jh $$2) {
      return fae.a();
   }

   @Override
   protected boolean f(dvj $$0) {
      return $$0.c(d) == 7 && !$$0.c(e);
   }

   @Override
   protected void b(dvj $$0, arn $$1, jh $$2, azs $$3) {
      if (this.o($$0)) {
         c($$0, $$1, $$2);
         $$1.a($$2, false);
      }
   }

   protected boolean o(dvj $$0) {
      return !$$0.c(e) && $$0.c(d) == 7;
   }

   @Override
   protected void a(dvj $$0, arn $$1, jh $$2, azs $$3) {
      $$1.a($$2, a($$0, $$1, $$2), 3);
   }

   @Override
   protected int i_(dvj $$0) {
      return 1;
   }

   @Override
   protected dvj a(dvj $$0, jm $$1, dvj $$2, dfc $$3, jh $$4, jh $$5) {
      if ($$0.c(f)) {
         $$3.a($$4, erl.c, erl.c.a($$3));
      }

      int $$6 = r($$2) + 1;
      if ($$6 != 1 || $$0.c(d) != $$6) {
         $$3.a($$4, this, 1);
      }

      return $$0;
   }

   private static dvj a(dvj $$0, dfc $$1, jh $$2) {
      int $$3 = 7;
      jh.a $$4 = new jh.a();

      for (jm $$5 : jm.values()) {
         $$4.a($$2, $$5);
         $$3 = Math.min($$3, r($$1.a_($$4)) + 1);
         if ($$3 == 1) {
            break;
         }
      }

      return $$0.b(d, Integer.valueOf($$3));
   }

   private static int r(dvj $$0) {
      return q($$0).orElse(7);
   }

   public static OptionalInt q(dvj $$0) {
      if ($$0.a(axa.u)) {
         return OptionalInt.of(0);
      } else {
         return $$0.b(d) ? OptionalInt.of($$0.c(d)) : OptionalInt.empty();
      }
   }

   @Override
   protected erk b_(dvj $$0) {
      return $$0.c(f) ? erl.c.a(false) : super.b_($$0);
   }

   @Override
   public void a(dvj $$0, dfb $$1, jh $$2, azs $$3) {
      if ($$1.r($$2.d())) {
         if ($$3.a(15) == 1) {
            jh $$4 = $$2.e();
            dvj $$5 = $$1.a_($$4);
            if (!$$5.t() || !$$5.c($$1, $$4, jm.b)) {
               azo.a($$1, $$2, $$3, lr.l);
            }
         }
      }
   }

   @Override
   protected void a(dvk.a<die, dvj> $$0) {
      $$0.a(d, e, f);
   }

   @Override
   public dvj a(czs $$0) {
      erk $$1 = $$0.q().b_($$0.a());
      dvj $$2 = this.m().b(e, Boolean.valueOf(true)).b(f, Boolean.valueOf($$1.a() == erl.c));
      return a($$2, $$0.q(), $$0.a());
   }
}
