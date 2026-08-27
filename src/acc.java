public class acc implements ux<aaw> {
   private final cfo a;
   private final boolean b;
   private final boolean c;

   public acc(cfo $$0, boolean $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public acc(si $$0) {
      this.a = $$0.b(cfo.class);
      this.b = $$0.readBoolean();
      this.c = $$0.readBoolean();
   }

   @Override
   public void a(si $$0) {
      $$0.a(this.a);
      $$0.a(this.b);
      $$0.a(this.c);
   }

   public void a(aaw $$0) {
      $$0.a(this);
   }

   public cfo a() {
      return this.a;
   }

   public boolean d() {
      return this.b;
   }

   public boolean e() {
      return this.c;
   }
}
