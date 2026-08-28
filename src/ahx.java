public class ahx implements zb<agb> {
   public static final ys<vr, ahx> a = zb.a(ahx::a, ahx::new);
   private final ewb b;
   private final bqf c;
   private final int d;

   public ahx(bqf $$0, ewb $$1, int $$2) {
      this.c = $$0;
      this.b = $$1;
      this.d = $$2;
   }

   private ahx(vr $$0) {
      this.c = $$0.b(bqf.class);
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

   public bqf b() {
      return this.c;
   }

   public ewb e() {
      return this.b;
   }

   public int f() {
      return this.d;
   }
}
