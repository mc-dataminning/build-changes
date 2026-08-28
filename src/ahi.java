public class ahi implements zg<agi> {
   public static final yx<vw, ahi> a = zg.a(ahi::a, ahi::new);
   private final boolean b;
   private final boolean c;

   public ahi(boolean $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private ahi(vw $$0) {
      this.b = $$0.readBoolean();
      this.c = $$0.readBoolean();
   }

   private void a(vw $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   public void a(agi $$0) {
      $$0.a(this);
   }

   @Override
   public zi<ahi> a() {
      return agg.bG;
   }

   public boolean b() {
      return this.b;
   }

   public boolean e() {
      return this.c;
   }
}
