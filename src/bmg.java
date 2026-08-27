import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bmg extends bma<bkj> {
   private final btk<Integer> c;

   public bmg(btk<Integer> $$0) {
      super(ImmutableMap.of($$0, btl.a));
      this.c = $$0;
   }

   private Optional<Integer> b(bkj $$0) {
      return $$0.dN().c(this.c);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   @Override
   protected boolean a(alq $$0, bkj $$1, long $$2) {
      Optional<Integer> $$3 = this.b($$1);
      return $$3.isPresent() && $$3.get() > 0;
   }

   @Override
   protected void c(alq $$0, bkj $$1, long $$2) {
      Optional<Integer> $$3 = this.b($$1);
      $$1.dN().a(this.c, $$3.get() - 1);
   }

   @Override
   protected void b(alq $$0, bkj $$1, long $$2) {
      $$1.dN().b(this.c);
   }
}
