import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class deg extends dba implements cyv {
   public static final MapCodec<deg> c = b(deg::new);
   public static final dmj d = dlz.at;
   public static final int e = 4;
   private static final int f = 3;
   private static final int g = 1;
   private static final eos h = cys.a(3.0, 0.0, 3.0, 13.0, 15.0, 13.0);
   private static final eos i = cys.a(3.0, -1.0, 3.0, 13.0, 16.0, 13.0);
   private static final eos j = cys.a(5.0, -1.0, 5.0, 11.0, 3.0, 11.0);
   private static final eos k = cys.a(3.0, -1.0, 3.0, 13.0, 5.0, 13.0);
   private static final eos[] l = new eos[]{cys.a(3.0, 0.0, 3.0, 13.0, 11.0, 13.0), h};
   private static final eos[] m = new eos[]{j, cys.a(3.0, -1.0, 3.0, 13.0, 14.0, 13.0), i, i, i};

   @Override
   public MapCodec<deg> a() {
      return c;
   }

   public deg(dli.d $$0) {
      super($$0);
   }

   @Nullable
   @Override
   public dlj a(crk $$0) {
      return this.o();
   }

   @Override
   public eos a(dlj $$0, cux $$1, hz $$2, eoe $$3) {
      return $$0.c(b) == dmf.a ? l[Math.min(Math.abs(4 - ($$0.c(d) + 1)), l.length - 1)] : m[$$0.c(d)];
   }

   @Override
   public eos b(dlj $$0, cux $$1, hz $$2, eoe $$3) {
      if ($$0.c(d) == 0) {
         return j;
      } else {
         return $$0.c(b) == dmf.b ? k : super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public dlj a(dlj $$0, ie $$1, dlj $$2, cvs $$3, hz $$4, hz $$5) {
      if (b($$0.c(d))) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return $$0.a($$3, $$4) ? $$0 : cyu.a.o();
      }
   }

   @Override
   public boolean a(dlj $$0, cvu $$1, hz $$2) {
      return m($$0) && !b($$1, $$2) ? false : super.a($$0, $$1, $$2);
   }

   @Override
   protected boolean b(dlj $$0, cux $$1, hz $$2) {
      return $$0.a(cyu.cC);
   }

   @Override
   protected void a(dlk.a<cys, dlj> $$0) {
      $$0.a(d);
      super.a($$0);
   }

   @Override
   public void a(dlj $$0, cvr $$1, hz $$2, bnq $$3) {
      if ($$3 instanceof cew && $$1.Z().b(cvn.c)) {
         $$1.a($$2, true, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(dlj $$0, crk $$1) {
      return false;
   }

   @Override
   public void a(cvr $$0, hz $$1, dlj $$2, boi $$3, cpd $$4) {
   }

   @Override
   public boolean e_(dlj $$0) {
      return $$0.c(b) == dmf.b && !this.n($$0);
   }

   @Override
   public void b(dlj $$0, aow $$1, hz $$2, awp $$3) {
      float $$4 = dan.a(this, $$1, $$2);
      boolean $$5 = $$3.a((int)(25.0F / $$4) + 1) == 0;
      if ($$5) {
         this.a($$1, $$0, $$2, 1);
      }
   }

   private void a(aow $$0, dlj $$1, hz $$2, int $$3) {
      int $$4 = Math.min($$1.c(d) + $$3, 4);
      if (this.a($$0, $$2, $$1, $$4)) {
         dlj $$5 = $$1.a(d, Integer.valueOf($$4));
         $$0.a($$2, $$5, 2);
         if (b($$4)) {
            $$0.a($$2.c(), $$5.a(b, dmf.a), 3);
         }
      }
   }

   private static boolean a(cvu $$0, hz $$1) {
      dlj $$2 = $$0.a_($$1);
      return $$2.i() || $$2.a(cyu.kB);
   }

   private static boolean b(cvu $$0, hz $$1) {
      return dan.a($$0, $$1);
   }

   private static boolean m(dlj $$0) {
      return $$0.a(cyu.kB) && $$0.c(b) == dmf.b;
   }

   private static boolean b(int $$0) {
      return $$0 >= 3;
   }

   private boolean a(cvu $$0, hz $$1, dlj $$2, int $$3) {
      return !this.n($$2) && b($$0, $$1) && (!b($$3) || a($$0, $$1.c()));
   }

   private boolean n(dlj $$0) {
      return $$0.c(d) >= 4;
   }

   @Nullable
   private deg.a d(cvu $$0, hz $$1, dlj $$2) {
      if (m($$2)) {
         return new deg.a($$1, $$2);
      } else {
         hz $$3 = $$1.d();
         dlj $$4 = $$0.a_($$3);
         return m($$4) ? new deg.a($$3, $$4) : null;
      }
   }

   @Override
   public boolean b(cvu $$0, hz $$1, dlj $$2) {
      deg.a $$3 = this.d($$0, $$1, $$2);
      return $$3 == null ? false : this.a($$0, $$3.a, $$3.b, $$3.b.c(d) + 1);
   }

   @Override
   public boolean a(cvr $$0, awp $$1, hz $$2, dlj $$3) {
      return true;
   }

   @Override
   public void a(aow $$0, awp $$1, hz $$2, dlj $$3) {
      deg.a $$4 = this.d($$0, $$2, $$3);
      if ($$4 != null) {
         this.a($$0, $$4.b, $$4.a, 1);
      }
   }

   static record a(hz a, dlj b) {
   }
}
