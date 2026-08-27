import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class cwf extends cvz implements cwg {
   public static final MapCodec<cwf> a = b(cwf::new);
   public static final djg b = djf.e;
   private static final int c = 5;

   @Override
   public MapCodec<cwf> a() {
      return a;
   }

   public cwf(dio.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(true)));
   }

   @Override
   public void a(dip $$0, csy $$1, hv $$2, blf $$3) {
      dip $$4 = $$1.a_($$2.c());
      if ($$4.i()) {
         $$3.k($$0.c(b));
         if (!$$1.B) {
            amp $$5 = (amp)$$1;

            for (int $$6 = 0; $$6 < 2; $$6++) {
               $$5.a(jv.aj, (double)$$2.u() + $$1.z.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.z.j(), 1, 0.0, 0.0, 0.0, 1.0);
               $$5.a(jv.e, (double)$$2.u() + $$1.z.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.z.j(), 1, 0.0, 0.01, 0.0, 0.2);
            }
         }
      } else {
         $$3.l($$0.c(b));
      }
   }

   @Override
   public void a(dip $$0, amp $$1, hv $$2, auf $$3) {
      a($$1, $$2, $$0, $$1.a_($$2.d()));
   }

   @Override
   public edz c_(dip $$0) {
      return eea.c.a(false);
   }

   public static void b(csz $$0, hv $$1, dip $$2) {
      a($$0, $$1, $$0.a_($$1), $$2);
   }

   public static void a(csz $$0, hv $$1, dip $$2, dip $$3) {
      if (h($$2)) {
         dip $$4 = n($$3);
         $$0.a($$1, $$4, 2);
         hv.a $$5 = $$1.j().c(ia.b);

         while (h($$0.a_($$5))) {
            if (!$$0.a($$5, $$4, 2)) {
               return;
            }

            $$5.c(ia.b);
         }
      }
   }

   private static boolean h(dip $$0) {
      return $$0.a(cwb.nd) || $$0.a(cwb.G) && $$0.u().e() >= 8 && $$0.u().b();
   }

   private static dip n(dip $$0) {
      if ($$0.a(cwb.nd)) {
         return $$0;
      } else if ($$0.a(cwb.dW)) {
         return cwb.nd.o().a(b, Boolean.valueOf(false));
      } else {
         return $$0.a(cwb.kJ) ? cwb.nd.o().a(b, Boolean.valueOf(true)) : cwb.G.o();
      }
   }

   @Override
   public void a(dip $$0, csy $$1, hv $$2, auf $$3) {
      double $$4 = (double)$$2.u();
      double $$5 = (double)$$2.v();
      double $$6 = (double)$$2.w();
      if ($$0.c(b)) {
         $$1.b(jv.am, $$4 + 0.5, $$5 + 0.8, $$6, 0.0, 0.0, 0.0);
         if ($$3.a(200) == 0) {
            $$1.a($$4, $$5, $$6, arc.cC, ard.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      } else {
         $$1.b(jv.an, $$4 + 0.5, $$5, $$6 + 0.5, 0.0, 0.04, 0.0);
         $$1.b(jv.an, $$4 + (double)$$3.i(), $$5 + (double)$$3.i(), $$6 + (double)$$3.i(), 0.0, 0.04, 0.0);
         if ($$3.a(200) == 0) {
            $$1.a($$4, $$5, $$6, arc.cA, ard.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      }
   }

   @Override
   public dip a(dip $$0, ia $$1, dip $$2, csz $$3, hv $$4, hv $$5) {
      $$3.a($$4, eea.c, eea.c.a($$3));
      if (!$$0.a($$3, $$4) || $$1 == ia.a || $$1 == ia.b && !$$2.a(cwb.nd) && h($$2)) {
         $$3.a($$4, this, 5);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dip $$0, ctb $$1, hv $$2) {
      dip $$3 = $$1.a_($$2.d());
      return $$3.a(cwb.nd) || $$3.a(cwb.kJ) || $$3.a(cwb.dW);
   }

   @Override
   public elu a(dip $$0, cse $$1, hv $$2, elg $$3) {
      return elr.a();
   }

   @Override
   public dce b_(dip $$0) {
      return dce.a;
   }

   @Override
   protected void a(diq.a<cvz, dip> $$0) {
      $$0.a(b);
   }

   @Override
   public cmh a(@Nullable cer $$0, csz $$1, hv $$2, dip $$3) {
      $$1.a($$2, cwb.a.o(), 11);
      return new cmh(cmk.qw);
   }

   @Override
   public Optional<arb> au_() {
      return eea.c.j();
   }
}
