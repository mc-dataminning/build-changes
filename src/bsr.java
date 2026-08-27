import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bsr extends bsl<bqt> {
   private final bzw<Integer> c;

   public bsr(bzw<Integer> $$0) {
      super(ImmutableMap.of($$0, bzx.a));
      this.c = $$0;
   }

   private Optional<Integer> b(bqt $$0) {
      return $$0.dP().c(this.c);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   @Override
   protected boolean a(apu $$0, bqt $$1, long $$2) {
      Optional<Integer> $$3 = this.b($$1);
      return $$3.isPresent() && $$3.get() > 0;
   }

   @Override
   protected void c(apu $$0, bqt $$1, long $$2) {
      Optional<Integer> $$3 = this.b($$1);
      $$1.dP().a(this.c, $$3.get() - 1);
   }

   @Override
   protected void b(apu $$0, bqt $$1, long $$2) {
      $$1.dP().b(this.c);
   }
}
