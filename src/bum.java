import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bum extends bug<bso> {
   private final cbr<Integer> c;

   public bum(cbr<Integer> $$0) {
      super(ImmutableMap.of($$0, cbs.a));
      this.c = $$0;
   }

   private Optional<Integer> b(bso $$0) {
      return $$0.dZ().c(this.c);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   @Override
   protected boolean a(aqt $$0, bso $$1, long $$2) {
      Optional<Integer> $$3 = this.b($$1);
      return $$3.isPresent() && $$3.get() > 0;
   }

   @Override
   protected void c(aqt $$0, bso $$1, long $$2) {
      Optional<Integer> $$3 = this.b($$1);
      $$1.dZ().a(this.c, $$3.get() - 1);
   }

   @Override
   protected void b(aqt $$0, bso $$1, long $$2) {
      $$1.dZ().b(this.c);
   }
}
