public class aib implements zs<agy> {
   public static final zj<wi, aib> a = zs.a(aib::a, aib::new);
   private final int b;
   private final all c;
   private final boolean d;

   public aib(int $$0, dav<?> $$1, boolean $$2) {
      this.b = $$0;
      this.c = $$1.a();
      this.d = $$2;
   }

   private aib(wi $$0) {
      this.b = $$0.x();
      this.c = $$0.q();
      this.d = $$0.readBoolean();
   }

   private void a(wi $$0) {
      $$0.f(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
   }

   @Override
   public zu<aib> a() {
      return agw.bL;
   }

   public void a(agy $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public all e() {
      return this.c;
   }

   public boolean f() {
      return this.d;
   }
}
