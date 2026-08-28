import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class die extends dhy implements dif {
   public static final MapCodec<die> a = b(die::new);
   public static final dvu b = dvt.e;
   private static final int c = 5;

   @Override
   public MapCodec<die> a() {
      return a;
   }

   public die(dvc.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(true)));
   }

   @Override
   protected void a(dvd $$0, dev $$1, jg $$2, btz $$3) {
      dvd $$4 = $$1.a_($$2.d());
      if ($$4.l()) {
         $$3.l($$0.c(b));
         if (!$$1.C) {
            arm $$5 = (arm)$$1;

            for (int $$6 = 0; $$6 < 2; $$6++) {
               $$5.a(lq.am, (double)$$2.u() + $$1.A.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.A.j(), 1, 0.0, 0.0, 0.0, 1.0);
               $$5.a(lq.d, (double)$$2.u() + $$1.A.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.A.j(), 1, 0.0, 0.01, 0.0, 0.2);
            }
         }
      } else {
         $$3.m($$0.c(b));
      }
   }

   @Override
   protected void a(dvd $$0, arm $$1, jg $$2, azr $$3) {
      a($$1, $$2, $$0, $$1.a_($$2.e()));
   }

   @Override
   protected ere b_(dvd $$0) {
      return erf.c.a(false);
   }

   public static void b(dew $$0, jg $$1, dvd $$2) {
      a($$0, $$1, $$0.a_($$1), $$2);
   }

   public static void a(dew $$0, jg $$1, dvd $$2, dvd $$3) {
      if (o($$2)) {
         dvd $$4 = q($$3);
         $$0.a($$1, $$4, 2);
         jg.a $$5 = $$1.k().c(jl.b);

         while (o($$0.a_($$5))) {
            if (!$$0.a($$5, $$4, 2)) {
               return;
            }

            $$5.c(jl.b);
         }
      }
   }

   private static boolean o(dvd $$0) {
      return $$0.a(dia.nd) || $$0.a(dia.G) && $$0.y().e() >= 8 && $$0.y().b();
   }

   private static dvd q(dvd $$0) {
      if ($$0.a(dia.nd)) {
         return $$0;
      } else if ($$0.a(dia.dW)) {
         return dia.nd.m().b(b, Boolean.valueOf(false));
      } else {
         return $$0.a(dia.kJ) ? dia.nd.m().b(b, Boolean.valueOf(true)) : dia.G.m();
      }
   }

   @Override
   public void a(dvd $$0, dev $$1, jg $$2, azr $$3) {
      double $$4 = (double)$$2.u();
      double $$5 = (double)$$2.v();
      double $$6 = (double)$$2.w();
      if ($$0.c(b)) {
         $$1.b(lq.ap, $$4 + 0.5, $$5 + 0.8, $$6, 0.0, 0.0, 0.0);
         if ($$3.a(200) == 0) {
            $$1.a($$4, $$5, $$6, awk.da, awl.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      } else {
         $$1.b(lq.aq, $$4 + 0.5, $$5, $$6 + 0.5, 0.0, 0.04, 0.0);
         $$1.b(lq.aq, $$4 + (double)$$3.i(), $$5 + (double)$$3.i(), $$6 + (double)$$3.i(), 0.0, 0.04, 0.0);
         if ($$3.a(200) == 0) {
            $$1.a($$4, $$5, $$6, awk.cY, awl.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      }
   }

   @Override
   protected dvd a(dvd $$0, jl $$1, dvd $$2, dew $$3, jg $$4, jg $$5) {
      $$3.a($$4, erf.c, erf.c.a($$3));
      if (!$$0.a($$3, $$4) || $$1 == jl.a || $$1 == jl.b && !$$2.a(dia.nd) && o($$2)) {
         $$3.a($$4, this, 5);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dvd $$0, dey $$1, jg $$2) {
      dvd $$3 = $$1.a_($$2.e());
      return $$3.a(dia.nd) || $$3.a(dia.kJ) || $$3.a(dia.dW);
   }

   @Override
   protected fab a(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      return ezy.a();
   }

   @Override
   protected doe a_(dvd $$0) {
      return doe.a;
   }

   @Override
   protected void a(dve.a<dhy, dvd> $$0) {
      $$0.a(b);
   }

   @Override
   public cvx a(@Nullable coh $$0, dew $$1, jg $$2, dvd $$3) {
      $$1.a($$2, dia.a.m(), 11);
      return new cvx(cwb.qA);
   }

   @Override
   public Optional<awj> au_() {
      return erf.c.j();
   }
}
