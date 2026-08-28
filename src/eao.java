public class eao extends dyo implements dle, ear.b {
   private ear a = this.j();

   public eao(iw $$0, ebq $$1) {
      super(dyq.R, $$0, $$1);
   }

   private ear j() {
      eaq $$0 = eaq.a;
      eaq.a $$1 = eaq.a.a;
      return new ear(this, $$0, $$1);
   }

   @Override
   protected void a(ua $$0, ji.a $$1) {
      super.a($$0, $$1);
      this.a = $$0.<ear>a(this.a.a(), $$1.a(uo.a)).orElseGet(this::j);
      if (this.n != null) {
         this.f();
      }
   }

   @Override
   protected void b(ua $$0, ji.a $$1) {
      super.b($$0, $$1);
      $$0.a(this.a.a(), $$1.a(uo.a), this.a);
   }

   public acl a() {
      return acl.a(this);
   }

   @Override
   public ua a(ji.a $$0) {
      return this.a.f().a(this.m().c(dws.b));
   }

   @Override
   public void a(bxn<?> $$0, bai $$1) {
      if (this.n == null) {
         ag.b("Expected non-null level");
      } else {
         this.a.a($$0, this.n);
         this.e();
      }
   }

   public ear c() {
      return this.a;
   }

   @Override
   public eav d() {
      return !this.m().b(ecg.bB) ? eav.a : this.m().c(ecg.bB);
   }

   @Override
   public void a(dkj $$0, eav $$1) {
      this.e();
      $$0.b(this.o, this.m().b(ecg.bB, $$1));
   }

   @Override
   public void f() {
      this.e();
      if (this.n != null) {
         this.n.a(this.o, this.m(), this.m(), 3);
      }
   }
}
