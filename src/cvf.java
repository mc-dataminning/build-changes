import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class cvf extends cua {
   public static final MapCodec<cvf> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(jy.f.q().fieldOf("plant").forGetter($$0x -> $$0x.e), t()).apply($$0, cvf::new)
   );
   public static final int b = 5;
   public static final dhb c = dgr.au;
   protected static final eiy d = cua.a(1.0, 0.0, 1.0, 15.0, 15.0, 15.0);
   private final cua e;

   @Override
   public MapCodec<cvf> a() {
      return a;
   }

   protected cvf(cua $$0, dga.d $$1) {
      super($$1);
      this.e = $$0;
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   public void a(dgb $$0, alq $$1, ht $$2, ate $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   public boolean e_(dgb $$0) {
      return $$0.c(c) < 5;
   }

   @Override
   public eiy b_(dgb $$0, cqf $$1, ht $$2) {
      return d;
   }

   @Override
   public void b(dgb $$0, alq $$1, ht $$2, ate $$3) {
      ht $$4 = $$2.c();
      if ($$1.t($$4) && $$4.v() < $$1.aj()) {
         int $$5 = $$0.c(c);
         if ($$5 < 5) {
            boolean $$6 = false;
            boolean $$7 = false;
            dgb $$8 = $$1.a_($$2.d());
            if ($$8.a(cuc.fz)) {
               $$6 = true;
            } else if ($$8.a(this.e)) {
               int $$9 = 1;

               for (int $$10 = 0; $$10 < 4; $$10++) {
                  dgb $$11 = $$1.a_($$2.c($$9 + 1));
                  if (!$$11.a(this.e)) {
                     if ($$11.a(cuc.fz)) {
                        $$7 = true;
                     }
                     break;
                  }

                  $$9++;
               }

               if ($$9 < 2 || $$9 <= $$3.a($$7 ? 5 : 4)) {
                  $$6 = true;
               }
            } else if ($$8.i()) {
               $$6 = true;
            }

            if ($$6 && b($$1, $$4, null) && $$1.t($$2.b(2))) {
               $$1.a($$2, cvg.a($$1, $$2, this.e.o()), 2);
               this.a($$1, $$4, $$5);
            } else if ($$5 < 4) {
               int $$12 = $$3.a(4);
               if ($$7) {
                  $$12++;
               }

               boolean $$13 = false;

               for (int $$14 = 0; $$14 < $$12; $$14++) {
                  hx $$15 = hx.c.a.a($$3);
                  ht $$16 = $$2.a($$15);
                  if ($$1.t($$16) && $$1.t($$16.d()) && b($$1, $$16, $$15.g())) {
                     this.a($$1, $$16, $$5 + 1);
                     $$13 = true;
                  }
               }

               if ($$13) {
                  $$1.a($$2, cvg.a($$1, $$2, this.e.o()), 2);
               } else {
                  this.a($$1, $$2);
               }
            } else {
               this.a($$1, $$2);
            }
         }
      }
   }

   private void a(cqz $$0, ht $$1, int $$2) {
      $$0.a($$1, this.o().a(c, Integer.valueOf($$2)), 2);
      $$0.c(1033, $$1, 0);
   }

   private void a(cqz $$0, ht $$1) {
      $$0.a($$1, this.o().a(c, Integer.valueOf(5)), 2);
      $$0.c(1034, $$1, 0);
   }

   private static boolean b(crc $$0, ht $$1, @Nullable hx $$2) {
      for (hx $$3 : hx.c.a) {
         if ($$3 != $$2 && !$$0.t($$1.a($$3))) {
            return false;
         }
      }

      return true;
   }

   @Override
   public dgb a(dgb $$0, hx $$1, dgb $$2, cra $$3, ht $$4, ht $$5) {
      if ($$1 != hx.b && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dgb $$0, crc $$1, ht $$2) {
      dgb $$3 = $$1.a_($$2.d());
      if (!$$3.a(this.e) && !$$3.a(cuc.fz)) {
         if (!$$3.i()) {
            return false;
         } else {
            boolean $$4 = false;

            for (hx $$5 : hx.c.a) {
               dgb $$6 = $$1.a_($$2.a($$5));
               if ($$6.a(this.e)) {
                  if ($$4) {
                     return false;
                  }

                  $$4 = true;
               } else if (!$$6.i()) {
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
   protected void a(dgc.a<cua, dgb> $$0) {
      $$0.a(c);
   }

   public static void a(cra $$0, ht $$1, ate $$2, int $$3) {
      $$0.a($$1, cvg.a($$0, $$1, cuc.ku.o()), 2);
      a($$0, $$1, $$2, $$1, $$3, 0);
   }

   private static void a(cra $$0, ht $$1, ate $$2, ht $$3, int $$4, int $$5) {
      cua $$6 = cuc.ku;
      int $$7 = $$2.a(4) + 1;
      if ($$5 == 0) {
         $$7++;
      }

      for (int $$8 = 0; $$8 < $$7; $$8++) {
         ht $$9 = $$1.b($$8 + 1);
         if (!b($$0, $$9, null)) {
            return;
         }

         $$0.a($$9, cvg.a($$0, $$9, $$6.o()), 2);
         $$0.a($$9.d(), cvg.a($$0, $$9.d(), $$6.o()), 2);
      }

      boolean $$10 = false;
      if ($$5 < 4) {
         int $$11 = $$2.a(4);
         if ($$5 == 0) {
            $$11++;
         }

         for (int $$12 = 0; $$12 < $$11; $$12++) {
            hx $$13 = hx.c.a.a($$2);
            ht $$14 = $$1.b($$7).a($$13);
            if (Math.abs($$14.u() - $$3.u()) < $$4 && Math.abs($$14.w() - $$3.w()) < $$4 && $$0.t($$14) && $$0.t($$14.d()) && b($$0, $$14, $$13.g())) {
               $$10 = true;
               $$0.a($$14, cvg.a($$0, $$14, $$6.o()), 2);
               $$0.a($$14.a($$13.g()), cvg.a($$0, $$14.a($$13.g()), $$6.o()), 2);
               a($$0, $$14, $$2, $$3, $$4, $$5 + 1);
            }
         }
      }

      if (!$$10) {
         $$0.a($$1.b($$7), cuc.kv.o().a(c, Integer.valueOf(5)), 2);
      }
   }

   @Override
   public void a(cqz $$0, dgb $$1, eib $$2, cdp $$3) {
      ht $$4 = $$2.a();
      if (!$$0.B && $$3.a($$0, $$4) && $$3.ag().a(aqv.g)) {
         $$0.a($$4, true, $$3);
      }
   }
}
