public class aeg implements zv<ach> {
   public static final zm<wl, aeg> a = zv.a(aeg::a, aeg::new);
   private final int b;
   private final ale c;

   public aeg(int $$0, cyw<?> $$1) {
      this.b = $$0;
      this.c = $$1.a();
   }

   private aeg(wl $$0) {
      this.b = $$0.readByte();
      this.c = $$0.q();
   }

   private void a(wl $$0) {
      $$0.k(this.b);
      $$0.a(this.c);
   }

   @Override
   public zx<aeg> a() {
      return agt.Y;
   }

   public void a(ach $$0) {
      $$0.a(this);
   }

   public ale b() {
      return this.c;
   }

   public int e() {
      return this.b;
   }
}
