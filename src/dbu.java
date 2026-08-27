import com.mojang.serialization.MapCodec;
import java.util.Optional;

public abstract class dbu extends dch {
   private static final int c = 8;
   private final float d;
   protected static final float a = 1.0F;
   protected static final etc b = dch.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);

   public dbu(dph.d $$0, float $$1) {
      super($$0);
      this.d = $$1;
   }

   @Override
   protected abstract MapCodec<? extends dbu> a();

   @Override
   public dpi a(cux $$0) {
      return a($$0.q(), $$0.a());
   }

   public static dpi a(cym $$0, id $$1) {
      id $$2 = $$1.d();
      dpi $$3 = $$0.a_($$2);
      return djr.m($$3) ? dcj.cs.n() : ((dfh)dcj.cr).b($$0, $$1);
   }

   @Override
   protected etc a(dpi $$0, cym $$1, id $$2, eso $$3) {
      return b;
   }

   @Override
   public void a(dpi $$0, czg $$1, id $$2, axt $$3) {
      if ($$3.a(24) == 0) {
         $$1.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, auo.iO, aup.e, 1.0F + $$3.i(), $$3.i() * 0.7F + 0.3F, false);
      }

      id $$4 = $$2.d();
      dpi $$5 = $$1.a_($$4);
      if (!this.f($$5) && !$$5.d($$1, $$4, ij.b)) {
         if (this.f($$1.a_($$2.g()))) {
            for (int $$10 = 0; $$10 < 2; $$10++) {
               double $$11 = (double)$$2.u() + $$3.j() * 0.1F;
               double $$12 = (double)$$2.v() + $$3.j();
               double $$13 = (double)$$2.w() + $$3.j();
               $$1.a(kn.V, $$11, $$12, $$13, 0.0, 0.0, 0.0);
            }
         }

         if (this.f($$1.a_($$2.h()))) {
            for (int $$14 = 0; $$14 < 2; $$14++) {
               double $$15 = (double)($$2.u() + 1) - $$3.j() * 0.1F;
               double $$16 = (double)$$2.v() + $$3.j();
               double $$17 = (double)$$2.w() + $$3.j();
               $$1.a(kn.V, $$15, $$16, $$17, 0.0, 0.0, 0.0);
            }
         }

         if (this.f($$1.a_($$2.e()))) {
            for (int $$18 = 0; $$18 < 2; $$18++) {
               double $$19 = (double)$$2.u() + $$3.j();
               double $$20 = (double)$$2.v() + $$3.j();
               double $$21 = (double)$$2.w() + $$3.j() * 0.1F;
               $$1.a(kn.V, $$19, $$20, $$21, 0.0, 0.0, 0.0);
            }
         }

         if (this.f($$1.a_($$2.f()))) {
            for (int $$22 = 0; $$22 < 2; $$22++) {
               double $$23 = (double)$$2.u() + $$3.j();
               double $$24 = (double)$$2.v() + $$3.j();
               double $$25 = (double)($$2.w() + 1) - $$3.j() * 0.1F;
               $$1.a(kn.V, $$23, $$24, $$25, 0.0, 0.0, 0.0);
            }
         }

         if (this.f($$1.a_($$2.c()))) {
            for (int $$26 = 0; $$26 < 2; $$26++) {
               double $$27 = (double)$$2.u() + $$3.j();
               double $$28 = (double)($$2.v() + 1) - $$3.j() * 0.1F;
               double $$29 = (double)$$2.w() + $$3.j();
               $$1.a(kn.V, $$27, $$28, $$29, 0.0, 0.0, 0.0);
            }
         }
      } else {
         for (int $$6 = 0; $$6 < 3; $$6++) {
            double $$7 = (double)$$2.u() + $$3.j();
            double $$8 = (double)$$2.v() + $$3.j() * 0.5 + 0.5;
            double $$9 = (double)$$2.w() + $$3.j();
            $$1.a(kn.V, $$7, $$8, $$9, 0.0, 0.0, 0.0);
         }
      }
   }

   protected abstract boolean f(dpi var1);

   @Override
   protected void a(dpi $$0, czg $$1, id $$2, bqa $$3) {
      if (!$$3.bb()) {
         $$3.i($$3.az() + 1);
         if ($$3.az() == 0) {
            $$3.g(8);
         }
      }

      $$3.a($$1.ai().a(), this.d);
      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void b(dpi $$0, czg $$1, id $$2, dpi $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         if (a($$1)) {
            Optional<emb> $$5 = emb.a($$1, $$2, ij.a.a);
            if ($$5.isPresent()) {
               $$5.get().b();
               return;
            }
         }

         if (!$$0.a((czj)$$1, $$2)) {
            $$1.a($$2, false);
         }
      }
   }

   private static boolean a(czg $$0) {
      return $$0.ae() == czg.h || $$0.ae() == czg.i;
   }

   @Override
   protected void a(czg $$0, cka $$1, id $$2, dpi $$3) {
   }

   @Override
   public dpi a(czg $$0, id $$1, dpi $$2, cka $$3) {
      if (!$$0.x_()) {
         $$0.a(null, 1009, $$1, 0);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   public static boolean a(czg $$0, id $$1, ij $$2) {
      dpi $$3 = $$0.a_($$1);
      return !$$3.i() ? false : a($$0, $$1).a((czj)$$0, $$1) || b($$0, $$1, $$2);
   }

   private static boolean b(czg $$0, id $$1, ij $$2) {
      if (!a($$0)) {
         return false;
      } else {
         id.a $$3 = $$1.j();
         boolean $$4 = false;

         for (ij $$5 : ij.values()) {
            if ($$0.a_($$3.g($$1).c($$5)).a(dcj.co)) {
               $$4 = true;
               break;
            }
         }

         if (!$$4) {
            return false;
         } else {
            ij.a $$6 = $$2.o().d() ? $$2.i().o() : ij.c.a.b($$0.z);
            return emb.a($$0, $$1, $$6).isPresent();
         }
      }
   }
}
