import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bxw extends bxq<bvx> {
   private final cfb<Integer> c;

   public bxw(cfb<Integer> $$0) {
      super(ImmutableMap.of($$0, cfc.a));
      this.c = $$0;
   }

   private Optional<Integer> b(bvx $$0) {
      return $$0.ec().c(this.c);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   @Override
   protected boolean a(arx $$0, bvx $$1, long $$2) {
      Optional<Integer> $$3 = this.b($$1);
      return $$3.isPresent() && $$3.get() > 0;
   }

   @Override
   protected void c(arx $$0, bvx $$1, long $$2) {
      Optional<Integer> $$3 = this.b($$1);
      $$1.ec().a(this.c, $$3.get() - 1);
   }

   @Override
   protected void b(arx $$0, bvx $$1, long $$2) {
      $$1.ec().b(this.c);
   }
}
