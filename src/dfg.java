import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dfg extends dfa implements dfh {
   public static final MapCodec<dfg> a = b(dfg::new);
   public static final dsu b = dst.e;
   private static final int c = 5;

   @Override
   public MapCodec<dfg> a() {
      return a;
   }

   public dfg(dsc.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(true)));
   }

   @Override
   protected void a(dsd $$0, dbz $$1, iz $$2, bsv $$3) {
      dsd $$4 = $$1.a_($$2.c());
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
   protected void a(dsd $$0, arf $$1, iz $$2, azh $$3) {
      a($$1, $$2, $$0, $$1.a_($$2.d()));
   }

   @Override
   protected enw b_(dsd $$0) {
      return enx.c.a(false);
   }

   public static void b(dca $$0, iz $$1, dsd $$2) {
      a($$0, $$1, $$0.a_($$1), $$2);
   }

   public static void a(dca $$0, iz $$1, dsd $$2, dsd $$3) {
      if (m($$2)) {
         dsd $$4 = n($$3);
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

   private static boolean m(dsd $$0) {
      return $$0.a(dfc.nd) || $$0.a(dfc.G) && $$0.u().e() >= 8 && $$0.u().b();
   }

   private static dsd n(dsd $$0) {
      if ($$0.a(dfc.nd)) {
         return $$0;
      } else if ($$0.a(dfc.dW)) {
         return dfc.nd.o().a(b, Boolean.valueOf(false));
      } else {
         return $$0.a(dfc.kJ) ? dfc.nd.o().a(b, Boolean.valueOf(true)) : dfc.G.o();
      }
   }

   @Override
   public void a(dsd $$0, dbz $$1, iz $$2, azh $$3) {
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
   protected dsd a(dsd $$0, je $$1, dsd $$2, dca $$3, iz $$4, iz $$5) {
      $$3.a($$4, enx.c, enx.c.a($$3));
      if (!$$0.a($$3, $$4) || $$1 == je.a || $$1 == je.b && !$$2.a(dfc.nd) && m($$2)) {
         $$3.a($$4, this, 5);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dsd $$0, dcc $$1, iz $$2) {
      dsd $$3 = $$1.a_($$2.d());
      return $$3.a(dfc.nd) || $$3.a(dfc.kJ) || $$3.a(dfc.dW);
   }

   @Override
   protected ewl a(dsd $$0, dbf $$1, iz $$2, evx $$3) {
      return ewi.a();
   }

   @Override
   protected dlg a_(dsd $$0) {
      return dlg.a;
   }

   @Override
   protected void a(dse.a<dfa, dsd> $$0) {
      $$0.a(b);
   }

   @Override
   public cuq a(@Nullable cmy $$0, dca $$1, iz $$2, dsd $$3) {
      $$1.a($$2, dfc.a.o(), 11);
      return new cuq(cut.qz);
   }

   @Override
   public Optional<avz> ar_() {
      return enx.c.j();
   }
}
