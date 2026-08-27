import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dkx extends dhl implements dff {
   public static final MapCodec<dkx> c = b(dkx::new);
   public static final duc d = dts.at;
   public static final int e = 4;
   private static final int f = 3;
   private static final int g = 1;
   private static final exn h = dfc.a(3.0, 0.0, 3.0, 13.0, 15.0, 13.0);
   private static final exn i = dfc.a(3.0, -1.0, 3.0, 13.0, 16.0, 13.0);
   private static final exn j = dfc.a(5.0, -1.0, 5.0, 11.0, 3.0, 11.0);
   private static final exn k = dfc.a(3.0, -1.0, 3.0, 13.0, 5.0, 13.0);
   private static final exn[] l = new exn[]{dfc.a(3.0, 0.0, 3.0, 13.0, 11.0, 13.0), h};
   private static final exn[] m = new exn[]{j, dfc.a(3.0, -1.0, 3.0, 13.0, 14.0, 13.0), i, i, i};

   @Override
   public MapCodec<dkx> a() {
      return c;
   }

   public dkx(dtb.d $$0) {
      super($$0);
   }

   @Nullable
   @Override
   public dtc a(cyd $$0) {
      return this.n();
   }

   @Override
   public exn a(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
      return $$0.c(b) == dty.a ? l[Math.min(Math.abs(4 - ($$0.c(d) + 1)), l.length - 1)] : m[$$0.c(d)];
   }

   @Override
   public exn b(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
      if ($$0.c(d) == 0) {
         return j;
      } else {
         return $$0.c(b) == dty.b ? k : super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public dtc a(dtc $$0, iw $$1, dtc $$2, dcb $$3, ir $$4, ir $$5) {
      if (b($$0.c(d))) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return $$0.a($$3, $$4) ? $$0 : dfe.a.n();
      }
   }

   @Override
   public boolean a(dtc $$0, dcd $$1, ir $$2) {
      return m($$0) && !b($$1, $$2) ? false : super.a($$0, $$1, $$2);
   }

   @Override
   protected boolean b(dtc $$0, dbg $$1, ir $$2) {
      return $$0.a(dfe.dn) || $$0.a(dfe.do);
   }

   @Override
   protected void a(dtd.a<dfc, dtc> $$0) {
      $$0.a(d);
      super.a($$0);
   }

   @Override
   public void a(dtc $$0, dca $$1, ir $$2, brv $$3) {
      if ($$3 instanceof cjj && $$1.ab().b(dbw.c)) {
         $$1.a($$2, true, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(dtc $$0, cyd $$1) {
      return false;
   }

   @Override
   public void a(dca $$0, ir $$1, dtc $$2, bso $$3, cuh $$4) {
   }

   @Override
   public boolean d_(dtc $$0) {
      return $$0.c(b) == dty.b && !this.n($$0);
   }

   @Override
   public void b(dtc $$0, aqt $$1, ir $$2, ayt $$3) {
      float $$4 = dgy.a(this, $$1, $$2);
      boolean $$5 = $$3.a((int)(25.0F / $$4) + 1) == 0;
      if ($$5) {
         this.a($$1, $$0, $$2, 1);
      }
   }

   private void a(aqt $$0, dtc $$1, ir $$2, int $$3) {
      int $$4 = Math.min($$1.c(d) + $$3, 4);
      if (this.a($$0, $$2, $$1, $$4)) {
         dtc $$5 = $$1.a(d, Integer.valueOf($$4));
         $$0.a($$2, $$5, 2);
         if (b($$4)) {
            $$0.a($$2.c(), $$5.a(b, dty.a), 3);
         }
      }
   }

   private static boolean a(dcd $$0, ir $$1) {
      dtc $$2 = $$0.a_($$1);
      return $$2.i() || $$2.a(dfe.ly);
   }

   private static boolean b(dcd $$0, ir $$1) {
      return dgy.a($$0, $$1);
   }

   private static boolean m(dtc $$0) {
      return $$0.a(dfe.ly) && $$0.c(b) == dty.b;
   }

   private static boolean b(int $$0) {
      return $$0 >= 3;
   }

   private boolean a(dcd $$0, ir $$1, dtc $$2, int $$3) {
      return !this.n($$2) && b($$0, $$1) && (!b($$3) || a($$0, $$1.c()));
   }

   private boolean n(dtc $$0) {
      return $$0.c(d) >= 4;
   }

   @Nullable
   private dkx.a d(dcd $$0, ir $$1, dtc $$2) {
      if (m($$2)) {
         return new dkx.a($$1, $$2);
      } else {
         ir $$3 = $$1.d();
         dtc $$4 = $$0.a_($$3);
         return m($$4) ? new dkx.a($$3, $$4) : null;
      }
   }

   @Override
   public boolean b(dcd $$0, ir $$1, dtc $$2) {
      dkx.a $$3 = this.d($$0, $$1, $$2);
      return $$3 == null ? false : this.a($$0, $$3.a, $$3.b, $$3.b.c(d) + 1);
   }

   @Override
   public boolean a(dca $$0, ayt $$1, ir $$2, dtc $$3) {
      return true;
   }

   @Override
   public void a(aqt $$0, ayt $$1, ir $$2, dtc $$3) {
      dkx.a $$4 = this.d($$0, $$2, $$3);
      if ($$4 != null) {
         this.a($$0, $$4.b, $$4.a, 1);
      }
   }

   static record a(ir a, dtc b) {
   }
}
