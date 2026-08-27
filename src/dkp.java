import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dkp extends dch {
   public static final MapCodec<dkp> a = b(dkp::new);
   public static final dpz b = dpy.B;

   @Override
   public MapCodec<dkp> a() {
      return a;
   }

   public dkp(dph.d $$0) {
      super($$0);
      this.k(this.n().a(b, Boolean.valueOf(false)));
   }

   @Override
   protected void b(dpi $$0, czg $$1, id $$2, dpi $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         if ($$1.C($$2)) {
            a($$1, $$2);
            $$1.a($$2, false);
         }
      }
   }

   @Override
   protected void a(dpi $$0, czg $$1, id $$2, dch $$3, id $$4, boolean $$5) {
      if ($$1.C($$2)) {
         a($$1, $$2);
         $$1.a($$2, false);
      }
   }

   @Override
   public dpi a(czg $$0, id $$1, dpi $$2, cka $$3) {
      if (!$$0.x_() && !$$3.f() && $$2.c(b)) {
         a($$0, $$1);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(czg $$0, id $$1, cyy $$2) {
      if (!$$0.B) {
         cgl $$3 = new cgl($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2.f());
         int $$4 = $$3.r();
         $$3.b((short)($$0.z.a($$4 / 4) + $$4 / 8));
         $$0.b($$3);
      }
   }

   public static void a(czg $$0, id $$1) {
      a($$0, $$1, null);
   }

   private static void a(czg $$0, id $$1, @Nullable bqt $$2) {
      if (!$$0.B) {
         cgl $$3 = new cgl($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2);
         $$0.b($$3);
         $$0.a(null, $$3.dr(), $$3.dt(), $$3.dx(), auo.zc, aup.e, 1.0F, 1.0F);
         $$0.a($$2, dub.I, $$1);
      }
   }

   @Override
   protected boh a(crs $$0, dpi $$1, czg $$2, id $$3, cka $$4, boe $$5, esf $$6) {
      if (!$$0.a(crv.or) && !$$0.a(crv.tW)) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      } else {
         a($$2, $$3, $$4);
         $$2.a($$3, dcj.a.n(), 11);
         crn $$7 = $$0.f();
         if (!$$4.f()) {
            if ($$0.a(crv.or)) {
               $$0.a(1, $$4, bqt.d($$5));
            } else {
               $$0.g(1);
            }
         }

         $$4.b(auz.c.b($$7));
         return boh.a($$2.B);
      }
   }

   @Override
   protected void a(czg $$0, dpi $$1, esf $$2, cks $$3) {
      if (!$$0.B) {
         id $$4 = $$2.a();
         bqa $$5 = $$3.u();
         if ($$3.bN() && $$3.a($$0, $$4)) {
            a($$0, $$4, $$5 instanceof bqt ? (bqt)$$5 : null);
            $$0.a($$4, false);
         }
      }
   }

   @Override
   public boolean a(cyy $$0) {
      return false;
   }

   @Override
   protected void a(dpj.a<dch, dpi> $$0) {
      $$0.a(b);
   }
}
