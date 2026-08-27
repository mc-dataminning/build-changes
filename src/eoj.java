public class eoj extends gfb {
   private final eyk a;
   private final eoj.a b;
   private etj c = etj.a;

   public eoj(ens $$0, eyk $$1) {
      super(eqn.a);
      this.a = $$1;
      this.b = a($$0);
   }

   public eoj(tl $$0, eyk $$1) {
      super(eqn.a);
      this.a = $$1;
      this.b = a($$0);
   }

   public eoj(tl $$0, tl $$1, eyk $$2) {
      super(eqn.a);
      this.a = $$2;
      this.b = a($$0, $$1);
   }

   private static eoj.a a(ens $$0) {
      emh $$1 = $$0.a;
      return a(tl.a("mco.errorMessage.realmsService.realmsError", $$1.a()), $$1.b());
   }

   private static eoj.a a(tl $$0) {
      return a(tl.c("mco.errorMessage.generic"), $$0);
   }

   private static eoj.a a(tl $$0, tl $$1) {
      return new eoj.a($$0, $$1);
   }

   @Override
   public void aH_() {
      this.d(esq.a(tk.h, $$0 -> this.f.a(this.a)).a(this.g / 2 - 100, this.h - 52, 200, 20).a());
      this.c = etj.a(this.i, this.b.b, this.g * 3 / 4);
   }

   @Override
   public tl g() {
      return tl.h().b(this.b.a).f(": ").b(this.b.b);
   }

   @Override
   public void a(esf $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.b.a, this.g / 2, 80, -1);
      this.c.a($$0, this.g / 2, 100, 9, -65536);
   }

   static record a(tl a, tl b) {
   }
}
