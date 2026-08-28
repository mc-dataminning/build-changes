import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dkq extends dhj implements dfe {
   public static final MapCodec<dkq> c = b(dkq::new);
   public static final dte d = dsu.at;
   public static final int e = 4;
   private static final int f = 3;
   private static final int g = 1;
   private static final ewm h = dfb.a(3.0, 0.0, 3.0, 13.0, 15.0, 13.0);
   private static final ewm i = dfb.a(3.0, -1.0, 3.0, 13.0, 16.0, 13.0);
   private static final ewm j = dfb.a(5.0, -1.0, 5.0, 11.0, 3.0, 11.0);
   private static final ewm k = dfb.a(3.0, -1.0, 3.0, 13.0, 5.0, 13.0);
   private static final ewm[] l = new ewm[]{dfb.a(3.0, 0.0, 3.0, 13.0, 11.0, 13.0), h};
   private static final ewm[] m = new ewm[]{j, dfb.a(3.0, -1.0, 3.0, 13.0, 14.0, 13.0), i, i, i};

   @Override
   public MapCodec<dkq> a() {
      return c;
   }

   public dkq(dsd.d $$0) {
      super($$0);
   }

   @Nullable
   @Override
   public dse a(cyc $$0) {
      return this.o();
   }

   @Override
   public ewm a(dse $$0, dbg $$1, iz $$2, evy $$3) {
      return $$0.c(b) == dta.a ? l[Math.min(Math.abs(4 - ($$0.c(d) + 1)), l.length - 1)] : m[$$0.c(d)];
   }

   @Override
   public ewm b(dse $$0, dbg $$1, iz $$2, evy $$3) {
      if ($$0.c(d) == 0) {
         return j;
      } else {
         return $$0.c(b) == dta.b ? k : super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public dse a(dse $$0, je $$1, dse $$2, dcb $$3, iz $$4, iz $$5) {
      if (b($$0.c(d))) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return $$0.a($$3, $$4) ? $$0 : dfd.a.o();
      }
   }

   @Override
   public boolean a(dse $$0, dcd $$1, iz $$2) {
      return m($$0) && !b($$1, $$2) ? false : super.a($$0, $$1, $$2);
   }

   @Override
   protected boolean b(dse $$0, dbg $$1, iz $$2) {
      return $$0.a(dfd.cC);
   }

   @Override
   protected void a(dsf.a<dfb, dse> $$0) {
      $$0.a(d);
      super.a($$0);
   }

   @Override
   public void a(dse $$0, dca $$1, iz $$2, bsw $$3) {
      if ($$3 instanceof ckk && $$1.ab().b(dbw.c)) {
         $$1.a($$2, true, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(dse $$0, cyc $$1) {
      return false;
   }

   @Override
   public void a(dca $$0, iz $$1, dse $$2, btr $$3, cur $$4) {
   }

   @Override
   public boolean d_(dse $$0) {
      return $$0.c(b) == dta.b && !this.n($$0);
   }

   @Override
   public void b(dse $$0, arf $$1, iz $$2, azh $$3) {
      float $$4 = dgw.a(this, $$1, $$2);
      boolean $$5 = $$3.a((int)(25.0F / $$4) + 1) == 0;
      if ($$5) {
         this.a($$1, $$0, $$2, 1);
      }
   }

   private void a(arf $$0, dse $$1, iz $$2, int $$3) {
      int $$4 = Math.min($$1.c(d) + $$3, 4);
      if (this.a($$0, $$2, $$1, $$4)) {
         dse $$5 = $$1.a(d, Integer.valueOf($$4));
         $$0.a($$2, $$5, 2);
         if (b($$4)) {
            $$0.a($$2.c(), $$5.a(b, dta.a), 3);
         }
      }
   }

   private static boolean a(dcd $$0, iz $$1) {
      dse $$2 = $$0.a_($$1);
      return $$2.i() || $$2.a(dfd.kB);
   }

   private static boolean b(dcd $$0, iz $$1) {
      return dgw.a($$0, $$1);
   }

   private static boolean m(dse $$0) {
      return $$0.a(dfd.kB) && $$0.c(b) == dta.b;
   }

   private static boolean b(int $$0) {
      return $$0 >= 3;
   }

   private boolean a(dcd $$0, iz $$1, dse $$2, int $$3) {
      return !this.n($$2) && b($$0, $$1) && (!b($$3) || a($$0, $$1.c()));
   }

   private boolean n(dse $$0) {
      return $$0.c(d) >= 4;
   }

   @Nullable
   private dkq.a d(dcd $$0, iz $$1, dse $$2) {
      if (m($$2)) {
         return new dkq.a($$1, $$2);
      } else {
         iz $$3 = $$1.d();
         dse $$4 = $$0.a_($$3);
         return m($$4) ? new dkq.a($$3, $$4) : null;
      }
   }

   @Override
   public boolean b(dcd $$0, iz $$1, dse $$2) {
      dkq.a $$3 = this.d($$0, $$1, $$2);
      return $$3 == null ? false : this.a($$0, $$3.a, $$3.b, $$3.b.c(d) + 1);
   }

   @Override
   public boolean a(dca $$0, azh $$1, iz $$2, dse $$3) {
      return true;
   }

   @Override
   public void a(arf $$0, azh $$1, iz $$2, dse $$3) {
      dkq.a $$4 = this.d($$0, $$2, $$3);
      if ($$4 != null) {
         this.a($$0, $$4.b, $$4.a, 1);
      }
   }

   static record a(iz a, dse b) {
   }
}
