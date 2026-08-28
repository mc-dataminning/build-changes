import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bvn extends bvh<btn> {
   private final ccs<Integer> c;

   public bvn(ccs<Integer> $$0) {
      super(ImmutableMap.of($$0, cct.a));
      this.c = $$0;
   }

   private Optional<Integer> b(btn $$0) {
      return $$0.dU().c(this.c);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   @Override
   protected boolean a(aqu $$0, btn $$1, long $$2) {
      Optional<Integer> $$3 = this.b($$1);
      return $$3.isPresent() && $$3.get() > 0;
   }

   @Override
   protected void c(aqu $$0, btn $$1, long $$2) {
      Optional<Integer> $$3 = this.b($$1);
      $$1.dU().a(this.c, $$3.get() - 1);
   }

   @Override
   protected void b(aqu $$0, btn $$1, long $$2) {
      $$1.dU().b(this.c);
   }
}
