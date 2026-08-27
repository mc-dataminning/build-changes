public class ady implements yz<abk> {
   public static final yq<vs, ady> a = yz.a(ady::a, ady::new);
   private final int b;
   private final byte c;

   public ady(bql $$0, byte $$1) {
      this.b = $$0.aj();
      this.c = $$1;
   }

   private ady(vs $$0) {
      this.b = $$0.l();
      this.c = $$0.readByte();
   }

   private void a(vs $$0) {
      $$0.c(this.b);
      $$0.k(this.c);
   }

   @Override
   public zb<ady> a() {
      return afv.am;
   }

   public void a(abk $$0) {
      $$0.a(this);
   }

   public bql a(czu $$0) {
      return $$0.a(this.b);
   }

   public byte b() {
      return this.c;
   }
}
