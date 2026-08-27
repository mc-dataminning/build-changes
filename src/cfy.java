public class cfy extends cfq {
   static final afs<String> c = afv.a(cfy.class, afu.e);
   static final afs<uv> d = afv.a(cfy.class, afu.f);
   private final crg e = new cfy.a();
   private static final int i = 4;
   private int j;

   public cfy(bkz<? extends cfy> $$0, csf $$1) {
      super($$0, $$1);
   }

   public cfy(csf $$0, double $$1, double $$2, double $$3) {
      super(bkz.s, $$0, $$1, $$2, $$3);
   }

   @Override
   protected clj ah_() {
      return clr.nL;
   }

   @Override
   protected void c_() {
      super.c_();
      this.an().a(c, "");
      this.an().a(d, uu.a);
   }

   @Override
   protected void a(sd $$0) {
      super.a($$0);
      this.e.b($$0);
      this.an().b(c, this.C().m());
      this.an().b(d, this.C().l());
   }

   @Override
   protected void b(sd $$0) {
      super.b($$0);
      this.e.a($$0);
   }

   @Override
   public cfq.a w() {
      return cfq.a.g;
   }

   @Override
   public dhn y() {
      return cvh.fN.o();
   }

   public crg C() {
      return this.e;
   }

   @Override
   public void a(int $$0, int $$1, int $$2, boolean $$3) {
      if ($$3 && this.ah - this.j >= 4) {
         this.C().a(this.dN());
         this.j = this.ah;
      }
   }

   @Override
   public bjb a(cdz $$0, bja $$1) {
      return this.e.a($$0);
   }

   @Override
   public void a(afs<?> $$0) {
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
   public boolean cN() {
      return true;
   }

   public class a extends crg {
      @Override
      public ami e() {
         return (ami)cfy.this.dN();
      }

      @Override
      public void f() {
         cfy.this.an().b(cfy.c, this.m());
         cfy.this.an().b(cfy.d, this.l());
      }

      @Override
      public ejz g() {
         return cfy.this.dl();
      }

      public cfy h() {
         return cfy.this;
      }

      @Override
      public du i() {
         return new du(this, cfy.this.dl(), cfy.this.bG(), this.e(), 2, this.n().getString(), cfy.this.Q_(), this.e().n(), cfy.this);
      }

      @Override
      public boolean j() {
         return !cfy.this.dI();
      }
   }
}
