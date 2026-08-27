import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class brm extends brg<bpo> {
   private final byr<Integer> c;

   public brm(byr<Integer> $$0) {
      super(ImmutableMap.of($$0, bys.a));
      this.c = $$0;
   }

   private Optional<Integer> b(bpo $$0) {
      return $$0.dP().c(this.c);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   @Override
   protected boolean a(apf $$0, bpo $$1, long $$2) {
      Optional<Integer> $$3 = this.b($$1);
      return $$3.isPresent() && $$3.get() > 0;
   }

   @Override
   protected void c(apf $$0, bpo $$1, long $$2) {
      Optional<Integer> $$3 = this.b($$1);
      $$1.dP().a(this.c, $$3.get() - 1);
   }

   @Override
   protected void b(apf $$0, bpo $$1, long $$2) {
      $$1.dP().b(this.c);
   }
}
