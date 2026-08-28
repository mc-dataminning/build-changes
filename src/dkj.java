import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dkj extends dhc implements dex {
   public static final MapCodec<dkj> c = b(dkj::new);
   public static final dsx d = dsn.at;
   public static final int e = 4;
   private static final int f = 3;
   private static final int g = 1;
   private static final ewf h = deu.a(3.0, 0.0, 3.0, 13.0, 15.0, 13.0);
   private static final ewf i = deu.a(3.0, -1.0, 3.0, 13.0, 16.0, 13.0);
   private static final ewf j = deu.a(5.0, -1.0, 5.0, 11.0, 3.0, 11.0);
   private static final ewf k = deu.a(3.0, -1.0, 3.0, 13.0, 5.0, 13.0);
   private static final ewf[] l = new ewf[]{deu.a(3.0, 0.0, 3.0, 13.0, 11.0, 13.0), h};
   private static final ewf[] m = new ewf[]{j, deu.a(3.0, -1.0, 3.0, 13.0, 14.0, 13.0), i, i, i};

   @Override
   public MapCodec<dkj> a() {
      return c;
   }

   public dkj(drw.d $$0) {
      super($$0);
   }

   @Nullable
   @Override
   public drx a(cxv $$0) {
      return this.n();
   }

   @Override
   public ewf a(drx $$0, daz $$1, iz $$2, evr $$3) {
      return $$0.c(b) == dst.a ? l[Math.min(Math.abs(4 - ($$0.c(d) + 1)), l.length - 1)] : m[$$0.c(d)];
   }

   @Override
   public ewf b(drx $$0, daz $$1, iz $$2, evr $$3) {
      if ($$0.c(d) == 0) {
         return j;
      } else {
         return $$0.c(b) == dst.b ? k : super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public drx a(drx $$0, je $$1, drx $$2, dbu $$3, iz $$4, iz $$5) {
      if (b($$0.c(d))) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return $$0.a($$3, $$4) ? $$0 : dew.a.n();
      }
   }

   @Override
   public boolean a(drx $$0, dbw $$1, iz $$2) {
      return m($$0) && !b($$1, $$2) ? false : super.a($$0, $$1, $$2);
   }

   @Override
   protected boolean b(drx $$0, daz $$1, iz $$2) {
      return $$0.a(dew.cC);
   }

   @Override
   protected void a(dry.a<deu, drx> $$0) {
      $$0.a(d);
      super.a($$0);
   }

   @Override
   public void a(drx $$0, dbt $$1, iz $$2, bsp $$3) {
      if ($$3 instanceof ckd && $$1.ab().b(dbp.c)) {
         $$1.a($$2, true, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(drx $$0, cxv $$1) {
      return false;
   }

   @Override
   public void a(dbt $$0, iz $$1, drx $$2, btk $$3, cuk $$4) {
   }

   @Override
   public boolean d_(drx $$0) {
      return $$0.c(b) == dst.b && !this.n($$0);
   }

   @Override
   public void b(drx $$0, arb $$1, iz $$2, azc $$3) {
      float $$4 = dgp.a(this, $$1, $$2);
      boolean $$5 = $$3.a((int)(25.0F / $$4) + 1) == 0;
      if ($$5) {
         this.a($$1, $$0, $$2, 1);
      }
   }

   private void a(arb $$0, drx $$1, iz $$2, int $$3) {
      int $$4 = Math.min($$1.c(d) + $$3, 4);
      if (this.a($$0, $$2, $$1, $$4)) {
         drx $$5 = $$1.a(d, Integer.valueOf($$4));
         $$0.a($$2, $$5, 2);
         if (b($$4)) {
            $$0.a($$2.c(), $$5.a(b, dst.a), 3);
         }
      }
   }

   private static boolean a(dbw $$0, iz $$1) {
      drx $$2 = $$0.a_($$1);
      return $$2.i() || $$2.a(dew.kB);
   }

   private static boolean b(dbw $$0, iz $$1) {
      return dgp.a($$0, $$1);
   }

   private static boolean m(drx $$0) {
      return $$0.a(dew.kB) && $$0.c(b) == dst.b;
   }

   private static boolean b(int $$0) {
      return $$0 >= 3;
   }

   private boolean a(dbw $$0, iz $$1, drx $$2, int $$3) {
      return !this.n($$2) && b($$0, $$1) && (!b($$3) || a($$0, $$1.c()));
   }

   private boolean n(drx $$0) {
      return $$0.c(d) >= 4;
   }

   @Nullable
   private dkj.a d(dbw $$0, iz $$1, drx $$2) {
      if (m($$2)) {
         return new dkj.a($$1, $$2);
      } else {
         iz $$3 = $$1.d();
         drx $$4 = $$0.a_($$3);
         return m($$4) ? new dkj.a($$3, $$4) : null;
      }
   }

   @Override
   public boolean b(dbw $$0, iz $$1, drx $$2) {
      dkj.a $$3 = this.d($$0, $$1, $$2);
      return $$3 == null ? false : this.a($$0, $$3.a, $$3.b, $$3.b.c(d) + 1);
   }

   @Override
   public boolean a(dbt $$0, azc $$1, iz $$2, drx $$3) {
      return true;
   }

   @Override
   public void a(arb $$0, azc $$1, iz $$2, drx $$3) {
      dkj.a $$4 = this.d($$0, $$2, $$3);
      if ($$4 != null) {
         this.a($$0, $$4.b, $$4.a, 1);
      }
   }

   static record a(iz a, drx b) {
   }
}
