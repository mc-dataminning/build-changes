import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dkx extends dhq implements dfl {
   public static final MapCodec<dkx> c = b(dkx::new);
   public static final dtl d = dtb.at;
   public static final int e = 4;
   private static final int f = 3;
   private static final int g = 1;
   private static final exa h = dfi.a(3.0, 0.0, 3.0, 13.0, 15.0, 13.0);
   private static final exa i = dfi.a(3.0, -1.0, 3.0, 13.0, 16.0, 13.0);
   private static final exa j = dfi.a(5.0, -1.0, 5.0, 11.0, 3.0, 11.0);
   private static final exa k = dfi.a(3.0, -1.0, 3.0, 13.0, 5.0, 13.0);
   private static final exa[] l = new exa[]{dfi.a(3.0, 0.0, 3.0, 13.0, 11.0, 13.0), h};
   private static final exa[] m = new exa[]{j, dfi.a(3.0, -1.0, 3.0, 13.0, 14.0, 13.0), i, i, i};

   @Override
   public MapCodec<dkx> a() {
      return c;
   }

   public dkx(dsk.d $$0) {
      super($$0);
   }

   @Nullable
   @Override
   public dsl a(cxn $$0) {
      return this.o();
   }

   @Override
   public exa a(dsl $$0, dbm $$1, ja $$2, ewm $$3) {
      return $$0.c(b) == dth.a ? l[Math.min(Math.abs(4 - ($$0.c(d) + 1)), l.length - 1)] : m[$$0.c(d)];
   }

   @Override
   public exa b(dsl $$0, dbm $$1, ja $$2, ewm $$3) {
      if ($$0.c(d) == 0) {
         return j;
      } else {
         return $$0.c(b) == dth.b ? k : super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public dsl a(dsl $$0, jf $$1, dsl $$2, dch $$3, ja $$4, ja $$5) {
      if (b($$0.c(d))) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return $$0.a($$3, $$4) ? $$0 : dfk.a.o();
      }
   }

   @Override
   public boolean a(dsl $$0, dcj $$1, ja $$2) {
      return m($$0) && !b($$1, $$2) ? false : super.a($$0, $$1, $$2);
   }

   @Override
   protected boolean b(dsl $$0, dbm $$1, ja $$2) {
      return $$0.a(dfk.cC);
   }

   @Override
   protected void a(dsm.a<dfi, dsl> $$0) {
      $$0.a(d);
      super.a($$0);
   }

   @Override
   public void a(dsl $$0, dcg $$1, ja $$2, bsh $$3) {
      if ($$3 instanceof cjw && $$1.ab().b(dcc.c)) {
         $$1.a($$2, true, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(dsl $$0, cxn $$1) {
      return false;
   }

   @Override
   public void a(dcg $$0, ja $$1, dsl $$2, btc $$3, cud $$4) {
   }

   @Override
   public boolean d_(dsl $$0) {
      return $$0.c(b) == dth.b && !this.n($$0);
   }

   @Override
   public void b(dsl $$0, aqm $$1, ja $$2, ayo $$3) {
      float $$4 = dhd.a(this, $$1, $$2);
      boolean $$5 = $$3.a((int)(25.0F / $$4) + 1) == 0;
      if ($$5) {
         this.a($$1, $$0, $$2, 1);
      }
   }

   private void a(aqm $$0, dsl $$1, ja $$2, int $$3) {
      int $$4 = Math.min($$1.c(d) + $$3, 4);
      if (this.a($$0, $$2, $$1, $$4)) {
         dsl $$5 = $$1.a(d, Integer.valueOf($$4));
         $$0.a($$2, $$5, 2);
         if (b($$4)) {
            $$0.a($$2.c(), $$5.a(b, dth.a), 3);
         }
      }
   }

   private static boolean a(dcj $$0, ja $$1) {
      dsl $$2 = $$0.a_($$1);
      return $$2.i() || $$2.a(dfk.kB);
   }

   private static boolean b(dcj $$0, ja $$1) {
      return dhd.a($$0, $$1);
   }

   private static boolean m(dsl $$0) {
      return $$0.a(dfk.kB) && $$0.c(b) == dth.b;
   }

   private static boolean b(int $$0) {
      return $$0 >= 3;
   }

   private boolean a(dcj $$0, ja $$1, dsl $$2, int $$3) {
      return !this.n($$2) && b($$0, $$1) && (!b($$3) || a($$0, $$1.c()));
   }

   private boolean n(dsl $$0) {
      return $$0.c(d) >= 4;
   }

   @Nullable
   private dkx.a d(dcj $$0, ja $$1, dsl $$2) {
      if (m($$2)) {
         return new dkx.a($$1, $$2);
      } else {
         ja $$3 = $$1.d();
         dsl $$4 = $$0.a_($$3);
         return m($$4) ? new dkx.a($$3, $$4) : null;
      }
   }

   @Override
   public boolean b(dcj $$0, ja $$1, dsl $$2) {
      dkx.a $$3 = this.d($$0, $$1, $$2);
      return $$3 == null ? false : this.a($$0, $$3.a, $$3.b, $$3.b.c(d) + 1);
   }

   @Override
   public boolean a(dcg $$0, ayo $$1, ja $$2, dsl $$3) {
      return true;
   }

   @Override
   public void a(aqm $$0, ayo $$1, ja $$2, dsl $$3) {
      dkx.a $$4 = this.d($$0, $$2, $$3);
      if ($$4 != null) {
         this.a($$0, $$4.b, $$4.a, 1);
      }
   }

   static record a(ja a, dsl b) {
   }
}
