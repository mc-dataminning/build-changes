import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bvl extends bvf<btl> {
   private final ccq<Integer> c;

   public bvl(ccq<Integer> $$0) {
      super(ImmutableMap.of($$0, ccr.a));
      this.c = $$0;
   }

   private Optional<Integer> b(btl $$0) {
      return $$0.dU().c(this.c);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   @Override
   protected boolean a(aqt $$0, btl $$1, long $$2) {
      Optional<Integer> $$3 = this.b($$1);
      return $$3.isPresent() && $$3.get() > 0;
   }

   @Override
   protected void c(aqt $$0, btl $$1, long $$2) {
      Optional<Integer> $$3 = this.b($$1);
      $$1.dU().a(this.c, $$3.get() - 1);
   }

   @Override
   protected void b(aqt $$0, btl $$1, long $$2) {
      $$1.dU().b(this.c);
   }
}
