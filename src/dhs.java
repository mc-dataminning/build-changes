import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dhs extends dhm implements dht {
   public static final MapCodec<dhs> a = b(dhs::new);
   public static final dvj b = dvi.e;
   private static final int c = 5;

   @Override
   public MapCodec<dhs> a() {
      return a;
   }

   public dhs(dur.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(true)));
   }

   @Override
   protected void a(dus $$0, dej $$1, jf $$2, btr $$3) {
      dus $$4 = $$1.a_($$2.d());
      if ($$4.l()) {
         $$3.l($$0.c(b));
         if (!$$1.B) {
            arj $$5 = (arj)$$1;

            for (int $$6 = 0; $$6 < 2; $$6++) {
               $$5.a(lo.am, (double)$$2.u() + $$1.z.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.z.j(), 1, 0.0, 0.0, 0.0, 1.0);
               $$5.a(lo.d, (double)$$2.u() + $$1.z.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.z.j(), 1, 0.0, 0.01, 0.0, 0.2);
            }
         }
      } else {
         $$3.m($$0.c(b));
      }
   }

   @Override
   protected void a(dus $$0, arj $$1, jf $$2, azn $$3) {
      a($$1, $$2, $$0, $$1.a_($$2.e()));
   }

   @Override
   protected eqt b_(dus $$0) {
      return equ.c.a(false);
   }

   public static void b(dek $$0, jf $$1, dus $$2) {
      a($$0, $$1, $$0.a_($$1), $$2);
   }

   public static void a(dek $$0, jf $$1, dus $$2, dus $$3) {
      if (o($$2)) {
         dus $$4 = q($$3);
         $$0.a($$1, $$4, 2);
         jf.a $$5 = $$1.k().c(jk.b);

         while (o($$0.a_($$5))) {
            if (!$$0.a($$5, $$4, 2)) {
               return;
            }

            $$5.c(jk.b);
         }
      }
   }

   private static boolean o(dus $$0) {
      return $$0.a(dho.nd) || $$0.a(dho.G) && $$0.y().e() >= 8 && $$0.y().b();
   }

   private static dus q(dus $$0) {
      if ($$0.a(dho.nd)) {
         return $$0;
      } else if ($$0.a(dho.dW)) {
         return dho.nd.n().b(b, Boolean.valueOf(false));
      } else {
         return $$0.a(dho.kJ) ? dho.nd.n().b(b, Boolean.valueOf(true)) : dho.G.n();
      }
   }

   @Override
   public void a(dus $$0, dej $$1, jf $$2, azn $$3) {
      double $$4 = (double)$$2.u();
      double $$5 = (double)$$2.v();
      double $$6 = (double)$$2.w();
      if ($$0.c(b)) {
         $$1.b(lo.ap, $$4 + 0.5, $$5 + 0.8, $$6, 0.0, 0.0, 0.0);
         if ($$3.a(200) == 0) {
            $$1.a($$4, $$5, $$6, awg.da, awh.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      } else {
         $$1.b(lo.aq, $$4 + 0.5, $$5, $$6 + 0.5, 0.0, 0.04, 0.0);
         $$1.b(lo.aq, $$4 + (double)$$3.i(), $$5 + (double)$$3.i(), $$6 + (double)$$3.i(), 0.0, 0.04, 0.0);
         if ($$3.a(200) == 0) {
            $$1.a($$4, $$5, $$6, awg.cY, awh.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      }
   }

   @Override
   protected dus a(dus $$0, jk $$1, dus $$2, dek $$3, jf $$4, jf $$5) {
      $$3.a($$4, equ.c, equ.c.a($$3));
      if (!$$0.a($$3, $$4) || $$1 == jk.a || $$1 == jk.b && !$$2.a(dho.nd) && o($$2)) {
         $$3.a($$4, this, 5);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dus $$0, dem $$1, jf $$2) {
      dus $$3 = $$1.a_($$2.e());
      return $$3.a(dho.nd) || $$3.a(dho.kJ) || $$3.a(dho.dW);
   }

   @Override
   protected ezq a(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      return ezn.a();
   }

   @Override
   protected dnt a_(dus $$0) {
      return dnt.a;
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      $$0.a(b);
   }

   @Override
   public cvs a(@Nullable cnx $$0, dek $$1, jf $$2, dus $$3) {
      $$1.a($$2, dho.a.n(), 11);
      return new cvs(cvw.qA);
   }

   @Override
   public Optional<awf> au_() {
      return equ.c.j();
   }
}
