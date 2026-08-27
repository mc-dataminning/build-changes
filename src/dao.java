import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dao extends cxi implements cvd {
   public static final MapCodec<dao> c = b(dao::new);
   public static final dii d = dhy.at;
   public static final int e = 4;
   private static final int f = 3;
   private static final int g = 1;
   private static final ekn h = cva.a(3.0, 0.0, 3.0, 13.0, 15.0, 13.0);
   private static final ekn i = cva.a(3.0, -1.0, 3.0, 13.0, 16.0, 13.0);
   private static final ekn j = cva.a(5.0, -1.0, 5.0, 11.0, 3.0, 11.0);
   private static final ekn k = cva.a(3.0, -1.0, 3.0, 13.0, 5.0, 13.0);
   private static final ekn[] l = new ekn[]{cva.a(3.0, 0.0, 3.0, 13.0, 11.0, 13.0), h};
   private static final ekn[] m = new ekn[]{j, cva.a(3.0, -1.0, 3.0, 13.0, 14.0, 13.0), i, i, i};

   @Override
   public MapCodec<dao> a() {
      return c;
   }

   public dao(dhh.d $$0) {
      super($$0);
   }

   @Nullable
   @Override
   public dhi a(cnr $$0) {
      return this.o();
   }

   @Override
   public ekn a(dhi $$0, crg $$1, ht $$2, ejz $$3) {
      return $$0.c(b) == die.a ? l[Math.min(Math.abs(4 - ($$0.c(d) + 1)), l.length - 1)] : m[$$0.c(d)];
   }

   @Override
   public ekn b(dhi $$0, crg $$1, ht $$2, ejz $$3) {
      if ($$0.c(d) == 0) {
         return j;
      } else {
         return $$0.c(b) == die.b ? k : super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public dhi a(dhi $$0, hx $$1, dhi $$2, csb $$3, ht $$4, ht $$5) {
      if (b($$0.c(d))) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return $$0.a($$3, $$4) ? $$0 : cvc.a.o();
      }
   }

   @Override
   public boolean a(dhi $$0, csd $$1, ht $$2) {
      return h($$0) && !b($$1, $$2) ? false : super.a($$0, $$1, $$2);
   }

   @Override
   protected boolean b(dhi $$0, crg $$1, ht $$2) {
      return $$0.a(cvc.cC);
   }

   @Override
   protected void a(dhj.a<cva, dhi> $$0) {
      $$0.a(d);
      super.a($$0);
   }

   @Override
   public void a(dhi $$0, csa $$1, ht $$2, bkq $$3) {
      if ($$3 instanceof cbn && $$1.Y().b(crw.c)) {
         $$1.a($$2, true, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(dhi $$0, cnr $$1) {
      return false;
   }

   @Override
   public void a(csa $$0, ht $$1, dhi $$2, blg $$3, clj $$4) {
   }

   @Override
   public boolean e_(dhi $$0) {
      return $$0.c(b) == die.b && !this.n($$0);
   }

   @Override
   public void b(dhi $$0, ame $$1, ht $$2, ats $$3) {
      float $$4 = cwv.a(this, $$1, $$2);
      boolean $$5 = $$3.a((int)(25.0F / $$4) + 1) == 0;
      if ($$5) {
         this.a($$1, $$0, $$2, 1);
      }
   }

   private void a(ame $$0, dhi $$1, ht $$2, int $$3) {
      int $$4 = Math.min($$1.c(d) + $$3, 4);
      if (this.a($$0, $$2, $$1, $$4)) {
         dhi $$5 = $$1.a(d, Integer.valueOf($$4));
         $$0.a($$2, $$5, 2);
         if (b($$4)) {
            $$0.a($$2.c(), $$5.a(b, die.a), 3);
         }
      }
   }

   private static boolean a(csd $$0, ht $$1) {
      dhi $$2 = $$0.a_($$1);
      return $$2.i() || $$2.a(cvc.kB);
   }

   private static boolean b(csd $$0, ht $$1) {
      return cwv.a($$0, $$1);
   }

   private static boolean h(dhi $$0) {
      return $$0.a(cvc.kB) && $$0.c(b) == die.b;
   }

   private static boolean b(int $$0) {
      return $$0 >= 3;
   }

   private boolean a(csd $$0, ht $$1, dhi $$2, int $$3) {
      return !this.n($$2) && b($$0, $$1) && (!b($$3) || a($$0, $$1.c()));
   }

   private boolean n(dhi $$0) {
      return $$0.c(d) >= 4;
   }

   @Nullable
   private dao.a d(csd $$0, ht $$1, dhi $$2) {
      if (h($$2)) {
         return new dao.a($$1, $$2);
      } else {
         ht $$3 = $$1.d();
         dhi $$4 = $$0.a_($$3);
         return h($$4) ? new dao.a($$3, $$4) : null;
      }
   }

   @Override
   public boolean b(csd $$0, ht $$1, dhi $$2) {
      dao.a $$3 = this.d($$0, $$1, $$2);
      return $$3 == null ? false : this.a($$0, $$3.a, $$3.b, $$3.b.c(d) + 1);
   }

   @Override
   public boolean a(csa $$0, ats $$1, ht $$2, dhi $$3) {
      return true;
   }

   @Override
   public void a(ame $$0, ats $$1, ht $$2, dhi $$3) {
      dao.a $$4 = this.d($$0, $$2, $$3);
      if ($$4 != null) {
         this.a($$0, $$4.b, $$4.a, 1);
      }
   }

   static record a(ht a, dhi b) {
   }
}
