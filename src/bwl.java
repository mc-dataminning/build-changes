import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bwl extends bwf<bun> {
   private final cdq<Integer> c;

   public bwl(cdq<Integer> $$0) {
      super(ImmutableMap.of($$0, cdr.a));
      this.c = $$0;
   }

   private Optional<Integer> b(bun $$0) {
      return $$0.dY().c(this.c);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   @Override
   protected boolean a(arj $$0, bun $$1, long $$2) {
      Optional<Integer> $$3 = this.b($$1);
      return $$3.isPresent() && $$3.get() > 0;
   }

   @Override
   protected void c(arj $$0, bun $$1, long $$2) {
      Optional<Integer> $$3 = this.b($$1);
      $$1.dY().a(this.c, $$3.get() - 1);
   }

   @Override
   protected void b(arj $$0, bun $$1, long $$2) {
      $$1.dY().b(this.c);
   }
}
