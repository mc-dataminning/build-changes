import javax.annotation.Nullable;

public class ccq extends cco implements bpw<ccx> {
   private static final aii<Integer> bV = ail.a(ccq.class, aik.b);
   private static final boi bW = bol.aa.n().a(boh.a().a(bog.a, 0.0F, bol.aa.l() + 0.125F, 0.0F)).a(0.5F);

   public ccq(bol<? extends ccq> $$0, cwe $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(awt $$0) {
      this.f(bqe.n).a((double)a($$0::a));
      this.f(bqe.o).a(b($$0::j));
      this.f(bqe.j).a(a($$0::j));
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(bV, 0);
   }

   @Override
   public void b(sy $$0) {
      super.b($$0);
      $$0.a("Variant", this.gl());
   }

   @Override
   public void a(sy $$0) {
      super.a($$0);
      this.x($$0.h("Variant"));
   }

   private void x(int $$0) {
      this.am.b(bV, $$0);
   }

   private int gl() {
      return this.am.b(bV);
   }

   private void a(ccx $$0, ccs $$1) {
      this.x($$0.a() & 0xFF | $$1.a() << 8 & 0xFF00);
   }

   public ccx u() {
      return ccx.a(this.gl() & 0xFF);
   }

   public void a(ccx $$0) {
      this.x($$0.a() & 0xFF | this.gl() & -256);
   }

   public ccs w() {
      return ccs.a((this.gl() & 0xFF00) >> 8);
   }

   @Override
   public void a(bme $$0) {
      cpq $$1 = this.fN();
      super.a($$0);
      cpq $$2 = this.fN();
      if (this.ag > 20 && this.l($$2) && $$1 != $$2) {
         this.a(atp.mk, 0.5F, 1.0F);
      }
   }

   @Override
   protected void a(dgr $$0) {
      super.a($$0);
      if (this.af.a(10) == 0) {
         this.a(atp.ml, $$0.a() * 0.6F, $$0.b());
      }
   }

   @Override
   protected ato y() {
      return atp.mi;
   }

   @Override
   protected ato n_() {
      return atp.mm;
   }

   @Nullable
   @Override
   protected ato gs() {
      return atp.mn;
   }

   @Override
   protected ato d(bne $$0) {
      return atp.mp;
   }

   @Override
   protected ato gK() {
      return atp.mj;
   }

   @Override
   public bml b(cia $$0, bmk $$1) {
      boolean $$2 = !this.o_() && this.gA() && $$0.fK();
      if (!this.bM() && !$$2) {
         cpq $$3 = $$0.b($$1);
         if (!$$3.b()) {
            if (this.o($$3)) {
               return this.c($$0, $$3);
            }

            if (!this.gA()) {
               this.gR();
               return bml.a(this.dJ().B);
            }
         }

         return super.b($$0, $$1);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public boolean a(cam $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return !($$0 instanceof ccp) && !($$0 instanceof ccq) ? false : this.gT() && ((cco)$$0).gT();
      }
   }

   @Nullable
   @Override
   public boa a(apa $$0, boa $$1) {
      if ($$1 instanceof ccp) {
         cct $$2 = bol.ar.a((cwe)$$0);
         if ($$2 != null) {
            this.a($$1, $$2);
         }

         return $$2;
      } else {
         ccq $$3 = (ccq)$$1;
         ccq $$4 = bol.aa.a((cwe)$$0);
         if ($$4 != null) {
            int $$5 = this.af.a(9);
            ccx $$6;
            if ($$5 < 4) {
               $$6 = this.u();
            } else if ($$5 < 8) {
               $$6 = $$3.u();
            } else {
               $$6 = ac.a(ccx.values(), this.af);
            }

            int $$9 = this.af.a(5);
            ccs $$10;
            if ($$9 < 2) {
               $$10 = this.w();
            } else if ($$9 < 4) {
               $$10 = $$3.w();
            } else {
               $$10 = ac.a(ccs.values(), this.af);
            }

            $$4.a($$6, $$10);
            this.a($$1, $$4);
         }

         return $$4;
      }
   }

   @Override
   public boolean fO() {
      return true;
   }

   @Override
   public boolean l(cpq $$0) {
      if ($$0.d() instanceof cnb $$1 && $$1.c() == cnb.a.a) {
         return true;
      }

      return false;
   }

   @Nullable
   @Override
   public bpp a(cwt $$0, bmj $$1, bpb $$2, @Nullable bpp $$3) {
      awt $$4 = $$0.F_();
      ccx $$5;
      if ($$3 instanceof ccq.a) {
         $$5 = ((ccq.a)$$3).a;
      } else {
         $$5 = ac.a(ccx.values(), $$4);
         $$3 = new ccq.a($$5);
      }

      this.a($$5, ac.a(ccs.values(), $$4));
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boi e(bpi $$0) {
      return this.o_() ? bW : super.e($$0);
   }

   public static class a extends boa.a {
      public final ccx a;

      public a(ccx $$0) {
         super(true);
         this.a = $$0;
      }
   }
}
