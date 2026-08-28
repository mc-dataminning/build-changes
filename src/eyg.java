import javax.annotation.Nullable;

public class eyg implements eyh {
   private final djm b;

   public eyg(djm $$0) {
      this.b = $$0;
   }

   @Override
   public void a(jb $$0, eat $$1, iv $$2, iv $$3, int $$4, int $$5) {
      eyh.a(this.b, $$0, $$2, $$3, $$1, $$4, $$5 - 1);
   }

   @Override
   public void a(iv $$0, dmr $$1, @Nullable eyi $$2) {
      eat $$3 = this.b.a_($$0);
      this.a($$3, $$0, $$1, $$2, false);
   }

   @Override
   public void a(eat $$0, iv $$1, dmr $$2, @Nullable eyi $$3, boolean $$4) {
      eyh.a(this.b, $$0, $$1, $$2, $$3, $$4);
   }
}
