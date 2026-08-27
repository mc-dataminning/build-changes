public class ckb extends cjt {
   static final aii<String> c = ail.a(ckb.class, aik.e);
   static final aii<vs> d = ail.a(ckb.class, aik.f);
   private final cvf e = new ckb.a();
   private static final int i = 4;
   private int j;

   public ckb(bol<? extends ckb> $$0, cwe $$1) {
      super($$0, $$1);
   }

   public ckb(cwe $$0, double $$1, double $$2, double $$3) {
      super(bol.u, $$0, $$1, $$2, $$3);
   }

   @Override
   protected cpl ai_() {
      return cpt.nL;
   }

   @Override
   protected void c_() {
      super.c_();
      this.an().a(c, "");
      this.an().a(d, vr.a);
   }

   @Override
   protected void a(sy $$0) {
      super.a($$0);
      this.e.b($$0);
      this.an().b(c, this.C().m());
      this.an().b(d, this.C().l());
   }

   @Override
   protected void b(sy $$0) {
      super.b($$0);
      this.e.a($$0);
   }

   @Override
   public cjt.a w() {
      return cjt.a.g;
   }

   @Override
   public dme y() {
      return czh.fN.o();
   }

   public cvf C() {
      return this.e;
   }

   @Override
   public void a(int $$0, int $$1, int $$2, boolean $$3) {
      if ($$3 && this.ag - this.j >= 4) {
         this.C().a(this.dJ());
         this.j = this.ag;
      }
   }

   @Override
   public bml a(cia $$0, bmk $$1) {
      return this.e.a($$0);
   }

   @Override
   public void a(aii<?> $$0) {
      super.a($$0);
      if (d.equals($$0)) {
         try {
            this.e.c(this.an().b(d));
         } catch (Throwable var3) {
         }
      } else if (c.equals($$0)) {
         this.e.a(this.an().b(c));
      }
   }

   @Override
   public boolean cJ() {
      return true;
   }

   public class a extends cvf {
      @Override
      public apa e() {
         return (apa)ckb.this.dJ();
      }

      @Override
      public void f() {
         ckb.this.an().b(ckb.c, this.m());
         ckb.this.an().b(ckb.d, this.l());
      }

      @Override
      public eov g() {
         return ckb.this.dh();
      }

      public ckb h() {
         return ckb.this;
      }

      @Override
      public du i() {
         return new du(this, ckb.this.dh(), ckb.this.bG(), this.e(), 2, this.n().getString(), ckb.this.Q_(), this.e().o(), ckb.this);
      }

      @Override
      public boolean j() {
         return !ckb.this.dE();
      }
   }
}
