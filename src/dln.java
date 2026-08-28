import com.mojang.serialization.MapCodec;
import java.util.Optional;

public abstract class dln extends dma {
   private static final int b = 8;
   private static final int c = 1;
   private static final int d = 3;
   private final float e;
   protected static final ffc a = dma.b(16.0, 0.0, 1.0);

   public dln(dzy.d $$0, float $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected abstract MapCodec<? extends dln> a();

   @Override
   public dzz a(dcr $$0) {
      return a($$0.q(), $$0.a());
   }

   public static dzz a(dib $$0, iu $$1) {
      iu $$2 = $$1.e();
      dzz $$3 = $$0.a_($$2);
      return dtt.o($$3) ? dmc.cA.m() : ((dpb)dmc.cz).b($$0, $$1);
   }

   @Override
   protected ffc a(dzz $$0, dib $$1, iu $$2, fen $$3) {
      return a;
   }

   @Override
   public void a(dzz $$0, div $$1, iu $$2, azv $$3) {
      if ($$3.a(24) == 0) {
         $$1.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, awn.ju, awo.e, 1.0F + $$3.i(), $$3.i() * 0.7F + 0.3F, false);
      }

      iu $$4 = $$2.e();
      dzz $$5 = $$1.a_($$4);
      if (!this.g($$5) && !$$5.c($$1, $$4, ja.b)) {
         if (this.g($$1.a_($$2.h()))) {
            for (int $$10 = 0; $$10 < 2; $$10++) {
               double $$11 = (double)$$2.u() + $$3.j() * 0.1F;
               double $$12 = (double)$$2.v() + $$3.j();
               double $$13 = (double)$$2.w() + $$3.j();
               $$1.a(lx.aa, $$11, $$12, $$13, 0.0, 0.0, 0.0);
            }
         }

         if (this.g($$1.a_($$2.i()))) {
            for (int $$14 = 0; $$14 < 2; $$14++) {
               double $$15 = (double)($$2.u() + 1) - $$3.j() * 0.1F;
               double $$16 = (double)$$2.v() + $$3.j();
               double $$17 = (double)$$2.w() + $$3.j();
               $$1.a(lx.aa, $$15, $$16, $$17, 0.0, 0.0, 0.0);
            }
         }

         if (this.g($$1.a_($$2.f()))) {
            for (int $$18 = 0; $$18 < 2; $$18++) {
               double $$19 = (double)$$2.u() + $$3.j();
               double $$20 = (double)$$2.v() + $$3.j();
               double $$21 = (double)$$2.w() + $$3.j() * 0.1F;
               $$1.a(lx.aa, $$19, $$20, $$21, 0.0, 0.0, 0.0);
            }
         }

         if (this.g($$1.a_($$2.g()))) {
            for (int $$22 = 0; $$22 < 2; $$22++) {
               double $$23 = (double)$$2.u() + $$3.j();
               double $$24 = (double)$$2.v() + $$3.j();
               double $$25 = (double)($$2.w() + 1) - $$3.j() * 0.1F;
               $$1.a(lx.aa, $$23, $$24, $$25, 0.0, 0.0, 0.0);
            }
         }

         if (this.g($$1.a_($$2.d()))) {
            for (int $$26 = 0; $$26 < 2; $$26++) {
               double $$27 = (double)$$2.u() + $$3.j();
               double $$28 = (double)($$2.v() + 1) - $$3.j() * 0.1F;
               double $$29 = (double)$$2.w() + $$3.j();
               $$1.a(lx.aa, $$27, $$28, $$29, 0.0, 0.0, 0.0);
            }
         }
      } else {
         for (int $$6 = 0; $$6 < 3; $$6++) {
            double $$7 = (double)$$2.u() + $$3.j();
            double $$8 = (double)$$2.v() + $$3.j() * 0.5 + 0.5;
            double $$9 = (double)$$2.w() + $$3.j();
            $$1.a(lx.aa, $$7, $$8, $$9, 0.0, 0.0, 0.0);
         }
      }
   }

   protected abstract boolean g(dzz var1);

   @Override
   protected void a(dzz $$0, div $$1, iu $$2, bwd $$3) {
      if (!$$3.bi()) {
         if ($$3.aG() < 0) {
            $$3.h($$3.aG() + 1);
         } else if ($$3 instanceof arr) {
            int $$4 = $$1.C_().b(1, 3);
            $$3.h($$3.aG() + $$4);
         }

         if ($$3.aG() >= 0) {
            $$3.e(8.0F);
         }
      }

      $$3.a($$1.al().a(), this.e);
      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dzz $$0, div $$1, iu $$2, dzz $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         if (a($$1)) {
            Optional<exf> $$5 = exf.a((diw)$$1, $$2, ja.a.a);
            if ($$5.isPresent()) {
               $$5.get().a($$1);
               return;
            }
         }

         if (!$$0.a((diy)$$1, $$2)) {
            $$1.a($$2, false);
         }
      }
   }

   private static boolean a(div $$0) {
      return $$0.aj() == div.i || $$0.aj() == div.j;
   }

   @Override
   protected void a(div $$0, cqy $$1, iu $$2, dzz $$3) {
   }

   @Override
   public dzz a(div $$0, iu $$1, dzz $$2, cqy $$3) {
      if (!$$0.w_()) {
         $$0.a(null, 1009, $$1, 0);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   public static boolean a(div $$0, iu $$1, ja $$2) {
      dzz $$3 = $$0.a_($$1);
      return !$$3.l() ? false : a($$0, $$1).a((diy)$$0, $$1) || b($$0, $$1, $$2);
   }

   private static boolean b(div $$0, iu $$1, ja $$2) {
      if (!a($$0)) {
         return false;
      } else {
         iu.a $$3 = $$1.k();
         boolean $$4 = false;

         for (ja $$5 : ja.values()) {
            if ($$0.a_($$3.g($$1).c($$5)).a(dmc.cw)) {
               $$4 = true;
               break;
            }
         }

         if (!$$4) {
            return false;
         } else {
            ja.a $$6 = $$2.o().d() ? $$2.i().o() : ja.c.a.b($$0.A);
            return exf.a((diw)$$0, $$1, $$6).isPresent();
         }
      }
   }
}
