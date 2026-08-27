import com.mojang.serialization.MapCodec;

public class dnu extends dfl implements dff {
   public static final MapCodec<dnu> a = b(dnu::new);
   private static final float d = 0.003F;
   public static final int b = 3;
   public static final duc c = dts.as;
   private static final exn e = dfc.a(3.0, 0.0, 3.0, 13.0, 8.0, 13.0);
   private static final exn f = dfc.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   @Override
   public MapCodec<dnu> a() {
      return a;
   }

   public dnu(dtb.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   public cuh a(dcd $$0, ir $$1, dtc $$2) {
      return new cuh(cuk.yd);
   }

   @Override
   protected exn a(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
      if ($$0.c(c) == 0) {
         return e;
      } else {
         return $$0.c(c) < 3 ? f : super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected boolean d_(dtc $$0) {
      return $$0.c(c) < 3;
   }

   @Override
   protected void b(dtc $$0, aqt $$1, ir $$2, ayt $$3) {
      int $$4 = $$0.c(c);
      if ($$4 < 3 && $$3.a(5) == 0 && $$1.b($$2.c(), 0) >= 9) {
         dtc $$5 = $$0.a(c, Integer.valueOf($$4 + 1));
         $$1.a($$2, $$5, 2);
         $$1.a(dxv.c, $$2, dxv.a.a($$5));
      }
   }

   @Override
   protected void a(dtc $$0, dca $$1, ir $$2, brv $$3) {
      if ($$3 instanceof bso && $$3.ak() != bsb.S && $$3.ak() != bsb.j) {
         $$3.a($$0, new ewu(0.8F, 0.75, 0.8F));
         if (!$$1.C && $$0.c(c) > 0 && ($$3.ae != $$3.dz() || $$3.ag != $$3.dF())) {
            double $$4 = Math.abs($$3.dz() - $$3.ae);
            double $$5 = Math.abs($$3.dF() - $$3.ag);
            if ($$4 >= 0.003F || $$5 >= 0.003F) {
               $$3.a($$1.aj().u(), 1.0F);
            }
         }
      }
   }

   @Override
   protected bqc a(cuh $$0, dtc $$1, dca $$2, ir $$3, cly $$4, bpz $$5, ewq $$6) {
      int $$7 = $$1.c(c);
      boolean $$8 = $$7 == 3;
      return !$$8 && $$0.a(cuk.sV) ? bqc.e : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   @Override
   protected bqa a(dtc $$0, dca $$1, ir $$2, cly $$3, ewq $$4) {
      int $$5 = $$0.c(c);
      boolean $$6 = $$5 == 3;
      if ($$5 > 1) {
         int $$7 = 1 + $$1.A.a(2);
         a($$1, $$2, new cuh(cuk.yd, $$7 + ($$6 ? 1 : 0)));
         $$1.a(null, $$2, avo.zN, avq.e, 1.0F, 0.8F + $$1.A.i() * 0.4F);
         dtc $$8 = $$0.a(c, Integer.valueOf(1));
         $$1.a($$2, $$8, 2);
         $$1.a(dxv.c, $$2, dxv.a.a($$3, $$8));
         return bqa.a($$1.C);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected void a(dtd.a<dfc, dtc> $$0) {
      $$0.a(c);
   }

   @Override
   public boolean b(dcd $$0, ir $$1, dtc $$2) {
      return $$2.c(c) < 3;
   }

   @Override
   public boolean a(dca $$0, ayt $$1, ir $$2, dtc $$3) {
      return true;
   }

   @Override
   public void a(aqt $$0, ayt $$1, ir $$2, dtc $$3) {
      int $$4 = Math.min(3, $$3.c(c) + 1);
      $$0.a($$2, $$3.a(c, Integer.valueOf($$4)), 2);
   }
}
