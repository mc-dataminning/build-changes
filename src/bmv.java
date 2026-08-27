import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bmv extends bmp<bky> {
   private final btz<Integer> c;

   public bmv(btz<Integer> $$0) {
      super(ImmutableMap.of($$0, bua.a));
      this.c = $$0;
   }

   private Optional<Integer> b(bky $$0) {
      return $$0.dN().c(this.c);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   @Override
   protected boolean a(ama $$0, bky $$1, long $$2) {
      Optional<Integer> $$3 = this.b($$1);
      return $$3.isPresent() && $$3.get() > 0;
   }

   @Override
   protected void c(ama $$0, bky $$1, long $$2) {
      Optional<Integer> $$3 = this.b($$1);
      $$1.dN().a(this.c, $$3.get() - 1);
   }

   @Override
   protected void b(ama $$0, bky $$1, long $$2) {
      $$1.dN().b(this.c);
   }
}
