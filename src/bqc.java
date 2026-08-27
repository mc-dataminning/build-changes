import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bqc extends bpw<bog> {
   private final bxh<Integer> c;

   public bqc(bxh<Integer> $$0) {
      super(ImmutableMap.of($$0, bxi.a));
      this.c = $$0;
   }

   private Optional<Integer> b(bog $$0) {
      return $$0.dO().c(this.c);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   @Override
   protected boolean a(aov $$0, bog $$1, long $$2) {
      Optional<Integer> $$3 = this.b($$1);
      return $$3.isPresent() && $$3.get() > 0;
   }

   @Override
   protected void c(aov $$0, bog $$1, long $$2) {
      Optional<Integer> $$3 = this.b($$1);
      $$1.dO().a(this.c, $$3.get() - 1);
   }

   @Override
   protected void b(aov $$0, bog $$1, long $$2) {
      $$1.dO().b(this.c);
   }
}
