public class cew extends ceo {
   static final afc<String> c = aff.a(cew.class, afe.e);
   static final afc<ui> d = aff.a(cew.class, afe.f);
   private final cqa e = new cew.a();
   private static final int i = 4;
   private int j;

   public cew(bjx<? extends cew> $$0, cqz $$1) {
      super($$0, $$1);
   }

   public cew(cqz $$0, double $$1, double $$2, double $$3) {
      super(bjx.s, $$0, $$1, $$2, $$3);
   }

   @Override
   protected cke ag_() {
      return ckm.na;
   }

   @Override
   protected void b_() {
      super.b_();
      this.al().a(c, "");
      this.al().a(d, uh.a);
   }

   @Override
   protected void a(rt $$0) {
      super.a($$0);
      this.e.b($$0);
      this.al().b(c, this.B().m());
      this.al().b(d, this.B().l());
   }

   @Override
   protected void b(rt $$0) {
      super.b($$0);
      this.e.a($$0);
   }

   @Override
   public ceo.a v() {
      return ceo.a.g;
   }

   @Override
   public dgb x() {
      return cuc.fN.o();
   }

   public cqa B() {
      return this.e;
   }

   @Override
   public void a(int $$0, int $$1, int $$2, boolean $$3) {
      if ($$3 && this.ah - this.j >= 4) {
         this.B().a(this.dL());
         this.j = this.ah;
      }
   }

   @Override
   public bib a(ccx $$0, bia $$1) {
      return this.e.a($$0);
   }

   @Override
   public void a(afc<?> $$0) {
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

   public class a extends cqa {
      @Override
      public alq e() {
         return (alq)cew.this.dL();
      }

      @Override
      public void f() {
         cew.this.al().b(cew.c, this.m());
         cew.this.al().b(cew.d, this.l());
      }

      @Override
      public eif g() {
         return cew.this.dj();
      }

      public cew h() {
         return cew.this;
      }

      @Override
      public du i() {
         return new du(this, cew.this.dj(), cew.this.bF(), this.e(), 2, this.n().getString(), cew.this.O_(), this.e().n(), cew.this);
      }

      @Override
      public boolean j() {
         return !cew.this.dG();
      }
   }
}
