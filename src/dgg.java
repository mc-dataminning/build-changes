import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dgg extends dfb {
   public static final MapCodec<dgg> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(lp.e.q().fieldOf("plant").forGetter($$0x -> $$0x.e), u()).apply($$0, dgg::new)
   );
   public static final int b = 5;
   public static final dte c = dsu.au;
   protected static final ewm d = dfb.a(1.0, 0.0, 1.0, 15.0, 15.0, 15.0);
   private final dfb e;

   @Override
   public MapCodec<dgg> a() {
      return a;
   }

   protected dgg(dfb $$0, dsd.d $$1) {
      super($$1);
      this.e = $$0;
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected void a(dse $$0, arf $$1, iz $$2, azh $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected boolean d_(dse $$0) {
      return $$0.c(c) < 5;
   }

   @Override
   public ewm b_(dse $$0, dbg $$1, iz $$2) {
      return d;
   }

   @Override
   protected void b(dse $$0, arf $$1, iz $$2, azh $$3) {
      iz $$4 = $$2.c();
      if ($$1.u($$4) && $$4.v() < $$1.am()) {
         int $$5 = $$0.c(c);
         if ($$5 < 5) {
            boolean $$6 = false;
            boolean $$7 = false;
            dse $$8 = $$1.a_($$2.d());
            if ($$8.a(dfd.fz)) {
               $$6 = true;
            } else if ($$8.a(this.e)) {
               int $$9 = 1;

               for (int $$10 = 0; $$10 < 4; $$10++) {
                  dse $$11 = $$1.a_($$2.c($$9 + 1));
                  if (!$$11.a(this.e)) {
                     if ($$11.a(dfd.fz)) {
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
               $$1.a($$2, dgh.a($$1, $$2, this.e.o()), 2);
               this.a($$1, $$4, $$5);
            } else if ($$5 < 4) {
               int $$12 = $$3.a(4);
               if ($$7) {
                  $$12++;
               }

               boolean $$13 = false;

               for (int $$14 = 0; $$14 < $$12; $$14++) {
                  je $$15 = je.c.a.a($$3);
                  iz $$16 = $$2.a($$15);
                  if ($$1.u($$16) && $$1.u($$16.d()) && b($$1, $$16, $$15.g())) {
                     this.a($$1, $$16, $$5 + 1);
                     $$13 = true;
                  }
               }

               if ($$13) {
                  $$1.a($$2, dgh.a($$1, $$2, this.e.o()), 2);
               } else {
                  this.a($$1, $$2);
               }
            } else {
               this.a($$1, $$2);
            }
         }
      }
   }

   private void a(dca $$0, iz $$1, int $$2) {
      $$0.a($$1, this.o().a(c, Integer.valueOf($$2)), 2);
      $$0.c(1033, $$1, 0);
   }

   private void a(dca $$0, iz $$1) {
      $$0.a($$1, this.o().a(c, Integer.valueOf(5)), 2);
      $$0.c(1034, $$1, 0);
   }

   private static boolean b(dcd $$0, iz $$1, @Nullable je $$2) {
      for (je $$3 : je.c.a) {
         if ($$3 != $$2 && !$$0.u($$1.a($$3))) {
            return false;
         }
      }

      return true;
   }

   @Override
   protected dse a(dse $$0, je $$1, dse $$2, dcb $$3, iz $$4, iz $$5) {
      if ($$1 != je.b && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dse $$0, dcd $$1, iz $$2) {
      dse $$3 = $$1.a_($$2.d());
      if (!$$3.a(this.e) && !$$3.a(dfd.fz)) {
         if (!$$3.i()) {
            return false;
         } else {
            boolean $$4 = false;

            for (je $$5 : je.c.a) {
               dse $$6 = $$1.a_($$2.a($$5));
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
   protected void a(dsf.a<dfb, dse> $$0) {
      $$0.a(c);
   }

   public static void a(dcb $$0, iz $$1, azh $$2, int $$3) {
      $$0.a($$1, dgh.a($$0, $$1, dfd.ku.o()), 2);
      a($$0, $$1, $$2, $$1, $$3, 0);
   }

   private static void a(dcb $$0, iz $$1, azh $$2, iz $$3, int $$4, int $$5) {
      dfb $$6 = dfd.ku;
      int $$7 = $$2.a(4) + 1;
      if ($$5 == 0) {
         $$7++;
      }

      for (int $$8 = 0; $$8 < $$7; $$8++) {
         iz $$9 = $$1.b($$8 + 1);
         if (!b($$0, $$9, null)) {
            return;
         }

         $$0.a($$9, dgh.a($$0, $$9, $$6.o()), 2);
         $$0.a($$9.d(), dgh.a($$0, $$9.d(), $$6.o()), 2);
      }

      boolean $$10 = false;
      if ($$5 < 4) {
         int $$11 = $$2.a(4);
         if ($$5 == 0) {
            $$11++;
         }

         for (int $$12 = 0; $$12 < $$11; $$12++) {
            je $$13 = je.c.a.a($$2);
            iz $$14 = $$1.b($$7).a($$13);
            if (Math.abs($$14.u() - $$3.u()) < $$4 && Math.abs($$14.w() - $$3.w()) < $$4 && $$0.u($$14) && $$0.u($$14.d()) && b($$0, $$14, $$13.g())) {
               $$10 = true;
               $$0.a($$14, dgh.a($$0, $$14, $$6.o()), 2);
               $$0.a($$14.a($$13.g()), dgh.a($$0, $$14.a($$13.g()), $$6.o()), 2);
               a($$0, $$14, $$2, $$3, $$4, $$5 + 1);
            }
         }
      }

      if (!$$10) {
         $$0.a($$1.b($$7), dfd.kv.o().a(c, Integer.valueOf(5)), 2);
      }
   }

   @Override
   protected void a(dca $$0, dse $$1, evp $$2, cnr $$3) {
      iz $$4 = $$2.a();
      if (!$$0.B && $$3.a($$0, $$4) && $$3.b($$0)) {
         $$0.a($$4, true, $$3);
      }
   }
}
