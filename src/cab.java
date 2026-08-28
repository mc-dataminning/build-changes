import com.google.common.collect.ImmutableMap;

public class cab extends byv<bxg> {
   public cab(int $$0, int $$1) {
      super(ImmutableMap.of(cgg.o, cgh.a), $$0, $$1);
   }

   protected boolean a(arq $$0, bxg $$1, long $$2) {
      return $$1.ec().c(cgg.o).filter($$1x -> $$1x.a($$1)).isPresent();
   }

   protected void b(arq $$0, bxg $$1, long $$2) {
      $$1.ec().b(cgg.o);
   }

   protected void c(arq $$0, bxg $$1, long $$2) {
      $$1.ec().c(cgg.o).ifPresent($$1x -> $$1.J().a($$1x.a()));
   }
}
