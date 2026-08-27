import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class cwk extends cvf {
   public static final MapCodec<cwk> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kc.f.q().fieldOf("plant").forGetter($$0x -> $$0x.e), u()).apply($$0, cwk::new)
   );
   public static final int b = 5;
   public static final din c = did.au;
   protected static final eks d = cvf.a(1.0, 0.0, 1.0, 15.0, 15.0, 15.0);
   private final cvf e;

   @Override
   public MapCodec<cwk> a() {
      return a;
   }

   protected cwk(cvf $$0, dhm.d $$1) {
      super($$1);
      this.e = $$0;
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   public void a(dhn $$0, ami $$1, hx $$2, atw $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   public boolean e_(dhn $$0) {
      return $$0.c(c) < 5;
   }

   @Override
   public eks b_(dhn $$0, crl $$1, hx $$2) {
      return d;
   }

   @Override
   public void b(dhn $$0, ami $$1, hx $$2, atw $$3) {
      hx $$4 = $$2.c();
      if ($$1.t($$4) && $$4.v() < $$1.ak()) {
         int $$5 = $$0.c(c);
         if ($$5 < 5) {
            boolean $$6 = false;
            boolean $$7 = false;
            dhn $$8 = $$1.a_($$2.d());
            if ($$8.a(cvh.fz)) {
               $$6 = true;
            } else if ($$8.a(this.e)) {
               int $$9 = 1;

               for (int $$10 = 0; $$10 < 4; $$10++) {
                  dhn $$11 = $$1.a_($$2.c($$9 + 1));
                  if (!$$11.a(this.e)) {
                     if ($$11.a(cvh.fz)) {
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
               $$1.a($$2, cwl.a($$1, $$2, this.e.o()), 2);
               this.a($$1, $$4, $$5);
            } else if ($$5 < 4) {
               int $$12 = $$3.a(4);
               if ($$7) {
                  $$12++;
               }

               boolean $$13 = false;

               for (int $$14 = 0; $$14 < $$12; $$14++) {
                  ib $$15 = ib.c.a.a($$3);
                  hx $$16 = $$2.a($$15);
                  if ($$1.t($$16) && $$1.t($$16.d()) && b($$1, $$16, $$15.g())) {
                     this.a($$1, $$16, $$5 + 1);
                     $$13 = true;
                  }
               }

               if ($$13) {
                  $$1.a($$2, cwl.a($$1, $$2, this.e.o()), 2);
               } else {
                  this.a($$1, $$2);
               }
            } else {
               this.a($$1, $$2);
            }
         }
      }
   }

   private void a(csf $$0, hx $$1, int $$2) {
      $$0.a($$1, this.o().a(c, Integer.valueOf($$2)), 2);
      $$0.c(1033, $$1, 0);
   }

   private void a(csf $$0, hx $$1) {
      $$0.a($$1, this.o().a(c, Integer.valueOf(5)), 2);
      $$0.c(1034, $$1, 0);
   }

   private static boolean b(csi $$0, hx $$1, @Nullable ib $$2) {
      for (ib $$3 : ib.c.a) {
         if ($$3 != $$2 && !$$0.t($$1.a($$3))) {
            return false;
         }
      }

      return true;
   }

   @Override
   public dhn a(dhn $$0, ib $$1, dhn $$2, csg $$3, hx $$4, hx $$5) {
      if ($$1 != ib.b && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dhn $$0, csi $$1, hx $$2) {
      dhn $$3 = $$1.a_($$2.d());
      if (!$$3.a(this.e) && !$$3.a(cvh.fz)) {
         if (!$$3.i()) {
            return false;
         } else {
            boolean $$4 = false;

            for (ib $$5 : ib.c.a) {
               dhn $$6 = $$1.a_($$2.a($$5));
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
   protected void a(dho.a<cvf, dhn> $$0) {
      $$0.a(c);
   }

   public static void a(csg $$0, hx $$1, atw $$2, int $$3) {
      $$0.a($$1, cwl.a($$0, $$1, cvh.ku.o()), 2);
      a($$0, $$1, $$2, $$1, $$3, 0);
   }

   private static void a(csg $$0, hx $$1, atw $$2, hx $$3, int $$4, int $$5) {
      cvf $$6 = cvh.ku;
      int $$7 = $$2.a(4) + 1;
      if ($$5 == 0) {
         $$7++;
      }

      for (int $$8 = 0; $$8 < $$7; $$8++) {
         hx $$9 = $$1.b($$8 + 1);
         if (!b($$0, $$9, null)) {
            return;
         }

         $$0.a($$9, cwl.a($$0, $$9, $$6.o()), 2);
         $$0.a($$9.d(), cwl.a($$0, $$9.d(), $$6.o()), 2);
      }

      boolean $$10 = false;
      if ($$5 < 4) {
         int $$11 = $$2.a(4);
         if ($$5 == 0) {
            $$11++;
         }

         for (int $$12 = 0; $$12 < $$11; $$12++) {
            ib $$13 = ib.c.a.a($$2);
            hx $$14 = $$1.b($$7).a($$13);
            if (Math.abs($$14.u() - $$3.u()) < $$4 && Math.abs($$14.w() - $$3.w()) < $$4 && $$0.t($$14) && $$0.t($$14.d()) && b($$0, $$14, $$13.g())) {
               $$10 = true;
               $$0.a($$14, cwl.a($$0, $$14, $$6.o()), 2);
               $$0.a($$14.a($$13.g()), cwl.a($$0, $$14.a($$13.g()), $$6.o()), 2);
               a($$0, $$14, $$2, $$3, $$4, $$5 + 1);
            }
         }
      }

      if (!$$10) {
         $$0.a($$1.b($$7), cvh.kv.o().a(c, Integer.valueOf(5)), 2);
      }
   }

   @Override
   public void a(csf $$0, dhn $$1, ejv $$2, cer $$3) {
      hx $$4 = $$2.a();
      if (!$$0.B && $$3.a($$0, $$4) && $$3.b($$0)) {
         $$0.a($$4, true, $$3);
      }
   }
}
