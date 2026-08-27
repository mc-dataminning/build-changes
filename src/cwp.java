import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class cwp extends cwj implements cwq {
   public static final MapCodec<cwp> a = b(cwp::new);
   public static final djr b = djq.e;
   private static final int c = 5;

   @Override
   public MapCodec<cwp> a() {
      return a;
   }

   public cwp(diz.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(true)));
   }

   @Override
   public void a(dja $$0, cti $$1, hx $$2, blp $$3) {
      dja $$4 = $$1.a_($$2.c());
      if ($$4.i()) {
         $$3.k($$0.c(b));
         if (!$$1.B) {
            amz $$5 = (amz)$$1;

            for (int $$6 = 0; $$6 < 2; $$6++) {
               $$5.a(jx.aj, (double)$$2.u() + $$1.z.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.z.j(), 1, 0.0, 0.0, 0.0, 1.0);
               $$5.a(jx.e, (double)$$2.u() + $$1.z.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.z.j(), 1, 0.0, 0.01, 0.0, 0.2);
            }
         }
      } else {
         $$3.l($$0.c(b));
      }
   }

   @Override
   public void a(dja $$0, amz $$1, hx $$2, aup $$3) {
      a($$1, $$2, $$0, $$1.a_($$2.d()));
   }

   @Override
   public eek c_(dja $$0) {
      return eel.c.a(false);
   }

   public static void b(ctj $$0, hx $$1, dja $$2) {
      a($$0, $$1, $$0.a_($$1), $$2);
   }

   public static void a(ctj $$0, hx $$1, dja $$2, dja $$3) {
      if (h($$2)) {
         dja $$4 = n($$3);
         $$0.a($$1, $$4, 2);
         hx.a $$5 = $$1.j().c(ic.b);

         while (h($$0.a_($$5))) {
            if (!$$0.a($$5, $$4, 2)) {
               return;
            }

            $$5.c(ic.b);
         }
      }
   }

   private static boolean h(dja $$0) {
      return $$0.a(cwl.nd) || $$0.a(cwl.G) && $$0.u().e() >= 8 && $$0.u().b();
   }

   private static dja n(dja $$0) {
      if ($$0.a(cwl.nd)) {
         return $$0;
      } else if ($$0.a(cwl.dW)) {
         return cwl.nd.o().a(b, Boolean.valueOf(false));
      } else {
         return $$0.a(cwl.kJ) ? cwl.nd.o().a(b, Boolean.valueOf(true)) : cwl.G.o();
      }
   }

   @Override
   public void a(dja $$0, cti $$1, hx $$2, aup $$3) {
      double $$4 = (double)$$2.u();
      double $$5 = (double)$$2.v();
      double $$6 = (double)$$2.w();
      if ($$0.c(b)) {
         $$1.b(jx.am, $$4 + 0.5, $$5 + 0.8, $$6, 0.0, 0.0, 0.0);
         if ($$3.a(200) == 0) {
            $$1.a($$4, $$5, $$6, arm.cC, arn.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      } else {
         $$1.b(jx.an, $$4 + 0.5, $$5, $$6 + 0.5, 0.0, 0.04, 0.0);
         $$1.b(jx.an, $$4 + (double)$$3.i(), $$5 + (double)$$3.i(), $$6 + (double)$$3.i(), 0.0, 0.04, 0.0);
         if ($$3.a(200) == 0) {
            $$1.a($$4, $$5, $$6, arm.cA, arn.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      }
   }

   @Override
   public dja a(dja $$0, ic $$1, dja $$2, ctj $$3, hx $$4, hx $$5) {
      $$3.a($$4, eel.c, eel.c.a($$3));
      if (!$$0.a($$3, $$4) || $$1 == ic.a || $$1 == ic.b && !$$2.a(cwl.nd) && h($$2)) {
         $$3.a($$4, this, 5);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dja $$0, ctl $$1, hx $$2) {
      dja $$3 = $$1.a_($$2.d());
      return $$3.a(cwl.nd) || $$3.a(cwl.kJ) || $$3.a(cwl.dW);
   }

   @Override
   public emf a(dja $$0, cso $$1, hx $$2, elr $$3) {
      return emc.a();
   }

   @Override
   public dco b_(dja $$0) {
      return dco.a;
   }

   @Override
   protected void a(djb.a<cwj, dja> $$0) {
      $$0.a(b);
   }

   @Override
   public cmr a(@Nullable cfb $$0, ctj $$1, hx $$2, dja $$3) {
      $$1.a($$2, cwl.a.o(), 11);
      return new cmr(cmu.qw);
   }

   @Override
   public Optional<arl> au_() {
      return eel.c.j();
   }
}
