public class ahr implements zv<agv> {
   public static final zm<wl, ahr> a = zv.a(ahr::a, ahr::new);
   private final iz b;
   private final int c;
   private final boolean d;

   public ahr(iz $$0, int $$1, boolean $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private ahr(wl $$0) {
      this.b = $$0.e();
      this.c = $$0.l();
      this.d = $$0.readBoolean();
   }

   private void a(wl $$0) {
      $$0.a(this.b);
      $$0.c(this.c);
      $$0.a(this.d);
   }

   @Override
   public zx<ahr> a() {
      return agt.bz;
   }

   public void a(agv $$0) {
      $$0.a(this);
   }

   public iz b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public boolean f() {
      return this.d;
   }
}
