import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dkq extends djl {
   public static final MapCodec<dkq> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(mb.e.q().fieldOf("plant").forGetter($$0x -> $$0x.e), t()).apply($$0, dkq::new)
   );
   public static final int b = 5;
   public static final dxv c = dxm.ax;
   protected static final fbt d = djl.a(1.0, 0.0, 1.0, 15.0, 15.0, 15.0);
   private final djl e;

   @Override
   public MapCodec<dkq> a() {
      return a;
   }

   protected dkq(djl $$0, dwv.d $$1) {
      super($$1);
      this.e = $$0;
      this.l(this.F.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected void a(dww $$0, ard $$1, ji $$2, azh $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected boolean f(dww $$0) {
      return $$0.c(c) < 5;
   }

   @Override
   public fbt b_(dww $$0, dfm $$1, ji $$2) {
      return d;
   }

   @Override
   protected void b(dww $$0, ard $$1, ji $$2, azh $$3) {
      ji $$4 = $$2.d();
      if ($$1.u($$4) && $$4.v() <= $$1.an()) {
         int $$5 = $$0.c(c);
         if ($$5 < 5) {
            boolean $$6 = false;
            boolean $$7 = false;
            dww $$8 = $$1.a_($$2.e());
            if ($$8.a(djn.fU)) {
               $$6 = true;
            } else if ($$8.a(this.e)) {
               int $$9 = 1;

               for (int $$10 = 0; $$10 < 4; $$10++) {
                  dww $$11 = $$1.a_($$2.c($$9 + 1));
                  if (!$$11.a(this.e)) {
                     if ($$11.a(djn.fU)) {
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
               $$1.a($$2, dkr.a($$1, $$2, this.e.m()), 2);
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
                  $$1.a($$2, dkr.a($$1, $$2, this.e.m()), 2);
               } else {
                  this.a($$1, $$2);
               }
            } else {
               this.a($$1, $$2);
            }
         }
      }
   }

   private void a(dgh $$0, ji $$1, int $$2) {
      $$0.a($$1, this.m().b(c, Integer.valueOf($$2)), 2);
      $$0.c(1033, $$1, 0);
   }

   private void a(dgh $$0, ji $$1) {
      $$0.a($$1, this.m().b(c, Integer.valueOf(5)), 2);
      $$0.c(1034, $$1, 0);
   }

   private static boolean b(dgk $$0, ji $$1, @Nullable jn $$2) {
      for (jn $$3 : jn.c.a) {
         if ($$3 != $$2 && !$$0.u($$1.a($$3))) {
            return false;
         }
      }

      return true;
   }

   @Override
   protected dww a(dww $$0, dgk $$1, dgw $$2, ji $$3, jn $$4, ji $$5, dww $$6, azh $$7) {
      if ($$4 != jn.b && !$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dww $$0, dgk $$1, ji $$2) {
      dww $$3 = $$1.a_($$2.e());
      if (!$$3.a(this.e) && !$$3.a(djn.fU)) {
         if (!$$3.l()) {
            return false;
         } else {
            boolean $$4 = false;

            for (jn $$5 : jn.c.a) {
               dww $$6 = $$1.a_($$2.a($$5));
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
   protected void a(dwx.a<djl, dww> $$0) {
      $$0.a(c);
   }

   public static void a(dgi $$0, ji $$1, azh $$2, int $$3) {
      $$0.a($$1, dkr.a($$0, $$1, djn.kW.m()), 2);
      a($$0, $$1, $$2, $$1, $$3, 0);
   }

   private static void a(dgi $$0, ji $$1, azh $$2, ji $$3, int $$4, int $$5) {
      djl $$6 = djn.kW;
      int $$7 = $$2.a(4) + 1;
      if ($$5 == 0) {
         $$7++;
      }

      for (int $$8 = 0; $$8 < $$7; $$8++) {
         ji $$9 = $$1.b($$8 + 1);
         if (!b($$0, $$9, null)) {
            return;
         }

         $$0.a($$9, dkr.a($$0, $$9, $$6.m()), 2);
         $$0.a($$9.e(), dkr.a($$0, $$9.e(), $$6.m()), 2);
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
               $$0.a($$14, dkr.a($$0, $$14, $$6.m()), 2);
               $$0.a($$14.a($$13.g()), dkr.a($$0, $$14.a($$13.g()), $$6.m()), 2);
               a($$0, $$14, $$2, $$3, $$4, $$5 + 1);
            }
         }
      }

      if (!$$10) {
         $$0.a($$1.b($$7), djn.kX.m().b(c, Integer.valueOf(5)), 2);
      }
   }

   @Override
   protected void a(dgh $$0, dww $$1, fav $$2, cpp $$3) {
      ji $$4 = $$2.b();
      if ($$0 instanceof ard $$5 && $$3.c($$5, $$4) && $$3.a($$5)) {
         $$0.a($$4, true, $$3);
      }
   }
}
