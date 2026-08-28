import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dnx extends dmr {
   public static final MapCodec<dnx> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(mg.e.q().fieldOf("plant").forGetter($$0x -> $$0x.e), t()).apply($$0, dnx::new)
   );
   public static final int b = 5;
   public static final ebt c = ebj.ax;
   private static final ffw d = dmr.b(14.0, 0.0, 15.0);
   private final dmr e;

   @Override
   public MapCodec<dnx> a() {
      return a;
   }

   protected dnx(dmr $$0, eas.d $$1) {
      super($$1);
      this.e = $$0;
      this.l(this.C.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected void a(eat $$0, arq $$1, iv $$2, azv $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected boolean f(eat $$0) {
      return $$0.c(c) < 5;
   }

   @Override
   public ffw b_(eat $$0, diq $$1, iv $$2) {
      return d;
   }

   @Override
   protected void b(eat $$0, arq $$1, iv $$2, azv $$3) {
      iv $$4 = $$2.d();
      if ($$1.v($$4) && $$4.v() <= $$1.ao()) {
         int $$5 = $$0.c(c);
         if ($$5 < 5) {
            boolean $$6 = false;
            boolean $$7 = false;
            eat $$8 = $$1.a_($$2.e());
            if ($$8.a(dmt.fY)) {
               $$6 = true;
            } else if ($$8.a(this.e)) {
               int $$9 = 1;

               for (int $$10 = 0; $$10 < 4; $$10++) {
                  eat $$11 = $$1.a_($$2.c($$9 + 1));
                  if (!$$11.a(this.e)) {
                     if ($$11.a(dmt.fY)) {
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

            if ($$6 && b($$1, $$4, null) && $$1.v($$2.b(2))) {
               $$1.a($$2, dny.a($$1, $$2, this.e.m()), 2);
               this.a($$1, $$4, $$5);
            } else if ($$5 < 4) {
               int $$12 = $$3.a(4);
               if ($$7) {
                  $$12++;
               }

               boolean $$13 = false;

               for (int $$14 = 0; $$14 < $$12; $$14++) {
                  jb $$15 = jb.c.a.a($$3);
                  iv $$16 = $$2.a($$15);
                  if ($$1.v($$16) && $$1.v($$16.e()) && b($$1, $$16, $$15.g())) {
                     this.a($$1, $$16, $$5 + 1);
                     $$13 = true;
                  }
               }

               if ($$13) {
                  $$1.a($$2, dny.a($$1, $$2, this.e.m()), 2);
               } else {
                  this.a($$1, $$2);
               }
            } else {
               this.a($$1, $$2);
            }
         }
      }
   }

   private void a(djm $$0, iv $$1, int $$2) {
      $$0.a($$1, this.m().b(c, Integer.valueOf($$2)), 2);
      $$0.c(1033, $$1, 0);
   }

   private void a(djm $$0, iv $$1) {
      $$0.a($$1, this.m().b(c, Integer.valueOf(5)), 2);
      $$0.c(1034, $$1, 0);
   }

   private static boolean b(djp $$0, iv $$1, @Nullable jb $$2) {
      for (jb $$3 : jb.c.a) {
         if ($$3 != $$2 && !$$0.v($$1.a($$3))) {
            return false;
         }
      }

      return true;
   }

   @Override
   protected eat a(eat $$0, djp $$1, dkb $$2, iv $$3, jb $$4, iv $$5, eat $$6, azv $$7) {
      if ($$4 != jb.b && !$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(eat $$0, djp $$1, iv $$2) {
      eat $$3 = $$1.a_($$2.e());
      if (!$$3.a(this.e) && !$$3.a(dmt.fY)) {
         if (!$$3.l()) {
            return false;
         } else {
            boolean $$4 = false;

            for (jb $$5 : jb.c.a) {
               eat $$6 = $$1.a_($$2.a($$5));
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
   protected void a(eau.a<dmr, eat> $$0) {
      $$0.a(c);
   }

   public static void a(djn $$0, iv $$1, azv $$2, int $$3) {
      $$0.a($$1, dny.a($$0, $$1, dmt.la.m()), 2);
      a($$0, $$1, $$2, $$1, $$3, 0);
   }

   private static void a(djn $$0, iv $$1, azv $$2, iv $$3, int $$4, int $$5) {
      dmr $$6 = dmt.la;
      int $$7 = $$2.a(4) + 1;
      if ($$5 == 0) {
         $$7++;
      }

      for (int $$8 = 0; $$8 < $$7; $$8++) {
         iv $$9 = $$1.b($$8 + 1);
         if (!b($$0, $$9, null)) {
            return;
         }

         $$0.a($$9, dny.a($$0, $$9, $$6.m()), 2);
         $$0.a($$9.e(), dny.a($$0, $$9.e(), $$6.m()), 2);
      }

      boolean $$10 = false;
      if ($$5 < 4) {
         int $$11 = $$2.a(4);
         if ($$5 == 0) {
            $$11++;
         }

         for (int $$12 = 0; $$12 < $$11; $$12++) {
            jb $$13 = jb.c.a.a($$2);
            iv $$14 = $$1.b($$7).a($$13);
            if (Math.abs($$14.u() - $$3.u()) < $$4 && Math.abs($$14.w() - $$3.w()) < $$4 && $$0.v($$14) && $$0.v($$14.e()) && b($$0, $$14, $$13.g())) {
               $$10 = true;
               $$0.a($$14, dny.a($$0, $$14, $$6.m()), 2);
               $$0.a($$14.a($$13.g()), dny.a($$0, $$14.a($$13.g()), $$6.m()), 2);
               a($$0, $$14, $$2, $$3, $$4, $$5 + 1);
            }
         }
      }

      if (!$$10) {
         $$0.a($$1.b($$7), dmt.lb.m().b(c, Integer.valueOf(5)), 2);
      }
   }

   @Override
   protected void a(djm $$0, eat $$1, fey $$2, csh $$3) {
      iv $$4 = $$2.b();
      if ($$0 instanceof arq $$5 && $$3.c($$5, $$4) && $$3.a($$5)) {
         $$0.a($$4, true, $$3);
      }
   }
}
