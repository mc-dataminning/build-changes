public class add implements ze<abq> {
   public static final yv<vx, add> a = ze.a(add::a, add::new);
   private final int b;
   private final io c;
   private final int d;
   private final boolean e;

   public add(int $$0, io $$1, int $$2, boolean $$3) {
      this.b = $$0;
      this.c = $$1.i();
      this.d = $$2;
      this.e = $$3;
   }

   private add(vx $$0) {
      this.b = $$0.readInt();
      this.c = $$0.e();
      this.d = $$0.readInt();
      this.e = $$0.readBoolean();
   }

   private void a(vx $$0) {
      $$0.p(this.b);
      $$0.a(this.c);
      $$0.p(this.d);
      $$0.a(this.e);
   }

   @Override
   public zg<add> a() {
      return agb.L;
   }

   public void a(abq $$0) {
      $$0.a(this);
   }

   public boolean b() {
      return this.e;
   }

   public int e() {
      return this.b;
   }

   public int f() {
      return this.d;
   }

   public io g() {
      return this.c;
   }
}
