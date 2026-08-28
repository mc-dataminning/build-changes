import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dou extends dno {
   public static final MapCodec<dou> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(mh.e.q().fieldOf("plant").forGetter($$0x -> $$0x.e), t()).apply($$0, dou::new)
   );
   public static final int b = 5;
   public static final ecq c = ecg.ax;
   private static final fgw d = dno.b(14.0, 0.0, 15.0);
   private final dno e;

   @Override
   public MapCodec<dou> a() {
      return a;
   }

   protected dou(dno $$0, ebp.d $$1) {
      super($$1);
      this.e = $$0;
      this.l(this.C.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected void a(ebq $$0, asb $$1, iw $$2, bai $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected boolean f(ebq $$0) {
      return $$0.c(c) < 5;
   }

   @Override
   public fgw b_(ebq $$0, djn $$1, iw $$2) {
      return d;
   }

   @Override
   protected void b(ebq $$0, asb $$1, iw $$2, bai $$3) {
      iw $$4 = $$2.d();
      if ($$1.v($$4) && $$4.v() <= $$1.ao()) {
         int $$5 = $$0.c(c);
         if ($$5 < 5) {
            boolean $$6 = false;
            boolean $$7 = false;
            ebq $$8 = $$1.a_($$2.e());
            if ($$8.a(dnq.fY)) {
               $$6 = true;
            } else if ($$8.a(this.e)) {
               int $$9 = 1;

               for (int $$10 = 0; $$10 < 4; $$10++) {
                  ebq $$11 = $$1.a_($$2.c($$9 + 1));
                  if (!$$11.a(this.e)) {
                     if ($$11.a(dnq.fY)) {
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
               $$1.a($$2, dov.a($$1, $$2, this.e.m()), 2);
               this.a($$1, $$4, $$5);
            } else if ($$5 < 4) {
               int $$12 = $$3.a(4);
               if ($$7) {
                  $$12++;
               }

               boolean $$13 = false;

               for (int $$14 = 0; $$14 < $$12; $$14++) {
                  jc $$15 = jc.c.a.a($$3);
                  iw $$16 = $$2.a($$15);
                  if ($$1.v($$16) && $$1.v($$16.e()) && b($$1, $$16, $$15.g())) {
                     this.a($$1, $$16, $$5 + 1);
                     $$13 = true;
                  }
               }

               if ($$13) {
                  $$1.a($$2, dov.a($$1, $$2, this.e.m()), 2);
               } else {
                  this.a($$1, $$2);
               }
            } else {
               this.a($$1, $$2);
            }
         }
      }
   }

   private void a(dkj $$0, iw $$1, int $$2) {
      $$0.a($$1, this.m().b(c, Integer.valueOf($$2)), 2);
      $$0.c(1033, $$1, 0);
   }

   private void a(dkj $$0, iw $$1) {
      $$0.a($$1, this.m().b(c, Integer.valueOf(5)), 2);
      $$0.c(1034, $$1, 0);
   }

   private static boolean b(dkm $$0, iw $$1, @Nullable jc $$2) {
      for (jc $$3 : jc.c.a) {
         if ($$3 != $$2 && !$$0.v($$1.a($$3))) {
            return false;
         }
      }

      return true;
   }

   @Override
   protected ebq a(ebq $$0, dkm $$1, dky $$2, iw $$3, jc $$4, iw $$5, ebq $$6, bai $$7) {
      if ($$4 != jc.b && !$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(ebq $$0, dkm $$1, iw $$2) {
      ebq $$3 = $$1.a_($$2.e());
      if (!$$3.a(this.e) && !$$3.a(dnq.fY)) {
         if (!$$3.l()) {
            return false;
         } else {
            boolean $$4 = false;

            for (jc $$5 : jc.c.a) {
               ebq $$6 = $$1.a_($$2.a($$5));
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
   protected void a(ebr.a<dno, ebq> $$0) {
      $$0.a(c);
   }

   public static void a(dkk $$0, iw $$1, bai $$2, int $$3) {
      $$0.a($$1, dov.a($$0, $$1, dnq.la.m()), 2);
      a($$0, $$1, $$2, $$1, $$3, 0);
   }

   private static void a(dkk $$0, iw $$1, bai $$2, iw $$3, int $$4, int $$5) {
      dno $$6 = dnq.la;
      int $$7 = $$2.a(4) + 1;
      if ($$5 == 0) {
         $$7++;
      }

      for (int $$8 = 0; $$8 < $$7; $$8++) {
         iw $$9 = $$1.b($$8 + 1);
         if (!b($$0, $$9, null)) {
            return;
         }

         $$0.a($$9, dov.a($$0, $$9, $$6.m()), 2);
         $$0.a($$9.e(), dov.a($$0, $$9.e(), $$6.m()), 2);
      }

      boolean $$10 = false;
      if ($$5 < 4) {
         int $$11 = $$2.a(4);
         if ($$5 == 0) {
            $$11++;
         }

         for (int $$12 = 0; $$12 < $$11; $$12++) {
            jc $$13 = jc.c.a.a($$2);
            iw $$14 = $$1.b($$7).a($$13);
            if (Math.abs($$14.u() - $$3.u()) < $$4 && Math.abs($$14.w() - $$3.w()) < $$4 && $$0.v($$14) && $$0.v($$14.e()) && b($$0, $$14, $$13.g())) {
               $$10 = true;
               $$0.a($$14, dov.a($$0, $$14, $$6.m()), 2);
               $$0.a($$14.a($$13.g()), dov.a($$0, $$14.a($$13.g()), $$6.m()), 2);
               a($$0, $$14, $$2, $$3, $$4, $$5 + 1);
            }
         }
      }

      if (!$$10) {
         $$0.a($$1.b($$7), dnq.lb.m().b(c, Integer.valueOf(5)), 2);
      }
   }

   @Override
   protected void a(dkj $$0, ebq $$1, ffy $$2, ctd $$3) {
      iw $$4 = $$2.b();
      if ($$0 instanceof asb $$5 && $$3.c($$5, $$4) && $$3.a($$5)) {
         $$0.a($$4, true, $$3);
      }
   }
}
