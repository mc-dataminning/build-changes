import com.mojang.serialization.MapCodec;
import java.util.Optional;

public abstract class dnb extends dno {
   private static final int b = 8;
   private static final int c = 1;
   private static final int d = 3;
   private final float e;
   protected static final fgw a = dno.b(16.0, 0.0, 1.0);

   public dnb(ebp.d $$0, float $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected abstract MapCodec<? extends dnb> a();

   @Override
   public ebq a(ded $$0) {
      return a($$0.q(), $$0.a());
   }

   public static ebq a(djn $$0, iw $$1) {
      iw $$2 = $$1.e();
      ebq $$3 = $$0.a_($$2);
      return dvj.o($$3) ? dnq.cC.m() : ((dqq)dnq.cB).b($$0, $$1);
   }

   @Override
   protected fgw a(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return a;
   }

   @Override
   public void a(ebq $$0, dkj $$1, iw $$2, bai $$3) {
      if ($$3.a(24) == 0) {
         $$1.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, awy.jx, awz.e, 1.0F + $$3.i(), $$3.i() * 0.7F + 0.3F, false);
      }

      iw $$4 = $$2.e();
      ebq $$5 = $$1.a_($$4);
      if (!this.g($$5) && !$$5.c($$1, $$4, jc.b)) {
         if (this.g($$1.a_($$2.h()))) {
            for (int $$10 = 0; $$10 < 2; $$10++) {
               double $$11 = (double)$$2.u() + $$3.j() * 0.1F;
               double $$12 = (double)$$2.v() + $$3.j();
               double $$13 = (double)$$2.w() + $$3.j();
               $$1.a(lz.aa, $$11, $$12, $$13, 0.0, 0.0, 0.0);
            }
         }

         if (this.g($$1.a_($$2.i()))) {
            for (int $$14 = 0; $$14 < 2; $$14++) {
               double $$15 = (double)($$2.u() + 1) - $$3.j() * 0.1F;
               double $$16 = (double)$$2.v() + $$3.j();
               double $$17 = (double)$$2.w() + $$3.j();
               $$1.a(lz.aa, $$15, $$16, $$17, 0.0, 0.0, 0.0);
            }
         }

         if (this.g($$1.a_($$2.f()))) {
            for (int $$18 = 0; $$18 < 2; $$18++) {
               double $$19 = (double)$$2.u() + $$3.j();
               double $$20 = (double)$$2.v() + $$3.j();
               double $$21 = (double)$$2.w() + $$3.j() * 0.1F;
               $$1.a(lz.aa, $$19, $$20, $$21, 0.0, 0.0, 0.0);
            }
         }

         if (this.g($$1.a_($$2.g()))) {
            for (int $$22 = 0; $$22 < 2; $$22++) {
               double $$23 = (double)$$2.u() + $$3.j();
               double $$24 = (double)$$2.v() + $$3.j();
               double $$25 = (double)($$2.w() + 1) - $$3.j() * 0.1F;
               $$1.a(lz.aa, $$23, $$24, $$25, 0.0, 0.0, 0.0);
            }
         }

         if (this.g($$1.a_($$2.d()))) {
            for (int $$26 = 0; $$26 < 2; $$26++) {
               double $$27 = (double)$$2.u() + $$3.j();
               double $$28 = (double)($$2.v() + 1) - $$3.j() * 0.1F;
               double $$29 = (double)$$2.w() + $$3.j();
               $$1.a(lz.aa, $$27, $$28, $$29, 0.0, 0.0, 0.0);
            }
         }
      } else {
         for (int $$6 = 0; $$6 < 3; $$6++) {
            double $$7 = (double)$$2.u() + $$3.j();
            double $$8 = (double)$$2.v() + $$3.j() * 0.5 + 0.5;
            double $$9 = (double)$$2.w() + $$3.j();
            $$1.a(lz.aa, $$7, $$8, $$9, 0.0, 0.0, 0.0);
         }
      }
   }

   protected abstract boolean g(ebq var1);

   @Override
   protected void a(ebq $$0, dkj $$1, iw $$2, bxe $$3, bxx $$4) {
      $$4.a(bxy.b);
      $$4.b(bxy.b, $$0x -> $$0x.a($$0x.dV().al().a(), this.e));
   }

   public static void a(bxe $$0) {
      if (!$$0.bh()) {
         if ($$0.aE() < 0) {
            $$0.h($$0.aE() + 1);
         } else if ($$0 instanceof asc) {
            int $$1 = $$0.dV().G_().b(1, 3);
            $$0.h($$0.aE() + $$1);
         }

         if ($$0.aE() >= 0) {
            $$0.e(8.0F);
         }
      }
   }

   @Override
   protected void a(ebq $$0, dkj $$1, iw $$2, ebq $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         if (a($$1)) {
            Optional<eyz> $$5 = eyz.a((dkk)$$1, $$2, jc.a.a);
            if ($$5.isPresent()) {
               $$5.get().a($$1);
               return;
            }
         }

         if (!$$0.a((dkm)$$1, $$2)) {
            $$1.a($$2, false);
         }
      }
   }

   private static boolean a(dkj $$0) {
      return $$0.aj() == dkj.i || $$0.aj() == dkj.j;
   }

   @Override
   protected void a(dkj $$0, csi $$1, iw $$2, ebq $$3) {
   }

   @Override
   public ebq a(dkj $$0, iw $$1, ebq $$2, csi $$3) {
      if (!$$0.A_()) {
         $$0.a(null, 1009, $$1, 0);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   public static boolean a(dkj $$0, iw $$1, jc $$2) {
      ebq $$3 = $$0.a_($$1);
      return !$$3.l() ? false : a($$0, $$1).a((dkm)$$0, $$1) || b($$0, $$1, $$2);
   }

   private static boolean b(dkj $$0, iw $$1, jc $$2) {
      if (!a($$0)) {
         return false;
      } else {
         iw.a $$3 = $$1.k();
         boolean $$4 = false;

         for (jc $$5 : jc.values()) {
            if ($$0.a_($$3.g($$1).c($$5)).a(dnq.cy)) {
               $$4 = true;
               break;
            }
         }

         if (!$$4) {
            return false;
         } else {
            jc.a $$6 = $$2.o().d() ? $$2.i().o() : jc.c.a.b($$0.A);
            return eyz.a((dkk)$$0, $$1, $$6).isPresent();
         }
      }
   }
}
