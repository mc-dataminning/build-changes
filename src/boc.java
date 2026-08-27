import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class boc extends bnw<bmf> {
   private final bvh<Integer> c;

   public boc(bvh<Integer> $$0) {
      super(ImmutableMap.of($$0, bvi.a));
      this.c = $$0;
   }

   private Optional<Integer> b(bmf $$0) {
      return $$0.dO().c(this.c);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   @Override
   protected boolean a(amz $$0, bmf $$1, long $$2) {
      Optional<Integer> $$3 = this.b($$1);
      return $$3.isPresent() && $$3.get() > 0;
   }

   @Override
   protected void c(amz $$0, bmf $$1, long $$2) {
      Optional<Integer> $$3 = this.b($$1);
      $$1.dO().a(this.c, $$3.get() - 1);
   }

   @Override
   protected void b(amz $$0, bmf $$1, long $$2) {
      $$1.dO().b(this.c);
   }
}
