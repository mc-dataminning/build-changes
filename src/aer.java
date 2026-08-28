public class aer implements zj<aby> {
   public static final za<vy, aer> a = zj.a(aer::a, aer::new);
   private final int b;
   private final byte c;

   public aer(bwv $$0, byte $$1) {
      this.b = $$0.ao();
      this.c = $$1;
   }

   private aer(vy $$0) {
      this.b = $$0.l();
      this.c = $$0.readByte();
   }

   private void a(vy $$0) {
      $$0.c(this.b);
      $$0.l(this.c);
   }

   @Override
   public zl<aer> a() {
      return agr.aq;
   }

   public void a(aby $$0) {
      $$0.a(this);
   }

   public bwv a(djz $$0) {
      return $$0.a(this.b);
   }

   public float b() {
      return azq.a(this.c);
   }
}
