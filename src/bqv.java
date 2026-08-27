import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bqv extends bqp<box> {
   private final bya<Integer> c;

   public bqv(bya<Integer> $$0) {
      super(ImmutableMap.of($$0, byb.a));
      this.c = $$0;
   }

   private Optional<Integer> b(box $$0) {
      return $$0.dM().c(this.c);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   @Override
   protected boolean a(apa $$0, box $$1, long $$2) {
      Optional<Integer> $$3 = this.b($$1);
      return $$3.isPresent() && $$3.get() > 0;
   }

   @Override
   protected void c(apa $$0, box $$1, long $$2) {
      Optional<Integer> $$3 = this.b($$1);
      $$1.dM().a(this.c, $$3.get() - 1);
   }

   @Override
   protected void b(apa $$0, box $$1, long $$2) {
      $$1.dM().b(this.c);
   }
}
