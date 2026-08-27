import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dcn extends dch implements dco {
   public static final MapCodec<dcn> a = b(dcn::new);
   public static final dpz b = dpy.e;
   private static final int c = 5;

   @Override
   public MapCodec<dcn> a() {
      return a;
   }

   public dcn(dph.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(true)));
   }

   @Override
   protected void a(dpi $$0, czg $$1, id $$2, bqa $$3) {
      dpi $$4 = $$1.a_($$2.c());
      if ($$4.i()) {
         $$3.k($$0.c(b));
         if (!$$1.B) {
            apu $$5 = (apu)$$1;

            for (int $$6 = 0; $$6 < 2; $$6++) {
               $$5.a(kn.ak, (double)$$2.u() + $$1.z.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.z.j(), 1, 0.0, 0.0, 0.0, 1.0);
               $$5.a(kn.e, (double)$$2.u() + $$1.z.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.z.j(), 1, 0.0, 0.01, 0.0, 0.2);
            }
         }
      } else {
         $$3.l($$0.c(b));
      }
   }

   @Override
   protected void a(dpi $$0, apu $$1, id $$2, axt $$3) {
      a($$1, $$2, $$0, $$1.a_($$2.d()));
   }

   @Override
   protected elb c_(dpi $$0) {
      return elc.c.a(false);
   }

   public static void b(czh $$0, id $$1, dpi $$2) {
      a($$0, $$1, $$0.a_($$1), $$2);
   }

   public static void a(czh $$0, id $$1, dpi $$2, dpi $$3) {
      if (m($$2)) {
         dpi $$4 = n($$3);
         $$0.a($$1, $$4, 2);
         id.a $$5 = $$1.j().c(ij.b);

         while (m($$0.a_($$5))) {
            if (!$$0.a($$5, $$4, 2)) {
               return;
            }

            $$5.c(ij.b);
         }
      }
   }

   private static boolean m(dpi $$0) {
      return $$0.a(dcj.nd) || $$0.a(dcj.G) && $$0.u().e() >= 8 && $$0.u().b();
   }

   private static dpi n(dpi $$0) {
      if ($$0.a(dcj.nd)) {
         return $$0;
      } else if ($$0.a(dcj.dW)) {
         return dcj.nd.n().a(b, Boolean.valueOf(false));
      } else {
         return $$0.a(dcj.kJ) ? dcj.nd.n().a(b, Boolean.valueOf(true)) : dcj.G.n();
      }
   }

   @Override
   public void a(dpi $$0, czg $$1, id $$2, axt $$3) {
      double $$4 = (double)$$2.u();
      double $$5 = (double)$$2.v();
      double $$6 = (double)$$2.w();
      if ($$0.c(b)) {
         $$1.b(kn.an, $$4 + 0.5, $$5 + 0.8, $$6, 0.0, 0.0, 0.0);
         if ($$3.a(200) == 0) {
            $$1.a($$4, $$5, $$6, auo.da, aup.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      } else {
         $$1.b(kn.ao, $$4 + 0.5, $$5, $$6 + 0.5, 0.0, 0.04, 0.0);
         $$1.b(kn.ao, $$4 + (double)$$3.i(), $$5 + (double)$$3.i(), $$6 + (double)$$3.i(), 0.0, 0.04, 0.0);
         if ($$3.a(200) == 0) {
            $$1.a($$4, $$5, $$6, auo.cY, aup.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      }
   }

   @Override
   protected dpi a(dpi $$0, ij $$1, dpi $$2, czh $$3, id $$4, id $$5) {
      $$3.a($$4, elc.c, elc.c.a($$3));
      if (!$$0.a($$3, $$4) || $$1 == ij.a || $$1 == ij.b && !$$2.a(dcj.nd) && m($$2)) {
         $$3.a($$4, this, 5);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dpi $$0, czj $$1, id $$2) {
      dpi $$3 = $$1.a_($$2.d());
      return $$3.a(dcj.nd) || $$3.a(dcj.kJ) || $$3.a(dcj.dW);
   }

   @Override
   protected etc a(dpi $$0, cym $$1, id $$2, eso $$3) {
      return esz.a();
   }

   @Override
   protected dim b_(dpi $$0) {
      return dim.a;
   }

   @Override
   protected void a(dpj.a<dch, dpi> $$0) {
      $$0.a(b);
   }

   @Override
   public crs a(@Nullable cka $$0, czh $$1, id $$2, dpi $$3) {
      $$1.a($$2, dcj.a.n(), 11);
      return new crs(crv.qy);
   }

   @Override
   public Optional<aun> as_() {
      return elc.c.j();
   }
}
