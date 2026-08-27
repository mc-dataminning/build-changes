import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bni extends bnc<bll> {
   private final bum<Integer> c;

   public bni(bum<Integer> $$0) {
      super(ImmutableMap.of($$0, bun.a));
      this.c = $$0;
   }

   private Optional<Integer> b(bll $$0) {
      return $$0.dP().c(this.c);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   @Override
   protected boolean a(ami $$0, bll $$1, long $$2) {
      Optional<Integer> $$3 = this.b($$1);
      return $$3.isPresent() && $$3.get() > 0;
   }

   @Override
   protected void c(ami $$0, bll $$1, long $$2) {
      Optional<Integer> $$3 = this.b($$1);
      $$1.dP().a(this.c, $$3.get() - 1);
   }

   @Override
   protected void b(ami $$0, bll $$1, long $$2) {
      $$1.dP().b(this.c);
   }
}
