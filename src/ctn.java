import java.util.UUID;
import javax.annotation.Nullable;

public class ctn extends ctk {
   private long a = 0L;

   public ctn(bxn<? extends ctn> $$0, dkj $$1) {
      super($$0, $$1);
   }

   public ctn(dkj $$0, byf $$1, dak $$2) {
      super(bxn.R, $$1, $$0, $$2);
   }

   @Override
   protected dag g() {
      return dao.tn;
   }

   @Override
   protected void c(@Nullable UUID $$0) {
      this.j();
      super.c($$0);
      this.m();
   }

   @Override
   public void c(@Nullable bxe $$0) {
      this.j();
      super.c($$0);
      this.m();
   }

   private void j() {
      if (this.q() instanceof asc $$0) {
         $$0.b(this);
      }
   }

   private void m() {
      if (this.q() instanceof asc $$0) {
         $$0.a(this);
      }
   }

   @Nullable
   @Override
   protected bxe b(UUID $$0) {
      if (this.dV() instanceof asb $$1) {
         bxe $$3 = super.b($$0);
         if ($$3 != null) {
            return $$3;
         } else {
            for (asb $$4 : $$1.p().L()) {
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
   protected void a(ffz $$0) {
      super.a($$0);
      $$0.a().a(this.dW().b(this, this.q()), 0.0F);
   }

   @Override
   protected void a(fga $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < 32; $$1++) {
         this.dV().a(lz.af, this.dA(), this.dC() + this.ae.j() * 2.0, this.dG(), this.ae.k(), 0.0, this.ae.k());
      }

      if (this.dV() instanceof asb $$2 && !this.dQ()) {
         bxe $$4 = this.q();
         if ($$4 != null && a($$4, $$2)) {
            fgc $$5 = this.bA();
            if ($$4 instanceof asc $$6) {
               if ($$6.f.c()) {
                  if (this.ae.i() < 0.05F && $$2.O().c(dkf.f)) {
                     cpb $$7 = bxn.P.a($$2, bxm.k);
                     if ($$7 != null) {
                        $$7.b($$4.dA(), $$4.dC(), $$4.dG(), $$4.dL(), $$4.dN());
                        $$2.b($$7);
                     }
                  }

                  if (this.aA()) {
                     $$4.ay();
                  }

                  asc $$8 = $$6.a(new eza($$2, $$5, fgc.c, 0.0F, 0.0F, byt.a(byt.k, byt.l), eza.a));
                  if ($$8 != null) {
                     $$8.k();
                     $$8.gP();
                     $$8.a($$6.y(), this.dW().m(), 5.0F);
                  }

                  this.a($$2, $$5);
               }
            } else {
               bxe $$9 = $$4.b(new eza($$2, $$5, $$4.dy(), $$4.dL(), $$4.dN(), eza.a));
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

   private static boolean a(bxe $$0, dkj $$1) {
      if ($$0.dV().aj() == $$1.aj()) {
         return !($$0 instanceof byf $$2) ? $$0.bJ() : $$2.bJ() && !$$2.fR();
      } else {
         return $$0.n(true);
      }
   }

   @Override
   public void h() {
      int $$0;
      int $$1;
      bxe $$2;
      label30: {
         $$0 = jz.b(this.dt().a());
         $$1 = jz.b(this.dt().c());
         $$2 = this.q();
         if ($$2 instanceof asc $$3 && !$$2.bJ() && $$3.y().O().c(dkf.aa)) {
            this.aq();
            break label30;
         }

         super.h();
      }

      if (this.bJ()) {
         iw $$4 = iw.a((jq)this.dt());
         if ((--this.a <= 0L || $$0 != jz.a($$4.u()) || $$1 != jz.a($$4.w())) && $$2 instanceof asc $$5) {
            this.a = $$5.c(this);
         }
      }
   }

   private void a(dkj $$0, fgc $$1) {
      $$0.a(null, $$1.d, $$1.e, $$1.f, awy.vj, awz.h);
   }

   @Nullable
   @Override
   public bxe b(eza $$0) {
      bxe $$1 = super.b($$0);
      if ($$1 != null) {
         $$1.f(iw.a((jq)$$1.dt()));
      }

      return $$1;
   }

   @Override
   public boolean a(dkj $$0, dkj $$1) {
      return $$0.aj() == dkj.k && $$1.aj() == dkj.i && this.q() instanceof asc $$2 ? super.a($$0, $$1) && $$2.i : super.a($$0, $$1);
   }

   @Override
   protected void a(ebq $$0) {
      super.a($$0);
      if ($$0.a(dnq.ll) && this.q() instanceof asc $$1) {
         $$1.a($$0);
      }
   }

   @Override
   public void b(bxe.d $$0) {
      if ($$0 != bxe.d.d) {
         this.j();
      }

      super.b($$0);
   }

   @Override
   public void a(boolean $$0, iw $$1) {
      bxe.a(this, $$0, $$1);
   }

   @Override
   public void l(boolean $$0) {
      bxe.b(this, $$0);
   }
}
