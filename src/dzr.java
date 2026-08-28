public class dzr extends dxr implements dkh, dzu.b {
   private dzu a = this.j();

   public dzr(iv $$0, eat $$1) {
      super(dxt.R, $$0, $$1);
   }

   private dzu j() {
      dzt $$0 = dzt.a;
      dzt.a $$1 = dzt.a.a;
      return new dzu(this, $$0, $$1);
   }

   @Override
   protected void a(tz $$0, jh.a $$1) {
      super.a($$0, $$1);
      this.a = $$0.<dzu>a(this.a.a(), $$1.a(un.a)).orElseGet(this::j);
      if (this.n != null) {
         this.f();
      }
   }

   @Override
   protected void b(tz $$0, jh.a $$1) {
      super.b($$0, $$1);
      $$0.a(this.a.a(), $$1.a(un.a), this.a);
   }

   public aca a() {
      return aca.a(this);
   }

   @Override
   public tz a(jh.a $$0) {
      return this.a.f().a(this.m().c(dvv.b));
   }

   @Override
   public void a(bwr<?> $$0, azv $$1) {
      if (this.n == null) {
         ag.b("Expected non-null level");
      } else {
         this.a.a($$0, this.n);
         this.e();
      }
   }

   public dzu c() {
      return this.a;
   }

   @Override
   public dzy d() {
      return !this.m().b(ebj.bB) ? dzy.a : this.m().c(ebj.bB);
   }

   @Override
   public void a(djm $$0, dzy $$1) {
      this.e();
      $$0.b(this.o, this.m().b(ebj.bB, $$1));
   }

   @Override
   public void f() {
      this.e();
      if (this.n != null) {
         this.n.a(this.o, this.m(), this.m(), 3);
      }
   }
}
