import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dll extends die implements dfz {
   public static final MapCodec<dll> c = b(dll::new);
   public static final dua d = dtq.at;
   public static final int e = 4;
   private static final int f = 3;
   private static final int g = 1;
   private static final exp h = dfw.a(3.0, 0.0, 3.0, 13.0, 15.0, 13.0);
   private static final exp i = dfw.a(3.0, -1.0, 3.0, 13.0, 16.0, 13.0);
   private static final exp j = dfw.a(5.0, -1.0, 5.0, 11.0, 3.0, 11.0);
   private static final exp k = dfw.a(3.0, -1.0, 3.0, 13.0, 5.0, 13.0);
   private static final exp[] l = new exp[]{dfw.a(3.0, 0.0, 3.0, 13.0, 11.0, 13.0), h};
   private static final exp[] m = new exp[]{j, dfw.a(3.0, -1.0, 3.0, 13.0, 14.0, 13.0), i, i, i};

   @Override
   public MapCodec<dll> a() {
      return c;
   }

   public dll(dsz.d $$0) {
      super($$0);
   }

   @Nullable
   @Override
   public dta a(cyb $$0) {
      return this.o();
   }

   @Override
   public exp a(dta $$0, dca $$1, jd $$2, exb $$3) {
      return $$0.c(b) == dtw.a ? l[Math.min(Math.abs(4 - ($$0.c(d) + 1)), l.length - 1)] : m[$$0.c(d)];
   }

   @Override
   public exp b(dta $$0, dca $$1, jd $$2, exb $$3) {
      if ($$0.c(d) == 0) {
         return j;
      } else {
         return $$0.c(b) == dtw.b ? k : super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public dta a(dta $$0, ji $$1, dta $$2, dcv $$3, jd $$4, jd $$5) {
      if (b($$0.c(d))) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return $$0.a($$3, $$4) ? $$0 : dfy.a.o();
      }
   }

   @Override
   public boolean a(dta $$0, dcx $$1, jd $$2) {
      return m($$0) && !b($$1, $$2) ? false : super.a($$0, $$1, $$2);
   }

   @Override
   protected boolean b(dta $$0, dca $$1, jd $$2) {
      return $$0.a(dfy.cC);
   }

   @Override
   protected void a(dtb.a<dfw, dta> $$0) {
      $$0.a(d);
      super.a($$0);
   }

   @Override
   public void a(dta $$0, dcu $$1, jd $$2, bsq $$3) {
      if ($$3 instanceof ckg && $$1.ab().b(dcq.c)) {
         $$1.a($$2, true, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(dta $$0, cyb $$1) {
      return false;
   }

   @Override
   public void a(dcu $$0, jd $$1, dta $$2, btl $$3, cuo $$4) {
   }

   @Override
   public boolean d_(dta $$0) {
      return $$0.c(b) == dtw.b && !this.n($$0);
   }

   @Override
   public void b(dta $$0, aqt $$1, jd $$2, ayv $$3) {
      float $$4 = dhr.a(this, $$1, $$2);
      boolean $$5 = $$3.a((int)(25.0F / $$4) + 1) == 0;
      if ($$5) {
         this.a($$1, $$0, $$2, 1);
      }
   }

   private void a(aqt $$0, dta $$1, jd $$2, int $$3) {
      int $$4 = Math.min($$1.c(d) + $$3, 4);
      if (this.a($$0, $$2, $$1, $$4)) {
         dta $$5 = $$1.a(d, Integer.valueOf($$4));
         $$0.a($$2, $$5, 2);
         if (b($$4)) {
            $$0.a($$2.c(), $$5.a(b, dtw.a), 3);
         }
      }
   }

   private static boolean a(dcx $$0, jd $$1) {
      dta $$2 = $$0.a_($$1);
      return $$2.i() || $$2.a(dfy.kB);
   }

   private static boolean b(dcx $$0, jd $$1) {
      return dhr.a($$0, $$1);
   }

   private static boolean m(dta $$0) {
      return $$0.a(dfy.kB) && $$0.c(b) == dtw.b;
   }

   private static boolean b(int $$0) {
      return $$0 >= 3;
   }

   private boolean a(dcx $$0, jd $$1, dta $$2, int $$3) {
      return !this.n($$2) && b($$0, $$1) && (!b($$3) || a($$0, $$1.c()));
   }

   private boolean n(dta $$0) {
      return $$0.c(d) >= 4;
   }

   @Nullable
   private dll.a d(dcx $$0, jd $$1, dta $$2) {
      if (m($$2)) {
         return new dll.a($$1, $$2);
      } else {
         jd $$3 = $$1.d();
         dta $$4 = $$0.a_($$3);
         return m($$4) ? new dll.a($$3, $$4) : null;
      }
   }

   @Override
   public boolean b(dcx $$0, jd $$1, dta $$2) {
      dll.a $$3 = this.d($$0, $$1, $$2);
      return $$3 == null ? false : this.a($$0, $$3.a, $$3.b, $$3.b.c(d) + 1);
   }

   @Override
   public boolean a(dcu $$0, ayv $$1, jd $$2, dta $$3) {
      return true;
   }

   @Override
   public void a(aqt $$0, ayv $$1, jd $$2, dta $$3) {
      dll.a $$4 = this.d($$0, $$2, $$3);
      if ($$4 != null) {
         this.a($$0, $$4.b, $$4.a, 1);
      }
   }

   static record a(jd a, dta b) {
   }
}
