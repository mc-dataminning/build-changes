import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dkn extends dhg implements dfb {
   public static final MapCodec<dkn> c = b(dkn::new);
   public static final dtb d = dsr.at;
   public static final int e = 4;
   private static final int f = 3;
   private static final int g = 1;
   private static final ewj h = dey.a(3.0, 0.0, 3.0, 13.0, 15.0, 13.0);
   private static final ewj i = dey.a(3.0, -1.0, 3.0, 13.0, 16.0, 13.0);
   private static final ewj j = dey.a(5.0, -1.0, 5.0, 11.0, 3.0, 11.0);
   private static final ewj k = dey.a(3.0, -1.0, 3.0, 13.0, 5.0, 13.0);
   private static final ewj[] l = new ewj[]{dey.a(3.0, 0.0, 3.0, 13.0, 11.0, 13.0), h};
   private static final ewj[] m = new ewj[]{j, dey.a(3.0, -1.0, 3.0, 13.0, 14.0, 13.0), i, i, i};

   @Override
   public MapCodec<dkn> a() {
      return c;
   }

   public dkn(dsa.d $$0) {
      super($$0);
   }

   @Nullable
   @Override
   public dsb a(cxz $$0) {
      return this.o();
   }

   @Override
   public ewj a(dsb $$0, dbd $$1, iz $$2, evv $$3) {
      return $$0.c(b) == dsx.a ? l[Math.min(Math.abs(4 - ($$0.c(d) + 1)), l.length - 1)] : m[$$0.c(d)];
   }

   @Override
   public ewj b(dsb $$0, dbd $$1, iz $$2, evv $$3) {
      if ($$0.c(d) == 0) {
         return j;
      } else {
         return $$0.c(b) == dsx.b ? k : super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public dsb a(dsb $$0, je $$1, dsb $$2, dby $$3, iz $$4, iz $$5) {
      if (b($$0.c(d))) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return $$0.a($$3, $$4) ? $$0 : dfa.a.o();
      }
   }

   @Override
   public boolean a(dsb $$0, dca $$1, iz $$2) {
      return m($$0) && !b($$1, $$2) ? false : super.a($$0, $$1, $$2);
   }

   @Override
   protected boolean b(dsb $$0, dbd $$1, iz $$2) {
      return $$0.a(dfa.cC);
   }

   @Override
   protected void a(dsc.a<dey, dsb> $$0) {
      $$0.a(d);
      super.a($$0);
   }

   @Override
   public void a(dsb $$0, dbx $$1, iz $$2, bst $$3) {
      if ($$3 instanceof ckh && $$1.ab().b(dbt.c)) {
         $$1.a($$2, true, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(dsb $$0, cxz $$1) {
      return false;
   }

   @Override
   public void a(dbx $$0, iz $$1, dsb $$2, bto $$3, cuo $$4) {
   }

   @Override
   public boolean d_(dsb $$0) {
      return $$0.c(b) == dsx.b && !this.n($$0);
   }

   @Override
   public void b(dsb $$0, are $$1, iz $$2, azg $$3) {
      float $$4 = dgt.a(this, $$1, $$2);
      boolean $$5 = $$3.a((int)(25.0F / $$4) + 1) == 0;
      if ($$5) {
         this.a($$1, $$0, $$2, 1);
      }
   }

   private void a(are $$0, dsb $$1, iz $$2, int $$3) {
      int $$4 = Math.min($$1.c(d) + $$3, 4);
      if (this.a($$0, $$2, $$1, $$4)) {
         dsb $$5 = $$1.a(d, Integer.valueOf($$4));
         $$0.a($$2, $$5, 2);
         if (b($$4)) {
            $$0.a($$2.c(), $$5.a(b, dsx.a), 3);
         }
      }
   }

   private static boolean a(dca $$0, iz $$1) {
      dsb $$2 = $$0.a_($$1);
      return $$2.i() || $$2.a(dfa.kB);
   }

   private static boolean b(dca $$0, iz $$1) {
      return dgt.a($$0, $$1);
   }

   private static boolean m(dsb $$0) {
      return $$0.a(dfa.kB) && $$0.c(b) == dsx.b;
   }

   private static boolean b(int $$0) {
      return $$0 >= 3;
   }

   private boolean a(dca $$0, iz $$1, dsb $$2, int $$3) {
      return !this.n($$2) && b($$0, $$1) && (!b($$3) || a($$0, $$1.c()));
   }

   private boolean n(dsb $$0) {
      return $$0.c(d) >= 4;
   }

   @Nullable
   private dkn.a d(dca $$0, iz $$1, dsb $$2) {
      if (m($$2)) {
         return new dkn.a($$1, $$2);
      } else {
         iz $$3 = $$1.d();
         dsb $$4 = $$0.a_($$3);
         return m($$4) ? new dkn.a($$3, $$4) : null;
      }
   }

   @Override
   public boolean b(dca $$0, iz $$1, dsb $$2) {
      dkn.a $$3 = this.d($$0, $$1, $$2);
      return $$3 == null ? false : this.a($$0, $$3.a, $$3.b, $$3.b.c(d) + 1);
   }

   @Override
   public boolean a(dbx $$0, azg $$1, iz $$2, dsb $$3) {
      return true;
   }

   @Override
   public void a(are $$0, azg $$1, iz $$2, dsb $$3) {
      dkn.a $$4 = this.d($$0, $$2, $$3);
      if ($$4 != null) {
         this.a($$0, $$4.b, $$4.a, 1);
      }
   }

   static record a(iz a, dsb b) {
   }
}
