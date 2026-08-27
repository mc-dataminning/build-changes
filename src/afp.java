public class afp implements zl<abw> {
   public static final zc<we, afp> a = zl.a(afp::a, afp::new);
   private final int b;
   private final int c;
   private final int d;

   public afp(int $$0, int $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private afp(we $$0) {
      this.b = $$0.readInt();
      this.c = $$0.readInt();
      this.d = $$0.readInt();
   }

   private void a(we $$0) {
      $$0.p(this.b);
      $$0.p(this.c);
      $$0.p(this.d);
   }

   @Override
   public zn<afp> a() {
      return agj.aR;
   }

   public void a(abw $$0) {
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
