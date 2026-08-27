import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class brn extends brh<bpp> {
   private final bys<Integer> c;

   public brn(bys<Integer> $$0) {
      super(ImmutableMap.of($$0, byt.a));
      this.c = $$0;
   }

   private Optional<Integer> b(bpp $$0) {
      return $$0.dP().c(this.c);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   @Override
   protected boolean a(apf $$0, bpp $$1, long $$2) {
      Optional<Integer> $$3 = this.b($$1);
      return $$3.isPresent() && $$3.get() > 0;
   }

   @Override
   protected void c(apf $$0, bpp $$1, long $$2) {
      Optional<Integer> $$3 = this.b($$1);
      $$1.dP().a(this.c, $$3.get() - 1);
   }

   @Override
   protected void b(apf $$0, bpp $$1, long $$2) {
      $$1.dP().b(this.c);
   }
}
