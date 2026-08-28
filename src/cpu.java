import java.util.UUID;
import javax.annotation.Nullable;

public class cpu extends cpr {
   private long b = 0L;

   public cpu(bup<? extends cpu> $$0, dff $$1) {
      super($$0, $$1);
   }

   public cpu(dff $$0, bve $$1, cwf $$2) {
      super(bup.G, $$1, $$0, $$2);
   }

   @Override
   protected cwb o() {
      return cwj.sw;
   }

   @Override
   protected void c(UUID $$0) {
      this.q();
      super.c($$0);
      this.t();
   }

   @Override
   public void c(@Nullable bui $$0) {
      this.q();
      super.c($$0);
      this.t();
   }

   private void q() {
      if (this.s() instanceof arr $$1) {
         $$1.b(this);
      }
   }

   private void t() {
      if (this.s() instanceof arr $$1) {
         $$1.a(this);
      }
   }

   @Nullable
   @Override
   protected bui b(UUID $$0) {
      if (this.dY() instanceof arq $$1) {
         bui $$3 = super.b($$0);
         if ($$3 != null) {
            return $$3;
         } else {
            for (arq $$4 : $$1.o().L()) {
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
   protected void a(ezo $$0) {
      super.a($$0);
      $$0.a().a(this.dZ().b(this, this.s()), 0.0F);
   }

   @Override
   protected void a(ezp $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < 32; $$1++) {
         this.dY().a(ls.ac, this.dD(), this.dF() + this.af.j() * 2.0, this.dJ(), this.af.k(), 0.0, this.af.k());
      }

      if (this.dY() instanceof arq $$2 && !this.dT()) {
         bui $$4 = this.s();
         if ($$4 != null && a($$4, $$2)) {
            if ($$4.cb()) {
               $$4.ap();
            }

            ezr $$8;
            if (this.dB().h() > 0.0) {
               ezm $$5 = $$4.cT();
               ezr $$6 = new ezr($$5.b(), $$5.c(), $$5.d()).c(0.5000099999997474);
               ezr $$7 = new ezr(Math.signum(this.dB().d), Math.signum(this.dB().e), Math.signum(this.dB().f));
               $$8 = $$7.h($$6).b(0.0, $$5.c() * 0.5, 0.0);
            } else {
               $$8 = ezr.c;
            }

            ezr $$10 = this.dw().d($$8);
            if ($$4 instanceof arr $$11) {
               if ($$11.g.c()) {
                  if (this.af.i() < 0.05F && $$2.ac().b(dfb.e)) {
                     clm $$12 = bup.I.a($$2, buo.k);
                     if ($$12 != null) {
                        $$12.b($$4.dD(), $$4.dF(), $$4.dJ(), $$4.dO(), $$4.dQ());
                        $$2.b($$12);
                     }
                  }

                  cor $$13 = $$11.a(new esm($$2, $$10, ezr.c, 0.0F, 0.0F, bvs.a(bvs.k, bvs.l), esm.a));
                  if ($$13 != null) {
                     $$13.n();
                     $$13.gQ();
                     $$13.a(this.dZ().m(), 5.0F);
                  }

                  this.a($$2, $$10);
               }
            } else {
               bui $$14 = $$4.b(new esm($$2, $$10, $$4.dB(), $$4.dO(), $$4.dQ(), esm.a));
               if ($$14 != null) {
                  $$14.n();
               }

               this.a($$2, $$10);
            }

            this.av();
            return;
         }

         this.av();
         return;
      }
   }

   private static boolean a(bui $$0, dff $$1) {
      if ($$0.dY().ag() == $$1.ag()) {
         return !($$0 instanceof bve $$2) ? $$0.bN() : $$2.bN() && !$$2.fU();
      } else {
         return $$0.o(true);
      }
   }

   @Override
   public void l() {
      int $$0 = kj.b(this.dw().a());
      int $$1 = kj.b(this.dw().c());
      bui $$2 = this.s();
      if ($$2 instanceof arr && !$$2.bN() && this.dY().ac().b(dfb.Y)) {
         this.av();
      } else {
         super.l();
      }

      jh $$3 = jh.a((ka)this.dw());
      if ((--this.b <= 0L || $$0 != kj.a($$3.u()) || $$1 != kj.a($$3.w())) && $$2 instanceof arr $$4) {
         this.b = $$4.c(this);
      }
   }

   private void a(dff $$0, ezr $$1) {
      $$0.a(null, $$1.d, $$1.e, $$1.f, awo.uu, awp.h);
   }

   @Nullable
   @Override
   public bui b(esm $$0) {
      bui $$1 = super.b($$0);
      if ($$1 != null) {
         $$1.f(jh.a((ka)$$1.dw()));
      }

      return $$1;
   }

   @Override
   public boolean a(dff $$0, dff $$1) {
      return $$0.ag() == dff.k && $$1.ag() == dff.i && this.s() instanceof arr $$2 ? super.a($$0, $$1) && $$2.j : super.a($$0, $$1);
   }

   @Override
   protected void a(dvo $$0) {
      super.a($$0);
      if ($$0.a(dil.kF) && this.s() instanceof arr $$1) {
         $$1.a($$0);
      }
   }

   @Override
   public void a(bui.c $$0) {
      if ($$0 != bui.c.d) {
         this.q();
      }

      super.a($$0);
   }
}
