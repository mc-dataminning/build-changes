import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class btc extends bsw<bre> {
   private final cah<Integer> c;

   public btc(cah<Integer> $$0) {
      super(ImmutableMap.of($$0, cai.a));
      this.c = $$0;
   }

   private Optional<Integer> b(bre $$0) {
      return $$0.dQ().c(this.c);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   @Override
   protected boolean a(aqe $$0, bre $$1, long $$2) {
      Optional<Integer> $$3 = this.b($$1);
      return $$3.isPresent() && $$3.get() > 0;
   }

   @Override
   protected void c(aqe $$0, bre $$1, long $$2) {
      Optional<Integer> $$3 = this.b($$1);
      $$1.dQ().a(this.c, $$3.get() - 1);
   }

   @Override
   protected void b(aqe $$0, bre $$1, long $$2) {
      $$1.dQ().b(this.c);
   }
}
