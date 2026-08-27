import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bkv extends bkp<biy> {
   private final brz<Integer> c;

   public bkv(brz<Integer> $$0) {
      super(ImmutableMap.of($$0, bsa.a));
      this.c = $$0;
   }

   private Optional<Integer> b(biy $$0) {
      return $$0.dM().c(this.c);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   @Override
   protected boolean a(akk $$0, biy $$1, long $$2) {
      Optional<Integer> $$3 = this.b($$1);
      return $$3.isPresent() && $$3.get() > 0;
   }

   @Override
   protected void c(akk $$0, biy $$1, long $$2) {
      Optional<Integer> $$3 = this.b($$1);
      $$1.dM().a(this.c, $$3.get() - 1);
   }

   @Override
   protected void b(akk $$0, biy $$1, long $$2) {
      $$1.dM().b(this.c);
   }
}
