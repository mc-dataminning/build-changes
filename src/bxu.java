import com.google.common.collect.ImmutableMap;

public class bxu extends bwo<bux> {
   public bxu(int $$0, int $$1) {
      super(ImmutableMap.of(cdz.n, cea.a), $$0, $$1);
   }

   protected boolean a(arm $$0, bux $$1, long $$2) {
      return $$1.ed().c(cdz.n).filter($$1x -> $$1x.a($$1)).isPresent();
   }

   protected void b(arm $$0, bux $$1, long $$2) {
      $$1.ed().b(cdz.n);
   }

   protected void c(arm $$0, bux $$1, long $$2) {
      $$1.ed().c(cdz.n).ifPresent($$1x -> $$1.K().a($$1x.a()));
   }
}
