import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bld extends bkx<bjg> {
   private final bsh<Integer> c;

   public bld(bsh<Integer> $$0) {
      super(ImmutableMap.of($$0, bsi.a));
      this.c = $$0;
   }

   private Optional<Integer> b(bjg $$0) {
      return $$0.dN().c(this.c);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   @Override
   protected boolean a(akq $$0, bjg $$1, long $$2) {
      Optional<Integer> $$3 = this.b($$1);
      return $$3.isPresent() && $$3.get() > 0;
   }

   @Override
   protected void c(akq $$0, bjg $$1, long $$2) {
      Optional<Integer> $$3 = this.b($$1);
      $$1.dN().a(this.c, $$3.get() - 1);
   }

   @Override
   protected void b(akq $$0, bjg $$1, long $$2) {
      $$1.dN().b(this.c);
   }
}
