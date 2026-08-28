import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dge extends dfy implements dgf {
   public static final MapCodec<dge> a = b(dge::new);
   public static final dtt b = dts.e;
   private static final int c = 5;

   @Override
   public MapCodec<dge> a() {
      return a;
   }

   public dge(dtb.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(true)));
   }

   @Override
   protected void a(dtc $$0, dcw $$1, jd $$2, bsr $$3) {
      dtc $$4 = $$1.a_($$2.d());
      if ($$4.i()) {
         $$3.l($$0.c(b));
         if (!$$1.B) {
            aqu $$5 = (aqu)$$1;

            for (int $$6 = 0; $$6 < 2; $$6++) {
               $$5.a(lm.am, (double)$$2.u() + $$1.z.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.z.j(), 1, 0.0, 0.0, 0.0, 1.0);
               $$5.a(lm.d, (double)$$2.u() + $$1.z.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.z.j(), 1, 0.0, 0.01, 0.0, 0.2);
            }
         }
      } else {
         $$3.m($$0.c(b));
      }
   }

   @Override
   protected void a(dtc $$0, aqu $$1, jd $$2, ayw $$3) {
      a($$1, $$2, $$0, $$1.a_($$2.e()));
   }

   @Override
   protected epc b_(dtc $$0) {
      return epd.c.a(false);
   }

   public static void b(dcx $$0, jd $$1, dtc $$2) {
      a($$0, $$1, $$0.a_($$1), $$2);
   }

   public static void a(dcx $$0, jd $$1, dtc $$2, dtc $$3) {
      if (m($$2)) {
         dtc $$4 = n($$3);
         $$0.a($$1, $$4, 2);
         jd.a $$5 = $$1.k().c(ji.b);

         while (m($$0.a_($$5))) {
            if (!$$0.a($$5, $$4, 2)) {
               return;
            }

            $$5.c(ji.b);
         }
      }
   }

   private static boolean m(dtc $$0) {
      return $$0.a(dga.nd) || $$0.a(dga.G) && $$0.u().e() >= 8 && $$0.u().b();
   }

   private static dtc n(dtc $$0) {
      if ($$0.a(dga.nd)) {
         return $$0;
      } else if ($$0.a(dga.dW)) {
         return dga.nd.o().a(b, Boolean.valueOf(false));
      } else {
         return $$0.a(dga.kJ) ? dga.nd.o().a(b, Boolean.valueOf(true)) : dga.G.o();
      }
   }

   @Override
   public void a(dtc $$0, dcw $$1, jd $$2, ayw $$3) {
      double $$4 = (double)$$2.u();
      double $$5 = (double)$$2.v();
      double $$6 = (double)$$2.w();
      if ($$0.c(b)) {
         $$1.b(lm.ap, $$4 + 0.5, $$5 + 0.8, $$6, 0.0, 0.0, 0.0);
         if ($$3.a(200) == 0) {
            $$1.a($$4, $$5, $$6, avp.da, avq.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      } else {
         $$1.b(lm.aq, $$4 + 0.5, $$5, $$6 + 0.5, 0.0, 0.04, 0.0);
         $$1.b(lm.aq, $$4 + (double)$$3.i(), $$5 + (double)$$3.i(), $$6 + (double)$$3.i(), 0.0, 0.04, 0.0);
         if ($$3.a(200) == 0) {
            $$1.a($$4, $$5, $$6, avp.cY, avq.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      }
   }

   @Override
   protected dtc a(dtc $$0, ji $$1, dtc $$2, dcx $$3, jd $$4, jd $$5) {
      $$3.a($$4, epd.c, epd.c.a($$3));
      if (!$$0.a($$3, $$4) || $$1 == ji.a || $$1 == ji.b && !$$2.a(dga.nd) && m($$2)) {
         $$3.a($$4, this, 5);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dtc $$0, dcz $$1, jd $$2) {
      dtc $$3 = $$1.a_($$2.e());
      return $$3.a(dga.nd) || $$3.a(dga.kJ) || $$3.a(dga.dW);
   }

   @Override
   protected ext a(dtc $$0, dcc $$1, jd $$2, exf $$3) {
      return exq.a();
   }

   @Override
   protected dmf a_(dtc $$0) {
      return dmf.a;
   }

   @Override
   protected void a(dtd.a<dfy, dtc> $$0) {
      $$0.a(b);
   }

   @Override
   public cuq a(@Nullable cmx $$0, dcx $$1, jd $$2, dtc $$3) {
      $$1.a($$2, dga.a.o(), 11);
      return new cuq(cut.qz);
   }

   @Override
   public Optional<avo> aw_() {
      return epd.c.j();
   }
}
