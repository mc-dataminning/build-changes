import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bqg extends bqa<boi> {
   private final bxl<Integer> c;

   public bqg(bxl<Integer> $$0) {
      super(ImmutableMap.of($$0, bxm.a));
      this.c = $$0;
   }

   private Optional<Integer> b(boi $$0) {
      return $$0.dO().c(this.c);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   @Override
   protected boolean a(aow $$0, boi $$1, long $$2) {
      Optional<Integer> $$3 = this.b($$1);
      return $$3.isPresent() && $$3.get() > 0;
   }

   @Override
   protected void c(aow $$0, boi $$1, long $$2) {
      Optional<Integer> $$3 = this.b($$1);
      $$1.dO().a(this.c, $$3.get() - 1);
   }

   @Override
   protected void b(aow $$0, boi $$1, long $$2) {
      $$1.dO().b(this.c);
   }
}
