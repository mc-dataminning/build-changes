public class cdv extends cdn {
   static final aeg<String> c = aej.a(cdv.class, aei.e);
   static final aeg<tn> d = aej.a(cdv.class, aei.f);
   private final coy e = new cdv.a();
   private static final int f = 4;
   private int g;

   public cdv(biw<? extends cdv> $$0, cpx $$1) {
      super($$0, $$1);
   }

   public cdv(cpx $$0, double $$1, double $$2, double $$3) {
      super(biw.s, $$0, $$1, $$2, $$3);
   }

   @Override
   protected cjc q() {
      return cjk.na;
   }

   @Override
   protected void a_() {
      super.a_();
      this.al().a(c, "");
      this.al().a(d, tm.a);
   }

   @Override
   protected void a(qy $$0) {
      super.a($$0);
      this.e.b($$0);
      this.al().b(c, this.G().m());
      this.al().b(d, this.G().l());
   }

   @Override
   protected void b(qy $$0) {
      super.b($$0);
      this.e.a($$0);
   }

   @Override
   public cdn.a z() {
      return cdn.a.g;
   }

   @Override
   public dfl B() {
      return csy.fN.n();
   }

   public coy G() {
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
   public bha a(cbw $$0, bgz $$1) {
      return this.e.a($$0);
   }

   @Override
   public void a(aeg<?> $$0) {
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

   public class a extends coy {
      @Override
      public aks e() {
         return (aks)cdv.this.dL();
      }

      @Override
      public void f() {
         cdv.this.al().b(cdv.c, this.m());
         cdv.this.al().b(cdv.d, this.l());
      }

      @Override
      public ehp g() {
         return cdv.this.dj();
      }

      public cdv h() {
         return cdv.this;
      }

      @Override
      public dt i() {
         return new dt(this, cdv.this.dj(), cdv.this.bF(), this.e(), 2, this.n().getString(), cdv.this.N_(), this.e().n(), cdv.this);
      }

      @Override
      public boolean j() {
         return !cdv.this.dG();
      }
   }
}
