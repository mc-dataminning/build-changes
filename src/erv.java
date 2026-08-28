import javax.annotation.Nullable;

public class erv implements erw {
   private final deg b;

   public erv(deg $$0) {
      this.b = $$0;
   }

   @Override
   public void a(jj $$0, duo $$1, je $$2, je $$3, int $$4, int $$5) {
      erw.a(this.b, $$0, $$1, $$2, $$3, $$4, $$5 - 1);
   }

   @Override
   public void a(je $$0, dhj $$1, @Nullable erx $$2) {
      duo $$3 = this.b.a_($$0);
      this.a($$3, $$0, $$1, $$2, false);
   }

   @Override
   public void a(duo $$0, je $$1, dhj $$2, @Nullable erx $$3, boolean $$4) {
      erw.a(this.b, $$0, $$1, $$2, $$3, $$4);
   }
}
