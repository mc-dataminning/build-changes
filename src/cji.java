public class cji extends cja {
   static final aie<String> c = aih.a(cji.class, aig.e);
   static final aie<vq> d = aih.a(cji.class, aig.f);
   private final cuo e = new cji.a();
   private static final int i = 4;
   private int j;

   public cji(bnu<? extends cji> $$0, cvn $$1) {
      super($$0, $$1);
   }

   public cji(cvn $$0, double $$1, double $$2, double $$3) {
      super(bnu.u, $$0, $$1, $$2, $$3);
   }

   @Override
   protected cou ai_() {
      return cpc.nL;
   }

   @Override
   protected void c_() {
      super.c_();
      this.an().a(c, "");
      this.an().a(d, vp.a);
   }

   @Override
   protected void a(sw $$0) {
      super.a($$0);
      this.e.b($$0);
      this.an().b(c, this.C().m());
      this.an().b(d, this.C().l());
   }

   @Override
   protected void b(sw $$0) {
      super.b($$0);
      this.e.a($$0);
   }

   @Override
   public cja.a w() {
      return cja.a.g;
   }

   @Override
   public dlf y() {
      return cyq.fN.o();
   }

   public cuo C() {
      return this.e;
   }

   @Override
   public void a(int $$0, int $$1, int $$2, boolean $$3) {
      if ($$3 && this.ag - this.j >= 4) {
         this.C().a(this.dM());
         this.j = this.ag;
      }
   }

   @Override
   public blu a(chh $$0, blt $$1) {
      return this.e.a($$0);
   }

   @Override
   public void a(aie<?> $$0) {
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

   public class a extends cuo {
      @Override
      public aov e() {
         return (aov)cji.this.dM();
      }

      @Override
      public void f() {
         cji.this.an().b(cji.c, this.m());
         cji.this.an().b(cji.d, this.l());
      }

      @Override
      public ens g() {
         return cji.this.dk();
      }

      public cji h() {
         return cji.this;
      }

      @Override
      public du i() {
         return new du(this, cji.this.dk(), cji.this.bG(), this.e(), 2, this.n().getString(), cji.this.Q_(), this.e().o(), cji.this);
      }

      @Override
      public boolean j() {
         return !cji.this.dH();
      }
   }
}
