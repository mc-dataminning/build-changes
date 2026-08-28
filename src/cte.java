import java.util.UUID;
import javax.annotation.Nullable;

public class cte extends ctb {
   private long a = 0L;

   public cte(bxe<? extends cte> $$0, djz $$1) {
      super($$0, $$1);
   }

   public cte(djz $$0, bxw $$1, daa $$2) {
      super(bxe.R, $$1, $$0, $$2);
   }

   @Override
   protected czw g() {
      return dae.tn;
   }

   @Override
   protected void c(@Nullable UUID $$0) {
      this.j();
      super.c($$0);
      this.m();
   }

   @Override
   public void c(@Nullable bwv $$0) {
      this.j();
      super.c($$0);
      this.m();
   }

   private void j() {
      if (this.q() instanceof arv $$0) {
         $$0.b(this);
      }
   }

   private void m() {
      if (this.q() instanceof arv $$0) {
         $$0.a(this);
      }
   }

   @Nullable
   @Override
   protected bwv b(UUID $$0) {
      if (this.dV() instanceof aru $$1) {
         bwv $$3 = super.b($$0);
         if ($$3 != null) {
            return $$3;
         } else {
            for (aru $$4 : $$1.p().L()) {
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
   protected void a(ffp $$0) {
      super.a($$0);
      $$0.a().a(this.dW().b(this, this.q()), 0.0F);
   }

   @Override
   protected void a(ffq $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < 32; $$1++) {
         this.dV().a(lz.af, this.dA(), this.dC() + this.ae.j() * 2.0, this.dG(), this.ae.k(), 0.0, this.ae.k());
      }

      if (this.dV() instanceof aru $$2 && !this.dQ()) {
         bwv $$4 = this.q();
         if ($$4 != null && a($$4, $$2)) {
            ffs $$5 = this.bA();
            if ($$4 instanceof arv $$6) {
               if ($$6.f.c()) {
                  if (this.ae.i() < 0.05F && $$2.O().c(djv.f)) {
                     cos $$7 = bxe.P.a($$2, bxd.k);
                     if ($$7 != null) {
                        $$7.b($$4.dA(), $$4.dC(), $$4.dG(), $$4.dL(), $$4.dN());
                        $$2.b($$7);
                     }
                  }

                  if (this.aA()) {
                     $$4.ay();
                  }

                  arv $$8 = $$6.a(new eyq($$2, $$5, ffs.c, 0.0F, 0.0F, byk.a(byk.k, byk.l), eyq.a));
                  if ($$8 != null) {
                     $$8.k();
                     $$8.gP();
                     $$8.a($$6.y(), this.dW().m(), 5.0F);
                  }

                  this.a($$2, $$5);
               }
            } else {
               bwv $$9 = $$4.b(new eyq($$2, $$5, $$4.dy(), $$4.dL(), $$4.dN(), eyq.a));
               if ($$9 != null) {
                  $$9.k();
               }

               this.a($$2, $$5);
            }

            this.aq();
            return;
         }

         this.aq();
         return;
      }
   }

   private static boolean a(bwv $$0, djz $$1) {
      if ($$0.dV().aj() == $$1.aj()) {
         return !($$0 instanceof bxw $$2) ? $$0.bJ() : $$2.bJ() && !$$2.fR();
      } else {
         return $$0.n(true);
      }
   }

   @Override
   public void h() {
      int $$0;
      int $$1;
      bwv $$2;
      label30: {
         $$0 = jz.b(this.dt().a());
         $$1 = jz.b(this.dt().c());
         $$2 = this.q();
         if ($$2 instanceof arv $$3 && !$$2.bJ() && $$3.y().O().c(djv.aa)) {
            this.aq();
            break label30;
         }

         super.h();
      }

      if (this.bJ()) {
         iw $$4 = iw.a((jq)this.dt());
         if ((--this.a <= 0L || $$0 != jz.a($$4.u()) || $$1 != jz.a($$4.w())) && $$2 instanceof arv $$5) {
            this.a = $$5.c(this);
         }
      }
   }

   private void a(djz $$0, ffs $$1) {
      $$0.a(null, $$1.d, $$1.e, $$1.f, awr.vj, aws.h);
   }

   @Nullable
   @Override
   public bwv b(eyq $$0) {
      bwv $$1 = super.b($$0);
      if ($$1 != null) {
         $$1.f(iw.a((jq)$$1.dt()));
      }

      return $$1;
   }

   @Override
   public boolean a(djz $$0, djz $$1) {
      return $$0.aj() == djz.k && $$1.aj() == djz.i && this.q() instanceof arv $$2 ? super.a($$0, $$1) && $$2.i : super.a($$0, $$1);
   }

   @Override
   protected void a(ebg $$0) {
      super.a($$0);
      if ($$0.a(dng.ll) && this.q() instanceof arv $$1) {
         $$1.a($$0);
      }
   }

   @Override
   public void b(bwv.d $$0) {
      if ($$0 != bwv.d.d) {
         this.j();
      }

      super.b($$0);
   }

   @Override
   public void a(boolean $$0, iw $$1) {
      bwv.a(this, $$0, $$1);
   }

   @Override
   public void l(boolean $$0) {
      bwv.b(this, $$0);
   }
}
