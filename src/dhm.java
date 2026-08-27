import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dhm extends deg implements dcb {
   public static final MapCodec<dhm> c = b(dhm::new);
   public static final dpz d = dpp.at;
   public static final int e = 4;
   private static final int f = 3;
   private static final int g = 1;
   private static final est h = dby.a(3.0, 0.0, 3.0, 13.0, 15.0, 13.0);
   private static final est i = dby.a(3.0, -1.0, 3.0, 13.0, 16.0, 13.0);
   private static final est j = dby.a(5.0, -1.0, 5.0, 11.0, 3.0, 11.0);
   private static final est k = dby.a(3.0, -1.0, 3.0, 13.0, 5.0, 13.0);
   private static final est[] l = new est[]{dby.a(3.0, 0.0, 3.0, 13.0, 11.0, 13.0), h};
   private static final est[] m = new est[]{j, dby.a(3.0, -1.0, 3.0, 13.0, 14.0, 13.0), i, i, i};

   @Override
   public MapCodec<dhm> a() {
      return c;
   }

   public dhm(doy.d $$0) {
      super($$0);
   }

   @Nullable
   @Override
   public doz a(cuo $$0) {
      return this.n();
   }

   @Override
   public est a(doz $$0, cyd $$1, ib $$2, esf $$3) {
      return $$0.c(b) == dpv.a ? l[Math.min(Math.abs(4 - ($$0.c(d) + 1)), l.length - 1)] : m[$$0.c(d)];
   }

   @Override
   public est b(doz $$0, cyd $$1, ib $$2, esf $$3) {
      if ($$0.c(d) == 0) {
         return j;
      } else {
         return $$0.c(b) == dpv.b ? k : super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public doz a(doz $$0, ih $$1, doz $$2, cyy $$3, ib $$4, ib $$5) {
      if (b($$0.c(d))) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return $$0.a($$3, $$4) ? $$0 : dca.a.n();
      }
   }

   @Override
   public boolean a(doz $$0, cza $$1, ib $$2) {
      return m($$0) && !b($$1, $$2) ? false : super.a($$0, $$1, $$2);
   }

   @Override
   protected boolean b(doz $$0, cyd $$1, ib $$2) {
      return $$0.a(dca.cC);
   }

   @Override
   protected void a(dpa.a<dby, doz> $$0) {
      $$0.a(d);
      super.a($$0);
   }

   @Override
   public void a(doz $$0, cyx $$1, ib $$2, bpv $$3) {
      if ($$3 instanceof che && $$1.aa().b(cyt.c)) {
         $$1.a($$2, true, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(doz $$0, cuo $$1) {
      return false;
   }

   @Override
   public void a(cyx $$0, ib $$1, doz $$2, bqo $$3, crj $$4) {
   }

   @Override
   public boolean e_(doz $$0) {
      return $$0.c(b) == dpv.b && !this.n($$0);
   }

   @Override
   public void b(doz $$0, aps $$1, ib $$2, axr $$3) {
      float $$4 = ddt.a(this, $$1, $$2);
      boolean $$5 = $$3.a((int)(25.0F / $$4) + 1) == 0;
      if ($$5) {
         this.a($$1, $$0, $$2, 1);
      }
   }

   private void a(aps $$0, doz $$1, ib $$2, int $$3) {
      int $$4 = Math.min($$1.c(d) + $$3, 4);
      if (this.a($$0, $$2, $$1, $$4)) {
         doz $$5 = $$1.a(d, Integer.valueOf($$4));
         $$0.a($$2, $$5, 2);
         if (b($$4)) {
            $$0.a($$2.c(), $$5.a(b, dpv.a), 3);
         }
      }
   }

   private static boolean a(cza $$0, ib $$1) {
      doz $$2 = $$0.a_($$1);
      return $$2.i() || $$2.a(dca.kB);
   }

   private static boolean b(cza $$0, ib $$1) {
      return ddt.a($$0, $$1);
   }

   private static boolean m(doz $$0) {
      return $$0.a(dca.kB) && $$0.c(b) == dpv.b;
   }

   private static boolean b(int $$0) {
      return $$0 >= 3;
   }

   private boolean a(cza $$0, ib $$1, doz $$2, int $$3) {
      return !this.n($$2) && b($$0, $$1) && (!b($$3) || a($$0, $$1.c()));
   }

   private boolean n(doz $$0) {
      return $$0.c(d) >= 4;
   }

   @Nullable
   private dhm.a d(cza $$0, ib $$1, doz $$2) {
      if (m($$2)) {
         return new dhm.a($$1, $$2);
      } else {
         ib $$3 = $$1.d();
         doz $$4 = $$0.a_($$3);
         return m($$4) ? new dhm.a($$3, $$4) : null;
      }
   }

   @Override
   public boolean b(cza $$0, ib $$1, doz $$2) {
      dhm.a $$3 = this.d($$0, $$1, $$2);
      return $$3 == null ? false : this.a($$0, $$3.a, $$3.b, $$3.b.c(d) + 1);
   }

   @Override
   public boolean a(cyx $$0, axr $$1, ib $$2, doz $$3) {
      return true;
   }

   @Override
   public void a(aps $$0, axr $$1, ib $$2, doz $$3) {
      dhm.a $$4 = this.d($$0, $$2, $$3);
      if ($$4 != null) {
         this.a($$0, $$4.b, $$4.a, 1);
      }
   }

   static record a(ib a, doz b) {
   }
}
