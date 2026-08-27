public class acn implements yp<aba> {
   public static final yg<vi, acn> a = yp.a(acn::a, acn::new);
   private final int b;
   private final id c;
   private final int d;
   private final boolean e;

   public acn(int $$0, id $$1, int $$2, boolean $$3) {
      this.b = $$0;
      this.c = $$1.i();
      this.d = $$2;
      this.e = $$3;
   }

   private acn(vi $$0) {
      this.b = $$0.readInt();
      this.c = $$0.e();
      this.d = $$0.readInt();
      this.e = $$0.readBoolean();
   }

   private void a(vi $$0) {
      $$0.p(this.b);
      $$0.a(this.c);
      $$0.p(this.d);
      $$0.a(this.e);
   }

   @Override
   public yr<acn> a() {
      return afl.L;
   }

   public void a(aba $$0) {
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

   public id g() {
      return this.c;
   }
}
