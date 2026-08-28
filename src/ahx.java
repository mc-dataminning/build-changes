public class ahx implements zb<agb> {
   public static final ys<vr, ahx> a = zb.a(ahx::a, ahx::new);
   private final ewd b;
   private final bqg c;
   private final int d;

   public ahx(bqg $$0, ewd $$1, int $$2) {
      this.c = $$0;
      this.b = $$1;
      this.d = $$2;
   }

   private ahx(vr $$0) {
      this.c = $$0.b(bqg.class);
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

   public bqg b() {
      return this.c;
   }

   public ewd e() {
      return this.b;
   }

   public int f() {
      return this.d;
   }
}
