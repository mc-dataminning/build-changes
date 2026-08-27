import javax.annotation.Nullable;

public class cfv extends cft implements bsz<cgc> {
   private static final ajm<Integer> bY = ajq.a(cfv.class, ajo.b);
   private static final brk bZ = brn.ab.n().a(brj.a().a(bri.a, 0.0F, brn.ab.l() + 0.125F, 0.0F)).a(0.5F);

   public cfv(brn<? extends cfv> $$0, dad $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(ayg $$0) {
      this.f(bth.q).a((double)a($$0::a));
      this.f(bth.r).a(b($$0::j));
      this.f(bth.m).a(a($$0::j));
   }

   @Override
   protected void a(ajq.a $$0) {
      super.a($$0);
      $$0.a(bY, 0);
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("Variant", this.gp());
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.x($$0.h("Variant"));
   }

   private void x(int $$0) {
      this.ao.a(bY, $$0);
   }

   private int gp() {
      return this.ao.a(bY);
   }

   private void a(cgc $$0, cfx $$1) {
      this.x($$0.a() & 0xFF | $$1.a() << 8 & 0xFF00);
   }

   public cgc r() {
      return cgc.a(this.gp() & 0xFF);
   }

   public void a(cgc $$0) {
      this.x($$0.a() & 0xFF | this.gp() & -256);
   }

   public cfx u() {
      return cfx.a((this.gp() & 0xFF00) >> 8);
   }

   @Override
   public void a(bpf $$0) {
      csz $$1 = this.fQ();
      super.a($$0);
      csz $$2 = this.fQ();
      if (this.ai > 20 && this.l($$2) && $$1 != $$2) {
         this.a(avc.my, 0.5F, 1.0F);
      }
   }

   @Override
   protected void a(dkr $$0) {
      super.a($$0);
      if (this.ah.a(10) == 0) {
         this.a(avc.mz, $$0.a() * 0.6F, $$0.b());
      }
   }

   @Override
   protected avb v() {
      return avc.mw;
   }

   @Override
   protected avb o_() {
      return avc.mA;
   }

   @Nullable
   @Override
   protected avb gw() {
      return avc.mB;
   }

   @Override
   protected avb d(bqf $$0) {
      return avc.mD;
   }

   @Override
   protected avb gN() {
      return avc.mx;
   }

   @Override
   public bpm b(clh $$0, bpl $$1) {
      boolean $$2 = !this.p_() && this.gE() && $$0.fP();
      if (!this.bQ() && !$$2) {
         csz $$3 = $$0.b($$1);
         if (!$$3.d()) {
            if (this.o($$3)) {
               return this.c($$0, $$3);
            }

            if (!this.gE()) {
               this.gU();
               return bpm.a(this.dN().B);
            }
         }

         return super.b($$0, $$1);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public boolean a(cdp $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return !($$0 instanceof cfu) && !($$0 instanceof cfv) ? false : this.gW() && ((cft)$$0).gW();
      }
   }

   @Nullable
   @Override
   public brb a(aqh $$0, brb $$1) {
      if ($$1 instanceof cfu) {
         cfy $$2 = brn.as.a((dad)$$0);
         if ($$2 != null) {
            this.a($$1, $$2);
         }

         return $$2;
      } else {
         cfv $$3 = (cfv)$$1;
         cfv $$4 = brn.ab.a((dad)$$0);
         if ($$4 != null) {
            int $$5 = this.ah.a(9);
            cgc $$6;
            if ($$5 < 4) {
               $$6 = this.r();
            } else if ($$5 < 8) {
               $$6 = $$3.r();
            } else {
               $$6 = ac.a(cgc.values(), this.ah);
            }

            int $$9 = this.ah.a(5);
            cfx $$10;
            if ($$9 < 2) {
               $$10 = this.u();
            } else if ($$9 < 4) {
               $$10 = $$3.u();
            } else {
               $$10 = ac.a(cfx.values(), this.ah);
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
   public boolean l(csz $$0) {
      if ($$0.f() instanceof cqn $$1 && $$1.d() == cqn.a.a) {
         return true;
      }

      return false;
   }

   @Nullable
   @Override
   public bss a(das $$0, bpk $$1, bse $$2, @Nullable bss $$3) {
      ayg $$4 = $$0.E_();
      cgc $$5;
      if ($$3 instanceof cfv.a) {
         $$5 = ((cfv.a)$$3).a;
      } else {
         $$5 = ac.a(cgc.values(), $$4);
         $$3 = new cfv.a($$5);
      }

      this.a($$5, ac.a(cfx.values(), $$4));
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public brk e(bsl $$0) {
      return this.p_() ? bZ : super.e($$0);
   }

   public static class a extends brb.a {
      public final cgc a;

      public a(cgc $$0) {
         super(true);
         this.a = $$0;
      }
   }
}
