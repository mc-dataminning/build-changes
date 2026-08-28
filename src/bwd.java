import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bwd extends bvx<buf> {
   private final cdi<Integer> c;

   public bwd(cdi<Integer> $$0) {
      super(ImmutableMap.of($$0, cdj.a));
      this.c = $$0;
   }

   private Optional<Integer> b(buf $$0) {
      return $$0.dX().c(this.c);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   @Override
   protected boolean a(arg $$0, buf $$1, long $$2) {
      Optional<Integer> $$3 = this.b($$1);
      return $$3.isPresent() && $$3.get() > 0;
   }

   @Override
   protected void c(arg $$0, buf $$1, long $$2) {
      Optional<Integer> $$3 = this.b($$1);
      $$1.dX().a(this.c, $$3.get() - 1);
   }

   @Override
   protected void b(arg $$0, buf $$1, long $$2) {
      $$1.dX().b(this.c);
   }
}
