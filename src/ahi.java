public class ahi implements zp<agv> {
   public static final zg<wf, ahi> a = zp.a(ahi::a, ahi::new);
   private final int b;
   private final String c;

   public ahi(int $$0, String $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private ahi(wf $$0) {
      this.b = $$0.l();
      this.c = $$0.d(32500);
   }

   private void a(wf $$0) {
      $$0.c(this.b);
      $$0.a(this.c, 32500);
   }

   @Override
   public zr<ahi> a() {
      return agt.bs;
   }

   public void a(agv $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public String e() {
      return this.c;
   }
}
