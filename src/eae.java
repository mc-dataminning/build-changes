public class eae extends dye implements dku, eah.b {
   private eah a = this.j();

   public eae(iw $$0, ebg $$1) {
      super(dyg.R, $$0, $$1);
   }

   private eah j() {
      eag $$0 = eag.a;
      eag.a $$1 = eag.a.a;
      return new eah(this, $$0, $$1);
   }

   @Override
   protected void a(ua $$0, ji.a $$1) {
      super.a($$0, $$1);
      this.a = $$0.<eah>a(this.a.a(), $$1.a(uo.a)).orElseGet(this::j);
      if (this.n != null) {
         this.f();
      }
   }

   @Override
   protected void b(ua $$0, ji.a $$1) {
      super.b($$0, $$1);
      $$0.a(this.a.a(), $$1.a(uo.a), this.a);
   }

   public ace a() {
      return ace.a(this);
   }

   @Override
   public ua a(ji.a $$0) {
      return this.a.f().a(this.m().c(dwi.b));
   }

   @Override
   public void a(bxe<?> $$0, azz $$1) {
      if (this.n == null) {
         ag.b("Expected non-null level");
      } else {
         this.a.a($$0, this.n);
         this.e();
      }
   }

   public eah c() {
      return this.a;
   }

   @Override
   public eal d() {
      return !this.m().b(ebw.bB) ? eal.a : this.m().c(ebw.bB);
   }

   @Override
   public void a(djz $$0, eal $$1) {
      this.e();
      $$0.b(this.o, this.m().b(ebw.bB, $$1));
   }

   @Override
   public void f() {
      this.e();
      if (this.n != null) {
         this.n.a(this.o, this.m(), this.m(), 3);
      }
   }
}
