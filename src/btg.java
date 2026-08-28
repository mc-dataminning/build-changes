public final class btg implements bta {
   private final wp a;
   private final cue b;

   public btg(cue $$0, wp $$1) {
      this.b = $$0;
      this.a = $$1;
   }

   @Override
   public wp m_() {
      return this.a;
   }

   @Override
   public csw createMenu(int $$0, cpq $$1, cpr $$2) {
      return this.b.createMenu($$0, $$1, $$2);
   }
}
