import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmq extends ddy {
   public static final MapCodec<dmq> a = b(dmq::new);
   public static final int b = 2;
   public static final int c = 1;
   public static final int d = 4;
   private static final evd g = ddy.a(3.0, 0.0, 3.0, 12.0, 7.0, 12.0);
   private static final evd h = ddy.a(1.0, 0.0, 1.0, 15.0, 7.0, 15.0);
   public static final dsb e = drr.aE;
   public static final dsb f = drr.aD;

   @Override
   public MapCodec<dmq> a() {
      return a;
   }

   public dmq(dra.d $$0) {
      super($$0);
      this.k(this.E.b().a(e, Integer.valueOf(0)).a(f, Integer.valueOf(1)));
   }

   @Override
   public void a(dax $$0, io $$1, drb $$2, bru $$3) {
      if (!$$3.bW()) {
         this.a($$0, $$2, $$1, $$3, 100);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dax $$0, drb $$1, io $$2, bru $$3, float $$4) {
      if (!($$3 instanceof cjv)) {
         this.a($$0, $$1, $$2, $$3, 3);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   private void a(dax $$0, drb $$1, io $$2, bru $$3, int $$4) {
      if (this.a($$0, $$3)) {
         if (!$$0.B && $$0.z.a($$4) == 0 && $$1.a(dea.mf)) {
            this.a($$0, $$2, $$1);
         }
      }
   }

   private void a(dax $$0, io $$1, drb $$2) {
      $$0.a(null, $$1, avh.Af, avi.e, 0.7F, 0.9F + $$0.z.i() * 0.2F);
      int $$3 = $$2.c(f);
      if ($$3 <= 1) {
         $$0.b($$1, false);
      } else {
         $$0.a($$1, $$2.a(f, Integer.valueOf($$3 - 1)), 2);
         $$0.a(dvu.f, $$1, dvu.a.a($$2));
         $$0.c(2001, $$1, ddy.i($$2));
      }
   }

   @Override
   protected void b(drb $$0, aqm $$1, io $$2, ayk $$3) {
      if (this.a($$1) && a($$1, $$2)) {
         int $$4 = $$0.c(e);
         if ($$4 < 2) {
            $$1.a(null, $$2, avh.Ag, avi.e, 0.7F, 0.9F + $$3.i() * 0.2F);
            $$1.a($$2, $$0.a(e, Integer.valueOf($$4 + 1)), 2);
            $$1.a(dvu.c, $$2, dvu.a.a($$0));
         } else {
            $$1.a(null, $$2, avh.Ah, avi.e, 0.7F, 0.9F + $$3.i() * 0.2F);
            $$1.a($$2, false);
            $$1.a(dvu.f, $$2, dvu.a.a($$0));

            for (int $$5 = 0; $$5 < $$0.c(f); $$5++) {
               $$1.c(2001, $$2, ddy.i($$0));
               cff $$6 = bsa.bh.a((dax)$$1);
               if ($$6 != null) {
                  $$6.c_(-24000);
                  $$6.i($$2);
                  $$6.b((double)$$2.u() + 0.3 + (double)$$5 * 0.2, (double)$$2.v(), (double)$$2.w() + 0.3, 0.0F, 0.0F);
                  $$1.b($$6);
               }
            }
         }
      }
   }

   public static boolean a(dad $$0, io $$1) {
      return b($$0, $$1.d());
   }

   public static boolean b(dad $$0, io $$1) {
      return $$0.a_($$1).a(avw.H);
   }

   @Override
   protected void b(drb $$0, dax $$1, io $$2, drb $$3, boolean $$4) {
      if (a($$1, $$2) && !$$1.B) {
         $$1.c(2012, $$2, 15);
      }
   }

   private boolean a(dax $$0) {
      float $$1 = $$0.f(1.0F);
      return (double)$$1 < 0.69 && (double)$$1 > 0.65 ? true : $$0.z.a(500) == 0;
   }

   @Override
   public void a(dax $$0, clw $$1, io $$2, drb $$3, @Nullable dog $$4, cto $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      this.a($$0, $$2, $$3);
   }

   @Override
   protected boolean a(drb $$0, cwz $$1) {
      return !$$1.h() && $$1.n().a(this.q()) && $$0.c(f) < 4 ? true : super.a($$0, $$1);
   }

   @Nullable
   @Override
   public drb a(cwz $$0) {
      drb $$1 = $$0.q().a_($$0.a());
      return $$1.a(this) ? $$1.a(f, Integer.valueOf(Math.min(4, $$1.c(f) + 1))) : super.a($$0);
   }

   @Override
   protected evd a(drb $$0, dad $$1, io $$2, eup $$3) {
      return $$0.c(f) > 1 ? h : g;
   }

   @Override
   protected void a(drc.a<ddy, drb> $$0) {
      $$0.a(e, f);
   }

   private boolean a(dax $$0, bru $$1) {
      if ($$1 instanceof cff || $$1 instanceof cdz) {
         return false;
      } else {
         return !($$1 instanceof bso) ? false : $$1 instanceof clw || $$0.aa().b(dat.c);
      }
   }
}
