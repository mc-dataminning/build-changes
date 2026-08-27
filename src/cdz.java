public class cdz extends cdr {
   static final aef<String> c = aei.a(cdz.class, aeh.e);
   static final aef<tl> d = aei.a(cdz.class, aeh.f);
   private final cpc e = new cdz.a();
   private static final int f = 4;
   private int g;

   public cdz(bja<? extends cdz> $$0, cqb $$1) {
      super($$0, $$1);
   }

   public cdz(cqb $$0, double $$1, double $$2, double $$3) {
      super(bja.s, $$0, $$1, $$2, $$3);
   }

   @Override
   protected cjg q() {
      return cjo.na;
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
   public cdr.a z() {
      return cdr.a.g;
   }

   @Override
   public dfd B() {
      return cte.fN.o();
   }

   public cpc G() {
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
   public bhe a(cca $$0, bhd $$1) {
      return this.e.a($$0);
   }

   @Override
   public void a(aef<?> $$0) {
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

   public class a extends cpc {
      @Override
      public akt e() {
         return (akt)cdz.this.dL();
      }

      @Override
      public void f() {
         cdz.this.al().b(cdz.c, this.m());
         cdz.this.al().b(cdz.d, this.l());
      }

      @Override
      public ehh g() {
         return cdz.this.dj();
      }

      public cdz h() {
         return cdz.this;
      }

      @Override
      public dt i() {
         return new dt(this, cdz.this.dj(), cdz.this.bF(), this.e(), 2, this.n().getString(), cdz.this.N_(), this.e().n(), cdz.this);
      }

      @Override
      public boolean j() {
         return !cdz.this.dG();
      }
   }
}
