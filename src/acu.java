public class acu implements zb<abm> {
   public static final ys<vu, acu> a = zb.a(acu::a, acu::new);
   private final int b;
   private final int c;
   private final int d;

   public acu(int $$0, int $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private acu(vu $$0) {
      this.b = $$0.readUnsignedByte();
      this.c = $$0.l();
      this.d = $$0.readInt();
   }

   private void a(vu $$0) {
      $$0.k(this.b);
      $$0.c(this.c);
      $$0.p(this.d);
   }

   @Override
   public zd<acu> a() {
      return afx.H;
   }

   public void a(abm $$0) {
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
