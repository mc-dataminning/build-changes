public class ckv extends ckn {
   static final aim<String> c = aiq.a(ckv.class, aio.e);
   static final aim<vu> d = aiq.a(ckv.class, aio.f);
   private final cwa e = new ckv.a();
   private static final int i = 4;
   private int j;

   public ckv(bpc<? extends ckv> $$0, cwz $$1) {
      super($$0, $$1);
   }

   public ckv(cwz $$0, double $$1, double $$2, double $$3) {
      super(bpc.v, $$0, $$1, $$2, $$3);
   }

   @Override
   protected cqf ah_() {
      return cqn.nL;
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
   public ckn.a v() {
      return ckn.a.g;
   }

   @Override
   public dmz x() {
      return dac.fN.o();
   }

   public cwa B() {
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
   public bnc a(cis $$0, bnb $$1) {
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

   public class a extends cwa {
      @Override
      public apf e() {
         return (apf)ckv.this.dM();
      }

      @Override
      public void f() {
         ckv.this.an().a(ckv.c, this.m());
         ckv.this.an().a(ckv.d, this.l());
      }

      @Override
      public epr g() {
         return ckv.this.dk();
      }

      public ckv h() {
         return ckv.this;
      }

      @Override
      public du i() {
         return new du(this, ckv.this.dk(), ckv.this.bJ(), this.e(), 2, this.n().getString(), ckv.this.O_(), this.e().o(), ckv.this);
      }

      @Override
      public boolean j() {
         return !ckv.this.dH();
      }
   }
}
