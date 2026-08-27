import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class cyy extends cys implements cyz {
   public static final MapCodec<cyy> a = b(cyy::new);
   public static final dma b = dlz.e;
   private static final int c = 5;

   @Override
   public MapCodec<cyy> a() {
      return a;
   }

   public cyy(dli.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(true)));
   }

   @Override
   protected void a(dlj $$0, cvr $$1, hz $$2, bnq $$3) {
      dlj $$4 = $$1.a_($$2.c());
      if ($$4.i()) {
         $$3.k($$0.c(b));
         if (!$$1.B) {
            aow $$5 = (aow)$$1;

            for (int $$6 = 0; $$6 < 2; $$6++) {
               $$5.a(jz.aj, (double)$$2.u() + $$1.z.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.z.j(), 1, 0.0, 0.0, 0.0, 1.0);
               $$5.a(jz.e, (double)$$2.u() + $$1.z.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.z.j(), 1, 0.0, 0.01, 0.0, 0.2);
            }
         }
      } else {
         $$3.l($$0.c(b));
      }
   }

   @Override
   protected void a(dlj $$0, aow $$1, hz $$2, awp $$3) {
      a($$1, $$2, $$0, $$1.a_($$2.d()));
   }

   @Override
   protected egw c_(dlj $$0) {
      return egx.c.a(false);
   }

   public static void b(cvs $$0, hz $$1, dlj $$2) {
      a($$0, $$1, $$0.a_($$1), $$2);
   }

   public static void a(cvs $$0, hz $$1, dlj $$2, dlj $$3) {
      if (m($$2)) {
         dlj $$4 = n($$3);
         $$0.a($$1, $$4, 2);
         hz.a $$5 = $$1.j().c(ie.b);

         while (m($$0.a_($$5))) {
            if (!$$0.a($$5, $$4, 2)) {
               return;
            }

            $$5.c(ie.b);
         }
      }
   }

   private static boolean m(dlj $$0) {
      return $$0.a(cyu.nd) || $$0.a(cyu.G) && $$0.u().e() >= 8 && $$0.u().b();
   }

   private static dlj n(dlj $$0) {
      if ($$0.a(cyu.nd)) {
         return $$0;
      } else if ($$0.a(cyu.dW)) {
         return cyu.nd.o().a(b, Boolean.valueOf(false));
      } else {
         return $$0.a(cyu.kJ) ? cyu.nd.o().a(b, Boolean.valueOf(true)) : cyu.G.o();
      }
   }

   @Override
   public void a(dlj $$0, cvr $$1, hz $$2, awp $$3) {
      double $$4 = (double)$$2.u();
      double $$5 = (double)$$2.v();
      double $$6 = (double)$$2.w();
      if ($$0.c(b)) {
         $$1.b(jz.am, $$4 + 0.5, $$5 + 0.8, $$6, 0.0, 0.0, 0.0);
         if ($$3.a(200) == 0) {
            $$1.a($$4, $$5, $$6, atl.cS, atm.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      } else {
         $$1.b(jz.an, $$4 + 0.5, $$5, $$6 + 0.5, 0.0, 0.04, 0.0);
         $$1.b(jz.an, $$4 + (double)$$3.i(), $$5 + (double)$$3.i(), $$6 + (double)$$3.i(), 0.0, 0.04, 0.0);
         if ($$3.a(200) == 0) {
            $$1.a($$4, $$5, $$6, atl.cQ, atm.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      }
   }

   @Override
   protected dlj a(dlj $$0, ie $$1, dlj $$2, cvs $$3, hz $$4, hz $$5) {
      $$3.a($$4, egx.c, egx.c.a($$3));
      if (!$$0.a($$3, $$4) || $$1 == ie.a || $$1 == ie.b && !$$2.a(cyu.nd) && m($$2)) {
         $$3.a($$4, this, 5);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dlj $$0, cvu $$1, hz $$2) {
      dlj $$3 = $$1.a_($$2.d());
      return $$3.a(cyu.nd) || $$3.a(cyu.kJ) || $$3.a(cyu.dW);
   }

   @Override
   protected eos a(dlj $$0, cux $$1, hz $$2, eoe $$3) {
      return eop.a();
   }

   @Override
   protected dex b_(dlj $$0) {
      return dex.a;
   }

   @Override
   protected void a(dlk.a<cys, dlj> $$0) {
      $$0.a(b);
   }

   @Override
   public cpd a(@Nullable chl $$0, cvs $$1, hz $$2, dlj $$3) {
      $$1.a($$2, cyu.a.o(), 11);
      return new cpd(cpg.qy);
   }

   @Override
   public Optional<atk> ax_() {
      return egx.c.j();
   }
}
