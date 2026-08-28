import com.mojang.serialization.MapCodec;

public class dot extends die implements dpf {
   public static final MapCodec<dot> a = b(dot::new);
   private static final int f = 1;
   private static final fah g;
   private static final fah h;
   private static final fah i = die.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   private static final fah j = fae.b().a(0.0, -1.0, 0.0);
   public static final int b = 7;
   public static final dwj c = dvz.aW;
   public static final dwa d = dvz.C;
   public static final dwa e = dvz.b;

   @Override
   public MapCodec<dot> a() {
      return a;
   }

   protected dot(dvi.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Integer.valueOf(7)).b(d, Boolean.valueOf(false)).b(e, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dvk.a<die, dvj> $$0) {
      $$0.a(c, d, e);
   }

   @Override
   protected fah a(dvj $$0, deg $$1, jh $$2, ezs $$3) {
      if (!$$3.a($$0.b().j())) {
         return $$0.c(e) ? h : g;
      } else {
         return fae.b();
      }
   }

   @Override
   protected fah a(dvj $$0, deg $$1, jh $$2) {
      return fae.b();
   }

   @Override
   protected boolean a(dvj $$0, czs $$1) {
      return $$1.n().a(this.j());
   }

   @Override
   public dvj a(czs $$0) {
      jh $$1 = $$0.a();
      dfb $$2 = $$0.q();
      int $$3 = a($$2, $$1);
      return this.m().b(d, Boolean.valueOf($$2.b_($$1).a() == erl.c)).b(c, Integer.valueOf($$3)).b(e, Boolean.valueOf(this.a($$2, $$1, $$3)));
   }

   @Override
   protected void b(dvj $$0, dfb $$1, jh $$2, dvj $$3, boolean $$4) {
      if (!$$1.C) {
         $$1.a($$2, this, 1);
      }
   }

   @Override
   protected dvj a(dvj $$0, jm $$1, dvj $$2, dfc $$3, jh $$4, jh $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, erl.c, erl.c.a($$3));
      }

      if (!$$3.y_()) {
         $$3.a($$4, this, 1);
      }

      return $$0;
   }

   @Override
   protected void a(dvj $$0, arn $$1, jh $$2, azs $$3) {
      int $$4 = a($$1, $$2);
      dvj $$5 = $$0.b(c, Integer.valueOf($$4)).b(e, Boolean.valueOf(this.a($$1, $$2, $$4)));
      if ($$5.c(c) == 7) {
         if ($$0.c(c) == 7) {
            cku.a($$1, $$2, $$5);
         } else {
            $$1.b($$2, true);
         }
      } else if ($$0 != $$5) {
         $$1.a($$2, $$5, 3);
      }
   }

   @Override
   protected boolean a(dvj $$0, dfe $$1, jh $$2) {
      return a($$1, $$2) < 7;
   }

   @Override
   protected fah b(dvj $$0, deg $$1, jh $$2, ezs $$3) {
      if ($$3.a(fae.b(), $$2, true) && !$$3.b()) {
         return g;
      } else {
         return $$0.c(c) != 0 && $$0.c(e) && $$3.a(j, $$2, true) ? i : fae.a();
      }
   }

   @Override
   protected erk b_(dvj $$0) {
      return $$0.c(d) ? erl.c.a(false) : super.b_($$0);
   }

   private boolean a(deg $$0, jh $$1, int $$2) {
      return $$2 > 0 && !$$0.a_($$1.e()).a(this);
   }

   public static int a(deg $$0, jh $$1) {
      jh.a $$2 = $$1.k().c(jm.a);
      dvj $$3 = $$0.a_($$2);
      int $$4 = 7;
      if ($$3.a(dig.nS)) {
         $$4 = $$3.c(c);
      } else if ($$3.c($$0, $$2, jm.b)) {
         return 0;
      }

      for (jm $$5 : jm.c.a) {
         dvj $$6 = $$0.a_($$2.a($$1, $$5));
         if ($$6.a(dig.nS)) {
            $$4 = Math.min($$4, $$6.c(c) + 1);
            if ($$4 == 1) {
               break;
            }
         }
      }

      return $$4;
   }

   static {
      fah $$0 = die.a(0.0, 14.0, 0.0, 16.0, 16.0, 16.0);
      fah $$1 = die.a(0.0, 0.0, 0.0, 2.0, 16.0, 2.0);
      fah $$2 = die.a(14.0, 0.0, 0.0, 16.0, 16.0, 2.0);
      fah $$3 = die.a(0.0, 0.0, 14.0, 2.0, 16.0, 16.0);
      fah $$4 = die.a(14.0, 0.0, 14.0, 16.0, 16.0, 16.0);
      g = fae.a($$0, $$1, $$2, $$3, $$4);
      fah $$5 = die.a(0.0, 0.0, 0.0, 2.0, 2.0, 16.0);
      fah $$6 = die.a(14.0, 0.0, 0.0, 16.0, 2.0, 16.0);
      fah $$7 = die.a(0.0, 0.0, 14.0, 16.0, 2.0, 16.0);
      fah $$8 = die.a(0.0, 0.0, 0.0, 16.0, 2.0, 2.0);
      h = fae.a(dot.i, g, $$6, $$5, $$8, $$7);
   }
}
