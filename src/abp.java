public class abp implements wb<xu> {
   private final ui a;
   private final ui b;

   public abp(ui $$0, ui $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public abp(tl $$0) {
      this.a = $$0.m();
      this.b = $$0.m();
   }

   @Override
   public void a(tl $$0) {
      $$0.a(this.a);
      $$0.a(this.b);
   }

   public void a(xu $$0) {
      $$0.a(this);
   }

   public ui a() {
      return this.a;
   }

   public ui d() {
      return this.b;
   }
}
