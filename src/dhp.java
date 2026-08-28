import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dhp extends dhj implements dhq {
   public static final MapCodec<dhp> a = b(dhp::new);
   public static final dvf b = dve.e;
   private static final int c = 5;

   @Override
   public MapCodec<dhp> a() {
      return a;
   }

   public dhp(dun.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(true)));
   }

   @Override
   protected void a(duo $$0, deg $$1, je $$2, bto $$3) {
      duo $$4 = $$1.a_($$2.d());
      if ($$4.l()) {
         $$3.l($$0.c(b));
         if (!$$1.B) {
            arh $$5 = (arh)$$1;

            for (int $$6 = 0; $$6 < 2; $$6++) {
               $$5.a(ln.am, (double)$$2.u() + $$1.z.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.z.j(), 1, 0.0, 0.0, 0.0, 1.0);
               $$5.a(ln.d, (double)$$2.u() + $$1.z.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.z.j(), 1, 0.0, 0.01, 0.0, 0.2);
            }
         }
      } else {
         $$3.m($$0.c(b));
      }
   }

   @Override
   protected void a(duo $$0, arh $$1, je $$2, azl $$3) {
      a($$1, $$2, $$0, $$1.a_($$2.e()));
   }

   @Override
   protected eqp b_(duo $$0) {
      return eqq.c.a(false);
   }

   public static void b(deh $$0, je $$1, duo $$2) {
      a($$0, $$1, $$0.a_($$1), $$2);
   }

   public static void a(deh $$0, je $$1, duo $$2, duo $$3) {
      if (o($$2)) {
         duo $$4 = q($$3);
         $$0.a($$1, $$4, 2);
         je.a $$5 = $$1.k().c(jj.b);

         while (o($$0.a_($$5))) {
            if (!$$0.a($$5, $$4, 2)) {
               return;
            }

            $$5.c(jj.b);
         }
      }
   }

   private static boolean o(duo $$0) {
      return $$0.a(dhl.nd) || $$0.a(dhl.G) && $$0.y().e() >= 8 && $$0.y().b();
   }

   private static duo q(duo $$0) {
      if ($$0.a(dhl.nd)) {
         return $$0;
      } else if ($$0.a(dhl.dW)) {
         return dhl.nd.o().b(b, Boolean.valueOf(false));
      } else {
         return $$0.a(dhl.kJ) ? dhl.nd.o().b(b, Boolean.valueOf(true)) : dhl.G.o();
      }
   }

   @Override
   public void a(duo $$0, deg $$1, je $$2, azl $$3) {
      double $$4 = (double)$$2.u();
      double $$5 = (double)$$2.v();
      double $$6 = (double)$$2.w();
      if ($$0.c(b)) {
         $$1.b(ln.ap, $$4 + 0.5, $$5 + 0.8, $$6, 0.0, 0.0, 0.0);
         if ($$3.a(200) == 0) {
            $$1.a($$4, $$5, $$6, awe.da, awf.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      } else {
         $$1.b(ln.aq, $$4 + 0.5, $$5, $$6 + 0.5, 0.0, 0.04, 0.0);
         $$1.b(ln.aq, $$4 + (double)$$3.i(), $$5 + (double)$$3.i(), $$6 + (double)$$3.i(), 0.0, 0.04, 0.0);
         if ($$3.a(200) == 0) {
            $$1.a($$4, $$5, $$6, awe.cY, awf.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      }
   }

   @Override
   protected duo a(duo $$0, jj $$1, duo $$2, deh $$3, je $$4, je $$5) {
      $$3.a($$4, eqq.c, eqq.c.a($$3));
      if (!$$0.a($$3, $$4) || $$1 == jj.a || $$1 == jj.b && !$$2.a(dhl.nd) && o($$2)) {
         $$3.a($$4, this, 5);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(duo $$0, dej $$1, je $$2) {
      duo $$3 = $$1.a_($$2.e());
      return $$3.a(dhl.nd) || $$3.a(dhl.kJ) || $$3.a(dhl.dW);
   }

   @Override
   protected ezm a(duo $$0, ddl $$1, je $$2, eyx $$3) {
      return ezj.a();
   }

   @Override
   protected dnq a_(duo $$0) {
      return dnq.a;
   }

   @Override
   protected void a(dup.a<dhj, duo> $$0) {
      $$0.a(b);
   }

   @Override
   public cvp a(@Nullable cnu $$0, deh $$1, je $$2, duo $$3) {
      $$1.a($$2, dhl.a.o(), 11);
      return new cvp(cvt.qA);
   }

   @Override
   public Optional<awd> at_() {
      return eqq.c.j();
   }
}
