import javax.annotation.Nullable;

public class cgm extends cgk implements btq<cgt> {
   private static final ajs<Integer> bY = ajw.a(cgm.class, aju.b);
   private static final brz bZ = bsc.ab.n().a(bry.a().a(brx.a, 0.0F, bsc.ab.m() + 0.125F, 0.0F)).a(0.5F);

   public cgm(bsc<? extends cgm> $$0, daz $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(aym $$0) {
      this.f(bty.q).a((double)a($$0::a));
      this.f(bty.r).a(b($$0::j));
      this.f(bty.m).a(a($$0::j));
   }

   @Override
   protected void a(ajw.a $$0) {
      super.a($$0);
      $$0.a(bY, 0);
   }

   @Override
   public void b(ud $$0) {
      super.b($$0);
      $$0.a("Variant", this.gp());
   }

   @Override
   public void a(ud $$0) {
      super.a($$0);
      this.x($$0.h("Variant"));
   }

   private void x(int $$0) {
      this.ao.a(bY, $$0);
   }

   private int gp() {
      return this.ao.a(bY);
   }

   private void a(cgt $$0, cgo $$1) {
      this.x($$0.a() & 0xFF | $$1.a() << 8 & 0xFF00);
   }

   public cgt s() {
      return cgt.a(this.gp() & 0xFF);
   }

   public void a(cgt $$0) {
      this.x($$0.a() & 0xFF | this.gp() & -256);
   }

   public cgo u() {
      return cgo.a((this.gp() & 0xFF00) >> 8);
   }

   @Override
   public void a(bpp $$0) {
      ctq $$1 = this.fQ();
      super.a($$0);
      ctq $$2 = this.fQ();
      if (this.ai > 20 && this.l($$2) && $$1 != $$2) {
         this.a(avi.mI, 0.5F, 1.0F);
      }
   }

   @Override
   protected void a(dln $$0) {
      super.a($$0);
      if (this.ah.a(10) == 0) {
         this.a(avi.mJ, $$0.a() * 0.6F, $$0.b());
      }
   }

   @Override
   protected avh v() {
      return avi.mG;
   }

   @Override
   protected avh o_() {
      return avi.mK;
   }

   @Nullable
   @Override
   protected avh gw() {
      return avi.mL;
   }

   @Override
   protected avh d(bqp $$0) {
      return avi.mN;
   }

   @Override
   protected avh gN() {
      return avi.mH;
   }

   @Override
   public bpw b(cly $$0, bpv $$1) {
      boolean $$2 = !this.p_() && this.gE() && $$0.fR();
      if (!this.bS() && !$$2) {
         ctq $$3 = $$0.b($$1);
         if (!$$3.e()) {
            if (this.o($$3)) {
               return this.c($$0, $$3);
            }

            if (!this.gE()) {
               this.gU();
               return bpw.a(this.dP().B);
            }
         }

         return super.b($$0, $$1);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public boolean a(ceg $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return !($$0 instanceof cgl) && !($$0 instanceof cgm) ? false : this.gW() && ((cgk)$$0).gW();
      }
   }

   @Nullable
   @Override
   public brq a(aqn $$0, brq $$1) {
      if ($$1 instanceof cgl) {
         cgp $$2 = bsc.at.a((daz)$$0);
         if ($$2 != null) {
            this.a($$1, $$2);
         }

         return $$2;
      } else {
         cgm $$3 = (cgm)$$1;
         cgm $$4 = bsc.ab.a((daz)$$0);
         if ($$4 != null) {
            int $$5 = this.ah.a(9);
            cgt $$6;
            if ($$5 < 4) {
               $$6 = this.s();
            } else if ($$5 < 8) {
               $$6 = $$3.s();
            } else {
               $$6 = ac.a(cgt.values(), this.ah);
            }

            int $$9 = this.ah.a(5);
            cgo $$10;
            if ($$9 < 2) {
               $$10 = this.u();
            } else if ($$9 < 4) {
               $$10 = $$3.u();
            } else {
               $$10 = ac.a(cgo.values(), this.ah);
            }

            $$4.a($$6, $$10);
            this.a($$1, $$4);
         }

         return $$4;
      }
   }

   @Override
   public boolean fR() {
      return true;
   }

   @Override
   public boolean l(ctq $$0) {
      if ($$0.g() instanceof cre $$1 && $$1.d() == cre.a.a) {
         return true;
      }

      return false;
   }

   @Nullable
   @Override
   public btj a(dbo $$0, bpu $$1, bsu $$2, @Nullable btj $$3) {
      aym $$4 = $$0.E_();
      cgt $$5;
      if ($$3 instanceof cgm.a) {
         $$5 = ((cgm.a)$$3).a;
      } else {
         $$5 = ac.a(cgt.values(), $$4);
         $$3 = new cgm.a($$5);
      }

      this.a($$5, ac.a(cgo.values(), $$4));
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public brz e(btc $$0) {
      return this.p_() ? bZ : super.e($$0);
   }

   public static class a extends brq.a {
      public final cgt a;

      public a(cgt $$0) {
         super(true);
         this.a = $$0;
      }
   }
}
