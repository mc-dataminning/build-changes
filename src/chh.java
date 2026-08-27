public class chh extends cgz {
   static final agm<String> c = agp.a(chh.class, ago.e);
   static final agm<vf> d = agp.a(chh.class, ago.f);
   private final csp e = new chh.a();
   private static final int i = 4;
   private int j;

   public chh(bly<? extends chh> $$0, cto $$1) {
      super($$0, $$1);
   }

   public chh(cto $$0, double $$1, double $$2, double $$3) {
      super(bly.t, $$0, $$1, $$2, $$3);
   }

   @Override
   protected cms ah_() {
      return cna.nL;
   }

   @Override
   protected void c_() {
      super.c_();
      this.an().a(c, "");
      this.an().a(d, ve.a);
   }

   @Override
   protected void a(sn $$0) {
      super.a($$0);
      this.e.b($$0);
      this.an().b(c, this.C().m());
      this.an().b(d, this.C().l());
   }

   @Override
   protected void b(sn $$0) {
      super.b($$0);
      this.e.a($$0);
   }

   @Override
   public cgz.a w() {
      return cgz.a.g;
   }

   @Override
   public djg y() {
      return cwr.fN.o();
   }

   public csp C() {
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
   public bka a(cfh $$0, bjz $$1) {
      return this.e.a($$0);
   }

   @Override
   public void a(agm<?> $$0) {
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

   public class a extends csp {
      @Override
      public and e() {
         return (and)chh.this.dM();
      }

      @Override
      public void f() {
         chh.this.an().b(chh.c, this.m());
         chh.this.an().b(chh.d, this.l());
      }

      @Override
      public els g() {
         return chh.this.dk();
      }

      public chh h() {
         return chh.this;
      }

      @Override
      public ds i() {
         return new ds(this, chh.this.dk(), chh.this.bG(), this.e(), 2, this.n().getString(), chh.this.Q_(), this.e().o(), chh.this);
      }

      @Override
      public boolean j() {
         return !chh.this.dH();
      }
   }
}
