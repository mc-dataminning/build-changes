public class aeq implements xg<adk> {
   private final cjx a;
   private final boolean b;
   private final boolean c;

   public aeq(cjx $$0, boolean $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public aeq(uj $$0) {
      this.a = $$0.b(cjx.class);
      this.b = $$0.readBoolean();
      this.c = $$0.readBoolean();
   }

   @Override
   public void a(uj $$0) {
      $$0.a(this.a);
      $$0.a(this.b);
      $$0.a(this.c);
   }

   public void a(adk $$0) {
      $$0.a(this);
   }

   public cjx a() {
      return this.a;
   }

   public boolean d() {
      return this.b;
   }

   public boolean e() {
      return this.c;
   }
}
