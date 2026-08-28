import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bvq extends bvk<btr> {
   private final ccv<Integer> c;

   public bvq(ccv<Integer> $$0) {
      super(ImmutableMap.of($$0, ccw.a));
      this.c = $$0;
   }

   private Optional<Integer> b(btr $$0) {
      return $$0.dS().c(this.c);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   @Override
   protected boolean a(arf $$0, btr $$1, long $$2) {
      Optional<Integer> $$3 = this.b($$1);
      return $$3.isPresent() && $$3.get() > 0;
   }

   @Override
   protected void c(arf $$0, btr $$1, long $$2) {
      Optional<Integer> $$3 = this.b($$1);
      $$1.dS().a(this.c, $$3.get() - 1);
   }

   @Override
   protected void b(arf $$0, btr $$1, long $$2) {
      $$1.dS().b(this.c);
   }
}
