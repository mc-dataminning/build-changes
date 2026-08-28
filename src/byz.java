import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class byz extends byt<bxc> {
   private final cge<Integer> c;

   public byz(cge<Integer> $$0) {
      super(ImmutableMap.of($$0, cgf.a));
      this.c = $$0;
   }

   private Optional<Integer> b(bxc $$0) {
      return $$0.eb().c(this.c);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   @Override
   protected boolean a(arq $$0, bxc $$1, long $$2) {
      Optional<Integer> $$3 = this.b($$1);
      return $$3.isPresent() && $$3.get() > 0;
   }

   @Override
   protected void c(arq $$0, bxc $$1, long $$2) {
      Optional<Integer> $$3 = this.b($$1);
      $$1.eb().a(this.c, $$3.get() - 1);
   }

   @Override
   protected void b(arq $$0, bxc $$1, long $$2) {
      $$1.eb().b(this.c);
   }
}
