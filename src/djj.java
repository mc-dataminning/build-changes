import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class djj extends die {
   public static final MapCodec<djj> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ly.e.q().fieldOf("plant").forGetter($$0x -> $$0x.e), t()).apply($$0, djj::new)
   );
   public static final int b = 5;
   public static final dwj c = dvz.au;
   protected static final fah d = die.a(1.0, 0.0, 1.0, 15.0, 15.0, 15.0);
   private final die e;

   @Override
   public MapCodec<djj> a() {
      return a;
   }

   protected djj(die $$0, dvi.d $$1) {
      super($$1);
      this.e = $$0;
      this.l(this.F.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected void a(dvj $$0, arn $$1, jh $$2, azs $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected boolean f(dvj $$0) {
      return $$0.c(c) < 5;
   }

   @Override
   public fah b_(dvj $$0, deg $$1, jh $$2) {
      return d;
   }

   @Override
   protected void b(dvj $$0, arn $$1, jh $$2, azs $$3) {
      jh $$4 = $$2.d();
      if ($$1.u($$4) && $$4.v() <= $$1.al()) {
         int $$5 = $$0.c(c);
         if ($$5 < 5) {
            boolean $$6 = false;
            boolean $$7 = false;
            dvj $$8 = $$1.a_($$2.e());
            if ($$8.a(dig.fz)) {
               $$6 = true;
            } else if ($$8.a(this.e)) {
               int $$9 = 1;

               for (int $$10 = 0; $$10 < 4; $$10++) {
                  dvj $$11 = $$1.a_($$2.c($$9 + 1));
                  if (!$$11.a(this.e)) {
                     if ($$11.a(dig.fz)) {
                        $$7 = true;
                     }
                     break;
                  }

                  $$9++;
               }

               if ($$9 < 2 || $$9 <= $$3.a($$7 ? 5 : 4)) {
                  $$6 = true;
               }
            } else if ($$8.l()) {
               $$6 = true;
            }

            if ($$6 && b($$1, $$4, null) && $$1.u($$2.b(2))) {
               $$1.a($$2, djk.a($$1, $$2, this.e.m()), 2);
               this.a($$1, $$4, $$5);
            } else if ($$5 < 4) {
               int $$12 = $$3.a(4);
               if ($$7) {
                  $$12++;
               }

               boolean $$13 = false;

               for (int $$14 = 0; $$14 < $$12; $$14++) {
                  jm $$15 = jm.c.a.a($$3);
                  jh $$16 = $$2.a($$15);
                  if ($$1.u($$16) && $$1.u($$16.e()) && b($$1, $$16, $$15.g())) {
                     this.a($$1, $$16, $$5 + 1);
                     $$13 = true;
                  }
               }

               if ($$13) {
                  $$1.a($$2, djk.a($$1, $$2, this.e.m()), 2);
               } else {
                  this.a($$1, $$2);
               }
            } else {
               this.a($$1, $$2);
            }
         }
      }
   }

   private void a(dfb $$0, jh $$1, int $$2) {
      $$0.a($$1, this.m().b(c, Integer.valueOf($$2)), 2);
      $$0.c(1033, $$1, 0);
   }

   private void a(dfb $$0, jh $$1) {
      $$0.a($$1, this.m().b(c, Integer.valueOf(5)), 2);
      $$0.c(1034, $$1, 0);
   }

   private static boolean b(dfe $$0, jh $$1, @Nullable jm $$2) {
      for (jm $$3 : jm.c.a) {
         if ($$3 != $$2 && !$$0.u($$1.a($$3))) {
            return false;
         }
      }

      return true;
   }

   @Override
   protected dvj a(dvj $$0, jm $$1, dvj $$2, dfc $$3, jh $$4, jh $$5) {
      if ($$1 != jm.b && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dvj $$0, dfe $$1, jh $$2) {
      dvj $$3 = $$1.a_($$2.e());
      if (!$$3.a(this.e) && !$$3.a(dig.fz)) {
         if (!$$3.l()) {
            return false;
         } else {
            boolean $$4 = false;

            for (jm $$5 : jm.c.a) {
               dvj $$6 = $$1.a_($$2.a($$5));
               if ($$6.a(this.e)) {
                  if ($$4) {
                     return false;
                  }

                  $$4 = true;
               } else if (!$$6.l()) {
                  return false;
               }
            }

            return $$4;
         }
      } else {
         return true;
      }
   }

   @Override
   protected void a(dvk.a<die, dvj> $$0) {
      $$0.a(c);
   }

   public static void a(dfc $$0, jh $$1, azs $$2, int $$3) {
      $$0.a($$1, djk.a($$0, $$1, dig.ku.m()), 2);
      a($$0, $$1, $$2, $$1, $$3, 0);
   }

   private static void a(dfc $$0, jh $$1, azs $$2, jh $$3, int $$4, int $$5) {
      die $$6 = dig.ku;
      int $$7 = $$2.a(4) + 1;
      if ($$5 == 0) {
         $$7++;
      }

      for (int $$8 = 0; $$8 < $$7; $$8++) {
         jh $$9 = $$1.b($$8 + 1);
         if (!b($$0, $$9, null)) {
            return;
         }

         $$0.a($$9, djk.a($$0, $$9, $$6.m()), 2);
         $$0.a($$9.e(), djk.a($$0, $$9.e(), $$6.m()), 2);
      }

      boolean $$10 = false;
      if ($$5 < 4) {
         int $$11 = $$2.a(4);
         if ($$5 == 0) {
            $$11++;
         }

         for (int $$12 = 0; $$12 < $$11; $$12++) {
            jm $$13 = jm.c.a.a($$2);
            jh $$14 = $$1.b($$7).a($$13);
            if (Math.abs($$14.u() - $$3.u()) < $$4 && Math.abs($$14.w() - $$3.w()) < $$4 && $$0.u($$14) && $$0.u($$14.e()) && b($$0, $$14, $$13.g())) {
               $$10 = true;
               $$0.a($$14, djk.a($$0, $$14, $$6.m()), 2);
               $$0.a($$14.a($$13.g()), djk.a($$0, $$14.a($$13.g()), $$6.m()), 2);
               a($$0, $$14, $$2, $$3, $$4, $$5 + 1);
            }
         }
      }

      if (!$$10) {
         $$0.a($$1.b($$7), dig.kv.m().b(c, Integer.valueOf(5)), 2);
      }
   }

   @Override
   protected void a(dfb $$0, dvj $$1, ezj $$2, cpg $$3) {
      jh $$4 = $$2.b();
      if (!$$0.C && $$3.a($$0, $$4) && $$3.b($$0)) {
         $$0.a($$4, true, $$3);
      }
   }
}
