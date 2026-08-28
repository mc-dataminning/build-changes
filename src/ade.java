public class ade implements zw<aci> {
   public static final zn<wm, ade> a = zw.a(ade::a, ade::new);
   private final int b;
   private final int c;
   private final int d;

   public ade(int $$0, int $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private ade(wm $$0) {
      this.b = $$0.readUnsignedByte();
      this.c = $$0.readShort();
      this.d = $$0.readShort();
   }

   private void a(wm $$0) {
      $$0.k(this.b);
      $$0.l(this.c);
      $$0.l(this.d);
   }

   @Override
   public zy<ade> a() {
      return agu.v;
   }

   public void a(aci $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }
}
