public class acp implements uw<aav> {
   private final ehb a;
   private final bgn b;
   private final int c;

   public acp(bgn $$0, ehb $$1, int $$2) {
      this.b = $$0;
      this.a = $$1;
      this.c = $$2;
   }

   public acp(sh $$0) {
      this.b = $$0.b(bgn.class);
      this.a = $$0.x();
      this.c = $$0.m();
   }

   @Override
   public void a(sh $$0) {
      $$0.a(this.b);
      $$0.a(this.a);
      $$0.c(this.c);
   }

   public void a(aav $$0) {
      $$0.a(this);
   }

   public bgn a() {
      return this.b;
   }

   public ehb d() {
      return this.a;
   }

   public int e() {
      return this.c;
   }
}
