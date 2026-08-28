import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bxx extends bxr<bvy> {
   private final cfc<Integer> c;

   public bxx(cfc<Integer> $$0) {
      super(ImmutableMap.of($$0, cfd.a));
      this.c = $$0;
   }

   private Optional<Integer> b(bvy $$0) {
      return $$0.ea().c(this.c);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   @Override
   protected boolean a(ard $$0, bvy $$1, long $$2) {
      Optional<Integer> $$3 = this.b($$1);
      return $$3.isPresent() && $$3.get() > 0;
   }

   @Override
   protected void c(ard $$0, bvy $$1, long $$2) {
      Optional<Integer> $$3 = this.b($$1);
      $$1.ea().a(this.c, $$3.get() - 1);
   }

   @Override
   protected void b(ard $$0, bvy $$1, long $$2) {
      $$1.ea().b(this.c);
   }
}
