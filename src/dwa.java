import com.mojang.serialization.Codec;

public class dwa extends dvq<dvz> {
   private static final float a = 0.06F;

   public dwa(Codec<dvz> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dvs<dvz> $$0) {
      cxu $$1 = $$0.b();
      ib $$2 = $$0.e();
      axd $$3 = $$0.d();
      dow $$4 = $$0.c();
      dvz $$5 = $$0.f();
      daa $$6 = $$5.b.b();
      ib $$7 = null;
      dmz $$8 = $$1.a_($$2.d());
      if ($$8.a($$6)) {
         $$7 = $$2;
      }

      if ($$7 == null) {
         return false;
      } else {
         int $$9 = aww.a($$3, 4, 13);
         if ($$3.a(12) == 0) {
            $$9 *= 2;
         }

         if (!$$5.g) {
            int $$10 = $$4.d();
            if ($$7.v() + $$9 + 1 >= $$10) {
               return false;
            }
         }

         boolean $$11 = !$$5.g && $$3.i() < 0.06F;
         $$1.a($$2, dac.a.o(), 4);
         this.a($$1, $$3, $$5, $$7, $$9, $$11);
         this.b($$1, $$3, $$5, $$7, $$9, $$11);
         return true;
      }
   }

   private static boolean a(cxu $$0, ib $$1, dvz $$2, boolean $$3) {
      if ($$0.a($$1, dmy.a::r)) {
         return true;
      } else {
         return $$3 ? $$2.f.test($$0, $$1) : false;
      }
   }

   private void a(cxu $$0, axd $$1, dvz $$2, ib $$3, int $$4, boolean $$5) {
      ib.a $$6 = new ib.a();
      dmz $$7 = $$2.c;
      int $$8 = $$5 ? 1 : 0;

      for (int $$9 = -$$8; $$9 <= $$8; $$9++) {
         for (int $$10 = -$$8; $$10 <= $$8; $$10++) {
            boolean $$11 = $$5 && aww.a($$9) == $$8 && aww.a($$10) == $$8;

            for (int $$12 = 0; $$12 < $$4; $$12++) {
               $$6.a($$3, $$9, $$12, $$10);
               if (a($$0, $$6, $$2, true)) {
                  if ($$2.g) {
                     if (!$$0.a_($$6.d()).i()) {
                        $$0.b($$6, true);
                     }

                     $$0.a($$6, $$7, 3);
                  } else if ($$11) {
                     if ($$1.i() < 0.1F) {
                        this.a($$0, $$6, $$7);
                     }
                  } else {
                     this.a($$0, $$6, $$7);
                  }
               }
            }
         }
      }
   }

   private void b(cxu $$0, axd $$1, dvz $$2, ib $$3, int $$4, boolean $$5) {
      ib.a $$6 = new ib.a();
      boolean $$7 = $$2.d.a(dac.kK);
      int $$8 = Math.min($$1.a(1 + $$4 / 3) + 5, $$4);
      int $$9 = $$4 - $$8;

      for (int $$10 = $$9; $$10 <= $$4; $$10++) {
         int $$11 = $$10 < $$4 - $$1.a(3) ? 2 : 1;
         if ($$8 > 8 && $$10 < $$9 + 4) {
            $$11 = 3;
         }

         if ($$5) {
            $$11++;
         }

         for (int $$12 = -$$11; $$12 <= $$11; $$12++) {
            for (int $$13 = -$$11; $$13 <= $$11; $$13++) {
               boolean $$14 = $$12 == -$$11 || $$12 == $$11;
               boolean $$15 = $$13 == -$$11 || $$13 == $$11;
               boolean $$16 = !$$14 && !$$15 && $$10 != $$4;
               boolean $$17 = $$14 && $$15;
               boolean $$18 = $$10 < $$9 + 3;
               $$6.a($$3, $$12, $$10, $$13);
               if (a($$0, $$6, $$2, false)) {
                  if ($$2.g && !$$0.a_($$6.d()).i()) {
                     $$0.b($$6, true);
                  }

                  if ($$18) {
                     if (!$$16) {
                        this.a($$0, $$1, $$6, $$2.d, $$7);
                     }
                  } else if ($$16) {
                     this.a($$0, $$1, $$2, $$6, 0.1F, 0.2F, $$7 ? 0.1F : 0.0F);
                  } else if ($$17) {
                     this.a($$0, $$1, $$2, $$6, 0.01F, 0.7F, $$7 ? 0.083F : 0.0F);
                  } else {
                     this.a($$0, $$1, $$2, $$6, 5.0E-4F, 0.98F, $$7 ? 0.07F : 0.0F);
                  }
               }
            }
         }
      }
   }

   private void a(cxa $$0, axd $$1, dvz $$2, ib.a $$3, float $$4, float $$5, float $$6) {
      if ($$1.i() < $$4) {
         this.a($$0, $$3, $$2.e);
      } else if ($$1.i() < $$5) {
         this.a($$0, $$3, $$2.d);
         if ($$1.i() < $$6) {
            a($$3, $$0, $$1);
         }
      }
   }

   private void a(cxa $$0, axd $$1, ib $$2, dmz $$3, boolean $$4) {
      if ($$0.a_($$2.d()).a($$3.b())) {
         this.a($$0, $$2, $$3);
      } else if ((double)$$1.i() < 0.15) {
         this.a($$0, $$2, $$3);
         if ($$4 && $$1.a(11) == 0) {
            a($$2, $$0, $$1);
         }
      }
   }

   private static void a(ib $$0, cxa $$1, axd $$2) {
      ib.a $$3 = $$0.j().c(ih.a);
      if ($$1.u($$3)) {
         int $$4 = aww.a($$2, 1, 5);
         if ($$2.a(7) == 0) {
            $$4 *= 2;
         }

         int $$5 = 23;
         int $$6 = 25;
         dxj.a($$1, $$2, $$3, $$4, 23, 25);
      }
   }
}
