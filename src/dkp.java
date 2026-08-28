import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dkp extends dhi implements dfd {
   public static final MapCodec<dkp> c = b(dkp::new);
   public static final dtd d = dst.at;
   public static final int e = 4;
   private static final int f = 3;
   private static final int g = 1;
   private static final ewl h = dfa.a(3.0, 0.0, 3.0, 13.0, 15.0, 13.0);
   private static final ewl i = dfa.a(3.0, -1.0, 3.0, 13.0, 16.0, 13.0);
   private static final ewl j = dfa.a(5.0, -1.0, 5.0, 11.0, 3.0, 11.0);
   private static final ewl k = dfa.a(3.0, -1.0, 3.0, 13.0, 5.0, 13.0);
   private static final ewl[] l = new ewl[]{dfa.a(3.0, 0.0, 3.0, 13.0, 11.0, 13.0), h};
   private static final ewl[] m = new ewl[]{j, dfa.a(3.0, -1.0, 3.0, 13.0, 14.0, 13.0), i, i, i};

   @Override
   public MapCodec<dkp> a() {
      return c;
   }

   public dkp(dsc.d $$0) {
      super($$0);
   }

   @Nullable
   @Override
   public dsd a(cyb $$0) {
      return this.o();
   }

   @Override
   public ewl a(dsd $$0, dbf $$1, iz $$2, evx $$3) {
      return $$0.c(b) == dsz.a ? l[Math.min(Math.abs(4 - ($$0.c(d) + 1)), l.length - 1)] : m[$$0.c(d)];
   }

   @Override
   public ewl b(dsd $$0, dbf $$1, iz $$2, evx $$3) {
      if ($$0.c(d) == 0) {
         return j;
      } else {
         return $$0.c(b) == dsz.b ? k : super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public dsd a(dsd $$0, je $$1, dsd $$2, dca $$3, iz $$4, iz $$5) {
      if (b($$0.c(d))) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return $$0.a($$3, $$4) ? $$0 : dfc.a.o();
      }
   }

   @Override
   public boolean a(dsd $$0, dcc $$1, iz $$2) {
      return m($$0) && !b($$1, $$2) ? false : super.a($$0, $$1, $$2);
   }

   @Override
   protected boolean b(dsd $$0, dbf $$1, iz $$2) {
      return $$0.a(dfc.cC);
   }

   @Override
   protected void a(dse.a<dfa, dsd> $$0) {
      $$0.a(d);
      super.a($$0);
   }

   @Override
   public void a(dsd $$0, dbz $$1, iz $$2, bsv $$3) {
      if ($$3 instanceof ckj && $$1.ab().b(dbv.c)) {
         $$1.a($$2, true, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(dsd $$0, cyb $$1) {
      return false;
   }

   @Override
   public void a(dbz $$0, iz $$1, dsd $$2, btq $$3, cuq $$4) {
   }

   @Override
   public boolean d_(dsd $$0) {
      return $$0.c(b) == dsz.b && !this.n($$0);
   }

   @Override
   public void b(dsd $$0, arf $$1, iz $$2, azh $$3) {
      float $$4 = dgv.a(this, $$1, $$2);
      boolean $$5 = $$3.a((int)(25.0F / $$4) + 1) == 0;
      if ($$5) {
         this.a($$1, $$0, $$2, 1);
      }
   }

   private void a(arf $$0, dsd $$1, iz $$2, int $$3) {
      int $$4 = Math.min($$1.c(d) + $$3, 4);
      if (this.a($$0, $$2, $$1, $$4)) {
         dsd $$5 = $$1.a(d, Integer.valueOf($$4));
         $$0.a($$2, $$5, 2);
         if (b($$4)) {
            $$0.a($$2.c(), $$5.a(b, dsz.a), 3);
         }
      }
   }

   private static boolean a(dcc $$0, iz $$1) {
      dsd $$2 = $$0.a_($$1);
      return $$2.i() || $$2.a(dfc.kB);
   }

   private static boolean b(dcc $$0, iz $$1) {
      return dgv.a($$0, $$1);
   }

   private static boolean m(dsd $$0) {
      return $$0.a(dfc.kB) && $$0.c(b) == dsz.b;
   }

   private static boolean b(int $$0) {
      return $$0 >= 3;
   }

   private boolean a(dcc $$0, iz $$1, dsd $$2, int $$3) {
      return !this.n($$2) && b($$0, $$1) && (!b($$3) || a($$0, $$1.c()));
   }

   private boolean n(dsd $$0) {
      return $$0.c(d) >= 4;
   }

   @Nullable
   private dkp.a d(dcc $$0, iz $$1, dsd $$2) {
      if (m($$2)) {
         return new dkp.a($$1, $$2);
      } else {
         iz $$3 = $$1.d();
         dsd $$4 = $$0.a_($$3);
         return m($$4) ? new dkp.a($$3, $$4) : null;
      }
   }

   @Override
   public boolean b(dcc $$0, iz $$1, dsd $$2) {
      dkp.a $$3 = this.d($$0, $$1, $$2);
      return $$3 == null ? false : this.a($$0, $$3.a, $$3.b, $$3.b.c(d) + 1);
   }

   @Override
   public boolean a(dbz $$0, azh $$1, iz $$2, dsd $$3) {
      return true;
   }

   @Override
   public void a(arf $$0, azh $$1, iz $$2, dsd $$3) {
      dkp.a $$4 = this.d($$0, $$2, $$3);
      if ($$4 != null) {
         this.a($$0, $$4.b, $$4.a, 1);
      }
   }

   static record a(iz a, dsd b) {
   }
}
