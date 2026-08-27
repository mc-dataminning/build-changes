public class chq extends chi {
   static final agn<String> c = agq.a(chq.class, agp.e);
   static final agn<vg> d = agq.a(chq.class, agp.f);
   private final csy e = new chq.a();
   private static final int i = 4;
   private int j;

   public chq(bmc<? extends chq> $$0, ctx $$1) {
      super($$0, $$1);
   }

   public chq(ctx $$0, double $$1, double $$2, double $$3) {
      super(bmc.u, $$0, $$1, $$2, $$3);
   }

   @Override
   protected cnb ai_() {
      return cnj.nL;
   }

   @Override
   protected void c_() {
      super.c_();
      this.an().a(c, "");
      this.an().a(d, vf.a);
   }

   @Override
   protected void a(so $$0) {
      super.a($$0);
      this.e.b($$0);
      this.an().b(c, this.C().m());
      this.an().b(d, this.C().l());
   }

   @Override
   protected void b(so $$0) {
      super.b($$0);
      this.e.a($$0);
   }

   @Override
   public chi.a w() {
      return chi.a.g;
   }

   @Override
   public djp y() {
      return cxa.fN.o();
   }

   public csy C() {
      return this.e;
   }

   @Override
   public void a(int $$0, int $$1, int $$2, boolean $$3) {
      if ($$3 && this.ah - this.j >= 4) {
         this.C().a(this.dL());
         this.j = this.ah;
      }
   }

   @Override
   public bkc a(cfq $$0, bkb $$1) {
      return this.e.a($$0);
   }

   @Override
   public void a(agn<?> $$0) {
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
   public boolean cM() {
      return true;
   }

   public class a extends csy {
      @Override
      public ane e() {
         return (ane)chq.this.dL();
      }

      @Override
      public void f() {
         chq.this.an().b(chq.c, this.m());
         chq.this.an().b(chq.d, this.l());
      }

      @Override
      public emc g() {
         return chq.this.dj();
      }

      public chq h() {
         return chq.this;
      }

      @Override
      public ds i() {
         return new ds(this, chq.this.dj(), chq.this.bG(), this.e(), 2, this.n().getString(), chq.this.Q_(), this.e().o(), chq.this);
      }

      @Override
      public boolean j() {
         return !chq.this.dG();
      }
   }
}
