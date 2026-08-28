import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dkp extends djk {
   public static final MapCodec<dkp> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(mb.e.q().fieldOf("plant").forGetter($$0x -> $$0x.e), t()).apply($$0, dkp::new)
   );
   public static final int b = 5;
   public static final dxu c = dxl.ax;
   protected static final fbs d = djk.a(1.0, 0.0, 1.0, 15.0, 15.0, 15.0);
   private final djk e;

   @Override
   public MapCodec<dkp> a() {
      return a;
   }

   protected dkp(djk $$0, dwu.d $$1) {
      super($$1);
      this.e = $$0;
      this.l(this.F.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected void a(dwv $$0, arc $$1, ji $$2, azg $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected boolean f(dwv $$0) {
      return $$0.c(c) < 5;
   }

   @Override
   public fbs b_(dwv $$0, dfl $$1, ji $$2) {
      return d;
   }

   @Override
   protected void b(dwv $$0, arc $$1, ji $$2, azg $$3) {
      ji $$4 = $$2.d();
      if ($$1.u($$4) && $$4.v() <= $$1.an()) {
         int $$5 = $$0.c(c);
         if ($$5 < 5) {
            boolean $$6 = false;
            boolean $$7 = false;
            dwv $$8 = $$1.a_($$2.e());
            if ($$8.a(djm.fU)) {
               $$6 = true;
            } else if ($$8.a(this.e)) {
               int $$9 = 1;

               for (int $$10 = 0; $$10 < 4; $$10++) {
                  dwv $$11 = $$1.a_($$2.c($$9 + 1));
                  if (!$$11.a(this.e)) {
                     if ($$11.a(djm.fU)) {
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
               $$1.a($$2, dkq.a($$1, $$2, this.e.m()), 2);
               this.a($$1, $$4, $$5);
            } else if ($$5 < 4) {
               int $$12 = $$3.a(4);
               if ($$7) {
                  $$12++;
               }

               boolean $$13 = false;

               for (int $$14 = 0; $$14 < $$12; $$14++) {
                  jn $$15 = jn.c.a.a($$3);
                  ji $$16 = $$2.a($$15);
                  if ($$1.u($$16) && $$1.u($$16.e()) && b($$1, $$16, $$15.g())) {
                     this.a($$1, $$16, $$5 + 1);
                     $$13 = true;
                  }
               }

               if ($$13) {
                  $$1.a($$2, dkq.a($$1, $$2, this.e.m()), 2);
               } else {
                  this.a($$1, $$2);
               }
            } else {
               this.a($$1, $$2);
            }
         }
      }
   }

   private void a(dgg $$0, ji $$1, int $$2) {
      $$0.a($$1, this.m().b(c, Integer.valueOf($$2)), 2);
      $$0.c(1033, $$1, 0);
   }

   private void a(dgg $$0, ji $$1) {
      $$0.a($$1, this.m().b(c, Integer.valueOf(5)), 2);
      $$0.c(1034, $$1, 0);
   }

   private static boolean b(dgj $$0, ji $$1, @Nullable jn $$2) {
      for (jn $$3 : jn.c.a) {
         if ($$3 != $$2 && !$$0.u($$1.a($$3))) {
            return false;
         }
      }

      return true;
   }

   @Override
   protected dwv a(dwv $$0, dgj $$1, dgv $$2, ji $$3, jn $$4, ji $$5, dwv $$6, azg $$7) {
      if ($$4 != jn.b && !$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dwv $$0, dgj $$1, ji $$2) {
      dwv $$3 = $$1.a_($$2.e());
      if (!$$3.a(this.e) && !$$3.a(djm.fU)) {
         if (!$$3.l()) {
            return false;
         } else {
            boolean $$4 = false;

            for (jn $$5 : jn.c.a) {
               dwv $$6 = $$1.a_($$2.a($$5));
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
   protected void a(dww.a<djk, dwv> $$0) {
      $$0.a(c);
   }

   public static void a(dgh $$0, ji $$1, azg $$2, int $$3) {
      $$0.a($$1, dkq.a($$0, $$1, djm.kW.m()), 2);
      a($$0, $$1, $$2, $$1, $$3, 0);
   }

   private static void a(dgh $$0, ji $$1, azg $$2, ji $$3, int $$4, int $$5) {
      djk $$6 = djm.kW;
      int $$7 = $$2.a(4) + 1;
      if ($$5 == 0) {
         $$7++;
      }

      for (int $$8 = 0; $$8 < $$7; $$8++) {
         ji $$9 = $$1.b($$8 + 1);
         if (!b($$0, $$9, null)) {
            return;
         }

         $$0.a($$9, dkq.a($$0, $$9, $$6.m()), 2);
         $$0.a($$9.e(), dkq.a($$0, $$9.e(), $$6.m()), 2);
      }

      boolean $$10 = false;
      if ($$5 < 4) {
         int $$11 = $$2.a(4);
         if ($$5 == 0) {
            $$11++;
         }

         for (int $$12 = 0; $$12 < $$11; $$12++) {
            jn $$13 = jn.c.a.a($$2);
            ji $$14 = $$1.b($$7).a($$13);
            if (Math.abs($$14.u() - $$3.u()) < $$4 && Math.abs($$14.w() - $$3.w()) < $$4 && $$0.u($$14) && $$0.u($$14.e()) && b($$0, $$14, $$13.g())) {
               $$10 = true;
               $$0.a($$14, dkq.a($$0, $$14, $$6.m()), 2);
               $$0.a($$14.a($$13.g()), dkq.a($$0, $$14.a($$13.g()), $$6.m()), 2);
               a($$0, $$14, $$2, $$3, $$4, $$5 + 1);
            }
         }
      }

      if (!$$10) {
         $$0.a($$1.b($$7), djm.kX.m().b(c, Integer.valueOf(5)), 2);
      }
   }

   @Override
   protected void a(dgg $$0, dwv $$1, fau $$2, cpo $$3) {
      ji $$4 = $$2.b();
      if ($$0 instanceof arc $$5 && $$3.c($$5, $$4) && $$3.a($$5)) {
         $$0.a($$4, true, $$3);
      }
   }
}
