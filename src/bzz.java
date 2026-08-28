import com.google.common.collect.ImmutableMap;

public class bzz extends byt<bxe> {
   public bzz(int $$0, int $$1) {
      super(ImmutableMap.of(cge.o, cgf.a), $$0, $$1);
   }

   protected boolean a(arq $$0, bxe $$1, long $$2) {
      return $$1.eb().c(cge.o).filter($$1x -> $$1x.a($$1)).isPresent();
   }

   protected void b(arq $$0, bxe $$1, long $$2) {
      $$1.eb().b(cge.o);
   }

   protected void c(arq $$0, bxe $$1, long $$2) {
      $$1.eb().c(cge.o).ifPresent($$1x -> $$1.J().a($$1x.a()));
   }
}
