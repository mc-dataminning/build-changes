import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dli extends dkd {
   public static final MapCodec<dli> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ma.e.q().fieldOf("plant").forGetter($$0x -> $$0x.e), t()).apply($$0, dli::new)
   );
   public static final int b = 5;
   public static final dyn c = dye.ax;
   protected static final fcl d = dkd.a(1.0, 0.0, 1.0, 15.0, 15.0, 15.0);
   private final dkd e;

   @Override
   public MapCodec<dli> a() {
      return a;
   }

   protected dli(dkd $$0, dxn.d $$1) {
      super($$1);
      this.e = $$0;
      this.l(this.F.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected void a(dxo $$0, arx $$1, jh $$2, bac $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected boolean f(dxo $$0) {
      return $$0.c(c) < 5;
   }

   @Override
   public fcl b_(dxo $$0, dge $$1, jh $$2) {
      return d;
   }

   @Override
   protected void b(dxo $$0, arx $$1, jh $$2, bac $$3) {
      jh $$4 = $$2.d();
      if ($$1.u($$4) && $$4.v() <= $$1.an()) {
         int $$5 = $$0.c(c);
         if ($$5 < 5) {
            boolean $$6 = false;
            boolean $$7 = false;
            dxo $$8 = $$1.a_($$2.e());
            if ($$8.a(dkf.fU)) {
               $$6 = true;
            } else if ($$8.a(this.e)) {
               int $$9 = 1;

               for (int $$10 = 0; $$10 < 4; $$10++) {
                  dxo $$11 = $$1.a_($$2.c($$9 + 1));
                  if (!$$11.a(this.e)) {
                     if ($$11.a(dkf.fU)) {
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
               $$1.a($$2, dlj.a($$1, $$2, this.e.m()), 2);
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
                  $$1.a($$2, dlj.a($$1, $$2, this.e.m()), 2);
               } else {
                  this.a($$1, $$2);
               }
            } else {
               this.a($$1, $$2);
            }
         }
      }
   }

   private void a(dgz $$0, jh $$1, int $$2) {
      $$0.a($$1, this.m().b(c, Integer.valueOf($$2)), 2);
      $$0.c(1033, $$1, 0);
   }

   private void a(dgz $$0, jh $$1) {
      $$0.a($$1, this.m().b(c, Integer.valueOf(5)), 2);
      $$0.c(1034, $$1, 0);
   }

   private static boolean b(dhc $$0, jh $$1, @Nullable jm $$2) {
      for (jm $$3 : jm.c.a) {
         if ($$3 != $$2 && !$$0.u($$1.a($$3))) {
            return false;
         }
      }

      return true;
   }

   @Override
   protected dxo a(dxo $$0, dhc $$1, dho $$2, jh $$3, jm $$4, jh $$5, dxo $$6, bac $$7) {
      if ($$4 != jm.b && !$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dxo $$0, dhc $$1, jh $$2) {
      dxo $$3 = $$1.a_($$2.e());
      if (!$$3.a(this.e) && !$$3.a(dkf.fU)) {
         if (!$$3.l()) {
            return false;
         } else {
            boolean $$4 = false;

            for (jm $$5 : jm.c.a) {
               dxo $$6 = $$1.a_($$2.a($$5));
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
   protected void a(dxp.a<dkd, dxo> $$0) {
      $$0.a(c);
   }

   public static void a(dha $$0, jh $$1, bac $$2, int $$3) {
      $$0.a($$1, dlj.a($$0, $$1, dkf.kW.m()), 2);
      a($$0, $$1, $$2, $$1, $$3, 0);
   }

   private static void a(dha $$0, jh $$1, bac $$2, jh $$3, int $$4, int $$5) {
      dkd $$6 = dkf.kW;
      int $$7 = $$2.a(4) + 1;
      if ($$5 == 0) {
         $$7++;
      }

      for (int $$8 = 0; $$8 < $$7; $$8++) {
         jh $$9 = $$1.b($$8 + 1);
         if (!b($$0, $$9, null)) {
            return;
         }

         $$0.a($$9, dlj.a($$0, $$9, $$6.m()), 2);
         $$0.a($$9.e(), dlj.a($$0, $$9.e(), $$6.m()), 2);
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
               $$0.a($$14, dlj.a($$0, $$14, $$6.m()), 2);
               $$0.a($$14.a($$13.g()), dlj.a($$0, $$14.a($$13.g()), $$6.m()), 2);
               a($$0, $$14, $$2, $$3, $$4, $$5 + 1);
            }
         }
      }

      if (!$$10) {
         $$0.a($$1.b($$7), dkf.kX.m().b(c, Integer.valueOf(5)), 2);
      }
   }

   @Override
   protected void a(dgz $$0, dxo $$1, fbn $$2, cqh $$3) {
      jh $$4 = $$2.b();
      if ($$0 instanceof arx $$5 && $$3.c($$5, $$4) && $$3.a($$5)) {
         $$0.a($$4, true, $$3);
      }
   }
}
