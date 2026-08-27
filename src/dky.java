import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dky extends dch {
   public static final MapCodec<dky> a = b(dky::new);
   public static final int b = 2;
   public static final int c = 1;
   public static final int d = 4;
   private static final etc g = dch.a(3.0, 0.0, 3.0, 12.0, 7.0, 12.0);
   private static final etc h = dch.a(1.0, 0.0, 1.0, 15.0, 7.0, 15.0);
   public static final dqi e = dpy.aE;
   public static final dqi f = dpy.aD;

   @Override
   public MapCodec<dky> a() {
      return a;
   }

   public dky(dph.d $$0) {
      super($$0);
      this.k(this.E.b().a(e, Integer.valueOf(0)).a(f, Integer.valueOf(1)));
   }

   @Override
   public void a(czg $$0, id $$1, dpi $$2, bqa $$3) {
      if (!$$3.bT()) {
         this.a($$0, $$2, $$1, $$3, 100);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(czg $$0, dpi $$1, id $$2, bqa $$3, float $$4) {
      if (!($$3 instanceof chz)) {
         this.a($$0, $$1, $$2, $$3, 3);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   private void a(czg $$0, dpi $$1, id $$2, bqa $$3, int $$4) {
      if (this.a($$0, $$3)) {
         if (!$$0.B && $$0.z.a($$4) == 0 && $$1.a(dcj.mf)) {
            this.a($$0, $$2, $$1);
         }
      }
   }

   private void a(czg $$0, id $$1, dpi $$2) {
      $$0.a(null, $$1, auo.zM, aup.e, 0.7F, 0.9F + $$0.z.i() * 0.2F);
      int $$3 = $$2.c(f);
      if ($$3 <= 1) {
         $$0.b($$1, false);
      } else {
         $$0.a($$1, $$2.a(f, Integer.valueOf($$3 - 1)), 2);
         $$0.a(dub.f, $$1, dub.a.a($$2));
         $$0.c(2001, $$1, dch.i($$2));
      }
   }

   @Override
   protected void b(dpi $$0, apu $$1, id $$2, axt $$3) {
      if (this.a($$1) && a($$1, $$2)) {
         int $$4 = $$0.c(e);
         if ($$4 < 2) {
            $$1.a(null, $$2, auo.zN, aup.e, 0.7F, 0.9F + $$3.i() * 0.2F);
            $$1.a($$2, $$0.a(e, Integer.valueOf($$4 + 1)), 2);
            $$1.a(dub.c, $$2, dub.a.a($$0));
         } else {
            $$1.a(null, $$2, auo.zO, aup.e, 0.7F, 0.9F + $$3.i() * 0.2F);
            $$1.a($$2, false);
            $$1.a(dub.f, $$2, dub.a.a($$0));

            for (int $$5 = 0; $$5 < $$0.c(f); $$5++) {
               $$1.c(2001, $$2, dch.i($$0));
               cdj $$6 = bqg.bg.a((czg)$$1);
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

   public static boolean a(cym $$0, id $$1) {
      return b($$0, $$1.d());
   }

   public static boolean b(cym $$0, id $$1) {
      return $$0.a_($$1).a(ave.H);
   }

   @Override
   protected void b(dpi $$0, czg $$1, id $$2, dpi $$3, boolean $$4) {
      if (a($$1, $$2) && !$$1.B) {
         $$1.c(2012, $$2, 15);
      }
   }

   private boolean a(czg $$0) {
      float $$1 = $$0.f(1.0F);
      return (double)$$1 < 0.69 && (double)$$1 > 0.65 ? true : $$0.z.a(500) == 0;
   }

   @Override
   public void a(czg $$0, cka $$1, id $$2, dpi $$3, @Nullable dmo $$4, crs $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      this.a($$0, $$2, $$3);
   }

   @Override
   protected boolean a(dpi $$0, cux $$1) {
      return !$$1.h() && $$1.n().a(this.p()) && $$0.c(f) < 4 ? true : super.a($$0, $$1);
   }

   @Nullable
   @Override
   public dpi a(cux $$0) {
      dpi $$1 = $$0.q().a_($$0.a());
      return $$1.a(this) ? $$1.a(f, Integer.valueOf(Math.min(4, $$1.c(f) + 1))) : super.a($$0);
   }

   @Override
   protected etc a(dpi $$0, cym $$1, id $$2, eso $$3) {
      return $$0.c(f) > 1 ? h : g;
   }

   @Override
   protected void a(dpj.a<dch, dpi> $$0) {
      $$0.a(e, f);
   }

   private boolean a(czg $$0, bqa $$1) {
      if ($$1 instanceof cdj || $$1 instanceof ccd) {
         return false;
      } else {
         return !($$1 instanceof bqt) ? false : $$1 instanceof cka || $$0.aa().b(czc.c);
      }
   }
}
