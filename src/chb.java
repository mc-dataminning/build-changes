public class chb extends cgt {
   static final agj<String> c = agm.a(chb.class, agl.e);
   static final agj<vd> d = agm.a(chb.class, agl.f);
   private final csj e = new chb.a();
   private static final int i = 4;
   private int j;

   public chb(blt<? extends chb> $$0, cti $$1) {
      super($$0, $$1);
   }

   public chb(cti $$0, double $$1, double $$2, double $$3) {
      super(blt.t, $$0, $$1, $$2, $$3);
   }

   @Override
   protected cmm ah_() {
      return cmu.nL;
   }

   @Override
   protected void c_() {
      super.c_();
      this.an().a(c, "");
      this.an().a(d, vc.a);
   }

   @Override
   protected void a(sl $$0) {
      super.a($$0);
      this.e.b($$0);
      this.an().b(c, this.C().m());
      this.an().b(d, this.C().l());
   }

   @Override
   protected void b(sl $$0) {
      super.b($$0);
      this.e.a($$0);
   }

   @Override
   public cgt.a w() {
      return cgt.a.g;
   }

   @Override
   public dja y() {
      return cwl.fN.o();
   }

   public csj C() {
      return this.e;
   }

   @Override
   public void a(int $$0, int $$1, int $$2, boolean $$3) {
      if ($$3 && this.ah - this.j >= 4) {
         this.C().a(this.dM());
         this.j = this.ah;
      }
   }

   @Override
   public bjv a(cfb $$0, bju $$1) {
      return this.e.a($$0);
   }

   @Override
   public void a(agj<?> $$0) {
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

   public class a extends csj {
      @Override
      public amz e() {
         return (amz)chb.this.dM();
      }

      @Override
      public void f() {
         chb.this.an().b(chb.c, this.m());
         chb.this.an().b(chb.d, this.l());
      }

      @Override
      public elm g() {
         return chb.this.dk();
      }

      public chb h() {
         return chb.this;
      }

      @Override
      public ds i() {
         return new ds(this, chb.this.dk(), chb.this.bG(), this.e(), 2, this.n().getString(), chb.this.Q_(), this.e().o(), chb.this);
      }

      @Override
      public boolean j() {
         return !chb.this.dH();
      }
   }
}
