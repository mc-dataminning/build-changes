public class crf extends cqg {
   private final apg a;

   public crf(apg $$0) {
      this.a = $$0;
   }

   @Override
   protected void b(cqf $$0, int $$1) {
      super.b($$0, $$1);
      this.a.d.b(new abk($$0, $$1));
   }

   @Override
   protected void c(cqf $$0) {
      super.c($$0);
      this.a.d.b(new abk($$0, 0));
   }
}
