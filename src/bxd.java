import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bxd extends bwx<bve> {
   private final cei<Integer> c;

   public bxd(cei<Integer> $$0) {
      super(ImmutableMap.of($$0, cej.a));
      this.c = $$0;
   }

   private Optional<Integer> b(bve $$0) {
      return $$0.ee().c(this.c);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   @Override
   protected boolean a(arq $$0, bve $$1, long $$2) {
      Optional<Integer> $$3 = this.b($$1);
      return $$3.isPresent() && $$3.get() > 0;
   }

   @Override
   protected void c(arq $$0, bve $$1, long $$2) {
      Optional<Integer> $$3 = this.b($$1);
      $$1.ee().a(this.c, $$3.get() - 1);
   }

   @Override
   protected void b(arq $$0, bve $$1, long $$2) {
      $$1.ee().b(this.c);
   }
}
