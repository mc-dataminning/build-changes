import com.google.common.collect.ImmutableMap;

public class car extends bzl<bxw> {
   public car(int $$0, int $$1) {
      super(ImmutableMap.of(cgw.o, cgx.a), $$0, $$1);
   }

   protected boolean a(ars $$0, bxw $$1, long $$2) {
      return $$1.ec().c(cgw.o).filter($$1x -> $$1x.a($$1)).isPresent();
   }

   protected void b(ars $$0, bxw $$1, long $$2) {
      $$1.ec().b(cgw.o);
   }

   protected void c(ars $$0, bxw $$1, long $$2) {
      $$1.ec().c(cgw.o).ifPresent($$1x -> $$1.J().a($$1x.a()));
   }
}
