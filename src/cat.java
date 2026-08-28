import com.google.common.collect.ImmutableMap;

public class cat extends bzn<bxy> {
   public cat(int $$0, int $$1) {
      super(ImmutableMap.of(cgy.o, cgz.a), $$0, $$1);
   }

   protected boolean a(aru $$0, bxy $$1, long $$2) {
      return $$1.ec().c(cgy.o).filter($$1x -> $$1x.a($$1)).isPresent();
   }

   protected void b(aru $$0, bxy $$1, long $$2) {
      $$1.ec().b(cgy.o);
   }

   protected void c(aru $$0, bxy $$1, long $$2) {
      $$1.ec().c(cgy.o).ifPresent($$1x -> $$1.J().a($$1x.a()));
   }
}
