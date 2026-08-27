import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bky extends bks<bjb> {
   private final bsc<Integer> c;

   public bky(bsc<Integer> $$0) {
      super(ImmutableMap.of($$0, bsd.a));
      this.c = $$0;
   }

   private Optional<Integer> b(bjb $$0) {
      return $$0.dM().c(this.c);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   @Override
   protected boolean a(akn $$0, bjb $$1, long $$2) {
      Optional<Integer> $$3 = this.b($$1);
      return $$3.isPresent() && $$3.get() > 0;
   }

   @Override
   protected void c(akn $$0, bjb $$1, long $$2) {
      Optional<Integer> $$3 = this.b($$1);
      $$1.dM().a(this.c, $$3.get() - 1);
   }

   @Override
   protected void b(akn $$0, bjb $$1, long $$2) {
      $$1.dM().b(this.c);
   }
}
