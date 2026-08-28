import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dnj extends dnc implements dnk {
   public static final MapCodec<dnj> a = b(dnj::new);
   public static final ebv b = ebu.h;
   private static final int c = 5;

   @Override
   public MapCodec<dnj> a() {
      return a;
   }

   public dnj(ebd.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, Boolean.valueOf(true)));
   }

   @Override
   protected void a(ebe $$0, djx $$1, iv $$2, bwt $$3, bxm $$4) {
      ebe $$5 = $$1.a_($$2.d());
      boolean $$6 = $$5.g($$1, $$2).c() && $$5.y().c();
      if ($$6) {
         $$3.a($$0.c(b), $$2);
      } else {
         $$3.l($$0.c(b));
      }
   }

   @Override
   protected void a(ebe $$0, ars $$1, iv $$2, azx $$3) {
      a($$1, $$2, $$0, $$1.a_($$2.e()));
   }

   @Override
   protected exo b_(ebe $$0) {
      return exp.c.a(false);
   }

   public static void b(djy $$0, iv $$1, ebe $$2) {
      a($$0, $$1, $$0.a_($$1), $$2);
   }

   public static void a(djy $$0, iv $$1, ebe $$2, ebe $$3) {
      if (o($$2)) {
         ebe $$4 = q($$3);
         $$0.a($$1, $$4, 2);
         iv.a $$5 = $$1.k().c(jb.b);

         while (o($$0.a_($$5))) {
            if (!$$0.a($$5, $$4, 2)) {
               return;
            }

            $$5.c(jb.b);
         }
      }
   }

   private static boolean o(ebe $$0) {
      return $$0.a(dne.nJ) || $$0.a(dne.J) && $$0.y().e() >= 8 && $$0.y().b();
   }

   private static ebe q(ebe $$0) {
      if ($$0.a(dne.nJ)) {
         return $$0;
      } else if ($$0.a(dne.en)) {
         return dne.nJ.m().b(b, Boolean.valueOf(false));
      } else {
         return $$0.a(dne.lp) ? dne.nJ.m().b(b, Boolean.valueOf(true)) : dne.J.m();
      }
   }

   @Override
   public void a(ebe $$0, djx $$1, iv $$2, azx $$3) {
      double $$4 = (double)$$2.u();
      double $$5 = (double)$$2.v();
      double $$6 = (double)$$2.w();
      if ($$0.c(b)) {
         $$1.b(ly.as, $$4 + 0.5, $$5 + 0.8, $$6, 0.0, 0.0, 0.0);
         if ($$3.a(200) == 0) {
            $$1.a($$4, $$5, $$6, awp.da, awq.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      } else {
         $$1.b(ly.at, $$4 + 0.5, $$5, $$6 + 0.5, 0.0, 0.04, 0.0);
         $$1.b(ly.at, $$4 + (double)$$3.i(), $$5 + (double)$$3.i(), $$6 + (double)$$3.i(), 0.0, 0.04, 0.0);
         if ($$3.a(200) == 0) {
            $$1.a($$4, $$5, $$6, awp.cY, awq.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      }
   }

   @Override
   protected ebe a(ebe $$0, dka $$1, dkm $$2, iv $$3, jb $$4, iv $$5, ebe $$6, azx $$7) {
      $$2.a($$3, exp.c, exp.c.a($$1));
      if (!$$0.a($$1, $$3) || $$4 == jb.a || $$4 == jb.b && !$$6.a(dne.nJ) && o($$6)) {
         $$2.a($$3, this, 5);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(ebe $$0, dka $$1, iv $$2) {
      ebe $$3 = $$1.a_($$2.e());
      return $$3.a(dne.nJ) || $$3.a(dne.lp) || $$3.a(dne.en);
   }

   @Override
   protected fgk a(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return fgh.a();
   }

   @Override
   protected dtp a_(ebe $$0) {
      return dtp.a;
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(b);
   }

   @Override
   public czy a(@Nullable bxu $$0, djy $$1, iv $$2, ebe $$3) {
      $$1.a($$2, dne.a.m(), 11);
      return new czy(dac.rp);
   }

   @Override
   public Optional<awo> at_() {
      return exp.c.j();
   }
}
