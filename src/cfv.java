import javax.annotation.Nullable;

public class cfv extends cex {
   private static final afz<Byte> g = agc.a(cfv.class, agb.a);
   private static final afz<Boolean> h = agc.a(cfv.class, agb.k);
   private static final cmh i = new cmh(cmk.vI);
   private boolean j;
   public int f;

   public cfv(blj<? extends cfv> $$0, csy $$1) {
      super($$0, $$1, i);
   }

   public cfv(csy $$0, blv $$1, cmh $$2) {
      super(blj.bc, $$1, $$0, $$2);
      this.an.b(g, (byte)cqu.g($$2));
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

      blf $$0 = this.w();
      int $$1 = this.an.b(g);
      if ($$1 > 0 && (this.j || this.H()) && $$0 != null) {
         if (!this.N()) {
            if (!this.dM().B && this.d == cex.a.b) {
               this.a(this.y(), 0.1F);
            }

            this.am();
         } else {
            this.p(true);
            elb $$2 = $$0.br().d(this.dk());
            this.p(this.dr(), this.dt() + $$2.d * 0.015 * (double)$$1, this.dx());
            if (this.dM().B) {
               this.ad = this.dt();
            }

            double $$3 = 0.05 * (double)$$1;
            this.g(this.dp().a(0.95).e($$2.d().a($$3)));
            if (this.f == 0) {
               this.a(arc.yF, 10.0F, 1.0F);
            }

            this.f++;
         }
      }

      super.l();
   }

   private boolean N() {
      blf $$0 = this.w();
      return $$0 == null || !$$0.bx() ? false : !($$0 instanceof amq) || !$$0.P_();
   }

   @Override
   public boolean I() {
      return this.an.b(h);
   }

   @Nullable
   @Override
   protected eky a(elb $$0, elb $$1) {
      return this.j ? null : super.a($$0, $$1);
   }

   @Override
   protected void a(eky $$0) {
      blf $$1 = $$0.a();
      float $$2 = 8.0F;
      if ($$1 instanceof blv $$3) {
         $$2 += cqu.a(this.z(), $$3.eS());
      }

      blf $$4 = this.w();
      bkd $$5 = this.dN().a(this, (blf)($$4 == null ? this : $$4));
      this.j = true;
      arb $$6 = arc.yD;
      if ($$1.a($$5, $$2)) {
         if ($$1.ai() == blj.F) {
            return;
         }

         if ($$1 instanceof blv $$7) {
            if ($$4 instanceof blv) {
               cqu.a($$7, $$4);
               cqu.b((blv)$$4, $$7);
            }

            this.a($$7);
         }
      } else if ($$1.ai().a(aru.s)) {
         this.s();
         return;
      }

      this.g(this.dp().d(-0.01, -0.1, -0.01));
      float $$8 = 1.0F;
      if (this.dM() instanceof amp && this.dM().Z() && this.M()) {
         hv $$9 = $$1.dm();
         if (this.dM().g($$9)) {
            blu $$10 = blj.aj.a(this.dM());
            if ($$10 != null) {
               $$10.e(elb.c($$9));
               $$10.b($$4 instanceof amq ? (amq)$$4 : null);
               this.dM().b($$10);
               $$6 = arc.yK;
               $$8 = 5.0F;
            }
         }
      }

      this.a($$6, $$8, 1.0F);
   }

   public boolean M() {
      return cqu.i(this.z());
   }

   @Override
   protected boolean a(cer $$0) {
      return super.a($$0) || this.H() && this.d((blf)$$0) && $$0.fS().e(this.y());
   }

   @Override
   protected arb u() {
      return arc.yE;
   }

   @Override
   public void b_(cer $$0) {
      if (this.d((blf)$$0) || this.w() == null) {
         super.b_($$0);
      }
   }

   @Override
   public void a(sj $$0) {
      super.a($$0);
      this.j = $$0.q("DealtDamage");
      this.an.b(g, (byte)cqu.g(this.z()));
   }

   @Override
   public void b(sj $$0) {
      super.b($$0);
      $$0.a("DealtDamage", this.j);
   }

   @Override
   public void q() {
      int $$0 = this.an.b(g);
      if (this.d != cex.a.b || $$0 <= 0) {
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
