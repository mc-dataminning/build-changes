public class ahp implements zg<agi> {
   public static final yx<vw, ahp> a = zg.a(ahp::a, ahp::new);
   private final crj b;
   private final boolean c;
   private final boolean d;

   public ahp(crj $$0, boolean $$1, boolean $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private ahp(vw $$0) {
      this.b = $$0.b(crj.class);
      this.c = $$0.readBoolean();
      this.d = $$0.readBoolean();
   }

   private void a(vw $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
   }

   @Override
   public zi<ahp> a() {
      return agg.bN;
   }

   public void a(agi $$0) {
      $$0.a(this);
   }

   public crj b() {
      return this.b;
   }

   public boolean e() {
      return this.c;
   }

   public boolean f() {
      return this.d;
   }
}
