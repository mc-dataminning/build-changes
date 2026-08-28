public class crn extends bwm {
   private final crm b;

   public crn(crm $$0) {
      this.b = $$0;
   }

   @Override
   public czn a(bws $$0, czn $$1) {
      return $$0 == bws.a ? this.b.gi().b($$1) : super.a($$0, $$1);
   }

   @Override
   public czn a(bws $$0) {
      return $$0 == bws.a ? this.b.gi().g() : super.a($$0);
   }

   @Override
   public boolean a() {
      return this.b.gi().g().f() && super.a();
   }
}
