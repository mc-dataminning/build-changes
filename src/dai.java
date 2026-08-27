import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dai extends dac implements daj {
   public static final MapCodec<dai> a = b(dai::new);
   public static final dns b = dnr.e;
   private static final int c = 5;

   @Override
   public MapCodec<dai> a() {
      return a;
   }

   public dai(dna.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(true)));
   }

   @Override
   protected void a(dnb $$0, cxb $$1, ib $$2, box $$3) {
      dnb $$4 = $$1.a_($$2.c());
      if ($$4.i()) {
         $$3.k($$0.c(b));
         if (!$$1.B) {
            apf $$5 = (apf)$$1;

            for (int $$6 = 0; $$6 < 2; $$6++) {
               $$5.a(kc.ak, (double)$$2.u() + $$1.z.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.z.j(), 1, 0.0, 0.0, 0.0, 1.0);
               $$5.a(kc.e, (double)$$2.u() + $$1.z.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.z.j(), 1, 0.0, 0.01, 0.0, 0.2);
            }
         }
      } else {
         $$3.l($$0.c(b));
      }
   }

   @Override
   protected void a(dnb $$0, apf $$1, ib $$2, axd $$3) {
      a($$1, $$2, $$0, $$1.a_($$2.d()));
   }

   @Override
   protected eip c_(dnb $$0) {
      return eiq.c.a(false);
   }

   public static void b(cxc $$0, ib $$1, dnb $$2) {
      a($$0, $$1, $$0.a_($$1), $$2);
   }

   public static void a(cxc $$0, ib $$1, dnb $$2, dnb $$3) {
      if (m($$2)) {
         dnb $$4 = n($$3);
         $$0.a($$1, $$4, 2);
         ib.a $$5 = $$1.j().c(ih.b);

         while (m($$0.a_($$5))) {
            if (!$$0.a($$5, $$4, 2)) {
               return;
            }

            $$5.c(ih.b);
         }
      }
   }

   private static boolean m(dnb $$0) {
      return $$0.a(dae.nd) || $$0.a(dae.G) && $$0.u().e() >= 8 && $$0.u().b();
   }

   private static dnb n(dnb $$0) {
      if ($$0.a(dae.nd)) {
         return $$0;
      } else if ($$0.a(dae.dW)) {
         return dae.nd.o().a(b, Boolean.valueOf(false));
      } else {
         return $$0.a(dae.kJ) ? dae.nd.o().a(b, Boolean.valueOf(true)) : dae.G.o();
      }
   }

   @Override
   public void a(dnb $$0, cxb $$1, ib $$2, axd $$3) {
      double $$4 = (double)$$2.u();
      double $$5 = (double)$$2.v();
      double $$6 = (double)$$2.w();
      if ($$0.c(b)) {
         $$1.b(kc.an, $$4 + 0.5, $$5 + 0.8, $$6, 0.0, 0.0, 0.0);
         if ($$3.a(200) == 0) {
            $$1.a($$4, $$5, $$6, aty.cZ, atz.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      } else {
         $$1.b(kc.ao, $$4 + 0.5, $$5, $$6 + 0.5, 0.0, 0.04, 0.0);
         $$1.b(kc.ao, $$4 + (double)$$3.i(), $$5 + (double)$$3.i(), $$6 + (double)$$3.i(), 0.0, 0.04, 0.0);
         if ($$3.a(200) == 0) {
            $$1.a($$4, $$5, $$6, aty.cX, atz.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      }
   }

   @Override
   protected dnb a(dnb $$0, ih $$1, dnb $$2, cxc $$3, ib $$4, ib $$5) {
      $$3.a($$4, eiq.c, eiq.c.a($$3));
      if (!$$0.a($$3, $$4) || $$1 == ih.a || $$1 == ih.b && !$$2.a(dae.nd) && m($$2)) {
         $$3.a($$4, this, 5);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dnb $$0, cxe $$1, ib $$2) {
      dnb $$3 = $$1.a_($$2.d());
      return $$3.a(dae.nd) || $$3.a(dae.kJ) || $$3.a(dae.dW);
   }

   @Override
   protected eqm a(dnb $$0, cwh $$1, ib $$2, epy $$3) {
      return eqj.a();
   }

   @Override
   protected dgh b_(dnb $$0) {
      return dgh.a;
   }

   @Override
   protected void a(dnc.a<dac, dnb> $$0) {
      $$0.a(b);
   }

   @Override
   public cqm a(@Nullable ciu $$0, cxc $$1, ib $$2, dnb $$3) {
      $$1.a($$2, dae.a.o(), 11);
      return new cqm(cqp.qy);
   }

   @Override
   public Optional<atx> av_() {
      return eiq.c.j();
   }
}
