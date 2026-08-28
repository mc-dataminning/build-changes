import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bva extends buu<btb> {
   private final ccf<Integer> c;

   public bva(ccf<Integer> $$0) {
      super(ImmutableMap.of($$0, ccg.a));
      this.c = $$0;
   }

   private Optional<Integer> b(btb $$0) {
      return $$0.dU().c(this.c);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   @Override
   protected boolean a(aqm $$0, btb $$1, long $$2) {
      Optional<Integer> $$3 = this.b($$1);
      return $$3.isPresent() && $$3.get() > 0;
   }

   @Override
   protected void c(aqm $$0, btb $$1, long $$2) {
      Optional<Integer> $$3 = this.b($$1);
      $$1.dU().a(this.c, $$3.get() - 1);
   }

   @Override
   protected void b(aqm $$0, btb $$1, long $$2) {
      $$1.dU().b(this.c);
   }
}
