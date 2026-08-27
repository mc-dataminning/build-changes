public class ecf implements ecg {
   private final cqz b;

   public ecf(cqz $$0) {
      this.b = $$0;
   }

   @Override
   public void a(hx $$0, dgb $$1, ht $$2, ht $$3, int $$4, int $$5) {
      ecg.a(this.b, $$0, $$1, $$2, $$3, $$4, $$5 - 1);
   }

   @Override
   public void a(ht $$0, cua $$1, ht $$2) {
      dgb $$3 = this.b.a_($$0);
      this.a($$3, $$0, $$1, $$2, false);
   }

   @Override
   public void a(dgb $$0, ht $$1, cua $$2, ht $$3, boolean $$4) {
      ecg.a(this.b, $$0, $$1, $$2, $$3, $$4);
   }
}
