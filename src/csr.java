import java.util.UUID;
import javax.annotation.Nullable;

public class csr extends cso {
   private long a = 0L;

   public csr(bwr<? extends csr> $$0, djm $$1) {
      super($$0, $$1);
   }

   public csr(djm $$0, bxj $$1, czn $$2) {
      super(bwr.Q, $$1, $$0, $$2);
   }

   @Override
   protected czj g() {
      return czr.tn;
   }

   @Override
   protected void c(@Nullable UUID $$0) {
      this.j();
      super.c($$0);
      this.m();
   }

   @Override
   public void c(@Nullable bwi $$0) {
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
   protected bwi b(UUID $$0) {
      if (this.dU() instanceof arq $$1) {
         bwi $$3 = super.b($$0);
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
   protected void a(fez $$0) {
      super.a($$0);
      $$0.a().a(this.dV().b(this, this.q()), 0.0F);
   }

   @Override
   protected void a(ffa $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < 32; $$1++) {
         this.dU().a(ly.af, this.dz(), this.dB() + this.ae.j() * 2.0, this.dF(), this.ae.k(), 0.0, this.ae.k());
      }

      if (this.dU() instanceof arq $$2 && !this.dP()) {
         bwi $$4 = this.q();
         if ($$4 != null && a($$4, $$2)) {
            ffc $$5 = this.bz();
            if ($$4 instanceof arr $$6) {
               if ($$6.f.c()) {
                  if (this.ae.i() < 0.05F && $$2.O().c(dji.f)) {
                     coe $$7 = bwr.O.a($$2, bwq.k);
                     if ($$7 != null) {
                        $$7.b($$4.dz(), $$4.dB(), $$4.dF(), $$4.dK(), $$4.dM());
                        $$2.b($$7);
                     }
                  }

                  if (this.aA()) {
                     $$4.ay();
                  }

                  arr $$8 = $$6.a(new eya($$2, $$5, ffc.c, 0.0F, 0.0F, bxx.a(bxx.k, bxx.l), eya.a));
                  if ($$8 != null) {
                     $$8.k();
                     $$8.gO();
                     $$8.a($$6.y(), this.dV().m(), 5.0F);
                  }

                  this.a($$2, $$5);
               }
            } else {
               bwi $$9 = $$4.b(new eya($$2, $$5, $$4.dx(), $$4.dK(), $$4.dM(), eya.a));
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

   private static boolean a(bwi $$0, djm $$1) {
      if ($$0.dU().aj() == $$1.aj()) {
         return !($$0 instanceof bxj $$2) ? $$0.bI() : $$2.bI() && !$$2.fQ();
      } else {
         return $$0.n(true);
      }
   }

   @Override
   public void h() {
      int $$0;
      int $$1;
      bwi $$2;
      label30: {
         $$0 = jy.b(this.ds().a());
         $$1 = jy.b(this.ds().c());
         $$2 = this.q();
         if ($$2 instanceof arr $$3 && !$$2.bI() && $$3.y().O().c(dji.aa)) {
            this.aq();
            break label30;
         }

         super.h();
      }

      if (this.bI()) {
         iv $$4 = iv.a((jp)this.ds());
         if ((--this.a <= 0L || $$0 != jy.a($$4.u()) || $$1 != jy.a($$4.w())) && $$2 instanceof arr $$5) {
            this.a = $$5.c(this);
         }
      }
   }

   private void a(djm $$0, ffc $$1) {
      $$0.a(null, $$1.d, $$1.e, $$1.f, awn.vj, awo.h);
   }

   @Nullable
   @Override
   public bwi b(eya $$0) {
      bwi $$1 = super.b($$0);
      if ($$1 != null) {
         $$1.f(iv.a((jp)$$1.ds()));
      }

      return $$1;
   }

   @Override
   public boolean a(djm $$0, djm $$1) {
      return $$0.aj() == djm.k && $$1.aj() == djm.i && this.q() instanceof arr $$2 ? super.a($$0, $$1) && $$2.i : super.a($$0, $$1);
   }

   @Override
   protected void a(eat $$0) {
      super.a($$0);
      if ($$0.a(dmt.ll) && this.q() instanceof arr $$1) {
         $$1.a($$0);
      }
   }

   @Override
   public void b(bwi.d $$0) {
      if ($$0 != bwi.d.d) {
         this.j();
      }

      super.b($$0);
   }

   @Override
   public void a(boolean $$0, iv $$1) {
      bwi.a(this, $$0, $$1);
   }

   @Override
   public void l(boolean $$0) {
      bwi.b(this, $$0);
   }
}
