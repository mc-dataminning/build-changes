public class ahy implements zo<agu> {
   public static final zf<we, ahy> a = zo.a(ahy::a, ahy::new);
   private static final int b = 2;
   private final boolean c;

   public ahy(cod $$0) {
      this.c = $$0.b;
   }

   private ahy(we $$0) {
      byte $$1 = $$0.readByte();
      this.c = ($$1 & 2) != 0;
   }

   private void a(we $$0) {
      byte $$1 = 0;
      if (this.c) {
         $$1 = (byte)($$1 | 2);
      }

      $$0.l($$1);
   }

   @Override
   public zq<ahy> a() {
      return ags.bM;
   }

   public void a(agu $$0) {
      $$0.a(this);
   }

   public boolean b() {
      return this.c;
   }
}
