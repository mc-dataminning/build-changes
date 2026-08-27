public class esx extends esg {
   private final erv a;

   public esx(erv $$0, te $$1) {
      super(0, 0, $$0.a($$1), 9 * 2, $$1);
      this.a = $$0;
   }

   @Override
   protected void b(erx $$0, int $$1, int $$2, float $$3) {
      int $$4 = this.p() + this.k() / 2;
      int $$5 = this.r() + this.h() / 2;
      te $$6 = this.l();
      $$0.a(this.a, $$6, $$4 - this.a.a($$6) / 2, $$5 - 9, -1, false);
      String $$7 = exg.a(ac.b());
      $$0.a(this.a, $$7, $$4 - this.a.b($$7) / 2, $$5, -8355712, false);
   }

   @Override
   protected void a(evt $$0) {
      $$0.a(evs.a, this.l());
   }
}
