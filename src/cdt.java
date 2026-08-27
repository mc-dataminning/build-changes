public class cdt extends cdl {
   static final aee<String> c = aeh.a(cdt.class, aeg.e);
   static final aee<tl> d = aeh.a(cdt.class, aeg.f);
   private final cow e = new cdt.a();
   private static final int f = 4;
   private int g;

   public cdt(biu<? extends cdt> $$0, cpv $$1) {
      super($$0, $$1);
   }

   public cdt(cpv $$0, double $$1, double $$2, double $$3) {
      super(biu.s, $$0, $$1, $$2, $$3);
   }

   @Override
   protected cja q() {
      return cji.na;
   }

   @Override
   protected void a_() {
      super.a_();
      this.al().a(c, "");
      this.al().a(d, tk.a);
   }

   @Override
   protected void a(qw $$0) {
      super.a($$0);
      this.e.b($$0);
      this.al().b(c, this.G().m());
      this.al().b(d, this.G().l());
   }

   @Override
   protected void b(qw $$0) {
      super.b($$0);
      this.e.a($$0);
   }

   @Override
   public cdl.a z() {
      return cdl.a.g;
   }

   @Override
   public dfj B() {
      return csw.fN.n();
   }

   public cow G() {
      return this.e;
   }

   @Override
   public void a(int $$0, int $$1, int $$2, boolean $$3) {
      if ($$3 && this.ah - this.g >= 4) {
         this.G().a(this.dL());
         this.g = this.ah;
      }
   }

   @Override
   public bgy a(cbu $$0, bgx $$1) {
      return this.e.a($$0);
   }

   @Override
   public void a(aee<?> $$0) {
      super.a($$0);
      if (d.equals($$0)) {
         try {
            this.e.c(this.al().b(d));
         } catch (Throwable var3) {
         }
      } else if (c.equals($$0)) {
         this.e.a(this.al().b(c));
      }
   }

   @Override
   public boolean cM() {
      return true;
   }

   public class a extends cow {
      @Override
      public akq e() {
         return (akq)cdt.this.dL();
      }

      @Override
      public void f() {
         cdt.this.al().b(cdt.c, this.m());
         cdt.this.al().b(cdt.d, this.l());
      }

      @Override
      public ehn g() {
         return cdt.this.dj();
      }

      public cdt h() {
         return cdt.this;
      }

      @Override
      public dt i() {
         return new dt(this, cdt.this.dj(), cdt.this.bF(), this.e(), 2, this.n().getString(), cdt.this.N_(), this.e().n(), cdt.this);
      }

      @Override
      public boolean j() {
         return !cdt.this.dG();
      }
   }
}
