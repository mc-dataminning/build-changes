import javax.annotation.Nullable;

public class etb implements etc {
   private final dfm b;

   public etb(dfm $$0) {
      this.b = $$0;
   }

   @Override
   public void a(jm $$0, dvv $$1, jh $$2, jh $$3, int $$4, int $$5) {
      etc.a(this.b, $$0, $$2, $$3, $$1, $$4, $$5 - 1);
   }

   @Override
   public void a(jh $$0, diq $$1, @Nullable etd $$2) {
      dvv $$3 = this.b.a_($$0);
      this.a($$3, $$0, $$1, $$2, false);
   }

   @Override
   public void a(dvv $$0, jh $$1, diq $$2, @Nullable etd $$3, boolean $$4) {
      etc.a(this.b, $$0, $$1, $$2, $$3, $$4);
   }
}
