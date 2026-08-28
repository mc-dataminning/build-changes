import java.util.UUID;
import javax.annotation.Nullable;

public class cpl extends cpi {
   public cpl(bug<? extends cpl> $$0, dev $$1) {
      super($$0, $$1);
   }

   public cpl(dev $$0, buv $$1, cvx $$2) {
      super(bug.G, $$1, $$0, $$2);
   }

   @Override
   protected cvt o() {
      return cwb.sg;
   }

   @Nullable
   @Override
   protected btz b(UUID $$0) {
      if (this.dX() instanceof arm $$1) {
         btz $$3 = super.b($$0);
         if ($$3 != null) {
            return $$3;
         } else {
            for (arm $$4 : $$1.o().L()) {
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
   protected void a(eze $$0) {
      super.a($$0);
      $$0.a().a(this.dY().b(this, this.s()), 0.0F);
   }

   @Override
   protected void a(ezf $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < 32; $$1++) {
         this.dX().a(lq.ac, this.dC(), this.dE() + this.af.j() * 2.0, this.dI(), this.af.k(), 0.0, this.af.k());
      }

      if (this.dX() instanceof arm $$2 && !this.dS()) {
         btz $$4 = this.s();
         if ($$4 != null && a($$4, $$2)) {
            if ($$4.ca()) {
               $$4.ao();
            }

            ezh $$8;
            if (this.dA().h() > 0.0) {
               ezc $$5 = $$4.cS();
               ezh $$6 = new ezh($$5.b(), $$5.c(), $$5.d()).c(0.5000099999997474);
               ezh $$7 = new ezh(Math.signum(this.dA().d), Math.signum(this.dA().e), Math.signum(this.dA().f));
               $$8 = $$7.h($$6).b(0.0, $$5.c() * 0.5, 0.0);
            } else {
               $$8 = ezh.c;
            }

            ezh $$10 = this.dv().d($$8);
            if ($$4 instanceof arn $$11) {
               if ($$11.d.c()) {
                  if (this.af.i() < 0.05F && $$2.ac().b(der.e)) {
                     cld $$12 = bug.I.a($$2, buf.k);
                     if ($$12 != null) {
                        $$12.b($$4.dC(), $$4.dE(), $$4.dI(), $$4.dN(), $$4.dP());
                        $$2.b($$12);
                     }
                  }

                  coh $$13 = $$11.a(new esc($$2, $$10, ezh.c, 0.0F, 0.0F, bvj.j, esc.a));
                  if ($$13 != null) {
                     $$13.n();
                     $$13.gO();
                     $$13.a(this.dY().m(), 5.0F);
                  }

                  this.a($$2, $$10);
               }
            } else {
               btz $$14 = $$4.b(new esc($$2, $$10, $$4.dA(), $$4.dN(), $$4.dP(), esc.a));
               if ($$14 != null) {
                  $$14.n();
               }

               this.a($$2, $$10);
            }

            this.au();
            return;
         }

         this.au();
         return;
      }
   }

   private static boolean a(btz $$0, dev $$1) {
      if ($$0.dX().ag() == $$1.ag()) {
         return !($$0 instanceof buv $$2) ? $$0.bM() : $$2.bM() && !$$2.fT();
      } else {
         return $$0.o(true);
      }
   }

   @Override
   public void l() {
      btz $$0 = this.s();
      if ($$0 instanceof arn && !$$0.bM() && this.dX().ac().b(der.Y)) {
         this.au();
      } else {
         super.l();
      }
   }

   private void a(dev $$0, ezh $$1) {
      $$0.a(null, $$1.d, $$1.e, $$1.f, awk.uu, awl.h);
   }

   @Override
   public boolean a(dev $$0, dev $$1) {
      return $$0.ag() == dev.k && $$1.ag() == dev.i && this.s() instanceof arn $$2 ? super.a($$0, $$1) && $$2.g : super.a($$0, $$1);
   }

   @Override
   protected void a(dvd $$0) {
      super.a($$0);
      if ($$0.a(dia.kF) && this.s() instanceof arn $$1) {
         $$1.a($$0);
      }
   }
}
