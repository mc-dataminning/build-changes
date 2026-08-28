public class aic implements zs<agy> {
   public static final zj<wi, aic> a = zs.a(aic::a, aic::new);
   private static final int b = 2;
   private final boolean c;

   public aic(com $$0) {
      this.c = $$0.b;
   }

   private aic(wi $$0) {
      byte $$1 = $$0.readByte();
      this.c = ($$1 & 2) != 0;
   }

   private void a(wi $$0) {
      byte $$1 = 0;
      if (this.c) {
         $$1 = (byte)($$1 | 2);
      }

      $$0.l($$1);
   }

   @Override
   public zu<aic> a() {
      return agw.bM;
   }

   public void a(agy $$0) {
      $$0.a(this);
   }

   public boolean b() {
      return this.c;
   }
}
