public class ahx implements zb<agb> {
   public static final ys<vr, ahx> a = zb.a(ahx::a, ahx::new);
   private final evv b;
   private final bqc c;
   private final int d;

   public ahx(bqc $$0, evv $$1, int $$2) {
      this.c = $$0;
      this.b = $$1;
      this.d = $$2;
   }

   private ahx(vr $$0) {
      this.c = $$0.b(bqc.class);
      this.b = $$0.v();
      this.d = $$0.l();
   }

   private void a(vr $$0) {
      $$0.a(this.c);
      $$0.a(this.b);
      $$0.c(this.d);
   }

   @Override
   public zd<ahx> a() {
      return afz.cc;
   }

   public void a(agb $$0) {
      $$0.a(this);
   }

   public bqc b() {
      return this.c;
   }

   public evv e() {
      return this.b;
   }

   public int f() {
      return this.d;
   }
}
