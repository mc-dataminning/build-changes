import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dnf extends dma {
   public static final MapCodec<dnf> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(mf.e.q().fieldOf("plant").forGetter($$0x -> $$0x.e), t()).apply($$0, dnf::new)
   );
   public static final int b = 5;
   public static final eaz c = eap.ax;
   private static final ffc d = dma.b(14.0, 0.0, 15.0);
   private final dma e;

   @Override
   public MapCodec<dnf> a() {
      return a;
   }

   protected dnf(dma $$0, dzy.d $$1) {
      super($$1);
      this.e = $$0;
      this.l(this.B.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected void a(dzz $$0, arq $$1, iu $$2, azv $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected boolean f(dzz $$0) {
      return $$0.c(c) < 5;
   }

   @Override
   public ffc b_(dzz $$0, dib $$1, iu $$2) {
      return d;
   }

   @Override
   protected void b(dzz $$0, arq $$1, iu $$2, azv $$3) {
      iu $$4 = $$2.d();
      if ($$1.v($$4) && $$4.v() <= $$1.ao()) {
         int $$5 = $$0.c(c);
         if ($$5 < 5) {
            boolean $$6 = false;
            boolean $$7 = false;
            dzz $$8 = $$1.a_($$2.e());
            if ($$8.a(dmc.fV)) {
               $$6 = true;
            } else if ($$8.a(this.e)) {
               int $$9 = 1;

               for (int $$10 = 0; $$10 < 4; $$10++) {
                  dzz $$11 = $$1.a_($$2.c($$9 + 1));
                  if (!$$11.a(this.e)) {
                     if ($$11.a(dmc.fV)) {
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
               $$1.a($$2, dng.a($$1, $$2, this.e.m()), 2);
               this.a($$1, $$4, $$5);
            } else if ($$5 < 4) {
               int $$12 = $$3.a(4);
               if ($$7) {
                  $$12++;
               }

               boolean $$13 = false;

               for (int $$14 = 0; $$14 < $$12; $$14++) {
                  ja $$15 = ja.c.a.a($$3);
                  iu $$16 = $$2.a($$15);
                  if ($$1.v($$16) && $$1.v($$16.e()) && b($$1, $$16, $$15.g())) {
                     this.a($$1, $$16, $$5 + 1);
                     $$13 = true;
                  }
               }

               if ($$13) {
                  $$1.a($$2, dng.a($$1, $$2, this.e.m()), 2);
               } else {
                  this.a($$1, $$2);
               }
            } else {
               this.a($$1, $$2);
            }
         }
      }
   }

   private void a(div $$0, iu $$1, int $$2) {
      $$0.a($$1, this.m().b(c, Integer.valueOf($$2)), 2);
      $$0.c(1033, $$1, 0);
   }

   private void a(div $$0, iu $$1) {
      $$0.a($$1, this.m().b(c, Integer.valueOf(5)), 2);
      $$0.c(1034, $$1, 0);
   }

   private static boolean b(diy $$0, iu $$1, @Nullable ja $$2) {
      for (ja $$3 : ja.c.a) {
         if ($$3 != $$2 && !$$0.v($$1.a($$3))) {
            return false;
         }
      }

      return true;
   }

   @Override
   protected dzz a(dzz $$0, diy $$1, djk $$2, iu $$3, ja $$4, iu $$5, dzz $$6, azv $$7) {
      if ($$4 != ja.b && !$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dzz $$0, diy $$1, iu $$2) {
      dzz $$3 = $$1.a_($$2.e());
      if (!$$3.a(this.e) && !$$3.a(dmc.fV)) {
         if (!$$3.l()) {
            return false;
         } else {
            boolean $$4 = false;

            for (ja $$5 : ja.c.a) {
               dzz $$6 = $$1.a_($$2.a($$5));
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
   protected void a(eaa.a<dma, dzz> $$0) {
      $$0.a(c);
   }

   public static void a(diw $$0, iu $$1, azv $$2, int $$3) {
      $$0.a($$1, dng.a($$0, $$1, dmc.kX.m()), 2);
      a($$0, $$1, $$2, $$1, $$3, 0);
   }

   private static void a(diw $$0, iu $$1, azv $$2, iu $$3, int $$4, int $$5) {
      dma $$6 = dmc.kX;
      int $$7 = $$2.a(4) + 1;
      if ($$5 == 0) {
         $$7++;
      }

      for (int $$8 = 0; $$8 < $$7; $$8++) {
         iu $$9 = $$1.b($$8 + 1);
         if (!b($$0, $$9, null)) {
            return;
         }

         $$0.a($$9, dng.a($$0, $$9, $$6.m()), 2);
         $$0.a($$9.e(), dng.a($$0, $$9.e(), $$6.m()), 2);
      }

      boolean $$10 = false;
      if ($$5 < 4) {
         int $$11 = $$2.a(4);
         if ($$5 == 0) {
            $$11++;
         }

         for (int $$12 = 0; $$12 < $$11; $$12++) {
            ja $$13 = ja.c.a.a($$2);
            iu $$14 = $$1.b($$7).a($$13);
            if (Math.abs($$14.u() - $$3.u()) < $$4 && Math.abs($$14.w() - $$3.w()) < $$4 && $$0.v($$14) && $$0.v($$14.e()) && b($$0, $$14, $$13.g())) {
               $$10 = true;
               $$0.a($$14, dng.a($$0, $$14, $$6.m()), 2);
               $$0.a($$14.a($$13.g()), dng.a($$0, $$14.a($$13.g()), $$6.m()), 2);
               a($$0, $$14, $$2, $$3, $$4, $$5 + 1);
            }
         }
      }

      if (!$$10) {
         $$0.a($$1.b($$7), dmc.kY.m().b(c, Integer.valueOf(5)), 2);
      }
   }

   @Override
   protected void a(div $$0, dzz $$1, fee $$2, crs $$3) {
      iu $$4 = $$2.b();
      if ($$0 instanceof arq $$5 && $$3.c($$5, $$4) && $$3.a($$5)) {
         $$0.a($$4, true, $$3);
      }
   }
}
