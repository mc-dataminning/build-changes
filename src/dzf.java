public class dzf extends dxf implements djv, dzi.b {
   private dzi a = this.j();

   public dzf(iu $$0, eah $$1) {
      super(dxh.R, $$0, $$1);
   }

   private dzi j() {
      dzh $$0 = dzh.a;
      dzh.a $$1 = dzh.a.a;
      return new dzi(this, $$0, $$1);
   }

   @Override
   protected void a(tz $$0, jg.a $$1) {
      super.a($$0, $$1);
      this.a = $$0.<dzi>a(this.a.a(), $$1.a(un.a)).orElseGet(this::j);
      if (this.n != null) {
         this.f();
      }
   }

   @Override
   protected void b(tz $$0, jg.a $$1) {
      super.b($$0, $$1);
      $$0.a(this.a.a(), $$1.a(un.a), this.a);
   }

   public aca a() {
      return aca.a(this);
   }

   @Override
   public tz a(jg.a $$0) {
      return this.a.f().a(this.m().c(dvj.b));
   }

   @Override
   public void a(bwo<?> $$0, azv $$1) {
      if (this.n == null) {
         af.b("Expected non-null level");
      } else {
         this.a.a($$0, this.n);
         this.e();
      }
   }

   public dzi c() {
      return this.a;
   }

   @Override
   public dzm d() {
      return !this.m().b(eax.bB) ? dzm.a : this.m().c(eax.bB);
   }

   @Override
   public void a(dja $$0, dzm $$1) {
      this.e();
      $$0.b(this.o, this.m().b(eax.bB, $$1));
   }

   @Override
   public void f() {
      this.e();
      if (this.n != null) {
         this.n.a(this.o, this.m(), this.m(), 3);
      }
   }
}
