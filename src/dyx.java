public class dyx extends dwx implements djq, dza.b {
   private dza a = this.j();

   public dyx(iu $$0, dzz $$1) {
      super(dwz.R, $$0, $$1);
   }

   private dza j() {
      dyz $$0 = dyz.a;
      dyz.a $$1 = dyz.a.a;
      return new dza(this, $$0, $$1);
   }

   @Override
   protected void a(tz $$0, jg.a $$1) {
      super.a($$0, $$1);
      this.a = $$0.<dza>a(this.a.a(), $$1.a(un.a)).orElseGet(this::j);
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
      return this.a.f().a(this.m().c(dvb.b));
   }

   @Override
   public void a(bwm<?> $$0, azv $$1) {
      if (this.n == null) {
         af.b("Expected non-null level");
      } else {
         this.a.a($$0, this.n);
         this.e();
      }
   }

   public dza c() {
      return this.a;
   }

   @Override
   public dze d() {
      return !this.m().b(eap.bB) ? dze.a : this.m().c(eap.bB);
   }

   @Override
   public void a(div $$0, dze $$1) {
      this.e();
      $$0.b(this.o, this.m().b(eap.bB, $$1));
   }

   @Override
   public void f() {
      this.e();
      if (this.n != null) {
         this.n.a(this.o, this.m(), this.m(), 3);
      }
   }
}
