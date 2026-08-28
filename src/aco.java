public class aco implements zr<acg> {
   public static final zi<wv, aco> a = zr.a(aco::a, aco::new);
   private final jh b;
   private final int c;
   private final int d;
   private final dkd e;

   public aco(jh $$0, dkd $$1, int $$2, int $$3) {
      this.b = $$0;
      this.e = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   private aco(wv $$0) {
      this.b = $$0.e();
      this.c = $$0.readUnsignedByte();
      this.d = $$0.readUnsignedByte();
      this.e = zg.a(mb.f).decode($$0);
   }

   private void a(wv $$0) {
      $$0.a(this.b);
      $$0.l(this.c);
      $$0.l(this.d);
      zg.a(mb.f).encode($$0, this.e);
   }

   @Override
   public zt<aco> a() {
      return agz.j;
   }

   public void a(acg $$0) {
      $$0.a(this);
   }

   public jh b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }

   public dkd g() {
      return this.e;
   }
}
