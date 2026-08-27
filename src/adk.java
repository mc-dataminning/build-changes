public class adk implements zl<abw> {
   public static final zc<we, adk> a = zl.a(adk::a, adk::new);
   private final int b;
   private final ir c;
   private final int d;
   private final boolean e;

   public adk(int $$0, ir $$1, int $$2, boolean $$3) {
      this.b = $$0;
      this.c = $$1.i();
      this.d = $$2;
      this.e = $$3;
   }

   private adk(we $$0) {
      this.b = $$0.readInt();
      this.c = $$0.e();
      this.d = $$0.readInt();
      this.e = $$0.readBoolean();
   }

   private void a(we $$0) {
      $$0.p(this.b);
      $$0.a(this.c);
      $$0.p(this.d);
      $$0.a(this.e);
   }

   @Override
   public zn<adk> a() {
      return agj.M;
   }

   public void a(abw $$0) {
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

   public ir g() {
      return this.c;
   }
}
