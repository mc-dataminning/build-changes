public class ahk implements zd<agn> {
   public static final yu<vs, ahk> a = zd.a(ahk::a, ahk::new);
   private final iu b;
   private final int c;
   private final boolean d;

   public ahk(iu $$0, int $$1, boolean $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private ahk(vs $$0) {
      this.b = $$0.e();
      this.c = $$0.l();
      this.d = $$0.readBoolean();
   }

   private void a(vs $$0) {
      $$0.a(this.b);
      $$0.c(this.c);
      $$0.a(this.d);
   }

   @Override
   public zf<ahk> a() {
      return agl.bG;
   }

   public void a(agn $$0) {
      $$0.a(this);
   }

   public iu b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public boolean f() {
      return this.d;
   }
}
