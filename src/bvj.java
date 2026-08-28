import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bvj extends bvd<btk> {
   private final cco<Integer> c;

   public bvj(cco<Integer> $$0) {
      super(ImmutableMap.of($$0, ccp.a));
      this.c = $$0;
   }

   private Optional<Integer> b(btk $$0) {
      return $$0.dS().c(this.c);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   @Override
   protected boolean a(arb $$0, btk $$1, long $$2) {
      Optional<Integer> $$3 = this.b($$1);
      return $$3.isPresent() && $$3.get() > 0;
   }

   @Override
   protected void c(arb $$0, btk $$1, long $$2) {
      Optional<Integer> $$3 = this.b($$1);
      $$1.dS().a(this.c, $$3.get() - 1);
   }

   @Override
   protected void b(arb $$0, btk $$1, long $$2) {
      $$1.dS().b(this.c);
   }
}
