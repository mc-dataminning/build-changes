import com.mojang.serialization.MapCodec;

public class dfo extends dfc {
   public static final MapCodec<dfo> a = b(dfo::new);
   public static final int b = 6;
   public static final duc c = dts.ay;
   public static final int d = b(0);
   protected static final float e = 1.0F;
   protected static final float f = 2.0F;
   protected static final exn[] g = new exn[]{
      dfc.a(1.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dfc.a(3.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dfc.a(5.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dfc.a(7.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dfc.a(9.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dfc.a(11.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dfc.a(13.0, 0.0, 1.0, 15.0, 8.0, 15.0)
   };

   @Override
   public MapCodec<dfo> a() {
      return a;
   }

   protected dfo(dtb.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected exn a(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
      return g[$$0.c(c)];
   }

   @Override
   protected bqc a(cuh $$0, dtc $$1, dca $$2, ir $$3, cly $$4, bpz $$5, ewq $$6) {
      cuc $$7 = $$0.f();
      if ($$0.a(awm.aJ) && $$1.c(c) == 0 && dfc.a($$7) instanceof dfr $$8) {
         if (!$$4.f()) {
            $$0.h(1);
         }

         $$2.a(null, $$3, avo.dw, avq.e, 1.0F, 1.0F);
         $$2.b($$3, dfs.a($$8));
         $$2.a($$4, dxv.c, $$3);
         $$4.b(avz.c.b($$7));
         return bqc.a;
      } else {
         return bqc.d;
      }
   }

   @Override
   protected bqa a(dtc $$0, dca $$1, ir $$2, cly $$3, ewq $$4) {
      if ($$1.C) {
         if (a($$1, $$2, $$0, $$3).a()) {
            return bqa.a;
         }

         if ($$3.b(bpz.a).d()) {
            return bqa.b;
         }
      }

      return a($$1, $$2, $$0, $$3);
   }

   protected static bqa a(dcb $$0, ir $$1, dtc $$2, cly $$3) {
      if (!$$3.t(false)) {
         return bqa.d;
      } else {
         $$3.a(avz.U);
         $$3.gx().a(2, 0.1F);
         int $$4 = $$2.c(c);
         $$0.a($$3, dxv.m, $$1);
         if ($$4 < 6) {
            $$0.a($$1, $$2.a(c, Integer.valueOf($$4 + 1)), 3);
         } else {
            $$0.a($$1, false);
            $$0.a($$3, dxv.f, $$1);
         }

         return bqa.a;
      }
   }

   @Override
   protected dtc a(dtc $$0, iw $$1, dtc $$2, dcb $$3, ir $$4, ir $$5) {
      return $$1 == iw.a && !$$0.a($$3, $$4) ? dfe.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dtc $$0, dcd $$1, ir $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   protected void a(dtd.a<dfc, dtc> $$0) {
      $$0.a(c);
   }

   @Override
   protected int a(dtc $$0, dca $$1, ir $$2) {
      return b($$0.c(c));
   }

   public static int b(int $$0) {
      return (7 - $$0) * 2;
   }

   @Override
   protected boolean c_(dtc $$0) {
      return true;
   }

   @Override
   protected boolean a(dtc $$0, ept $$1) {
      return false;
   }
}
