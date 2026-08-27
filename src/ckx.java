public class ckx extends ckp {
   static final aim<String> c = aiq.a(ckx.class, aio.e);
   static final aim<vu> d = aiq.a(ckx.class, aio.f);
   private final cwc e = new ckx.a();
   private static final int i = 4;
   private int j;

   public ckx(bpd<? extends ckx> $$0, cxb $$1) {
      super($$0, $$1);
   }

   public ckx(cxb $$0, double $$1, double $$2, double $$3) {
      super(bpd.w, $$0, $$1, $$2, $$3);
   }

   @Override
   protected cqh ah_() {
      return cqp.nL;
   }

   @Override
   protected void a(aiq.a $$0) {
      super.a($$0);
      $$0.a(c, "");
      $$0.a(d, vt.a);
   }

   @Override
   protected void a(ta $$0) {
      super.a($$0);
      this.e.b($$0);
      this.an().a(c, this.B().m());
      this.an().a(d, this.B().l());
   }

   @Override
   protected void b(ta $$0) {
      super.b($$0);
      this.e.a($$0);
   }

   @Override
   public ckp.a v() {
      return ckp.a.g;
   }

   @Override
   public dnb x() {
      return dae.fN.o();
   }

   public cwc B() {
      return this.e;
   }

   @Override
   public void a(int $$0, int $$1, int $$2, boolean $$3) {
      if ($$3 && this.ah - this.j >= 4) {
         this.B().a(this.dM());
         this.j = this.ah;
      }
   }

   @Override
   public bnd a(ciu $$0, bnc $$1) {
      return this.e.a($$0);
   }

   @Override
   public void a(aim<?> $$0) {
      super.a($$0);
      if (d.equals($$0)) {
         try {
            this.e.c(this.an().a(d));
         } catch (Throwable var3) {
         }
      } else if (c.equals($$0)) {
         this.e.a(this.an().a(c));
      }
   }

   @Override
   public boolean cM() {
      return true;
   }

   public class a extends cwc {
      @Override
      public apf e() {
         return (apf)ckx.this.dM();
      }

      @Override
      public void f() {
         ckx.this.an().a(ckx.c, this.m());
         ckx.this.an().a(ckx.d, this.l());
      }

      @Override
      public ept g() {
         return ckx.this.dk();
      }

      public ckx h() {
         return ckx.this;
      }

      @Override
      public du i() {
         return new du(this, ckx.this.dk(), ckx.this.bJ(), this.e(), 2, this.n().getString(), ckx.this.O_(), this.e().o(), ckx.this);
      }

      @Override
      public boolean j() {
         return !ckx.this.dH();
      }
   }
}
