public class aeu implements zb<abm> {
   public static final ys<vu, aeu> a = zb.a(aeu::a, aeu::new);
   private final float b;
   private final int c;
   private final int d;

   public aeu(float $$0, int $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private aeu(vu $$0) {
      this.b = $$0.readFloat();
      this.d = $$0.l();
      this.c = $$0.l();
   }

   private void a(vu $$0) {
      $$0.a(this.b);
      $$0.c(this.d);
      $$0.c(this.c);
   }

   @Override
   public zd<aeu> a() {
      return afx.aG;
   }

   public void a(abm $$0) {
      $$0.a(this);
   }

   public float b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }
}
