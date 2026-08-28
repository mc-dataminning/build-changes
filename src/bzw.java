import com.google.common.collect.ImmutableMap;

public class bzw extends byq<bxb> {
   public bzw(int $$0, int $$1) {
      super(ImmutableMap.of(cgb.o, cgc.a), $$0, $$1);
   }

   protected boolean a(aro $$0, bxb $$1, long $$2) {
      return $$1.eb().c(cgb.o).filter($$1x -> $$1x.a($$1)).isPresent();
   }

   protected void b(aro $$0, bxb $$1, long $$2) {
      $$1.eb().b(cgb.o);
   }

   protected void c(aro $$0, bxb $$1, long $$2) {
      $$1.eb().c(cgb.o).ifPresent($$1x -> $$1.J().a($$1x.a()));
   }
}
