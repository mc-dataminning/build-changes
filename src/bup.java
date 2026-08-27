import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bup extends buj<bsq> {
   private final cbu<Integer> c;

   public bup(cbu<Integer> $$0) {
      super(ImmutableMap.of($$0, cbv.a));
      this.c = $$0;
   }

   private Optional<Integer> b(bsq $$0) {
      return $$0.dS().c(this.c);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   @Override
   protected boolean a(aqn $$0, bsq $$1, long $$2) {
      Optional<Integer> $$3 = this.b($$1);
      return $$3.isPresent() && $$3.get() > 0;
   }

   @Override
   protected void c(aqn $$0, bsq $$1, long $$2) {
      Optional<Integer> $$3 = this.b($$1);
      $$1.dS().a(this.c, $$3.get() - 1);
   }

   @Override
   protected void b(aqn $$0, bsq $$1, long $$2) {
      $$1.dS().b(this.c);
   }
}
