import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class cxe extends cwy implements cxf {
   public static final MapCodec<cxe> a = b(cxe::new);
   public static final dkg b = dkf.e;
   private static final int c = 5;

   @Override
   public MapCodec<cxe> a() {
      return a;
   }

   public cxe(djo.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(true)));
   }

   @Override
   public void a(djp $$0, ctx $$1, hx $$2, blw $$3) {
      djp $$4 = $$1.a_($$2.c());
      if ($$4.i()) {
         $$3.k($$0.c(b));
         if (!$$1.B) {
            ane $$5 = (ane)$$1;

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
   public void a(djp $$0, ane $$1, hx $$2, auw $$3) {
      a($$1, $$2, $$0, $$1.a_($$2.d()));
   }

   @Override
   public eez c_(djp $$0) {
      return efa.c.a(false);
   }

   public static void b(cty $$0, hx $$1, djp $$2) {
      a($$0, $$1, $$0.a_($$1), $$2);
   }

   public static void a(cty $$0, hx $$1, djp $$2, djp $$3) {
      if (h($$2)) {
         djp $$4 = n($$3);
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

   private static boolean h(djp $$0) {
      return $$0.a(cxa.nd) || $$0.a(cxa.G) && $$0.u().e() >= 8 && $$0.u().b();
   }

   private static djp n(djp $$0) {
      if ($$0.a(cxa.nd)) {
         return $$0;
      } else if ($$0.a(cxa.dW)) {
         return cxa.nd.o().a(b, Boolean.valueOf(false));
      } else {
         return $$0.a(cxa.kJ) ? cxa.nd.o().a(b, Boolean.valueOf(true)) : cxa.G.o();
      }
   }

   @Override
   public void a(djp $$0, ctx $$1, hx $$2, auw $$3) {
      double $$4 = (double)$$2.u();
      double $$5 = (double)$$2.v();
      double $$6 = (double)$$2.w();
      if ($$0.c(b)) {
         $$1.b(jx.am, $$4 + 0.5, $$5 + 0.8, $$6, 0.0, 0.0, 0.0);
         if ($$3.a(200) == 0) {
            $$1.a($$4, $$5, $$6, art.cR, aru.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      } else {
         $$1.b(jx.an, $$4 + 0.5, $$5, $$6 + 0.5, 0.0, 0.04, 0.0);
         $$1.b(jx.an, $$4 + (double)$$3.i(), $$5 + (double)$$3.i(), $$6 + (double)$$3.i(), 0.0, 0.04, 0.0);
         if ($$3.a(200) == 0) {
            $$1.a($$4, $$5, $$6, art.cP, aru.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      }
   }

   @Override
   public djp a(djp $$0, ic $$1, djp $$2, cty $$3, hx $$4, hx $$5) {
      $$3.a($$4, efa.c, efa.c.a($$3));
      if (!$$0.a($$3, $$4) || $$1 == ic.a || $$1 == ic.b && !$$2.a(cxa.nd) && h($$2)) {
         $$3.a($$4, this, 5);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(djp $$0, cua $$1, hx $$2) {
      djp $$3 = $$1.a_($$2.d());
      return $$3.a(cxa.nd) || $$3.a(cxa.kJ) || $$3.a(cxa.dW);
   }

   @Override
   public emv a(djp $$0, ctd $$1, hx $$2, emh $$3) {
      return ems.a();
   }

   @Override
   public ddd b_(djp $$0) {
      return ddd.a;
   }

   @Override
   protected void a(djq.a<cwy, djp> $$0) {
      $$0.a(b);
   }

   @Override
   public cng a(@Nullable cfq $$0, cty $$1, hx $$2, djp $$3) {
      $$1.a($$2, cxa.a.o(), 11);
      return new cng(cnj.qy);
   }

   @Override
   public Optional<ars> ax_() {
      return efa.c.j();
   }
}
