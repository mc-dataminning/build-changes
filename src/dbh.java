import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dbh extends dac {
   public static final MapCodec<dbh> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ki.e.q().fieldOf("plant").forGetter($$0x -> $$0x.e), u()).apply($$0, dbh::new)
   );
   public static final int b = 5;
   public static final dob c = dnr.au;
   protected static final eqm d = dac.a(1.0, 0.0, 1.0, 15.0, 15.0, 15.0);
   private final dac e;

   @Override
   public MapCodec<dbh> a() {
      return a;
   }

   protected dbh(dac $$0, dna.d $$1) {
      super($$1);
      this.e = $$0;
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected void a(dnb $$0, apf $$1, ib $$2, axd $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected boolean e_(dnb $$0) {
      return $$0.c(c) < 5;
   }

   @Override
   public eqm b_(dnb $$0, cwh $$1, ib $$2) {
      return d;
   }

   @Override
   protected void b(dnb $$0, apf $$1, ib $$2, axd $$3) {
      ib $$4 = $$2.c();
      if ($$1.u($$4) && $$4.v() < $$1.ak()) {
         int $$5 = $$0.c(c);
         if ($$5 < 5) {
            boolean $$6 = false;
            boolean $$7 = false;
            dnb $$8 = $$1.a_($$2.d());
            if ($$8.a(dae.fz)) {
               $$6 = true;
            } else if ($$8.a(this.e)) {
               int $$9 = 1;

               for (int $$10 = 0; $$10 < 4; $$10++) {
                  dnb $$11 = $$1.a_($$2.c($$9 + 1));
                  if (!$$11.a(this.e)) {
                     if ($$11.a(dae.fz)) {
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

            if ($$6 && b($$1, $$4, null) && $$1.u($$2.b(2))) {
               $$1.a($$2, dbi.a($$1, $$2, this.e.o()), 2);
               this.a($$1, $$4, $$5);
            } else if ($$5 < 4) {
               int $$12 = $$3.a(4);
               if ($$7) {
                  $$12++;
               }

               boolean $$13 = false;

               for (int $$14 = 0; $$14 < $$12; $$14++) {
                  ih $$15 = ih.c.a.a($$3);
                  ib $$16 = $$2.a($$15);
                  if ($$1.u($$16) && $$1.u($$16.d()) && b($$1, $$16, $$15.g())) {
                     this.a($$1, $$16, $$5 + 1);
                     $$13 = true;
                  }
               }

               if ($$13) {
                  $$1.a($$2, dbi.a($$1, $$2, this.e.o()), 2);
               } else {
                  this.a($$1, $$2);
               }
            } else {
               this.a($$1, $$2);
            }
         }
      }
   }

   private void a(cxb $$0, ib $$1, int $$2) {
      $$0.a($$1, this.o().a(c, Integer.valueOf($$2)), 2);
      $$0.c(1033, $$1, 0);
   }

   private void a(cxb $$0, ib $$1) {
      $$0.a($$1, this.o().a(c, Integer.valueOf(5)), 2);
      $$0.c(1034, $$1, 0);
   }

   private static boolean b(cxe $$0, ib $$1, @Nullable ih $$2) {
      for (ih $$3 : ih.c.a) {
         if ($$3 != $$2 && !$$0.u($$1.a($$3))) {
            return false;
         }
      }

      return true;
   }

   @Override
   protected dnb a(dnb $$0, ih $$1, dnb $$2, cxc $$3, ib $$4, ib $$5) {
      if ($$1 != ih.b && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dnb $$0, cxe $$1, ib $$2) {
      dnb $$3 = $$1.a_($$2.d());
      if (!$$3.a(this.e) && !$$3.a(dae.fz)) {
         if (!$$3.i()) {
            return false;
         } else {
            boolean $$4 = false;

            for (ih $$5 : ih.c.a) {
               dnb $$6 = $$1.a_($$2.a($$5));
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
   protected void a(dnc.a<dac, dnb> $$0) {
      $$0.a(c);
   }

   public static void a(cxc $$0, ib $$1, axd $$2, int $$3) {
      $$0.a($$1, dbi.a($$0, $$1, dae.ku.o()), 2);
      a($$0, $$1, $$2, $$1, $$3, 0);
   }

   private static void a(cxc $$0, ib $$1, axd $$2, ib $$3, int $$4, int $$5) {
      dac $$6 = dae.ku;
      int $$7 = $$2.a(4) + 1;
      if ($$5 == 0) {
         $$7++;
      }

      for (int $$8 = 0; $$8 < $$7; $$8++) {
         ib $$9 = $$1.b($$8 + 1);
         if (!b($$0, $$9, null)) {
            return;
         }

         $$0.a($$9, dbi.a($$0, $$9, $$6.o()), 2);
         $$0.a($$9.d(), dbi.a($$0, $$9.d(), $$6.o()), 2);
      }

      boolean $$10 = false;
      if ($$5 < 4) {
         int $$11 = $$2.a(4);
         if ($$5 == 0) {
            $$11++;
         }

         for (int $$12 = 0; $$12 < $$11; $$12++) {
            ih $$13 = ih.c.a.a($$2);
            ib $$14 = $$1.b($$7).a($$13);
            if (Math.abs($$14.u() - $$3.u()) < $$4 && Math.abs($$14.w() - $$3.w()) < $$4 && $$0.u($$14) && $$0.u($$14.d()) && b($$0, $$14, $$13.g())) {
               $$10 = true;
               $$0.a($$14, dbi.a($$0, $$14, $$6.o()), 2);
               $$0.a($$14.a($$13.g()), dbi.a($$0, $$14.a($$13.g()), $$6.o()), 2);
               a($$0, $$14, $$2, $$3, $$4, $$5 + 1);
            }
         }
      }

      if (!$$10) {
         $$0.a($$1.b($$7), dae.kv.o().a(c, Integer.valueOf(5)), 2);
      }
   }

   @Override
   protected void a(cxb $$0, dnb $$1, epp $$2, cjm $$3) {
      ib $$4 = $$2.a();
      if (!$$0.B && $$3.a($$0, $$4) && $$3.b($$0)) {
         $$0.a($$4, true, $$3);
      }
   }
}
