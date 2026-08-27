public class aef implements ze<abq> {
   public static final yv<vx, aef> a = ze.a(aef::a, aef::new);
   private final int b;
   private final byte c;

   public aef(brw $$0, byte $$1) {
      this.b = $$0.al();
      this.c = $$1;
   }

   private aef(vx $$0) {
      this.b = $$0.l();
      this.c = $$0.readByte();
   }

   private void a(vx $$0) {
      $$0.c(this.b);
      $$0.k(this.c);
   }

   @Override
   public zg<aef> a() {
      return agc.am;
   }

   public void a(abq $$0) {
      $$0.a(this);
   }

   public brw a(daz $$0) {
      return $$0.a(this.b);
   }

   public byte b() {
      return this.c;
   }
}
