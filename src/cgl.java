import javax.annotation.Nullable;

public class cgl extends cfn {
   private static final agm<Byte> g = agp.a(cgl.class, ago.a);
   private static final agm<Boolean> h = agp.a(cgl.class, ago.k);
   private static final cmx i = new cmx(cna.vI);
   private boolean j;
   public int f;

   public cgl(bly<? extends cgl> $$0, cto $$1) {
      super($$0, $$1, i);
   }

   public cgl(cto $$0, bmk $$1, cmx $$2) {
      super(bly.bc, $$1, $$0, $$2);
      this.an.b(g, (byte)crk.g($$2));
      this.an.b(h, $$2.B());
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(g, (byte)0);
      this.an.a(h, false);
   }

   @Override
   public void l() {
      if (this.c > 4) {
         this.j = true;
      }

      blu $$0 = this.w();
      int $$1 = this.an.b(g);
      if ($$1 > 0 && (this.j || this.H()) && $$0 != null) {
         if (!this.N()) {
            if (!this.dM().B && this.d == cfn.a.b) {
               this.a(this.y(), 0.1F);
            }

            this.am();
         } else {
            this.p(true);
            els $$2 = $$0.br().d(this.dk());
            this.p(this.dr(), this.dt() + $$2.d * 0.015 * (double)$$1, this.dx());
            if (this.dM().B) {
               this.ad = this.dt();
            }

            double $$3 = 0.05 * (double)$$1;
            this.g(this.dp().a(0.95).e($$2.d().a($$3)));
            if (this.f == 0) {
               this.a(arr.yF, 10.0F, 1.0F);
            }

            this.f++;
         }
      }

      super.l();
   }

   private boolean N() {
      blu $$0 = this.w();
      return $$0 == null || !$$0.bx() ? false : !($$0 instanceof ane) || !$$0.P_();
   }

   @Override
   public boolean I() {
      return this.an.b(h);
   }

   @Nullable
   @Override
   protected elp a(els $$0, els $$1) {
      return this.j ? null : super.a($$0, $$1);
   }

   @Override
   protected void a(elp $$0) {
      blu $$1 = $$0.a();
      float $$2 = 8.0F;
      if ($$1 instanceof bmk $$3) {
         $$2 += crk.a(this.z(), $$3.eS());
      }

      blu $$4 = this.w();
      bks $$5 = this.dN().a(this, (blu)($$4 == null ? this : $$4));
      this.j = true;
      arq $$6 = arr.yD;
      if ($$1.a($$5, $$2)) {
         if ($$1.ai() == bly.F) {
            return;
         }

         if ($$1 instanceof bmk $$7) {
            if ($$4 instanceof bmk) {
               crk.a($$7, $$4);
               crk.b((bmk)$$4, $$7);
            }

            this.a($$7);
         }
      } else if ($$1.ai().a(asj.s)) {
         this.s();
         return;
      }

      this.g(this.dp().d(-0.01, -0.1, -0.01));
      float $$8 = 1.0F;
      if (this.dM() instanceof and && this.dM().aa() && this.M()) {
         hx $$9 = $$1.dm();
         if (this.dM().h($$9)) {
            bmj $$10 = bly.aj.a(this.dM());
            if ($$10 != null) {
               $$10.e(els.c($$9));
               $$10.b($$4 instanceof ane ? (ane)$$4 : null);
               this.dM().b($$10);
               $$6 = arr.yK;
               $$8 = 5.0F;
            }
         }
      }

      this.a($$6, $$8, 1.0F);
   }

   public boolean M() {
      return crk.i(this.z());
   }

   @Override
   protected boolean a(cfh $$0) {
      return super.a($$0) || this.H() && this.d((blu)$$0) && $$0.fS().e(this.y());
   }

   @Override
   protected arq u() {
      return arr.yE;
   }

   @Override
   public void b_(cfh $$0) {
      if (this.d((blu)$$0) || this.w() == null) {
         super.b_($$0);
      }
   }

   @Override
   public void a(sn $$0) {
      super.a($$0);
      this.j = $$0.q("DealtDamage");
      this.an.b(g, (byte)crk.g(this.z()));
   }

   @Override
   public void b(sn $$0) {
      super.b($$0);
      $$0.a("DealtDamage", this.j);
   }

   @Override
   public void q() {
      int $$0 = this.an.b(g);
      if (this.d != cfn.a.b || $$0 <= 0) {
         super.q();
      }
   }

   @Override
   protected float G() {
      return 0.99F;
   }

   @Override
   public boolean k(double $$0, double $$1, double $$2) {
      return true;
   }
}
