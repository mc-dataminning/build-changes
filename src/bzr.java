import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bzr extends bzl<bxu> {
   private final cgw<Integer> c;

   public bzr(cgw<Integer> $$0) {
      super(ImmutableMap.of($$0, cgx.a));
      this.c = $$0;
   }

   private Optional<Integer> b(bxu $$0) {
      return $$0.ec().c(this.c);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   @Override
   protected boolean a(ars $$0, bxu $$1, long $$2) {
      Optional<Integer> $$3 = this.b($$1);
      return $$3.isPresent() && $$3.get() > 0;
   }

   @Override
   protected void c(ars $$0, bxu $$1, long $$2) {
      Optional<Integer> $$3 = this.b($$1);
      $$1.ec().a(this.c, $$3.get() - 1);
   }

   @Override
   protected void b(ars $$0, bxu $$1, long $$2) {
      $$1.ec().b(this.c);
   }
}
