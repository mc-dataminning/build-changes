public class esz extends esi {
   private final erx a;

   public esz(erx $$0, tl $$1) {
      super(0, 0, $$0.a($$1), 9 * 3, $$1);
      this.a = $$0;
   }

   @Override
   protected void b(erz $$0, int $$1, int $$2, float $$3) {
      int $$4 = this.r() + this.l() / 2;
      int $$5 = this.t() + this.i() / 2;
      tl $$6 = this.m();
      $$0.a(this.a, $$6, $$4 - this.a.a($$6) / 2, $$5 - 9, -1, false);
      String $$7 = exq.a(ac.b());
      $$0.a(this.a, $$7, $$4 - this.a.b($$7) / 2, $$5 + 9, -8355712, false);
   }

   @Override
   protected void a(ewd $$0) {
      $$0.a(ewc.a, this.m());
   }
}
