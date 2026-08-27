import javax.annotation.Nullable;

public class cba extends cam {
   public static final double bV = 0.6;
   public static final double bW = 0.8;
   public static final double bY = 1.33;
   private static final csp bZ = csp.a(cpt.qY, cpt.qZ);
   private static final aii<Boolean> ca = ail.a(cba.class, aik.k);
   @Nullable
   private cba.a<cia> cb;
   @Nullable
   private cba.b cc;

   public cba(bol<? extends cba> $$0, cwe $$1) {
      super($$0, $$1);
      this.w();
   }

   boolean A() {
      return this.am.b(ca);
   }

   private void w(boolean $$0) {
      this.am.b(ca, $$0);
      this.w();
   }

   @Override
   public void b(sy $$0) {
      super.b($$0);
      $$0.a("Trusting", this.A());
   }

   @Override
   public void a(sy $$0) {
      super.a($$0);
      this.w($$0.q("Trusting"));
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(ca, false);
   }

   @Override
   protected void B() {
      this.cc = new cba.b(this, 0.6, bZ, true);
      this.bP.a(1, new bvo(this));
      this.bP.a(3, this.cc);
      this.bP.a(7, new bwa(this, 0.3F));
      this.bP.a(8, new bwk(this));
      this.bP.a(9, new bvg(this, 0.8));
      this.bP.a(10, new bxh(this, 0.8, 1.0000001E-5F));
      this.bP.a(11, new bwc(this, cia.class, 10.0F));
      this.bQ.a(1, new bxn<>(this, car.class, false));
      this.bQ.a(1, new bxn<>(this, cbn.class, 10, false, false, cbn.bW));
   }

   @Override
   public void aa() {
      if (this.K().b()) {
         double $$0 = this.K().c();
         if ($$0 == 0.6) {
            this.b(bpi.f);
            this.g(false);
         } else if ($$0 == 1.33) {
            this.b(bpi.a);
            this.g(true);
         } else {
            this.b(bpi.a);
            this.g(false);
         }
      } else {
         this.b(bpi.a);
         this.g(false);
      }
   }

   @Override
   public boolean h(double $$0) {
      return !this.A() && this.ag > 2400;
   }

   public static bqd.a u() {
      return boz.C().a(bqe.n, 10.0).a(bqe.o, 0.3F).a(bqe.c, 3.0);
   }

   @Nullable
   @Override
   protected ato y() {
      return atp.rK;
   }

   @Override
   public int Q() {
      return 900;
   }

   @Override
   protected ato d(bne $$0) {
      return atp.rJ;
   }

   @Override
   protected ato n_() {
      return atp.rL;
   }

   private float gl() {
      return (float)this.g(bqe.c);
   }

   @Override
   public boolean B(bof $$0) {
      return $$0.a(this.dK().b((box)this), this.gl());
   }

   @Override
   public bml b(cia $$0, bmk $$1) {
      cpq $$2 = $$0.b($$1);
      if ((this.cc == null || this.cc.i()) && !this.A() && this.o($$2) && $$0.f(this) < 9.0) {
         this.a($$0, $$1, $$2);
         if (!this.dJ().B) {
            if (this.af.a(3) == 0) {
               this.w(true);
               this.x(true);
               this.dJ().a(this, (byte)41);
            } else {
               this.x(false);
               this.dJ().a(this, (byte)40);
            }
         }

         return bml.a(this.dJ().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 41) {
         this.x(true);
      } else if ($$0 == 40) {
         this.x(false);
      } else {
         super.b($$0);
      }
   }

   private void x(boolean $$0) {
      jz $$1 = kb.O;
      if (!$$0) {
         $$1 = kb.ab;
      }

      for (int $$2 = 0; $$2 < 7; $$2++) {
         double $$3 = this.af.k() * 0.02;
         double $$4 = this.af.k() * 0.02;
         double $$5 = this.af.k() * 0.02;
         this.dJ().a($$1, this.d(1.0), this.dr() + 0.5, this.g(1.0), $$3, $$4, $$5);
      }
   }

   protected void w() {
      if (this.cb == null) {
         this.cb = new cba.a<>(this, cia.class, 16.0F, 0.8, 1.33);
      }

      this.bP.a(this.cb);
      if (!this.A()) {
         this.bP.a(4, this.cb);
      }
   }

   @Nullable
   public cba b(apa $$0, boa $$1) {
      return bol.as.a((cwe)$$0);
   }

   @Override
   public boolean o(cpq $$0) {
      return bZ.a($$0);
   }

   public static boolean c(bol<cba> $$0, cwf $$1, bpb $$2, ib $$3, awt $$4) {
      return $$4.a(3) != 0;
   }

   @Override
   public boolean a(cwh $$0) {
      if ($$0.f(this) && !$$0.d(this.cE())) {
         ib $$1 = this.dj();
         if ($$1.v() < $$0.A_()) {
            return false;
         }

         dme $$2 = $$0.a_($$1.d());
         if ($$2.a(czh.i) || $$2.a(aue.O)) {
            return true;
         }
      }

      return false;
   }

   @Nullable
   @Override
   public bpp a(cwt $$0, bmj $$1, bpb $$2, @Nullable bpp $$3) {
      if ($$3 == null) {
         $$3 = new boa.a(1.0F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public eov cG() {
      return new eov(0.0, (double)(0.5F * this.cF()), (double)(this.dd() * 0.4F));
   }

   @Override
   public boolean bQ() {
      return this.bU() || super.bQ();
   }

   static class a<T extends box> extends bvb<T> {
      private final cba i;

      public a(cba $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bok.e::test);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return !this.i.A() && super.a();
      }

      @Override
      public boolean b() {
         return !this.i.A() && super.b();
      }
   }

   static class b extends bxc {
      private final cba c;

      public b(cba $$0, double $$1, csp $$2, boolean $$3) {
         super($$0, $$1, $$2, $$3);
         this.c = $$0;
      }

      @Override
      protected boolean h() {
         return super.h() && !this.c.A();
      }
   }
}
