public class aef implements yw<abl> {
   public static final yn<vl, aef> a = yw.a(aef::a, aef::new);
   private final int b;
   private final byte c;

   public aef(bul $$0, byte $$1) {
      this.b = $$0.ar();
      this.c = $$1;
   }

   private aef(vl $$0) {
      this.b = $$0.l();
      this.c = $$0.readByte();
   }

   private void a(vl $$0) {
      $$0.c(this.b);
      $$0.l(this.c);
   }

   @Override
   public yy<aef> a() {
      return age.aq;
   }

   public void a(abl $$0) {
      $$0.a(this);
   }

   public bul a(dgi $$0) {
      return $$0.a(this.b);
   }

   public float b() {
      return ayz.a(this.c);
   }
}
