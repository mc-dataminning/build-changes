import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bux extends bur<bsy> {
   private final ccc<Integer> c;

   public bux(ccc<Integer> $$0) {
      super(ImmutableMap.of($$0, ccd.a));
      this.c = $$0;
   }

   private Optional<Integer> b(bsy $$0) {
      return $$0.dT().c(this.c);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   @Override
   protected boolean a(aqk $$0, bsy $$1, long $$2) {
      Optional<Integer> $$3 = this.b($$1);
      return $$3.isPresent() && $$3.get() > 0;
   }

   @Override
   protected void c(aqk $$0, bsy $$1, long $$2) {
      Optional<Integer> $$3 = this.b($$1);
      $$1.dT().a(this.c, $$3.get() - 1);
   }

   @Override
   protected void b(aqk $$0, bsy $$1, long $$2) {
      $$1.dT().b(this.c);
   }
}
