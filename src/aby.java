public class aby implements yw<abl> {
   public static final yn<vl, aby> a = yw.a(aby::a, aby::new);
   private final bsg b;
   private final boolean c;

   public aby(bsg $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private aby(vl $$0) {
      this.b = bsg.a($$0.readUnsignedByte());
      this.c = $$0.readBoolean();
   }

   private void a(vl $$0) {
      $$0.l(this.b.a());
      $$0.a(this.c);
   }

   @Override
   public yy<aby> a() {
      return age.m;
   }

   public void a(abl $$0) {
      $$0.a(this);
   }

   public boolean b() {
      return this.c;
   }

   public bsg e() {
      return this.b;
   }
}
