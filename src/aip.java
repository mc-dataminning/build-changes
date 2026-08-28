public class aip implements zk<agq> {
   public static final zb<wa, aip> a = zk.a(aip::a, aip::new);
   private final bro b;
   private final int c;
   private final float d;
   private final float e;

   public aip(bro $$0, int $$1, float $$2, float $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   private aip(wa $$0) {
      this.b = $$0.b(bro.class);
      this.c = $$0.l();
      this.d = $$0.readFloat();
      this.e = $$0.readFloat();
   }

   private void a(wa $$0) {
      $$0.a(this.b);
      $$0.c(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
   }

   @Override
   public zm<aip> a() {
      return ago.cg;
   }

   public void a(agq $$0) {
      $$0.a(this);
   }

   public bro b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public float f() {
      return this.d;
   }

   public float g() {
      return this.e;
   }
}
