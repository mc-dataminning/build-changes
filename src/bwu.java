import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bwu extends bwo<buv> {
   private final cdz<Integer> c;

   public bwu(cdz<Integer> $$0) {
      super(ImmutableMap.of($$0, cea.a));
      this.c = $$0;
   }

   private Optional<Integer> b(buv $$0) {
      return $$0.ed().c(this.c);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   @Override
   protected boolean a(arm $$0, buv $$1, long $$2) {
      Optional<Integer> $$3 = this.b($$1);
      return $$3.isPresent() && $$3.get() > 0;
   }

   @Override
   protected void c(arm $$0, buv $$1, long $$2) {
      Optional<Integer> $$3 = this.b($$1);
      $$1.ed().a(this.c, $$3.get() - 1);
   }

   @Override
   protected void b(arm $$0, buv $$1, long $$2) {
      $$1.ed().b(this.c);
   }
}
