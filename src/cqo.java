public class cqo extends cqf {
   static final akk<String> c = ako.a(cqo.class, akm.e);
   static final akk<xh> d = ako.a(cqo.class, akm.f);
   private final ddv e = new cqo.a();
   private static final int i = 4;
   private int j;

   public cqo(bug<? extends cqo> $$0, dev $$1) {
      super($$0, $$1);
   }

   public cqo(dev $$0, double $$1, double $$2, double $$3) {
      super(bug.v, $$0, $$1, $$2, $$3);
   }

   @Override
   protected cvt al_() {
      return cwb.nM;
   }

   @Override
   protected void a(ako.a $$0) {
      super.a($$0);
      $$0.a(c, "");
      $$0.a(d, xg.a);
   }

   @Override
   protected void a(uj $$0) {
      super.a($$0);
      this.e.b($$0, this.dZ());
      this.av().a(c, this.E().m());
      this.av().a(d, this.E().l());
   }

   @Override
   protected void b(uj $$0) {
      super.b($$0);
      this.e.a($$0, this.dZ());
   }

   @Override
   public cqf.a y() {
      return cqf.a.g;
   }

   @Override
   public dvd A() {
      return dia.fN.m();
   }

   public ddv E() {
      return this.e;
   }

   @Override
   public void a(int $$0, int $$1, int $$2, boolean $$3) {
      if ($$3 && this.ag - this.j >= 4) {
         this.E().a(this.dX());
         this.j = this.ag;
      }
   }

   @Override
   public bry a(coh $$0, brx $$1) {
      return this.e.a($$0);
   }

   @Override
   public void a(akk<?> $$0) {
      super.a($$0);
      if (d.equals($$0)) {
         try {
            this.e.c(this.av().a(d));
         } catch (Throwable var3) {
         }
      } else if (c.equals($$0)) {
         this.e.a(this.av().a(c));
      }
   }

   @Override
   public boolean cX() {
      return true;
   }

   public class a extends ddv {
      @Override
      public arm e() {
         return (arm)cqo.this.dX();
      }

      @Override
      public void f() {
         cqo.this.av().a(cqo.c, this.m());
         cqo.this.av().a(cqo.d, this.l());
      }

      @Override
      public ezh g() {
         return cqo.this.dv();
      }

      public cqo h() {
         return cqo.this;
      }

      @Override
      public ev i() {
         return new ev(this, cqo.this.dv(), cqo.this.bV(), this.e(), 2, this.n().getString(), cqo.this.S_(), this.e().o(), cqo.this);
      }

      @Override
      public boolean j() {
         return !cqo.this.dS();
      }
   }
}
