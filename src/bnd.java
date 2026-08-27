import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bnd extends bmx<blg> {
   private final buh<Integer> c;

   public bnd(buh<Integer> $$0) {
      super(ImmutableMap.of($$0, bui.a));
      this.c = $$0;
   }

   private Optional<Integer> b(blg $$0) {
      return $$0.dP().c(this.c);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   @Override
   protected boolean a(ame $$0, blg $$1, long $$2) {
      Optional<Integer> $$3 = this.b($$1);
      return $$3.isPresent() && $$3.get() > 0;
   }

   @Override
   protected void c(ame $$0, blg $$1, long $$2) {
      Optional<Integer> $$3 = this.b($$1);
      $$1.dP().a(this.c, $$3.get() - 1);
   }

   @Override
   protected void b(ame $$0, blg $$1, long $$2) {
      $$1.dP().b(this.c);
   }
}
