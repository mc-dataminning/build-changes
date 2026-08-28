public class ahy implements zj<agt> {
   public static final za<vy, ahy> a = zj.a(ahy::a, ahy::new);
   private static final int b = 2;
   private final boolean c;

   public ahy(crv $$0) {
      this.c = $$0.b;
   }

   private ahy(vy $$0) {
      byte $$1 = $$0.readByte();
      this.c = ($$1 & 2) != 0;
   }

   private void a(vy $$0) {
      byte $$1 = 0;
      if (this.c) {
         $$1 = (byte)($$1 | 2);
      }

      $$0.l($$1);
   }

   @Override
   public zl<ahy> a() {
      return agr.bR;
   }

   public void a(agt $$0) {
      $$0.a(this);
   }

   public boolean b() {
      return this.c;
   }
}
