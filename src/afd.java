public class afd implements zl<abw> {
   public static final zc<we, afd> a = zl.a(afd::a, afd::new);
   private final int b;
   private final int c;
   private final int d;
   private final int e;

   public afd(brv $$0) {
      this($$0.al(), $$0.dx());
   }

   public afd(int $$0, ewu $$1) {
      this.b = $$0;
      double $$2 = 3.9;
      double $$3 = aym.a($$1.c, -3.9, 3.9);
      double $$4 = aym.a($$1.d, -3.9, 3.9);
      double $$5 = aym.a($$1.e, -3.9, 3.9);
      this.c = (int)($$3 * 8000.0);
      this.d = (int)($$4 * 8000.0);
      this.e = (int)($$5 * 8000.0);
   }

   private afd(we $$0) {
      this.b = $$0.l();
      this.c = $$0.readShort();
      this.d = $$0.readShort();
      this.e = $$0.readShort();
   }

   private void a(we $$0) {
      $$0.c(this.b);
      $$0.l(this.c);
      $$0.l(this.d);
      $$0.l(this.e);
   }

   @Override
   public zn<afd> a() {
      return agj.aF;
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

   public int g() {
      return this.e;
   }
}
