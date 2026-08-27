import javax.annotation.Nullable;

public class cde extends ccg {
   private static final aef<Byte> g = aei.a(cde.class, aeh.a);
   private static final aef<Boolean> h = aei.a(cde.class, aeh.k);
   private cjl i = new cjl(cjo.uV);
   private boolean j;
   public int f;

   public cde(bja<? extends cde> $$0, cqb $$1) {
      super($$0, $$1);
   }

   public cde(cqb $$0, bjm $$1, cjl $$2) {
      super(bja.bb, $$1, $$0);
      this.i = $$2.p();
      this.an.b(g, (byte)cnw.g($$2));
      this.an.b(h, $$2.B());
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(g, (byte)0);
      this.an.a(h, false);
   }

   @Override
   public void l() {
      if (this.c > 4) {
         this.j = true;
      }

      biw $$0 = this.v();
      int $$1 = this.an.b(g);
      if ($$1 > 0 && (this.j || this.E()) && $$0 != null) {
         if (!this.K()) {
            if (!this.dL().B && this.d == ccg.a.b) {
               this.a(this.w(), 0.1F);
            }

            this.ak();
         } else {
            this.p(true);
            ehh $$2 = $$0.bp().d(this.dj());
            this.p(this.dq(), this.ds() + $$2.d * 0.015 * (double)$$1, this.dw());
            if (this.dL().B) {
               this.ad = this.ds();
            }

            double $$3 = 0.05 * (double)$$1;
            this.f(this.do().a(0.95).e($$2.d().a($$3)));
            if (this.f == 0) {
               this.a(apg.xP, 10.0F, 1.0F);
            }

            this.f++;
         }
      }

      super.l();
   }

   private boolean K() {
      biw $$0 = this.v();
      return $$0 == null || !$$0.bv() ? false : !($$0 instanceof aku) || !$$0.M_();
   }

   @Override
   protected cjl w() {
      return this.i.p();
   }

   @Override
   public boolean F() {
      return this.an.b(h);
   }

   @Nullable
   @Override
   protected ehe a(ehh $$0, ehh $$1) {
      return this.j ? null : super.a($$0, $$1);
   }

   @Override
   protected void a(ehe $$0) {
      biw $$1 = $$0.a();
      float $$2 = 8.0F;
      if ($$1 instanceof bjm $$3) {
         $$2 += cnw.a(this.i, $$3.eR());
      }

      biw $$4 = this.v();
      bhu $$5 = this.dM().a(this, (biw)($$4 == null ? this : $$4));
      this.j = true;
      apf $$6 = apg.xN;
      if ($$1.a($$5, $$2)) {
         if ($$1.ag() == bja.E) {
            return;
         }

         if ($$1 instanceof bjm $$7) {
            if ($$4 instanceof bjm) {
               cnw.a($$7, $$4);
               cnw.b((bjm)$$4, $$7);
            }

            this.a($$7);
         }
      }

      this.f(this.do().d(-0.01, -0.1, -0.01));
      float $$8 = 1.0F;
      if (this.dL() instanceof akt && this.dL().Y() && this.I()) {
         gw $$9 = $$1.dl();
         if (this.dL().g($$9)) {
            bjl $$10 = bja.ai.a(this.dL());
            if ($$10 != null) {
               $$10.d(ehh.c($$9));
               $$10.b($$4 instanceof aku ? (aku)$$4 : null);
               this.dL().b($$10);
               $$6 = apg.xU;
               $$8 = 5.0F;
            }
         }
      }

      this.a($$6, $$8, 1.0F);
   }

   public boolean I() {
      return cnw.i(this.i);
   }

   @Override
   protected boolean a(cca $$0) {
      return super.a($$0) || this.E() && this.d((biw)$$0) && $$0.fS().e(this.w());
   }

   @Override
   protected apf s() {
      return apg.xO;
   }

   @Override
   public void b_(cca $$0) {
      if (this.d((biw)$$0) || this.v() == null) {
         super.b_($$0);
      }
   }

   @Override
   public void a(qw $$0) {
      super.a($$0);
      if ($$0.b("Trident", 10)) {
         this.i = cjl.a($$0.p("Trident"));
      }

      this.j = $$0.q("DealtDamage");
      this.an.b(g, (byte)cnw.g(this.i));
   }

   @Override
   public void b(qw $$0) {
      super.b($$0);
      $$0.a("Trident", this.i.b(new qw()));
      $$0.a("DealtDamage", this.j);
   }

   @Override
   public void q() {
      int $$0 = this.an.b(g);
      if (this.d != ccg.a.b || $$0 <= 0) {
         super.q();
      }
   }

   @Override
   protected float C() {
      return 0.99F;
   }

   @Override
   public boolean k(double $$0, double $$1, double $$2) {
      return true;
   }
}
