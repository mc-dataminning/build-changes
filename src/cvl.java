import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class cvl extends cvf implements cvm {
   public static final MapCodec<cvl> a = b(cvl::new);
   public static final die b = did.e;
   private static final int c = 5;

   @Override
   public MapCodec<cvl> a() {
      return a;
   }

   public cvl(dhm.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(true)));
   }

   @Override
   public void a(dhn $$0, csf $$1, hx $$2, bkv $$3) {
      dhn $$4 = $$1.a_($$2.c());
      if ($$4.i()) {
         $$3.k($$0.c(b));
         if (!$$1.B) {
            ami $$5 = (ami)$$1;

            for (int $$6 = 0; $$6 < 2; $$6++) {
               $$5.a(jw.ah, (double)$$2.u() + $$1.z.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.z.j(), 1, 0.0, 0.0, 0.0, 1.0);
               $$5.a(jw.e, (double)$$2.u() + $$1.z.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.z.j(), 1, 0.0, 0.01, 0.0, 0.2);
            }
         }
      } else {
         $$3.l($$0.c(b));
      }
   }

   @Override
   public void a(dhn $$0, ami $$1, hx $$2, atw $$3) {
      a($$1, $$2, $$0, $$1.a_($$2.d()));
   }

   @Override
   public ecx c_(dhn $$0) {
      return ecy.c.a(false);
   }

   public static void b(csg $$0, hx $$1, dhn $$2) {
      a($$0, $$1, $$0.a_($$1), $$2);
   }

   public static void a(csg $$0, hx $$1, dhn $$2, dhn $$3) {
      if (h($$2)) {
         dhn $$4 = n($$3);
         $$0.a($$1, $$4, 2);
         hx.a $$5 = $$1.j().c(ib.b);

         while (h($$0.a_($$5))) {
            if (!$$0.a($$5, $$4, 2)) {
               return;
            }

            $$5.c(ib.b);
         }
      }
   }

   private static boolean h(dhn $$0) {
      return $$0.a(cvh.nd) || $$0.a(cvh.G) && $$0.u().e() >= 8 && $$0.u().b();
   }

   private static dhn n(dhn $$0) {
      if ($$0.a(cvh.nd)) {
         return $$0;
      } else if ($$0.a(cvh.dW)) {
         return cvh.nd.o().a(b, Boolean.valueOf(false));
      } else {
         return $$0.a(cvh.kJ) ? cvh.nd.o().a(b, Boolean.valueOf(true)) : cvh.G.o();
      }
   }

   @Override
   public void a(dhn $$0, csf $$1, hx $$2, atw $$3) {
      double $$4 = (double)$$2.u();
      double $$5 = (double)$$2.v();
      double $$6 = (double)$$2.w();
      if ($$0.c(b)) {
         $$1.b(jw.ak, $$4 + 0.5, $$5 + 0.8, $$6, 0.0, 0.0, 0.0);
         if ($$3.a(200) == 0) {
            $$1.a($$4, $$5, $$6, aqv.ct, aqw.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      } else {
         $$1.b(jw.al, $$4 + 0.5, $$5, $$6 + 0.5, 0.0, 0.04, 0.0);
         $$1.b(jw.al, $$4 + (double)$$3.i(), $$5 + (double)$$3.i(), $$6 + (double)$$3.i(), 0.0, 0.04, 0.0);
         if ($$3.a(200) == 0) {
            $$1.a($$4, $$5, $$6, aqv.cr, aqw.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      }
   }

   @Override
   public dhn a(dhn $$0, ib $$1, dhn $$2, csg $$3, hx $$4, hx $$5) {
      $$3.a($$4, ecy.c, ecy.c.a($$3));
      if (!$$0.a($$3, $$4) || $$1 == ib.a || $$1 == ib.b && !$$2.a(cvh.nd) && h($$2)) {
         $$3.a($$4, this, 5);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dhn $$0, csi $$1, hx $$2) {
      dhn $$3 = $$1.a_($$2.d());
      return $$3.a(cvh.nd) || $$3.a(cvh.kJ) || $$3.a(cvh.dW);
   }

   @Override
   public eks a(dhn $$0, crl $$1, hx $$2, eke $$3) {
      return ekp.a();
   }

   @Override
   public dbk b_(dhn $$0) {
      return dbk.a;
   }

   @Override
   protected void a(dho.a<cvf, dhn> $$0) {
      $$0.a(b);
   }

   @Override
   public clo a(@Nullable cdz $$0, csg $$1, hx $$2, dhn $$3) {
      $$1.a($$2, cvh.a.o(), 11);
      return new clo(clr.qw);
   }

   @Override
   public Optional<aqu> av_() {
      return ecy.c.j();
   }
}
