import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class czl extends czf implements czm {
   public static final MapCodec<czl> a = b(czl::new);
   public static final dmv b = dmu.e;
   private static final int c = 5;

   @Override
   public MapCodec<czl> a() {
      return a;
   }

   public czl(dmd.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(true)));
   }

   @Override
   protected void a(dme $$0, cwe $$1, ib $$2, bof $$3) {
      dme $$4 = $$1.a_($$2.c());
      if ($$4.i()) {
         $$3.k($$0.c(b));
         if (!$$1.B) {
            apa $$5 = (apa)$$1;

            for (int $$6 = 0; $$6 < 2; $$6++) {
               $$5.a(kb.aj, (double)$$2.u() + $$1.z.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.z.j(), 1, 0.0, 0.0, 0.0, 1.0);
               $$5.a(kb.e, (double)$$2.u() + $$1.z.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.z.j(), 1, 0.0, 0.01, 0.0, 0.2);
            }
         }
      } else {
         $$3.l($$0.c(b));
      }
   }

   @Override
   protected void a(dme $$0, apa $$1, ib $$2, awt $$3) {
      a($$1, $$2, $$0, $$1.a_($$2.d()));
   }

   @Override
   protected ehr c_(dme $$0) {
      return ehs.c.a(false);
   }

   public static void b(cwf $$0, ib $$1, dme $$2) {
      a($$0, $$1, $$0.a_($$1), $$2);
   }

   public static void a(cwf $$0, ib $$1, dme $$2, dme $$3) {
      if (m($$2)) {
         dme $$4 = n($$3);
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

   private static boolean m(dme $$0) {
      return $$0.a(czh.nd) || $$0.a(czh.G) && $$0.u().e() >= 8 && $$0.u().b();
   }

   private static dme n(dme $$0) {
      if ($$0.a(czh.nd)) {
         return $$0;
      } else if ($$0.a(czh.dW)) {
         return czh.nd.o().a(b, Boolean.valueOf(false));
      } else {
         return $$0.a(czh.kJ) ? czh.nd.o().a(b, Boolean.valueOf(true)) : czh.G.o();
      }
   }

   @Override
   public void a(dme $$0, cwe $$1, ib $$2, awt $$3) {
      double $$4 = (double)$$2.u();
      double $$5 = (double)$$2.v();
      double $$6 = (double)$$2.w();
      if ($$0.c(b)) {
         $$1.b(kb.am, $$4 + 0.5, $$5 + 0.8, $$6, 0.0, 0.0, 0.0);
         if ($$3.a(200) == 0) {
            $$1.a($$4, $$5, $$6, atp.cS, atq.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      } else {
         $$1.b(kb.an, $$4 + 0.5, $$5, $$6 + 0.5, 0.0, 0.04, 0.0);
         $$1.b(kb.an, $$4 + (double)$$3.i(), $$5 + (double)$$3.i(), $$6 + (double)$$3.i(), 0.0, 0.04, 0.0);
         if ($$3.a(200) == 0) {
            $$1.a($$4, $$5, $$6, atp.cQ, atq.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      }
   }

   @Override
   protected dme a(dme $$0, ih $$1, dme $$2, cwf $$3, ib $$4, ib $$5) {
      $$3.a($$4, ehs.c, ehs.c.a($$3));
      if (!$$0.a($$3, $$4) || $$1 == ih.a || $$1 == ih.b && !$$2.a(czh.nd) && m($$2)) {
         $$3.a($$4, this, 5);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dme $$0, cwh $$1, ib $$2) {
      dme $$3 = $$1.a_($$2.d());
      return $$3.a(czh.nd) || $$3.a(czh.kJ) || $$3.a(czh.dW);
   }

   @Override
   protected epo a(dme $$0, cvk $$1, ib $$2, epa $$3) {
      return epl.a();
   }

   @Override
   protected dfk b_(dme $$0) {
      return dfk.a;
   }

   @Override
   protected void a(dmf.a<czf, dme> $$0) {
      $$0.a(b);
   }

   @Override
   public cpq a(@Nullable cia $$0, cwf $$1, ib $$2, dme $$3) {
      $$1.a($$2, czh.a.o(), 11);
      return new cpq(cpt.qy);
   }

   @Override
   public Optional<ato> aw_() {
      return ehs.c.j();
   }
}
