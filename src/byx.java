import com.google.common.collect.ImmutableMap;

public class byx extends bxr<bwa> {
   public byx(int $$0, int $$1) {
      super(ImmutableMap.of(cfc.n, cfd.a), $$0, $$1);
   }

   protected boolean a(ard $$0, bwa $$1, long $$2) {
      return $$1.ea().c(cfc.n).filter($$1x -> $$1x.a($$1)).isPresent();
   }

   protected void b(ard $$0, bwa $$1, long $$2) {
      $$1.ea().b(cfc.n);
   }

   protected void c(ard $$0, bwa $$1, long $$2) {
      $$1.ea().c(cfc.n).ifPresent($$1x -> $$1.J().a($$1x.a()));
   }
}
