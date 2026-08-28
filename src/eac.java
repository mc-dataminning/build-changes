public class eac extends dyc implements dks, eaf.b {
   private eaf a = this.j();

   public eac(iv $$0, ebe $$1) {
      super(dye.R, $$0, $$1);
   }

   private eaf j() {
      eae $$0 = eae.a;
      eae.a $$1 = eae.a.a;
      return new eaf(this, $$0, $$1);
   }

   @Override
   protected void a(tz $$0, jh.a $$1) {
      super.a($$0, $$1);
      this.a = $$0.<eaf>a(this.a.a(), $$1.a(un.a)).orElseGet(this::j);
      if (this.n != null) {
         this.f();
      }
   }

   @Override
   protected void b(tz $$0, jh.a $$1) {
      super.b($$0, $$1);
      $$0.a(this.a.a(), $$1.a(un.a), this.a);
   }

   public acc a() {
      return acc.a(this);
   }

   @Override
   public tz a(jh.a $$0) {
      return this.a.f().a(this.m().c(dwg.b));
   }

   @Override
   public void a(bxc<?> $$0, azx $$1) {
      if (this.n == null) {
         ag.b("Expected non-null level");
      } else {
         this.a.a($$0, this.n);
         this.e();
      }
   }

   public eaf c() {
      return this.a;
   }

   @Override
   public eaj d() {
      return !this.m().b(ebu.bB) ? eaj.a : this.m().c(ebu.bB);
   }

   @Override
   public void a(djx $$0, eaj $$1) {
      this.e();
      $$0.b(this.o, this.m().b(ebu.bB, $$1));
   }

   @Override
   public void f() {
      this.e();
      if (this.n != null) {
         this.n.a(this.o, this.m(), this.m(), 3);
      }
   }
}
