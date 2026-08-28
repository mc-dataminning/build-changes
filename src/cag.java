import com.google.common.collect.ImmutableMap;

public class cag extends bza<bxl> {
   public cag(int $$0, int $$1) {
      super(ImmutableMap.of(cgl.o, cgm.a), $$0, $$1);
   }

   protected boolean a(arq $$0, bxl $$1, long $$2) {
      return $$1.eb().c(cgl.o).filter($$1x -> $$1x.a($$1)).isPresent();
   }

   protected void b(arq $$0, bxl $$1, long $$2) {
      $$1.eb().b(cgl.o);
   }

   protected void c(arq $$0, bxl $$1, long $$2) {
      $$1.eb().c(cgl.o).ifPresent($$1x -> $$1.J().a($$1x.a()));
   }
}
