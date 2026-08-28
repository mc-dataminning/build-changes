import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bya extends bxu<bwb> {
   private final cff<Integer> c;

   public bya(cff<Integer> $$0) {
      super(ImmutableMap.of($$0, cfg.a));
      this.c = $$0;
   }

   private Optional<Integer> b(bwb $$0) {
      return $$0.eb().c(this.c);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   @Override
   protected boolean a(ash $$0, bwb $$1, long $$2) {
      Optional<Integer> $$3 = this.b($$1);
      return $$3.isPresent() && $$3.get() > 0;
   }

   @Override
   protected void c(ash $$0, bwb $$1, long $$2) {
      Optional<Integer> $$3 = this.b($$1);
      $$1.eb().a(this.c, $$3.get() - 1);
   }

   @Override
   protected void b(ash $$0, bwb $$1, long $$2) {
      $$1.eb().b(this.c);
   }
}
