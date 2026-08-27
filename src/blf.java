import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class blf extends bkz<bji> {
   private final bsj<Integer> c;

   public blf(bsj<Integer> $$0) {
      super(ImmutableMap.of($$0, bsk.a));
      this.c = $$0;
   }

   private Optional<Integer> b(bji $$0) {
      return $$0.dN().c(this.c);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   @Override
   protected boolean a(aks $$0, bji $$1, long $$2) {
      Optional<Integer> $$3 = this.b($$1);
      return $$3.isPresent() && $$3.get() > 0;
   }

   @Override
   protected void c(aks $$0, bji $$1, long $$2) {
      Optional<Integer> $$3 = this.b($$1);
      $$1.dN().a(this.c, $$3.get() - 1);
   }

   @Override
   protected void b(aks $$0, bji $$1, long $$2) {
      $$1.dN().b(this.c);
   }
}
