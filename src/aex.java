public class aex implements zw<aci> {
   public static final zn<wm, aex> a = zw.a(aex::a, aex::new);
   private final int b;
   private final byte c;

   public aex(bsu $$0, byte $$1) {
      this.b = $$0.al();
      this.c = $$1;
   }

   private aex(wm $$0) {
      this.b = $$0.l();
      this.c = $$0.readByte();
   }

   private void a(wm $$0) {
      $$0.c(this.b);
      $$0.k(this.c);
   }

   @Override
   public zy<aex> a() {
      return agu.am;
   }

   public void a(aci $$0) {
      $$0.a(this);
   }

   public bsu a(dby $$0) {
      return $$0.a(this.b);
   }

   public byte b() {
      return this.c;
   }
}
