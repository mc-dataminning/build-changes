import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class byf extends bxz<bwg> {
   private final cfk<Integer> c;

   public byf(cfk<Integer> $$0) {
      super(ImmutableMap.of($$0, cfl.a));
      this.c = $$0;
   }

   private Optional<Integer> b(bwg $$0) {
      return $$0.ec().c(this.c);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   @Override
   protected boolean a(ash $$0, bwg $$1, long $$2) {
      Optional<Integer> $$3 = this.b($$1);
      return $$3.isPresent() && $$3.get() > 0;
   }

   @Override
   protected void c(ash $$0, bwg $$1, long $$2) {
      Optional<Integer> $$3 = this.b($$1);
      $$1.ec().a(this.c, $$3.get() - 1);
   }

   @Override
   protected void b(ash $$0, bwg $$1, long $$2) {
      $$1.ec().b(this.c);
   }
}
