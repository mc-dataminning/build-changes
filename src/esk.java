import javax.annotation.Nullable;

public class esk implements esl {
   private final dev b;

   public esk(dev $$0) {
      this.b = $$0;
   }

   @Override
   public void a(jl $$0, dvd $$1, jg $$2, jg $$3, int $$4, int $$5) {
      esl.a(this.b, $$0, $$2, $$3, $$1, $$4, $$5 - 1);
   }

   @Override
   public void a(jg $$0, dhy $$1, @Nullable esm $$2) {
      dvd $$3 = this.b.a_($$0);
      this.a($$3, $$0, $$1, $$2, false);
   }

   @Override
   public void a(dvd $$0, jg $$1, dhy $$2, @Nullable esm $$3, boolean $$4) {
      esl.a(this.b, $$0, $$1, $$2, $$3, $$4);
   }
}
