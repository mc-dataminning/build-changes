import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dag extends daa implements dah {
   public static final MapCodec<dag> a = b(dag::new);
   public static final dnq b = dnp.e;
   private static final int c = 5;

   @Override
   public MapCodec<dag> a() {
      return a;
   }

   public dag(dmy.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(true)));
   }

   @Override
   protected void a(dmz $$0, cwz $$1, ib $$2, bow $$3) {
      dmz $$4 = $$1.a_($$2.c());
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
   protected void a(dmz $$0, apf $$1, ib $$2, axd $$3) {
      a($$1, $$2, $$0, $$1.a_($$2.d()));
   }

   @Override
   protected ein c_(dmz $$0) {
      return eio.c.a(false);
   }

   public static void b(cxa $$0, ib $$1, dmz $$2) {
      a($$0, $$1, $$0.a_($$1), $$2);
   }

   public static void a(cxa $$0, ib $$1, dmz $$2, dmz $$3) {
      if (m($$2)) {
         dmz $$4 = n($$3);
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

   private static boolean m(dmz $$0) {
      return $$0.a(dac.nd) || $$0.a(dac.G) && $$0.u().e() >= 8 && $$0.u().b();
   }

   private static dmz n(dmz $$0) {
      if ($$0.a(dac.nd)) {
         return $$0;
      } else if ($$0.a(dac.dW)) {
         return dac.nd.o().a(b, Boolean.valueOf(false));
      } else {
         return $$0.a(dac.kJ) ? dac.nd.o().a(b, Boolean.valueOf(true)) : dac.G.o();
      }
   }

   @Override
   public void a(dmz $$0, cwz $$1, ib $$2, axd $$3) {
      double $$4 = (double)$$2.u();
      double $$5 = (double)$$2.v();
      double $$6 = (double)$$2.w();
      if ($$0.c(b)) {
         $$1.b(kc.an, $$4 + 0.5, $$5 + 0.8, $$6, 0.0, 0.0, 0.0);
         if ($$3.a(200) == 0) {
            $$1.a($$4, $$5, $$6, aty.cV, atz.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      } else {
         $$1.b(kc.ao, $$4 + 0.5, $$5, $$6 + 0.5, 0.0, 0.04, 0.0);
         $$1.b(kc.ao, $$4 + (double)$$3.i(), $$5 + (double)$$3.i(), $$6 + (double)$$3.i(), 0.0, 0.04, 0.0);
         if ($$3.a(200) == 0) {
            $$1.a($$4, $$5, $$6, aty.cT, atz.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      }
   }

   @Override
   protected dmz a(dmz $$0, ih $$1, dmz $$2, cxa $$3, ib $$4, ib $$5) {
      $$3.a($$4, eio.c, eio.c.a($$3));
      if (!$$0.a($$3, $$4) || $$1 == ih.a || $$1 == ih.b && !$$2.a(dac.nd) && m($$2)) {
         $$3.a($$4, this, 5);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dmz $$0, cxc $$1, ib $$2) {
      dmz $$3 = $$1.a_($$2.d());
      return $$3.a(dac.nd) || $$3.a(dac.kJ) || $$3.a(dac.dW);
   }

   @Override
   protected eqk a(dmz $$0, cwf $$1, ib $$2, epw $$3) {
      return eqh.a();
   }

   @Override
   protected dgf b_(dmz $$0) {
      return dgf.a;
   }

   @Override
   protected void a(dna.a<daa, dmz> $$0) {
      $$0.a(b);
   }

   @Override
   public cqk a(@Nullable cis $$0, cxa $$1, ib $$2, dmz $$3) {
      $$1.a($$2, dac.a.o(), 11);
      return new cqk(cqn.qy);
   }

   @Override
   public Optional<atx> av_() {
      return eio.c.j();
   }
}
