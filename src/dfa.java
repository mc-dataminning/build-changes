import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dfa extends deu implements dfb {
   public static final MapCodec<dfa> a = b(dfa::new);
   public static final dso b = dsn.e;
   private static final int c = 5;

   @Override
   public MapCodec<dfa> a() {
      return a;
   }

   public dfa(drw.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(true)));
   }

   @Override
   protected void a(drx $$0, dbt $$1, iz $$2, bsp $$3) {
      drx $$4 = $$1.a_($$2.c());
      if ($$4.i()) {
         $$3.l($$0.c(b));
         if (!$$1.B) {
            arb $$5 = (arb)$$1;

            for (int $$6 = 0; $$6 < 2; $$6++) {
               $$5.a(lj.am, (double)$$2.u() + $$1.z.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.z.j(), 1, 0.0, 0.0, 0.0, 1.0);
               $$5.a(lj.d, (double)$$2.u() + $$1.z.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.z.j(), 1, 0.0, 0.01, 0.0, 0.2);
            }
         }
      } else {
         $$3.m($$0.c(b));
      }
   }

   @Override
   protected void a(drx $$0, arb $$1, iz $$2, azc $$3) {
      a($$1, $$2, $$0, $$1.a_($$2.d()));
   }

   @Override
   protected enq b_(drx $$0) {
      return enr.c.a(false);
   }

   public static void b(dbu $$0, iz $$1, drx $$2) {
      a($$0, $$1, $$0.a_($$1), $$2);
   }

   public static void a(dbu $$0, iz $$1, drx $$2, drx $$3) {
      if (m($$2)) {
         drx $$4 = n($$3);
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

   private static boolean m(drx $$0) {
      return $$0.a(dew.nd) || $$0.a(dew.G) && $$0.u().e() >= 8 && $$0.u().b();
   }

   private static drx n(drx $$0) {
      if ($$0.a(dew.nd)) {
         return $$0;
      } else if ($$0.a(dew.dW)) {
         return dew.nd.n().a(b, Boolean.valueOf(false));
      } else {
         return $$0.a(dew.kJ) ? dew.nd.n().a(b, Boolean.valueOf(true)) : dew.G.n();
      }
   }

   @Override
   public void a(drx $$0, dbt $$1, iz $$2, azc $$3) {
      double $$4 = (double)$$2.u();
      double $$5 = (double)$$2.v();
      double $$6 = (double)$$2.w();
      if ($$0.c(b)) {
         $$1.b(lj.ap, $$4 + 0.5, $$5 + 0.8, $$6, 0.0, 0.0, 0.0);
         if ($$3.a(200) == 0) {
            $$1.a($$4, $$5, $$6, avw.da, avx.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      } else {
         $$1.b(lj.aq, $$4 + 0.5, $$5, $$6 + 0.5, 0.0, 0.04, 0.0);
         $$1.b(lj.aq, $$4 + (double)$$3.i(), $$5 + (double)$$3.i(), $$6 + (double)$$3.i(), 0.0, 0.04, 0.0);
         if ($$3.a(200) == 0) {
            $$1.a($$4, $$5, $$6, avw.cY, avx.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      }
   }

   @Override
   protected drx a(drx $$0, je $$1, drx $$2, dbu $$3, iz $$4, iz $$5) {
      $$3.a($$4, enr.c, enr.c.a($$3));
      if (!$$0.a($$3, $$4) || $$1 == je.a || $$1 == je.b && !$$2.a(dew.nd) && m($$2)) {
         $$3.a($$4, this, 5);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(drx $$0, dbw $$1, iz $$2) {
      drx $$3 = $$1.a_($$2.d());
      return $$3.a(dew.nd) || $$3.a(dew.kJ) || $$3.a(dew.dW);
   }

   @Override
   protected ewf a(drx $$0, daz $$1, iz $$2, evr $$3) {
      return ewc.a();
   }

   @Override
   protected dla a_(drx $$0) {
      return dla.a;
   }

   @Override
   protected void a(dry.a<deu, drx> $$0) {
      $$0.a(b);
   }

   @Override
   public cuk a(@Nullable cms $$0, dbu $$1, iz $$2, drx $$3) {
      $$1.a($$2, dew.a.n(), 11);
      return new cuk(cun.qz);
   }

   @Override
   public Optional<avv> at_() {
      return enr.c.j();
   }
}
