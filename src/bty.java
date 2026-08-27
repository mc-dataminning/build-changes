import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bty extends bts<bsa> {
   private final cbd<Integer> c;

   public bty(cbd<Integer> $$0) {
      super(ImmutableMap.of($$0, cbe.a));
      this.c = $$0;
   }

   private Optional<Integer> b(bsa $$0) {
      return $$0.dQ().c(this.c);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   @Override
   protected boolean a(aqh $$0, bsa $$1, long $$2) {
      Optional<Integer> $$3 = this.b($$1);
      return $$3.isPresent() && $$3.get() > 0;
   }

   @Override
   protected void c(aqh $$0, bsa $$1, long $$2) {
      Optional<Integer> $$3 = this.b($$1);
      $$1.dQ().a(this.c, $$3.get() - 1);
   }

   @Override
   protected void b(aqh $$0, bsa $$1, long $$2) {
      $$1.dQ().b(this.c);
   }
}
