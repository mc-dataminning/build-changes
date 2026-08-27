public class ezy extends ezd<cfn> {
   private static final aez x = new aez("container/grindstone/error");
   private static final aez y = new aez("textures/gui/container/grindstone.png");

   public ezy(cfn $$0, cbz $$1, tl $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   public void a(erz $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }

   @Override
   protected void a(erz $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.g - this.c) / 2;
      int $$5 = (this.h - this.k) / 2;
      $$0.a(y, $$4, $$5, 0, 0, this.c, this.k);
      if ((this.p.b(0).f() || this.p.b(1).f()) && !this.p.b(2).f()) {
         $$0.a(x, $$4 + 92, $$5 + 31, 28, 21);
      }
   }
}
