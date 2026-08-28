import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bxh extends bxb<bvi> {
   private final cem<Integer> c;

   public bxh(cem<Integer> $$0) {
      super(ImmutableMap.of($$0, cen.a));
      this.c = $$0;
   }

   private Optional<Integer> b(bvi $$0) {
      return $$0.eb().c(this.c);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   @Override
   protected boolean a(ard $$0, bvi $$1, long $$2) {
      Optional<Integer> $$3 = this.b($$1);
      return $$3.isPresent() && $$3.get() > 0;
   }

   @Override
   protected void c(ard $$0, bvi $$1, long $$2) {
      Optional<Integer> $$3 = this.b($$1);
      $$1.eb().a(this.c, $$3.get() - 1);
   }

   @Override
   protected void b(ard $$0, bvi $$1, long $$2) {
      $$1.eb().b(this.c);
   }
}
