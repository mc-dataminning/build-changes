import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dku extends dhn implements dfi {
   public static final MapCodec<dku> c = b(dku::new);
   public static final dth d = dsx.at;
   public static final int e = 4;
   private static final int f = 3;
   private static final int g = 1;
   private static final ews h = dff.a(3.0, 0.0, 3.0, 13.0, 15.0, 13.0);
   private static final ews i = dff.a(3.0, -1.0, 3.0, 13.0, 16.0, 13.0);
   private static final ews j = dff.a(5.0, -1.0, 5.0, 11.0, 3.0, 11.0);
   private static final ews k = dff.a(3.0, -1.0, 3.0, 13.0, 5.0, 13.0);
   private static final ews[] l = new ews[]{dff.a(3.0, 0.0, 3.0, 13.0, 11.0, 13.0), h};
   private static final ews[] m = new ews[]{j, dff.a(3.0, -1.0, 3.0, 13.0, 14.0, 13.0), i, i, i};

   @Override
   public MapCodec<dku> a() {
      return c;
   }

   public dku(dsg.d $$0) {
      super($$0);
   }

   @Nullable
   @Override
   public dsh a(cxk $$0) {
      return this.o();
   }

   @Override
   public ews a(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
      return $$0.c(b) == dtd.a ? l[Math.min(Math.abs(4 - ($$0.c(d) + 1)), l.length - 1)] : m[$$0.c(d)];
   }

   @Override
   public ews b(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
      if ($$0.c(d) == 0) {
         return j;
      } else {
         return $$0.c(b) == dtd.b ? k : super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public dsh a(dsh $$0, jf $$1, dsh $$2, dce $$3, ja $$4, ja $$5) {
      if (b($$0.c(d))) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return $$0.a($$3, $$4) ? $$0 : dfh.a.o();
      }
   }

   @Override
   public boolean a(dsh $$0, dcg $$1, ja $$2) {
      return m($$0) && !b($$1, $$2) ? false : super.a($$0, $$1, $$2);
   }

   @Override
   protected boolean b(dsh $$0, dbj $$1, ja $$2) {
      return $$0.a(dfh.cC);
   }

   @Override
   protected void a(dsi.a<dff, dsh> $$0) {
      $$0.a(d);
      super.a($$0);
   }

   @Override
   public void a(dsh $$0, dcd $$1, ja $$2, bsd $$3) {
      if ($$3 instanceof cjs && $$1.ab().b(dbz.c)) {
         $$1.a($$2, true, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(dsh $$0, cxk $$1) {
      return false;
   }

   @Override
   public void a(dcd $$0, ja $$1, dsh $$2, bsy $$3, cua $$4) {
   }

   @Override
   public boolean d_(dsh $$0) {
      return $$0.c(b) == dtd.b && !this.n($$0);
   }

   @Override
   public void b(dsh $$0, aqk $$1, ja $$2, aym $$3) {
      float $$4 = dha.a(this, $$1, $$2);
      boolean $$5 = $$3.a((int)(25.0F / $$4) + 1) == 0;
      if ($$5) {
         this.a($$1, $$0, $$2, 1);
      }
   }

   private void a(aqk $$0, dsh $$1, ja $$2, int $$3) {
      int $$4 = Math.min($$1.c(d) + $$3, 4);
      if (this.a($$0, $$2, $$1, $$4)) {
         dsh $$5 = $$1.a(d, Integer.valueOf($$4));
         $$0.a($$2, $$5, 2);
         if (b($$4)) {
            $$0.a($$2.c(), $$5.a(b, dtd.a), 3);
         }
      }
   }

   private static boolean a(dcg $$0, ja $$1) {
      dsh $$2 = $$0.a_($$1);
      return $$2.i() || $$2.a(dfh.kB);
   }

   private static boolean b(dcg $$0, ja $$1) {
      return dha.a($$0, $$1);
   }

   private static boolean m(dsh $$0) {
      return $$0.a(dfh.kB) && $$0.c(b) == dtd.b;
   }

   private static boolean b(int $$0) {
      return $$0 >= 3;
   }

   private boolean a(dcg $$0, ja $$1, dsh $$2, int $$3) {
      return !this.n($$2) && b($$0, $$1) && (!b($$3) || a($$0, $$1.c()));
   }

   private boolean n(dsh $$0) {
      return $$0.c(d) >= 4;
   }

   @Nullable
   private dku.a d(dcg $$0, ja $$1, dsh $$2) {
      if (m($$2)) {
         return new dku.a($$1, $$2);
      } else {
         ja $$3 = $$1.d();
         dsh $$4 = $$0.a_($$3);
         return m($$4) ? new dku.a($$3, $$4) : null;
      }
   }

   @Override
   public boolean b(dcg $$0, ja $$1, dsh $$2) {
      dku.a $$3 = this.d($$0, $$1, $$2);
      return $$3 == null ? false : this.a($$0, $$3.a, $$3.b, $$3.b.c(d) + 1);
   }

   @Override
   public boolean a(dcd $$0, aym $$1, ja $$2, dsh $$3) {
      return true;
   }

   @Override
   public void a(aqk $$0, aym $$1, ja $$2, dsh $$3) {
      dku.a $$4 = this.d($$0, $$2, $$3);
      if ($$4 != null) {
         this.a($$0, $$4.b, $$4.a, 1);
      }
   }

   static record a(ja a, dsh b) {
   }
}
