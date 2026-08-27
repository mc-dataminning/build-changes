import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dat extends cxn implements cvi {
   public static final MapCodec<dat> c = b(dat::new);
   public static final din d = did.at;
   public static final int e = 4;
   private static final int f = 3;
   private static final int g = 1;
   private static final eks h = cvf.a(3.0, 0.0, 3.0, 13.0, 15.0, 13.0);
   private static final eks i = cvf.a(3.0, -1.0, 3.0, 13.0, 16.0, 13.0);
   private static final eks j = cvf.a(5.0, -1.0, 5.0, 11.0, 3.0, 11.0);
   private static final eks k = cvf.a(3.0, -1.0, 3.0, 13.0, 5.0, 13.0);
   private static final eks[] l = new eks[]{cvf.a(3.0, 0.0, 3.0, 13.0, 11.0, 13.0), h};
   private static final eks[] m = new eks[]{j, cvf.a(3.0, -1.0, 3.0, 13.0, 14.0, 13.0), i, i, i};

   @Override
   public MapCodec<dat> a() {
      return c;
   }

   public dat(dhm.d $$0) {
      super($$0);
   }

   @Nullable
   @Override
   public dhn a(cnw $$0) {
      return this.o();
   }

   @Override
   public eks a(dhn $$0, crl $$1, hx $$2, eke $$3) {
      return $$0.c(b) == dij.a ? l[Math.min(Math.abs(4 - ($$0.c(d) + 1)), l.length - 1)] : m[$$0.c(d)];
   }

   @Override
   public eks b(dhn $$0, crl $$1, hx $$2, eke $$3) {
      if ($$0.c(d) == 0) {
         return j;
      } else {
         return $$0.c(b) == dij.b ? k : super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public dhn a(dhn $$0, ib $$1, dhn $$2, csg $$3, hx $$4, hx $$5) {
      if (b($$0.c(d))) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return $$0.a($$3, $$4) ? $$0 : cvh.a.o();
      }
   }

   @Override
   public boolean a(dhn $$0, csi $$1, hx $$2) {
      return h($$0) && !b($$1, $$2) ? false : super.a($$0, $$1, $$2);
   }

   @Override
   protected boolean b(dhn $$0, crl $$1, hx $$2) {
      return $$0.a(cvh.cC);
   }

   @Override
   protected void a(dho.a<cvf, dhn> $$0) {
      $$0.a(d);
      super.a($$0);
   }

   @Override
   public void a(dhn $$0, csf $$1, hx $$2, bkv $$3) {
      if ($$3 instanceof cbs && $$1.Y().b(csb.c)) {
         $$1.a($$2, true, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(dhn $$0, cnw $$1) {
      return false;
   }

   @Override
   public void a(csf $$0, hx $$1, dhn $$2, bll $$3, clo $$4) {
   }

   @Override
   public boolean e_(dhn $$0) {
      return $$0.c(b) == dij.b && !this.n($$0);
   }

   @Override
   public void b(dhn $$0, ami $$1, hx $$2, atw $$3) {
      float $$4 = cxa.a(this, $$1, $$2);
      boolean $$5 = $$3.a((int)(25.0F / $$4) + 1) == 0;
      if ($$5) {
         this.a($$1, $$0, $$2, 1);
      }
   }

   private void a(ami $$0, dhn $$1, hx $$2, int $$3) {
      int $$4 = Math.min($$1.c(d) + $$3, 4);
      if (this.a($$0, $$2, $$1, $$4)) {
         dhn $$5 = $$1.a(d, Integer.valueOf($$4));
         $$0.a($$2, $$5, 2);
         if (b($$4)) {
            $$0.a($$2.c(), $$5.a(b, dij.a), 3);
         }
      }
   }

   private static boolean a(csi $$0, hx $$1) {
      dhn $$2 = $$0.a_($$1);
      return $$2.i() || $$2.a(cvh.kB);
   }

   private static boolean b(csi $$0, hx $$1) {
      return cxa.a($$0, $$1);
   }

   private static boolean h(dhn $$0) {
      return $$0.a(cvh.kB) && $$0.c(b) == dij.b;
   }

   private static boolean b(int $$0) {
      return $$0 >= 3;
   }

   private boolean a(csi $$0, hx $$1, dhn $$2, int $$3) {
      return !this.n($$2) && b($$0, $$1) && (!b($$3) || a($$0, $$1.c()));
   }

   private boolean n(dhn $$0) {
      return $$0.c(d) >= 4;
   }

   @Nullable
   private dat.a d(csi $$0, hx $$1, dhn $$2) {
      if (h($$2)) {
         return new dat.a($$1, $$2);
      } else {
         hx $$3 = $$1.d();
         dhn $$4 = $$0.a_($$3);
         return h($$4) ? new dat.a($$3, $$4) : null;
      }
   }

   @Override
   public boolean b(csi $$0, hx $$1, dhn $$2) {
      dat.a $$3 = this.d($$0, $$1, $$2);
      return $$3 == null ? false : this.a($$0, $$3.a, $$3.b, $$3.b.c(d) + 1);
   }

   @Override
   public boolean a(csf $$0, atw $$1, hx $$2, dhn $$3) {
      return true;
   }

   @Override
   public void a(ami $$0, atw $$1, hx $$2, dhn $$3) {
      dat.a $$4 = this.d($$0, $$2, $$3);
      if ($$4 != null) {
         this.a($$0, $$4.b, $$4.a, 1);
      }
   }

   static record a(hx a, dhn b) {
   }
}
