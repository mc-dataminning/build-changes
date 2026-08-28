public class cue extends cvk {
   private final cud a;

   public cue(btj $$0, int $$1, int $$2, int $$3, cud $$4) {
      super($$0, $$1, $$2, $$3);
      this.a = $$4;
   }

   @Override
   public boolean a(cxy $$0) {
      return !this.a.e(this.d) && super.a($$0);
   }

   @Override
   public void d() {
      super.d();
      this.a.a(this.c);
   }
}
