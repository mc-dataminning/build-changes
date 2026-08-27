import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class cyu extends cyo implements cyv {
   public static final MapCodec<cyu> a = b(cyu::new);
   public static final dlw b = dlv.e;
   private static final int c = 5;

   @Override
   public MapCodec<cyu> a() {
      return a;
   }

   public cyu(dle.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(true)));
   }

   @Override
   protected void a(dlf $$0, cvn $$1, hz $$2, bno $$3) {
      dlf $$4 = $$1.a_($$2.c());
      if ($$4.i()) {
         $$3.k($$0.c(b));
         if (!$$1.B) {
            aov $$5 = (aov)$$1;

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
   protected void a(dlf $$0, aov $$1, hz $$2, awo $$3) {
      a($$1, $$2, $$0, $$1.a_($$2.d()));
   }

   @Override
   protected egp c_(dlf $$0) {
      return egq.c.a(false);
   }

   public static void b(cvo $$0, hz $$1, dlf $$2) {
      a($$0, $$1, $$0.a_($$1), $$2);
   }

   public static void a(cvo $$0, hz $$1, dlf $$2, dlf $$3) {
      if (m($$2)) {
         dlf $$4 = n($$3);
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

   private static boolean m(dlf $$0) {
      return $$0.a(cyq.nd) || $$0.a(cyq.G) && $$0.u().e() >= 8 && $$0.u().b();
   }

   private static dlf n(dlf $$0) {
      if ($$0.a(cyq.nd)) {
         return $$0;
      } else if ($$0.a(cyq.dW)) {
         return cyq.nd.o().a(b, Boolean.valueOf(false));
      } else {
         return $$0.a(cyq.kJ) ? cyq.nd.o().a(b, Boolean.valueOf(true)) : cyq.G.o();
      }
   }

   @Override
   public void a(dlf $$0, cvn $$1, hz $$2, awo $$3) {
      double $$4 = (double)$$2.u();
      double $$5 = (double)$$2.v();
      double $$6 = (double)$$2.w();
      if ($$0.c(b)) {
         $$1.b(jz.am, $$4 + 0.5, $$5 + 0.8, $$6, 0.0, 0.0, 0.0);
         if ($$3.a(200) == 0) {
            $$1.a($$4, $$5, $$6, atk.cR, atl.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      } else {
         $$1.b(jz.an, $$4 + 0.5, $$5, $$6 + 0.5, 0.0, 0.04, 0.0);
         $$1.b(jz.an, $$4 + (double)$$3.i(), $$5 + (double)$$3.i(), $$6 + (double)$$3.i(), 0.0, 0.04, 0.0);
         if ($$3.a(200) == 0) {
            $$1.a($$4, $$5, $$6, atk.cP, atl.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      }
   }

   @Override
   protected dlf a(dlf $$0, ie $$1, dlf $$2, cvo $$3, hz $$4, hz $$5) {
      $$3.a($$4, egq.c, egq.c.a($$3));
      if (!$$0.a($$3, $$4) || $$1 == ie.a || $$1 == ie.b && !$$2.a(cyq.nd) && m($$2)) {
         $$3.a($$4, this, 5);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dlf $$0, cvq $$1, hz $$2) {
      dlf $$3 = $$1.a_($$2.d());
      return $$3.a(cyq.nd) || $$3.a(cyq.kJ) || $$3.a(cyq.dW);
   }

   @Override
   protected eol a(dlf $$0, cut $$1, hz $$2, enx $$3) {
      return eoi.a();
   }

   @Override
   protected det b_(dlf $$0) {
      return det.a;
   }

   @Override
   protected void a(dlg.a<cyo, dlf> $$0) {
      $$0.a(b);
   }

   @Override
   public coz a(@Nullable chh $$0, cvo $$1, hz $$2, dlf $$3) {
      $$1.a($$2, cyq.a.o(), 11);
      return new coz(cpc.qy);
   }

   @Override
   public Optional<atj> ax_() {
      return egq.c.j();
   }
}
