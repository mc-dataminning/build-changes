public class ahy implements zv<agv> {
   public static final zm<wl, ahy> a = zv.a(ahy::a, ahy::new);
   private static final int b = 2;
   private final boolean c;

   public ahy(cmt $$0) {
      this.c = $$0.b;
   }

   private ahy(wl $$0) {
      byte $$1 = $$0.readByte();
      this.c = ($$1 & 2) != 0;
   }

   private void a(wl $$0) {
      byte $$1 = 0;
      if (this.c) {
         $$1 = (byte)($$1 | 2);
      }

      $$0.k($$1);
   }

   @Override
   public zx<ahy> a() {
      return agt.bJ;
   }

   public void a(agv $$0) {
      $$0.a(this);
   }

   public boolean b() {
      return this.c;
   }
}
