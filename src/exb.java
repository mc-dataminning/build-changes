import javax.annotation.Nullable;

public class exb implements exc {
   private final dip b;

   public exb(dip $$0) {
      this.b = $$0;
   }

   @Override
   public void a(ja $$0, dzo $$1, iu $$2, iu $$3, int $$4, int $$5) {
      exc.a(this.b, $$0, $$2, $$3, $$1, $$4, $$5 - 1);
   }

   @Override
   public void a(iu $$0, dlu $$1, @Nullable exd $$2) {
      dzo $$3 = this.b.a_($$0);
      this.a($$3, $$0, $$1, $$2, false);
   }

   @Override
   public void a(dzo $$0, iu $$1, dlu $$2, @Nullable exd $$3, boolean $$4) {
      exc.a(this.b, $$0, $$1, $$2, $$3, $$4);
   }
}
