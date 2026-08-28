public class ahx implements zd<agn> {
   public static final yu<vs, ahx> a = zd.a(ahx::a, ahx::new);
   private final cwa b;
   private final boolean c;
   private final boolean d;

   public ahx(cwa $$0, boolean $$1, boolean $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private ahx(vs $$0) {
      this.b = $$0.b(cwa.class);
      this.c = $$0.readBoolean();
      this.d = $$0.readBoolean();
   }

   private void a(vs $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
   }

   @Override
   public zf<ahx> a() {
      return agl.bW;
   }

   public void a(agn $$0) {
      $$0.a(this);
   }

   public cwa b() {
      return this.b;
   }

   public boolean e() {
      return this.c;
   }

   public boolean f() {
      return this.d;
   }
}
