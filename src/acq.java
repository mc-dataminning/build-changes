public class acq implements vd<abc> {
   private final int a;
   private final cjf b;

   public acq(int $$0, cjf $$1) {
      this.a = $$0;
      this.b = $$1.p();
   }

   public void a(abc $$0) {
      $$0.a(this);
   }

   public acq(so $$0) {
      this.a = $$0.readShort();
      this.b = $$0.q();
   }

   @Override
   public void a(so $$0) {
      $$0.l(this.a);
      $$0.a(this.b);
   }

   public int a() {
      return this.a;
   }

   public cjf d() {
      return this.b;
   }
}
