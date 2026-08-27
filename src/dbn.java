import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dbn extends cyh implements cwc {
   public static final MapCodec<dbn> c = b(dbn::new);
   public static final djp d = djf.at;
   public static final int e = 4;
   private static final int f = 3;
   private static final int g = 1;
   private static final elu h = cvz.a(3.0, 0.0, 3.0, 13.0, 15.0, 13.0);
   private static final elu i = cvz.a(3.0, -1.0, 3.0, 13.0, 16.0, 13.0);
   private static final elu j = cvz.a(5.0, -1.0, 5.0, 11.0, 3.0, 11.0);
   private static final elu k = cvz.a(3.0, -1.0, 3.0, 13.0, 5.0, 13.0);
   private static final elu[] l = new elu[]{cvz.a(3.0, 0.0, 3.0, 13.0, 11.0, 13.0), h};
   private static final elu[] m = new elu[]{j, cvz.a(3.0, -1.0, 3.0, 13.0, 14.0, 13.0), i, i, i};

   @Override
   public MapCodec<dbn> a() {
      return c;
   }

   public dbn(dio.d $$0) {
      super($$0);
   }

   @Nullable
   @Override
   public dip a(coq $$0) {
      return this.o();
   }

   @Override
   public elu a(dip $$0, cse $$1, hv $$2, elg $$3) {
      return $$0.c(b) == djl.a ? l[Math.min(Math.abs(4 - ($$0.c(d) + 1)), l.length - 1)] : m[$$0.c(d)];
   }

   @Override
   public elu b(dip $$0, cse $$1, hv $$2, elg $$3) {
      if ($$0.c(d) == 0) {
         return j;
      } else {
         return $$0.c(b) == djl.b ? k : super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public dip a(dip $$0, ia $$1, dip $$2, csz $$3, hv $$4, hv $$5) {
      if (b($$0.c(d))) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return $$0.a($$3, $$4) ? $$0 : cwb.a.o();
      }
   }

   @Override
   public boolean a(dip $$0, ctb $$1, hv $$2) {
      return h($$0) && !b($$1, $$2) ? false : super.a($$0, $$1, $$2);
   }

   @Override
   protected boolean b(dip $$0, cse $$1, hv $$2) {
      return $$0.a(cwb.cC);
   }

   @Override
   protected void a(diq.a<cvz, dip> $$0) {
      $$0.a(d);
      super.a($$0);
   }

   @Override
   public void a(dip $$0, csy $$1, hv $$2, blf $$3) {
      if ($$3 instanceof cce && $$1.Y().b(csu.c)) {
         $$1.a($$2, true, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(dip $$0, coq $$1) {
      return false;
   }

   @Override
   public void a(csy $$0, hv $$1, dip $$2, blv $$3, cmh $$4) {
   }

   @Override
   public boolean e_(dip $$0) {
      return $$0.c(b) == djl.b && !this.n($$0);
   }

   @Override
   public void b(dip $$0, amp $$1, hv $$2, auf $$3) {
      float $$4 = cxu.a(this, $$1, $$2);
      boolean $$5 = $$3.a((int)(25.0F / $$4) + 1) == 0;
      if ($$5) {
         this.a($$1, $$0, $$2, 1);
      }
   }

   private void a(amp $$0, dip $$1, hv $$2, int $$3) {
      int $$4 = Math.min($$1.c(d) + $$3, 4);
      if (this.a($$0, $$2, $$1, $$4)) {
         dip $$5 = $$1.a(d, Integer.valueOf($$4));
         $$0.a($$2, $$5, 2);
         if (b($$4)) {
            $$0.a($$2.c(), $$5.a(b, djl.a), 3);
         }
      }
   }

   private static boolean a(ctb $$0, hv $$1) {
      dip $$2 = $$0.a_($$1);
      return $$2.i() || $$2.a(cwb.kB);
   }

   private static boolean b(ctb $$0, hv $$1) {
      return cxu.a($$0, $$1);
   }

   private static boolean h(dip $$0) {
      return $$0.a(cwb.kB) && $$0.c(b) == djl.b;
   }

   private static boolean b(int $$0) {
      return $$0 >= 3;
   }

   private boolean a(ctb $$0, hv $$1, dip $$2, int $$3) {
      return !this.n($$2) && b($$0, $$1) && (!b($$3) || a($$0, $$1.c()));
   }

   private boolean n(dip $$0) {
      return $$0.c(d) >= 4;
   }

   @Nullable
   private dbn.a d(ctb $$0, hv $$1, dip $$2) {
      if (h($$2)) {
         return new dbn.a($$1, $$2);
      } else {
         hv $$3 = $$1.d();
         dip $$4 = $$0.a_($$3);
         return h($$4) ? new dbn.a($$3, $$4) : null;
      }
   }

   @Override
   public boolean b(ctb $$0, hv $$1, dip $$2) {
      dbn.a $$3 = this.d($$0, $$1, $$2);
      return $$3 == null ? false : this.a($$0, $$3.a, $$3.b, $$3.b.c(d) + 1);
   }

   @Override
   public boolean a(csy $$0, auf $$1, hv $$2, dip $$3) {
      return true;
   }

   @Override
   public void a(amp $$0, auf $$1, hv $$2, dip $$3) {
      dbn.a $$4 = this.d($$0, $$2, $$3);
      if ($$4 != null) {
         this.a($$0, $$4.b, $$4.a, 1);
      }
   }

   static record a(hv a, dip b) {
   }
}
