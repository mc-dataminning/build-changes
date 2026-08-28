import com.google.common.collect.ImmutableMap;

public class cbc extends bzw<byh> {
   public cbc(int $$0, int $$1) {
      super(ImmutableMap.of(chh.o, chi.a), $$0, $$1);
   }

   protected boolean a(asb $$0, byh $$1, long $$2) {
      return $$1.ec().c(chh.o).filter($$1x -> $$1x.a($$1)).isPresent();
   }

   protected void b(asb $$0, byh $$1, long $$2) {
      $$1.ec().b(chh.o);
   }

   protected void c(asb $$0, byh $$1, long $$2) {
      $$1.ec().c(chh.o).ifPresent($$1x -> $$1.I().a($$1x.a()));
   }
}
