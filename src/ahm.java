public class ahm implements zf<agp> {
   public static final yw<vu, ahm> a = zf.a(ahm::a, ahm::new);
   private final iu b;
   private final int c;
   private final boolean d;

   public ahm(iu $$0, int $$1, boolean $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private ahm(vu $$0) {
      this.b = $$0.e();
      this.c = $$0.l();
      this.d = $$0.readBoolean();
   }

   private void a(vu $$0) {
      $$0.a(this.b);
      $$0.c(this.c);
      $$0.a(this.d);
   }

   @Override
   public zh<ahm> a() {
      return agn.bG;
   }

   public void a(agp $$0) {
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
