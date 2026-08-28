import java.util.UUID;
import javax.annotation.Nullable;

public class csc extends crz {
   private long a = 0L;

   public csc(bwm<? extends csc> $$0, div $$1) {
      super($$0, $$1);
   }

   public csc(div $$0, bxc $$1, cyy $$2) {
      super(bwm.Q, $$1, $$0, $$2);
   }

   @Override
   protected cyu g() {
      return czc.ti;
   }

   @Override
   protected void c(UUID $$0) {
      this.j();
      super.c($$0);
      this.m();
   }

   @Override
   public void c(@Nullable bwd $$0) {
      this.j();
      super.c($$0);
      this.m();
   }

   private void j() {
      if (this.q() instanceof arr $$0) {
         $$0.b(this);
      }
   }

   private void m() {
      if (this.q() instanceof arr $$0) {
         $$0.a(this);
      }
   }

   @Nullable
   @Override
   protected bwd b(UUID $$0) {
      if (this.dV() instanceof arq $$1) {
         bwd $$3 = super.b($$0);
         if ($$3 != null) {
            return $$3;
         } else {
            for (arq $$4 : $$1.p().L()) {
               if ($$4 != $$1) {
                  $$3 = $$4.b($$0);
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
   protected void a(fef $$0) {
      super.a($$0);
      $$0.a().a(this.dW().b(this, this.q()), 0.0F);
   }

   @Override
   protected void a(feg $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < 32; $$1++) {
         this.dV().a(lx.af, this.dA(), this.dC() + this.ae.j() * 2.0, this.dG(), this.ae.k(), 0.0, this.ae.k());
      }

      if (this.dV() instanceof arq $$2 && !this.dQ()) {
         bwd $$4 = this.q();
         if ($$4 != null && a($$4, $$2)) {
            fei $$5 = this.bB();
            if ($$4 instanceof arr $$6) {
               if ($$6.f.c()) {
                  if (this.ae.i() < 0.05F && $$2.O().c(dir.e)) {
                     cnq $$7 = bwm.O.a($$2, bwl.k);
                     if ($$7 != null) {
                        $$7.b($$4.dA(), $$4.dC(), $$4.dG(), $$4.dL(), $$4.dN());
                        $$2.b($$7);
                     }
                  }

                  if (this.aD()) {
                     $$4.aB();
                  }

                  arr $$8 = $$6.a(new exg($$2, $$5, fei.c, 0.0F, 0.0F, bxq.a(bxq.k, bxq.l), exg.a));
                  if ($$8 != null) {
                     $$8.k();
                     $$8.gO();
                     $$8.a($$6.y(), this.dW().m(), 5.0F);
                  }

                  this.a($$2, $$5);
               }
            } else {
               bwd $$9 = $$4.b(new exg($$2, $$5, $$4.dy(), $$4.dL(), $$4.dN(), exg.a));
               if ($$9 != null) {
                  $$9.k();
               }

               this.a($$2, $$5);
            }

            this.at();
            return;
         }

         this.at();
         return;
      }
   }

   private static boolean a(bwd $$0, div $$1) {
      if ($$0.dV().aj() == $$1.aj()) {
         return !($$0 instanceof bxc $$2) ? $$0.bK() : $$2.bK() && !$$2.fQ();
      } else {
         return $$0.n(true);
      }
   }

   @Override
   public void h() {
      int $$0;
      int $$1;
      bwd $$2;
      label30: {
         $$0 = jx.b(this.dt().a());
         $$1 = jx.b(this.dt().c());
         $$2 = this.q();
         if ($$2 instanceof arr $$3 && !$$2.bK() && $$3.y().O().c(dir.Z)) {
            this.at();
            break label30;
         }

         super.h();
      }

      if (this.bK()) {
         iu $$4 = iu.a((jo)this.dt());
         if ((--this.a <= 0L || $$0 != jx.a($$4.u()) || $$1 != jx.a($$4.w())) && $$2 instanceof arr $$5) {
            this.a = $$5.c(this);
         }
      }
   }

   private void a(div $$0, fei $$1) {
      $$0.a(null, $$1.d, $$1.e, $$1.f, awn.vg, awo.h);
   }

   @Nullable
   @Override
   public bwd b(exg $$0) {
      bwd $$1 = super.b($$0);
      if ($$1 != null) {
         $$1.f(iu.a((jo)$$1.dt()));
      }

      return $$1;
   }

   @Override
   public boolean a(div $$0, div $$1) {
      return $$0.aj() == div.k && $$1.aj() == div.i && this.q() instanceof arr $$2 ? super.a($$0, $$1) && $$2.i : super.a($$0, $$1);
   }

   @Override
   protected void a(dzz $$0) {
      super.a($$0);
      if ($$0.a(dmc.li) && this.q() instanceof arr $$1) {
         $$1.a($$0);
      }
   }

   @Override
   public void b(bwd.e $$0) {
      if ($$0 != bwd.e.d) {
         this.j();
      }

      super.b($$0);
   }

   @Override
   public void a(boolean $$0, iu $$1) {
      bwd.a(this, $$0, $$1);
   }

   @Override
   public void l(boolean $$0) {
      bwd.b(this, $$0);
   }
}
