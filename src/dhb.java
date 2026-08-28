import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dhb extends dgv implements dhc {
   public static final MapCodec<dhb> a = b(dhb::new);
   public static final dur b = duq.e;
   private static final int c = 5;

   @Override
   public MapCodec<dhb> a() {
      return a;
   }

   public dhb(dtz.d $$0) {
      super($$0);
      this.l(this.E.b().b(b, Boolean.valueOf(true)));
   }

   @Override
   protected void a(dua $$0, dds $$1, je $$2, btj $$3) {
      dua $$4 = $$1.a_($$2.d());
      if ($$4.l()) {
         $$3.l($$0.c(b));
         if (!$$1.B) {
            arg $$5 = (arg)$$1;

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
   protected void a(dua $$0, arg $$1, je $$2, azk $$3) {
      a($$1, $$2, $$0, $$1.a_($$2.e()));
   }

   @Override
   protected eqb b_(dua $$0) {
      return eqc.c.a(false);
   }

   public static void b(ddt $$0, je $$1, dua $$2) {
      a($$0, $$1, $$0.a_($$1), $$2);
   }

   public static void a(ddt $$0, je $$1, dua $$2, dua $$3) {
      if (o($$2)) {
         dua $$4 = q($$3);
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

   private static boolean o(dua $$0) {
      return $$0.a(dgx.nd) || $$0.a(dgx.G) && $$0.y().e() >= 8 && $$0.y().b();
   }

   private static dua q(dua $$0) {
      if ($$0.a(dgx.nd)) {
         return $$0;
      } else if ($$0.a(dgx.dW)) {
         return dgx.nd.o().b(b, Boolean.valueOf(false));
      } else {
         return $$0.a(dgx.kJ) ? dgx.nd.o().b(b, Boolean.valueOf(true)) : dgx.G.o();
      }
   }

   @Override
   public void a(dua $$0, dds $$1, je $$2, azk $$3) {
      double $$4 = (double)$$2.u();
      double $$5 = (double)$$2.v();
      double $$6 = (double)$$2.w();
      if ($$0.c(b)) {
         $$1.b(ln.ap, $$4 + 0.5, $$5 + 0.8, $$6, 0.0, 0.0, 0.0);
         if ($$3.a(200) == 0) {
            $$1.a($$4, $$5, $$6, awd.da, awe.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      } else {
         $$1.b(ln.aq, $$4 + 0.5, $$5, $$6 + 0.5, 0.0, 0.04, 0.0);
         $$1.b(ln.aq, $$4 + (double)$$3.i(), $$5 + (double)$$3.i(), $$6 + (double)$$3.i(), 0.0, 0.04, 0.0);
         if ($$3.a(200) == 0) {
            $$1.a($$4, $$5, $$6, awd.cY, awe.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      }
   }

   @Override
   protected dua a(dua $$0, jj $$1, dua $$2, ddt $$3, je $$4, je $$5) {
      $$3.a($$4, eqc.c, eqc.c.a($$3));
      if (!$$0.a($$3, $$4) || $$1 == jj.a || $$1 == jj.b && !$$2.a(dgx.nd) && o($$2)) {
         $$3.a($$4, this, 5);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dua $$0, ddv $$1, je $$2) {
      dua $$3 = $$1.a_($$2.e());
      return $$3.a(dgx.nd) || $$3.a(dgx.kJ) || $$3.a(dgx.dW);
   }

   @Override
   protected eyx a(dua $$0, dcx $$1, je $$2, eyj $$3) {
      return eyu.a();
   }

   @Override
   protected dnc a_(dua $$0) {
      return dnc.a;
   }

   @Override
   protected void a(dub.a<dgv, dua> $$0) {
      $$0.a(b);
   }

   @Override
   public cvl a(@Nullable cnp $$0, ddt $$1, je $$2, dua $$3) {
      $$1.a($$2, dgx.a.o(), 11);
      return new cvl(cvo.qA);
   }

   @Override
   public Optional<awc> av_() {
      return eqc.c.j();
   }
}
