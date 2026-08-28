import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bzt extends bzn<bxw> {
   private final cgy<Integer> c;

   public bzt(cgy<Integer> $$0) {
      super(ImmutableMap.of($$0, cgz.a));
      this.c = $$0;
   }

   private Optional<Integer> b(bxw $$0) {
      return $$0.ec().c(this.c);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   @Override
   protected boolean a(aru $$0, bxw $$1, long $$2) {
      Optional<Integer> $$3 = this.b($$1);
      return $$3.isPresent() && $$3.get() > 0;
   }

   @Override
   protected void c(aru $$0, bxw $$1, long $$2) {
      Optional<Integer> $$3 = this.b($$1);
      $$1.ec().a(this.c, $$3.get() - 1);
   }

   @Override
   protected void b(aru $$0, bxw $$1, long $$2) {
      $$1.ec().b(this.c);
   }
}
