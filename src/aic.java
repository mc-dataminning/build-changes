public class aic implements zv<agv> {
   public static final zm<wl, aic> a = zv.a(aic::a, aic::new);
   private final crh b;
   private final boolean c;
   private final boolean d;

   public aic(crh $$0, boolean $$1, boolean $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private aic(wl $$0) {
      this.b = $$0.b(crh.class);
      this.c = $$0.readBoolean();
      this.d = $$0.readBoolean();
   }

   private void a(wl $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
   }

   @Override
   public zx<aic> a() {
      return agt.bN;
   }

   public void a(agv $$0) {
      $$0.a(this);
   }

   public crh b() {
      return this.b;
   }

   public boolean e() {
      return this.c;
   }

   public boolean f() {
      return this.d;
   }
}
