import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bun extends buh<bso> {
   private final cbs<Integer> c;

   public bun(cbs<Integer> $$0) {
      super(ImmutableMap.of($$0, cbt.a));
      this.c = $$0;
   }

   private Optional<Integer> b(bso $$0) {
      return $$0.dS().c(this.c);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   @Override
   protected boolean a(aqm $$0, bso $$1, long $$2) {
      Optional<Integer> $$3 = this.b($$1);
      return $$3.isPresent() && $$3.get() > 0;
   }

   @Override
   protected void c(aqm $$0, bso $$1, long $$2) {
      Optional<Integer> $$3 = this.b($$1);
      $$1.dS().a(this.c, $$3.get() - 1);
   }

   @Override
   protected void b(aqm $$0, bso $$1, long $$2) {
      $$1.dS().b(this.c);
   }
}
