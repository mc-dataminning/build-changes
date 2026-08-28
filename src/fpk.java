public class fpk extends fob {
   private final dba s;

   public fpk(dba $$0) {
      this.s = $$0;
   }

   @Override
   public dba m() {
      return this.s;
   }

   @Override
   int E() {
      return 150;
   }

   @Override
   protected void aM_() {
      super.aM_();
      this.a.a(this.m().m());
   }

   @Override
   protected void a(dba $$0) {
      if ($$0 instanceof cpc.a $$1) {
         this.m.L().b(new ail($$1.h().al(), this.a.a(), $$0.p()));
      }
   }
}
