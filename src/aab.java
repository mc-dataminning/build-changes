public class aab implements uo<zb> {
   private final int a;
   private final acq b;
   private final boolean c;

   public aab(int $$0, cjc<?> $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1.e();
      this.c = $$2;
   }

   public aab(sf $$0) {
      this.a = $$0.readByte();
      this.b = $$0.t();
      this.c = $$0.readBoolean();
   }

   @Override
   public void a(sf $$0) {
      $$0.writeByte(this.a);
      $$0.a(this.b);
      $$0.writeBoolean(this.c);
   }

   public void a(zb $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }

   public acq c() {
      return this.b;
   }

   public boolean d() {
      return this.c;
   }
}
