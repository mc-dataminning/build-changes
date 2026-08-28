public class ahd implements yw<agg> {
   public static final yn<vl, ahd> a = yw.a(ahd::a, ahd::new);
   private final ji b;
   private final int c;
   private final boolean d;

   public ahd(ji $$0, int $$1, boolean $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private ahd(vl $$0) {
      this.b = $$0.e();
      this.c = $$0.l();
      this.d = $$0.readBoolean();
   }

   private void a(vl $$0) {
      $$0.a(this.b);
      $$0.c(this.c);
      $$0.a(this.d);
   }

   @Override
   public yy<ahd> a() {
      return age.bG;
   }

   public void a(agg $$0) {
      $$0.a(this);
   }

   public ji b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public boolean f() {
      return this.d;
   }
}
