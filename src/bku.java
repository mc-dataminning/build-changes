import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bku extends bko<biw> {
   private final bry<Integer> c;

   public bku(bry<Integer> $$0) {
      super(ImmutableMap.of($$0, brz.a));
      this.c = $$0;
   }

   private Optional<Integer> b(biw $$0) {
      return $$0.dM().c(this.c);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   @Override
   protected boolean a(aki $$0, biw $$1, long $$2) {
      Optional<Integer> $$3 = this.b($$1);
      return $$3.isPresent() && $$3.get() > 0;
   }

   @Override
   protected void c(aki $$0, biw $$1, long $$2) {
      Optional<Integer> $$3 = this.b($$1);
      $$1.dM().a(this.c, $$3.get() - 1);
   }

   @Override
   protected void b(aki $$0, biw $$1, long $$2) {
      $$1.dM().b(this.c);
   }
}
