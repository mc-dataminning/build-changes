import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djn extends dgg implements deb {
   public static final MapCodec<djn> c = b(djn::new);
   public static final dsb d = drr.at;
   public static final int e = 4;
   private static final int f = 3;
   private static final int g = 1;
   private static final evd h = ddy.a(3.0, 0.0, 3.0, 13.0, 15.0, 13.0);
   private static final evd i = ddy.a(3.0, -1.0, 3.0, 13.0, 16.0, 13.0);
   private static final evd j = ddy.a(5.0, -1.0, 5.0, 11.0, 3.0, 11.0);
   private static final evd k = ddy.a(3.0, -1.0, 3.0, 13.0, 5.0, 13.0);
   private static final evd[] l = new evd[]{ddy.a(3.0, 0.0, 3.0, 13.0, 11.0, 13.0), h};
   private static final evd[] m = new evd[]{j, ddy.a(3.0, -1.0, 3.0, 13.0, 14.0, 13.0), i, i, i};

   @Override
   public MapCodec<djn> a() {
      return c;
   }

   public djn(dra.d $$0) {
      super($$0);
   }

   @Nullable
   @Override
   public drb a(cwz $$0) {
      return this.n();
   }

   @Override
   public evd a(drb $$0, dad $$1, io $$2, eup $$3) {
      return $$0.c(b) == drx.a ? l[Math.min(Math.abs(4 - ($$0.c(d) + 1)), l.length - 1)] : m[$$0.c(d)];
   }

   @Override
   public evd b(drb $$0, dad $$1, io $$2, eup $$3) {
      if ($$0.c(d) == 0) {
         return j;
      } else {
         return $$0.c(b) == drx.b ? k : super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public drb a(drb $$0, it $$1, drb $$2, day $$3, io $$4, io $$5) {
      if (b($$0.c(d))) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return $$0.a($$3, $$4) ? $$0 : dea.a.n();
      }
   }

   @Override
   public boolean a(drb $$0, dba $$1, io $$2) {
      return m($$0) && !b($$1, $$2) ? false : super.a($$0, $$1, $$2);
   }

   @Override
   protected boolean b(drb $$0, dad $$1, io $$2) {
      return $$0.a(dea.cC);
   }

   @Override
   protected void a(drc.a<ddy, drb> $$0) {
      $$0.a(d);
      super.a($$0);
   }

   @Override
   public void a(drb $$0, dax $$1, io $$2, bru $$3) {
      if ($$3 instanceof cjh && $$1.aa().b(dat.c)) {
         $$1.a($$2, true, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(drb $$0, cwz $$1) {
      return false;
   }

   @Override
   public void a(dax $$0, io $$1, drb $$2, bso $$3, cto $$4) {
   }

   @Override
   public boolean d_(drb $$0) {
      return $$0.c(b) == drx.b && !this.n($$0);
   }

   @Override
   public void b(drb $$0, aqm $$1, io $$2, ayk $$3) {
      float $$4 = dft.a(this, $$1, $$2);
      boolean $$5 = $$3.a((int)(25.0F / $$4) + 1) == 0;
      if ($$5) {
         this.a($$1, $$0, $$2, 1);
      }
   }

   private void a(aqm $$0, drb $$1, io $$2, int $$3) {
      int $$4 = Math.min($$1.c(d) + $$3, 4);
      if (this.a($$0, $$2, $$1, $$4)) {
         drb $$5 = $$1.a(d, Integer.valueOf($$4));
         $$0.a($$2, $$5, 2);
         if (b($$4)) {
            $$0.a($$2.c(), $$5.a(b, drx.a), 3);
         }
      }
   }

   private static boolean a(dba $$0, io $$1) {
      drb $$2 = $$0.a_($$1);
      return $$2.i() || $$2.a(dea.kB);
   }

   private static boolean b(dba $$0, io $$1) {
      return dft.a($$0, $$1);
   }

   private static boolean m(drb $$0) {
      return $$0.a(dea.kB) && $$0.c(b) == drx.b;
   }

   private static boolean b(int $$0) {
      return $$0 >= 3;
   }

   private boolean a(dba $$0, io $$1, drb $$2, int $$3) {
      return !this.n($$2) && b($$0, $$1) && (!b($$3) || a($$0, $$1.c()));
   }

   private boolean n(drb $$0) {
      return $$0.c(d) >= 4;
   }

   @Nullable
   private djn.a d(dba $$0, io $$1, drb $$2) {
      if (m($$2)) {
         return new djn.a($$1, $$2);
      } else {
         io $$3 = $$1.d();
         drb $$4 = $$0.a_($$3);
         return m($$4) ? new djn.a($$3, $$4) : null;
      }
   }

   @Override
   public boolean b(dba $$0, io $$1, drb $$2) {
      djn.a $$3 = this.d($$0, $$1, $$2);
      return $$3 == null ? false : this.a($$0, $$3.a, $$3.b, $$3.b.c(d) + 1);
   }

   @Override
   public boolean a(dax $$0, ayk $$1, io $$2, drb $$3) {
      return true;
   }

   @Override
   public void a(aqm $$0, ayk $$1, io $$2, drb $$3) {
      djn.a $$4 = this.d($$0, $$2, $$3);
      if ($$4 != null) {
         this.a($$0, $$4.b, $$4.a, 1);
      }
   }

   static record a(io a, drb b) {
   }
}
