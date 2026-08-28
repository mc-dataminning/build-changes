import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dkw extends dhp implements dfk {
   public static final MapCodec<dkw> c = b(dkw::new);
   public static final dtk d = dta.at;
   public static final int e = 4;
   private static final int f = 3;
   private static final int g = 1;
   private static final ewy h = dfh.a(3.0, 0.0, 3.0, 13.0, 15.0, 13.0);
   private static final ewy i = dfh.a(3.0, -1.0, 3.0, 13.0, 16.0, 13.0);
   private static final ewy j = dfh.a(5.0, -1.0, 5.0, 11.0, 3.0, 11.0);
   private static final ewy k = dfh.a(3.0, -1.0, 3.0, 13.0, 5.0, 13.0);
   private static final ewy[] l = new ewy[]{dfh.a(3.0, 0.0, 3.0, 13.0, 11.0, 13.0), h};
   private static final ewy[] m = new ewy[]{j, dfh.a(3.0, -1.0, 3.0, 13.0, 14.0, 13.0), i, i, i};

   @Override
   public MapCodec<dkw> a() {
      return c;
   }

   public dkw(dsj.d $$0) {
      super($$0);
   }

   @Nullable
   @Override
   public dsk a(cxm $$0) {
      return this.o();
   }

   @Override
   public ewy a(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
      return $$0.c(b) == dtg.a ? l[Math.min(Math.abs(4 - ($$0.c(d) + 1)), l.length - 1)] : m[$$0.c(d)];
   }

   @Override
   public ewy b(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
      if ($$0.c(d) == 0) {
         return j;
      } else {
         return $$0.c(b) == dtg.b ? k : super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public dsk a(dsk $$0, jf $$1, dsk $$2, dcg $$3, ja $$4, ja $$5) {
      if (b($$0.c(d))) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return $$0.a($$3, $$4) ? $$0 : dfj.a.o();
      }
   }

   @Override
   public boolean a(dsk $$0, dci $$1, ja $$2) {
      return m($$0) && !b($$1, $$2) ? false : super.a($$0, $$1, $$2);
   }

   @Override
   protected boolean b(dsk $$0, dbl $$1, ja $$2) {
      return $$0.a(dfj.cC);
   }

   @Override
   protected void a(dsl.a<dfh, dsk> $$0) {
      $$0.a(d);
      super.a($$0);
   }

   @Override
   public void a(dsk $$0, dcf $$1, ja $$2, bsg $$3) {
      if ($$3 instanceof cjv && $$1.ab().b(dcb.c)) {
         $$1.a($$2, true, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(dsk $$0, cxm $$1) {
      return false;
   }

   @Override
   public void a(dcf $$0, ja $$1, dsk $$2, btb $$3, cuc $$4) {
   }

   @Override
   public boolean d_(dsk $$0) {
      return $$0.c(b) == dtg.b && !this.n($$0);
   }

   @Override
   public void b(dsk $$0, aqm $$1, ja $$2, ayo $$3) {
      float $$4 = dhc.a(this, $$1, $$2);
      boolean $$5 = $$3.a((int)(25.0F / $$4) + 1) == 0;
      if ($$5) {
         this.a($$1, $$0, $$2, 1);
      }
   }

   private void a(aqm $$0, dsk $$1, ja $$2, int $$3) {
      int $$4 = Math.min($$1.c(d) + $$3, 4);
      if (this.a($$0, $$2, $$1, $$4)) {
         dsk $$5 = $$1.a(d, Integer.valueOf($$4));
         $$0.a($$2, $$5, 2);
         if (b($$4)) {
            $$0.a($$2.c(), $$5.a(b, dtg.a), 3);
         }
      }
   }

   private static boolean a(dci $$0, ja $$1) {
      dsk $$2 = $$0.a_($$1);
      return $$2.i() || $$2.a(dfj.kB);
   }

   private static boolean b(dci $$0, ja $$1) {
      return dhc.a($$0, $$1);
   }

   private static boolean m(dsk $$0) {
      return $$0.a(dfj.kB) && $$0.c(b) == dtg.b;
   }

   private static boolean b(int $$0) {
      return $$0 >= 3;
   }

   private boolean a(dci $$0, ja $$1, dsk $$2, int $$3) {
      return !this.n($$2) && b($$0, $$1) && (!b($$3) || a($$0, $$1.c()));
   }

   private boolean n(dsk $$0) {
      return $$0.c(d) >= 4;
   }

   @Nullable
   private dkw.a d(dci $$0, ja $$1, dsk $$2) {
      if (m($$2)) {
         return new dkw.a($$1, $$2);
      } else {
         ja $$3 = $$1.d();
         dsk $$4 = $$0.a_($$3);
         return m($$4) ? new dkw.a($$3, $$4) : null;
      }
   }

   @Override
   public boolean b(dci $$0, ja $$1, dsk $$2) {
      dkw.a $$3 = this.d($$0, $$1, $$2);
      return $$3 == null ? false : this.a($$0, $$3.a, $$3.b, $$3.b.c(d) + 1);
   }

   @Override
   public boolean a(dcf $$0, ayo $$1, ja $$2, dsk $$3) {
      return true;
   }

   @Override
   public void a(aqm $$0, ayo $$1, ja $$2, dsk $$3) {
      dkw.a $$4 = this.d($$0, $$2, $$3);
      if ($$4 != null) {
         this.a($$0, $$4.b, $$4.a, 1);
      }
   }

   static record a(ja a, dsk b) {
   }
}
