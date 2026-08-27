public class aep implements xf<adj> {
   private final cjp a;
   private final boolean b;
   private final boolean c;

   public aep(cjp $$0, boolean $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public aep(ui $$0) {
      this.a = $$0.b(cjp.class);
      this.b = $$0.readBoolean();
      this.c = $$0.readBoolean();
   }

   @Override
   public void a(ui $$0) {
      $$0.a(this.a);
      $$0.a(this.b);
      $$0.a(this.c);
   }

   public void a(adj $$0) {
      $$0.a(this);
   }

   public cjp a() {
      return this.a;
   }

   public boolean d() {
      return this.b;
   }

   public boolean e() {
      return this.c;
   }
}
