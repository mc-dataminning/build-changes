import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class byo extends byi<bwr> {
   private final cft<Integer> c;

   public byo(cft<Integer> $$0) {
      super(ImmutableMap.of($$0, cfu.a));
      this.c = $$0;
   }

   private Optional<Integer> b(bwr $$0) {
      return $$0.eb().c(this.c);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   @Override
   protected boolean a(arn $$0, bwr $$1, long $$2) {
      Optional<Integer> $$3 = this.b($$1);
      return $$3.isPresent() && $$3.get() > 0;
   }

   @Override
   protected void c(arn $$0, bwr $$1, long $$2) {
      Optional<Integer> $$3 = this.b($$1);
      $$1.eb().a(this.c, $$3.get() - 1);
   }

   @Override
   protected void b(arn $$0, bwr $$1, long $$2) {
      $$1.eb().b(this.c);
   }
}
