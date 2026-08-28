public class dzm extends dxm implements dkc, dzp.b {
   private dzp a = this.j();

   public dzm(iv $$0, eao $$1) {
      super(dxo.R, $$0, $$1);
   }

   private dzp j() {
      dzo $$0 = dzo.a;
      dzo.a $$1 = dzo.a.a;
      return new dzp(this, $$0, $$1);
   }

   @Override
   protected void a(tz $$0, jh.a $$1) {
      super.a($$0, $$1);
      this.a = $$0.<dzp>a(this.a.a(), $$1.a(un.a)).orElseGet(this::j);
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
      return this.a.f().a(this.m().c(dvq.b));
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

   public dzp c() {
      return this.a;
   }

   @Override
   public dzt d() {
      return !this.m().b(ebe.bB) ? dzt.a : this.m().c(ebe.bB);
   }

   @Override
   public void a(djh $$0, dzt $$1) {
      this.e();
      $$0.b(this.o, this.m().b(ebe.bB, $$1));
   }

   @Override
   public void f() {
      this.e();
      if (this.n != null) {
         this.n.a(this.o, this.m(), this.m(), 3);
      }
   }
}
