import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dfh extends dfb implements dfi {
   public static final MapCodec<dfh> a = b(dfh::new);
   public static final dsv b = dsu.e;
   private static final int c = 5;

   @Override
   public MapCodec<dfh> a() {
      return a;
   }

   public dfh(dsd.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(true)));
   }

   @Override
   protected void a(dse $$0, dca $$1, iz $$2, bsw $$3) {
      dse $$4 = $$1.a_($$2.c());
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
   protected void a(dse $$0, arf $$1, iz $$2, azh $$3) {
      a($$1, $$2, $$0, $$1.a_($$2.d()));
   }

   @Override
   protected enx b_(dse $$0) {
      return eny.c.a(false);
   }

   public static void b(dcb $$0, iz $$1, dse $$2) {
      a($$0, $$1, $$0.a_($$1), $$2);
   }

   public static void a(dcb $$0, iz $$1, dse $$2, dse $$3) {
      if (m($$2)) {
         dse $$4 = n($$3);
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

   private static boolean m(dse $$0) {
      return $$0.a(dfd.nd) || $$0.a(dfd.G) && $$0.u().e() >= 8 && $$0.u().b();
   }

   private static dse n(dse $$0) {
      if ($$0.a(dfd.nd)) {
         return $$0;
      } else if ($$0.a(dfd.dW)) {
         return dfd.nd.o().a(b, Boolean.valueOf(false));
      } else {
         return $$0.a(dfd.kJ) ? dfd.nd.o().a(b, Boolean.valueOf(true)) : dfd.G.o();
      }
   }

   @Override
   public void a(dse $$0, dca $$1, iz $$2, azh $$3) {
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
   protected dse a(dse $$0, je $$1, dse $$2, dcb $$3, iz $$4, iz $$5) {
      $$3.a($$4, eny.c, eny.c.a($$3));
      if (!$$0.a($$3, $$4) || $$1 == je.a || $$1 == je.b && !$$2.a(dfd.nd) && m($$2)) {
         $$3.a($$4, this, 5);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dse $$0, dcd $$1, iz $$2) {
      dse $$3 = $$1.a_($$2.d());
      return $$3.a(dfd.nd) || $$3.a(dfd.kJ) || $$3.a(dfd.dW);
   }

   @Override
   protected ewm a(dse $$0, dbg $$1, iz $$2, evy $$3) {
      return ewj.a();
   }

   @Override
   protected dlh a_(dse $$0) {
      return dlh.a;
   }

   @Override
   protected void a(dsf.a<dfb, dse> $$0) {
      $$0.a(b);
   }

   @Override
   public cur a(@Nullable cmz $$0, dcb $$1, iz $$2, dse $$3) {
      $$1.a($$2, dfd.a.o(), 11);
      return new cur(cuu.qz);
   }

   @Override
   public Optional<avz> ar_() {
      return eny.c.j();
   }
}
