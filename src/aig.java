public class aig implements zl<agl> {
   public static final zc<we, aig> a = zl.a(aig::a, aig::new);
   private final ewq b;
   private final bpz c;
   private final int d;

   public aig(bpz $$0, ewq $$1, int $$2) {
      this.c = $$0;
      this.b = $$1;
      this.d = $$2;
   }

   private aig(we $$0) {
      this.c = $$0.b(bpz.class);
      this.b = $$0.v();
      this.d = $$0.l();
   }

   private void a(we $$0) {
      $$0.a(this.c);
      $$0.a(this.b);
      $$0.c(this.d);
   }

   @Override
   public zn<aig> a() {
      return agj.cc;
   }

   public void a(agl $$0) {
      $$0.a(this);
   }

   public bpz b() {
      return this.c;
   }

   public ewq e() {
      return this.b;
   }

   public int f() {
      return this.d;
   }
}
