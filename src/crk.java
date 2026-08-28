public class crk extends bwm {
   private final crj b;

   public crk(crj $$0) {
      this.b = $$0;
   }

   @Override
   public czk a(bws $$0, czk $$1) {
      return $$0 == bws.a ? this.b.gi().b($$1) : super.a($$0, $$1);
   }

   @Override
   public czk a(bws $$0) {
      return $$0 == bws.a ? this.b.gi().g() : super.a($$0);
   }

   @Override
   public boolean a() {
      return this.b.gi().g().f() && super.a();
   }
}
