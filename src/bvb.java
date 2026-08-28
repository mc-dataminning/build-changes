import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bvb extends buv<btc> {
   private final ccg<Integer> c;

   public bvb(ccg<Integer> $$0) {
      super(ImmutableMap.of($$0, cch.a));
      this.c = $$0;
   }

   private Optional<Integer> b(btc $$0) {
      return $$0.dV().c(this.c);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   @Override
   protected boolean a(aqm $$0, btc $$1, long $$2) {
      Optional<Integer> $$3 = this.b($$1);
      return $$3.isPresent() && $$3.get() > 0;
   }

   @Override
   protected void c(aqm $$0, btc $$1, long $$2) {
      Optional<Integer> $$3 = this.b($$1);
      $$1.dV().a(this.c, $$3.get() - 1);
   }

   @Override
   protected void b(aqm $$0, btc $$1, long $$2) {
      $$1.dV().b(this.c);
   }
}
