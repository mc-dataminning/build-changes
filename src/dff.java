import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dff extends dez implements dfg {
   public static final MapCodec<dff> a = b(dff::new);
   public static final dst b = dss.e;
   private static final int c = 5;

   @Override
   public MapCodec<dff> a() {
      return a;
   }

   public dff(dsb.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(true)));
   }

   @Override
   protected void a(dsc $$0, dby $$1, iz $$2, bsu $$3) {
      dsc $$4 = $$1.a_($$2.c());
      if ($$4.i()) {
         $$3.l($$0.c(b));
         if (!$$1.B) {
            arf $$5 = (arf)$$1;

            for (int $$6 = 0; $$6 < 2; $$6++) {
               $$5.a(li.am, (double)$$2.u() + $$1.z.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.z.j(), 1, 0.0, 0.0, 0.0, 1.0);
               $$5.a(li.d, (double)$$2.u() + $$1.z.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.z.j(), 1, 0.0, 0.01, 0.0, 0.2);
            }
         }
      } else {
         $$3.m($$0.c(b));
      }
   }

   @Override
   protected void a(dsc $$0, arf $$1, iz $$2, azh $$3) {
      a($$1, $$2, $$0, $$1.a_($$2.d()));
   }

   @Override
   protected env b_(dsc $$0) {
      return enw.c.a(false);
   }

   public static void b(dbz $$0, iz $$1, dsc $$2) {
      a($$0, $$1, $$0.a_($$1), $$2);
   }

   public static void a(dbz $$0, iz $$1, dsc $$2, dsc $$3) {
      if (m($$2)) {
         dsc $$4 = n($$3);
         $$0.a($$1, $$4, 2);
         iz.a $$5 = $$1.j().c(je.b);

         while (m($$0.a_($$5))) {
            if (!$$0.a($$5, $$4, 2)) {
               return;
            }

            $$5.c(je.b);
         }
      }
   }

   private static boolean m(dsc $$0) {
      return $$0.a(dfb.nd) || $$0.a(dfb.G) && $$0.u().e() >= 8 && $$0.u().b();
   }

   private static dsc n(dsc $$0) {
      if ($$0.a(dfb.nd)) {
         return $$0;
      } else if ($$0.a(dfb.dW)) {
         return dfb.nd.o().a(b, Boolean.valueOf(false));
      } else {
         return $$0.a(dfb.kJ) ? dfb.nd.o().a(b, Boolean.valueOf(true)) : dfb.G.o();
      }
   }

   @Override
   public void a(dsc $$0, dby $$1, iz $$2, azh $$3) {
      double $$4 = (double)$$2.u();
      double $$5 = (double)$$2.v();
      double $$6 = (double)$$2.w();
      if ($$0.c(b)) {
         $$1.b(li.ap, $$4 + 0.5, $$5 + 0.8, $$6, 0.0, 0.0, 0.0);
         if ($$3.a(200) == 0) {
            $$1.a($$4, $$5, $$6, awa.da, awb.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      } else {
         $$1.b(li.aq, $$4 + 0.5, $$5, $$6 + 0.5, 0.0, 0.04, 0.0);
         $$1.b(li.aq, $$4 + (double)$$3.i(), $$5 + (double)$$3.i(), $$6 + (double)$$3.i(), 0.0, 0.04, 0.0);
         if ($$3.a(200) == 0) {
            $$1.a($$4, $$5, $$6, awa.cY, awb.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      }
   }

   @Override
   protected dsc a(dsc $$0, je $$1, dsc $$2, dbz $$3, iz $$4, iz $$5) {
      $$3.a($$4, enw.c, enw.c.a($$3));
      if (!$$0.a($$3, $$4) || $$1 == je.a || $$1 == je.b && !$$2.a(dfb.nd) && m($$2)) {
         $$3.a($$4, this, 5);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dsc $$0, dcb $$1, iz $$2) {
      dsc $$3 = $$1.a_($$2.d());
      return $$3.a(dfb.nd) || $$3.a(dfb.kJ) || $$3.a(dfb.dW);
   }

   @Override
   protected ewk a(dsc $$0, dbe $$1, iz $$2, evw $$3) {
      return ewh.a();
   }

   @Override
   protected dlf a_(dsc $$0) {
      return dlf.a;
   }

   @Override
   protected void a(dsd.a<dez, dsc> $$0) {
      $$0.a(b);
   }

   @Override
   public cup a(@Nullable cmx $$0, dbz $$1, iz $$2, dsc $$3) {
      $$1.a($$2, dfb.a.o(), 11);
      return new cup(cus.qz);
   }

   @Override
   public Optional<avz> ar_() {
      return enw.c.j();
   }
}
