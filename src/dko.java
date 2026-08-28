import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dko extends dhh implements dfc {
   public static final MapCodec<dko> c = b(dko::new);
   public static final dtc d = dss.at;
   public static final int e = 4;
   private static final int f = 3;
   private static final int g = 1;
   private static final ewk h = dez.a(3.0, 0.0, 3.0, 13.0, 15.0, 13.0);
   private static final ewk i = dez.a(3.0, -1.0, 3.0, 13.0, 16.0, 13.0);
   private static final ewk j = dez.a(5.0, -1.0, 5.0, 11.0, 3.0, 11.0);
   private static final ewk k = dez.a(3.0, -1.0, 3.0, 13.0, 5.0, 13.0);
   private static final ewk[] l = new ewk[]{dez.a(3.0, 0.0, 3.0, 13.0, 11.0, 13.0), h};
   private static final ewk[] m = new ewk[]{j, dez.a(3.0, -1.0, 3.0, 13.0, 14.0, 13.0), i, i, i};

   @Override
   public MapCodec<dko> a() {
      return c;
   }

   public dko(dsb.d $$0) {
      super($$0);
   }

   @Nullable
   @Override
   public dsc a(cya $$0) {
      return this.o();
   }

   @Override
   public ewk a(dsc $$0, dbe $$1, iz $$2, evw $$3) {
      return $$0.c(b) == dsy.a ? l[Math.min(Math.abs(4 - ($$0.c(d) + 1)), l.length - 1)] : m[$$0.c(d)];
   }

   @Override
   public ewk b(dsc $$0, dbe $$1, iz $$2, evw $$3) {
      if ($$0.c(d) == 0) {
         return j;
      } else {
         return $$0.c(b) == dsy.b ? k : super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public dsc a(dsc $$0, je $$1, dsc $$2, dbz $$3, iz $$4, iz $$5) {
      if (b($$0.c(d))) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return $$0.a($$3, $$4) ? $$0 : dfb.a.o();
      }
   }

   @Override
   public boolean a(dsc $$0, dcb $$1, iz $$2) {
      return m($$0) && !b($$1, $$2) ? false : super.a($$0, $$1, $$2);
   }

   @Override
   protected boolean b(dsc $$0, dbe $$1, iz $$2) {
      return $$0.a(dfb.cC);
   }

   @Override
   protected void a(dsd.a<dez, dsc> $$0) {
      $$0.a(d);
      super.a($$0);
   }

   @Override
   public void a(dsc $$0, dby $$1, iz $$2, bsu $$3) {
      if ($$3 instanceof cki && $$1.ab().b(dbu.c)) {
         $$1.a($$2, true, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(dsc $$0, cya $$1) {
      return false;
   }

   @Override
   public void a(dby $$0, iz $$1, dsc $$2, btp $$3, cup $$4) {
   }

   @Override
   public boolean d_(dsc $$0) {
      return $$0.c(b) == dsy.b && !this.n($$0);
   }

   @Override
   public void b(dsc $$0, arf $$1, iz $$2, azh $$3) {
      float $$4 = dgu.a(this, $$1, $$2);
      boolean $$5 = $$3.a((int)(25.0F / $$4) + 1) == 0;
      if ($$5) {
         this.a($$1, $$0, $$2, 1);
      }
   }

   private void a(arf $$0, dsc $$1, iz $$2, int $$3) {
      int $$4 = Math.min($$1.c(d) + $$3, 4);
      if (this.a($$0, $$2, $$1, $$4)) {
         dsc $$5 = $$1.a(d, Integer.valueOf($$4));
         $$0.a($$2, $$5, 2);
         if (b($$4)) {
            $$0.a($$2.c(), $$5.a(b, dsy.a), 3);
         }
      }
   }

   private static boolean a(dcb $$0, iz $$1) {
      dsc $$2 = $$0.a_($$1);
      return $$2.i() || $$2.a(dfb.kB);
   }

   private static boolean b(dcb $$0, iz $$1) {
      return dgu.a($$0, $$1);
   }

   private static boolean m(dsc $$0) {
      return $$0.a(dfb.kB) && $$0.c(b) == dsy.b;
   }

   private static boolean b(int $$0) {
      return $$0 >= 3;
   }

   private boolean a(dcb $$0, iz $$1, dsc $$2, int $$3) {
      return !this.n($$2) && b($$0, $$1) && (!b($$3) || a($$0, $$1.c()));
   }

   private boolean n(dsc $$0) {
      return $$0.c(d) >= 4;
   }

   @Nullable
   private dko.a d(dcb $$0, iz $$1, dsc $$2) {
      if (m($$2)) {
         return new dko.a($$1, $$2);
      } else {
         iz $$3 = $$1.d();
         dsc $$4 = $$0.a_($$3);
         return m($$4) ? new dko.a($$3, $$4) : null;
      }
   }

   @Override
   public boolean b(dcb $$0, iz $$1, dsc $$2) {
      dko.a $$3 = this.d($$0, $$1, $$2);
      return $$3 == null ? false : this.a($$0, $$3.a, $$3.b, $$3.b.c(d) + 1);
   }

   @Override
   public boolean a(dby $$0, azh $$1, iz $$2, dsc $$3) {
      return true;
   }

   @Override
   public void a(arf $$0, azh $$1, iz $$2, dsc $$3) {
      dko.a $$4 = this.d($$0, $$2, $$3);
      if ($$4 != null) {
         this.a($$0, $$4.b, $$4.a, 1);
      }
   }

   static record a(iz a, dsc b) {
   }
}
