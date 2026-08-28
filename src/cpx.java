import java.util.UUID;
import javax.annotation.Nullable;

public class cpx extends cpu {
   private long a = 0L;

   public cpx(bus<? extends cpx> $$0, dfm $$1) {
      super($$0, $$1);
   }

   public cpx(dfm $$0, bvh $$1, cwm $$2) {
      super(bus.P, $$1, $$0, $$2);
   }

   @Override
   protected cwi l() {
      return cwq.sw;
   }

   @Override
   protected void c(UUID $$0) {
      this.n();
      super.c($$0);
      this.q();
   }

   @Override
   public void c(@Nullable bul $$0) {
      this.n();
      super.c($$0);
      this.q();
   }

   private void n() {
      if (this.p() instanceof arq $$1) {
         $$1.b(this);
      }
   }

   private void q() {
      if (this.p() instanceof arq $$1) {
         $$1.a(this);
      }
   }

   @Nullable
   @Override
   protected bul b(UUID $$0) {
      if (this.dV() instanceof arp $$1) {
         bul $$3 = super.b($$0);
         if ($$3 != null) {
            return $$3;
         } else {
            for (arp $$4 : $$1.p().L()) {
               if ($$4 != $$1) {
                  $$3 = $$4.a($$0);
                  if ($$3 != null) {
                     return $$3;
                  }
               }
            }

            return null;
         }
      } else {
         return null;
      }
   }

   @Override
   protected void a(ezv $$0) {
      super.a($$0);
      $$0.a().a(this.dW().b(this, this.p()), 0.0F);
   }

   @Override
   protected void a(ezw $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < 32; $$1++) {
         this.dV().a(ls.ac, this.dA(), this.dC() + this.ae.j() * 2.0, this.dG(), this.ae.k(), 0.0, this.ae.k());
      }

      if (this.dV() instanceof arp $$2 && !this.dQ()) {
         bul $$4 = this.p();
         if ($$4 != null && a($$4, $$2)) {
            if ($$4.bZ()) {
               $$4.ao();
            }

            ezy $$8;
            if (this.dy().h() > 0.0) {
               ezt $$5 = $$4.cR();
               ezy $$6 = new ezy($$5.b(), $$5.c(), $$5.d()).c(0.5000099999997474);
               ezy $$7 = new ezy(Math.signum(this.dy().d), Math.signum(this.dy().e), Math.signum(this.dy().f));
               $$8 = $$7.h($$6).b(0.0, $$5.c() * 0.5, 0.0);
            } else {
               $$8 = ezy.c;
            }

            ezy $$10 = this.dt().d($$8);
            if ($$4 instanceof arq $$11) {
               if ($$11.f.c()) {
                  if (this.ae.i() < 0.05F && $$2.N().b(dfi.e)) {
                     clp $$12 = bus.N.a($$2, bur.k);
                     if ($$12 != null) {
                        $$12.b($$4.dA(), $$4.dC(), $$4.dG(), $$4.dL(), $$4.dN());
                        $$2.b($$12);
                     }
                  }

                  cou $$13 = $$11.a(new est($$2, $$10, ezy.c, 0.0F, 0.0F, bvv.a(bvv.k, bvv.l), est.a));
                  if ($$13 != null) {
                     $$13.k();
                     $$13.gL();
                     $$13.a($$11.y(), this.dW().m(), 5.0F);
                  }

                  this.a($$2, $$10);
               }
            } else {
               bul $$14 = $$4.b(new est($$2, $$10, $$4.dy(), $$4.dL(), $$4.dN(), est.a));
               if ($$14 != null) {
                  $$14.k();
               }

               this.a($$2, $$10);
            }

            this.at();
            return;
         }

         this.at();
         return;
      }
   }

   private static boolean a(bul $$0, dfm $$1) {
      if ($$0.dV().ag() == $$1.ag()) {
         return !($$0 instanceof bvh $$2) ? $$0.bL() : $$2.bL() && !$$2.fP();
      } else {
         return $$0.o(true);
      }
   }

   @Override
   public void h() {
      int $$0;
      int $$1;
      bul $$2;
      label26: {
         $$0 = kj.b(this.dt().a());
         $$1 = kj.b(this.dt().c());
         $$2 = this.p();
         if ($$2 instanceof arq $$3 && !$$2.bL() && $$3.y().N().b(dfi.Y)) {
            this.at();
            break label26;
         }

         super.h();
      }

      jh $$4 = jh.a((ka)this.dt());
      if ((--this.a <= 0L || $$0 != kj.a($$4.u()) || $$1 != kj.a($$4.w())) && $$2 instanceof arq $$5) {
         this.a = $$5.c(this);
      }
   }

   private void a(dfm $$0, ezy $$1) {
      $$0.a(null, $$1.d, $$1.e, $$1.f, awn.uu, awo.h);
   }

   @Nullable
   @Override
   public bul b(est $$0) {
      bul $$1 = super.b($$0);
      if ($$1 != null) {
         $$1.f(jh.a((ka)$$1.dt()));
      }

      return $$1;
   }

   @Override
   public boolean a(dfm $$0, dfm $$1) {
      return $$0.ag() == dfm.k && $$1.ag() == dfm.i && this.p() instanceof arq $$2 ? super.a($$0, $$1) && $$2.i : super.a($$0, $$1);
   }

   @Override
   protected void a(dvv $$0) {
      super.a($$0);
      if ($$0.a(dis.kF) && this.p() instanceof arq $$1) {
         $$1.a($$0);
      }
   }

   @Override
   public void a(bul.c $$0) {
      if ($$0 != bul.c.d) {
         this.n();
      }

      super.a($$0);
   }
}
