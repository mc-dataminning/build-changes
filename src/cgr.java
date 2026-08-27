public class cgr extends cgj {
   static final afz<String> c = agc.a(cgr.class, agb.e);
   static final afz<vb> d = agc.a(cgr.class, agb.f);
   private final crz e = new cgr.a();
   private static final int i = 4;
   private int j;

   public cgr(blj<? extends cgr> $$0, csy $$1) {
      super($$0, $$1);
   }

   public cgr(csy $$0, double $$1, double $$2, double $$3) {
      super(blj.t, $$0, $$1, $$2, $$3);
   }

   @Override
   protected cmc ah_() {
      return cmk.nL;
   }

   @Override
   protected void c_() {
      super.c_();
      this.an().a(c, "");
      this.an().a(d, va.a);
   }

   @Override
   protected void a(sj $$0) {
      super.a($$0);
      this.e.b($$0);
      this.an().b(c, this.C().m());
      this.an().b(d, this.C().l());
   }

   @Override
   protected void b(sj $$0) {
      super.b($$0);
      this.e.a($$0);
   }

   @Override
   public cgj.a w() {
      return cgj.a.g;
   }

   @Override
   public dip y() {
      return cwb.fN.o();
   }

   public crz C() {
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
   public bjl a(cer $$0, bjk $$1) {
      return this.e.a($$0);
   }

   @Override
   public void a(afz<?> $$0) {
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

   public class a extends crz {
      @Override
      public amp e() {
         return (amp)cgr.this.dM();
      }

      @Override
      public void f() {
         cgr.this.an().b(cgr.c, this.m());
         cgr.this.an().b(cgr.d, this.l());
      }

      @Override
      public elb g() {
         return cgr.this.dk();
      }

      public cgr h() {
         return cgr.this;
      }

      @Override
      public ds i() {
         return new ds(this, cgr.this.dk(), cgr.this.bG(), this.e(), 2, this.n().getString(), cgr.this.Q_(), this.e().n(), cgr.this);
      }

      @Override
      public boolean j() {
         return !cgr.this.dH();
      }
   }
}
