import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dkm extends dhf implements dfa {
   public static final MapCodec<dkm> c = b(dkm::new);
   public static final dta d = dsq.at;
   public static final int e = 4;
   private static final int f = 3;
   private static final int g = 1;
   private static final ewi h = dex.a(3.0, 0.0, 3.0, 13.0, 15.0, 13.0);
   private static final ewi i = dex.a(3.0, -1.0, 3.0, 13.0, 16.0, 13.0);
   private static final ewi j = dex.a(5.0, -1.0, 5.0, 11.0, 3.0, 11.0);
   private static final ewi k = dex.a(3.0, -1.0, 3.0, 13.0, 5.0, 13.0);
   private static final ewi[] l = new ewi[]{dex.a(3.0, 0.0, 3.0, 13.0, 11.0, 13.0), h};
   private static final ewi[] m = new ewi[]{j, dex.a(3.0, -1.0, 3.0, 13.0, 14.0, 13.0), i, i, i};

   @Override
   public MapCodec<dkm> a() {
      return c;
   }

   public dkm(drz.d $$0) {
      super($$0);
   }

   @Nullable
   @Override
   public dsa a(cxy $$0) {
      return this.o();
   }

   @Override
   public ewi a(dsa $$0, dbc $$1, iz $$2, evu $$3) {
      return $$0.c(b) == dsw.a ? l[Math.min(Math.abs(4 - ($$0.c(d) + 1)), l.length - 1)] : m[$$0.c(d)];
   }

   @Override
   public ewi b(dsa $$0, dbc $$1, iz $$2, evu $$3) {
      if ($$0.c(d) == 0) {
         return j;
      } else {
         return $$0.c(b) == dsw.b ? k : super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public dsa a(dsa $$0, je $$1, dsa $$2, dbx $$3, iz $$4, iz $$5) {
      if (b($$0.c(d))) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return $$0.a($$3, $$4) ? $$0 : dez.a.o();
      }
   }

   @Override
   public boolean a(dsa $$0, dbz $$1, iz $$2) {
      return m($$0) && !b($$1, $$2) ? false : super.a($$0, $$1, $$2);
   }

   @Override
   protected boolean b(dsa $$0, dbc $$1, iz $$2) {
      return $$0.a(dez.cC);
   }

   @Override
   protected void a(dsb.a<dex, dsa> $$0) {
      $$0.a(d);
      super.a($$0);
   }

   @Override
   public void a(dsa $$0, dbw $$1, iz $$2, bss $$3) {
      if ($$3 instanceof ckg && $$1.ab().b(dbs.c)) {
         $$1.a($$2, true, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(dsa $$0, cxy $$1) {
      return false;
   }

   @Override
   public void a(dbw $$0, iz $$1, dsa $$2, btn $$3, cun $$4) {
   }

   @Override
   public boolean d_(dsa $$0) {
      return $$0.c(b) == dsw.b && !this.n($$0);
   }

   @Override
   public void b(dsa $$0, are $$1, iz $$2, azf $$3) {
      float $$4 = dgs.a(this, $$1, $$2);
      boolean $$5 = $$3.a((int)(25.0F / $$4) + 1) == 0;
      if ($$5) {
         this.a($$1, $$0, $$2, 1);
      }
   }

   private void a(are $$0, dsa $$1, iz $$2, int $$3) {
      int $$4 = Math.min($$1.c(d) + $$3, 4);
      if (this.a($$0, $$2, $$1, $$4)) {
         dsa $$5 = $$1.a(d, Integer.valueOf($$4));
         $$0.a($$2, $$5, 2);
         if (b($$4)) {
            $$0.a($$2.c(), $$5.a(b, dsw.a), 3);
         }
      }
   }

   private static boolean a(dbz $$0, iz $$1) {
      dsa $$2 = $$0.a_($$1);
      return $$2.i() || $$2.a(dez.kB);
   }

   private static boolean b(dbz $$0, iz $$1) {
      return dgs.a($$0, $$1);
   }

   private static boolean m(dsa $$0) {
      return $$0.a(dez.kB) && $$0.c(b) == dsw.b;
   }

   private static boolean b(int $$0) {
      return $$0 >= 3;
   }

   private boolean a(dbz $$0, iz $$1, dsa $$2, int $$3) {
      return !this.n($$2) && b($$0, $$1) && (!b($$3) || a($$0, $$1.c()));
   }

   private boolean n(dsa $$0) {
      return $$0.c(d) >= 4;
   }

   @Nullable
   private dkm.a d(dbz $$0, iz $$1, dsa $$2) {
      if (m($$2)) {
         return new dkm.a($$1, $$2);
      } else {
         iz $$3 = $$1.d();
         dsa $$4 = $$0.a_($$3);
         return m($$4) ? new dkm.a($$3, $$4) : null;
      }
   }

   @Override
   public boolean b(dbz $$0, iz $$1, dsa $$2) {
      dkm.a $$3 = this.d($$0, $$1, $$2);
      return $$3 == null ? false : this.a($$0, $$3.a, $$3.b, $$3.b.c(d) + 1);
   }

   @Override
   public boolean a(dbw $$0, azf $$1, iz $$2, dsa $$3) {
      return true;
   }

   @Override
   public void a(are $$0, azf $$1, iz $$2, dsa $$3) {
      dkm.a $$4 = this.d($$0, $$2, $$3);
      if ($$4 != null) {
         this.a($$0, $$4.b, $$4.a, 1);
      }
   }

   static record a(iz a, dsa b) {
   }
}
