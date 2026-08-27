public class chi extends cha {
   static final agm<String> c = agp.a(chi.class, ago.e);
   static final agm<vf> d = agp.a(chi.class, ago.f);
   private final csq e = new chi.a();
   private static final int i = 4;
   private int j;

   public chi(blz<? extends chi> $$0, ctp $$1) {
      super($$0, $$1);
   }

   public chi(ctp $$0, double $$1, double $$2, double $$3) {
      super(blz.t, $$0, $$1, $$2, $$3);
   }

   @Override
   protected cmt ah_() {
      return cnb.nL;
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
   public cha.a w() {
      return cha.a.g;
   }

   @Override
   public djh y() {
      return cws.fN.o();
   }

   public csq C() {
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
   public bkb a(cfi $$0, bka $$1) {
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

   public class a extends csq {
      @Override
      public and e() {
         return (and)chi.this.dM();
      }

      @Override
      public void f() {
         chi.this.an().b(chi.c, this.m());
         chi.this.an().b(chi.d, this.l());
      }

      @Override
      public elt g() {
         return chi.this.dk();
      }

      public chi h() {
         return chi.this;
      }

      @Override
      public ds i() {
         return new ds(this, chi.this.dk(), chi.this.bG(), this.e(), 2, this.n().getString(), chi.this.Q_(), this.e().o(), chi.this);
      }

      @Override
      public boolean j() {
         return !chi.this.dH();
      }
   }
}
