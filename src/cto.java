public class cto extends cte {
   static final akh<String> b = akl.a(cto.class, akj.e);
   static final akh<ww> c = akl.a(cto.class, akj.f);
   private final dhq d = new cto.a();
   private static final int h = 4;
   private int i;

   public cto(bwj<? extends cto> $$0, dip $$1) {
      super($$0, $$1);
   }

   @Override
   protected cyo o() {
      return cyw.oq;
   }

   @Override
   public cys dI() {
      return new cys(cyw.vQ);
   }

   @Override
   protected void a(akl.a $$0) {
      super.a($$0);
      $$0.a(b, "");
      $$0.a(c, wv.a);
   }

   @Override
   protected void a(tx $$0) {
      super.a($$0);
      this.d.b($$0, this.dX());
      this.au().a(b, this.q().m());
      this.au().a(c, this.q().l());
   }

   @Override
   protected void b(tx $$0) {
      super.b($$0);
      this.d.a($$0, this.dX());
   }

   @Override
   public dzo v() {
      return dlw.gi.m();
   }

   public dhq q() {
      return this.d;
   }

   @Override
   public void a(int $$0, int $$1, int $$2, boolean $$3) {
      if ($$3 && this.af - this.i >= 4) {
         this.q().a(this.dV());
         this.i = this.af;
      }
   }

   @Override
   public bty a(cqs $$0, btx $$1) {
      return this.d.a($$0);
   }

   @Override
   public void a(akh<?> $$0) {
      super.a($$0);
      if (c.equals($$0)) {
         try {
            this.d.c(this.au().a(c));
         } catch (Throwable var3) {
         }
      } else if (b.equals($$0)) {
         this.d.a(this.au().a(b));
      }
   }

   public class a extends dhq {
      @Override
      public aro e() {
         return (aro)cto.this.dV();
      }

      @Override
      public void f() {
         cto.this.au().a(cto.b, this.m());
         cto.this.au().a(cto.c, this.l());
      }

      @Override
      public fdw g() {
         return cto.this.dt();
      }

      public cto h() {
         return cto.this;
      }

      @Override
      public ei i() {
         return new ei(this, cto.this.dt(), cto.this.bU(), this.e(), 2, this.n().getString(), cto.this.m_(), this.e().p(), cto.this);
      }

      @Override
      public boolean j() {
         return !cto.this.dQ();
      }
   }
}
