import com.google.common.collect.ImmutableMap;

public class bxi extends bwc<bum> {
   public bxi(int $$0, int $$1) {
      super(ImmutableMap.of(cdn.n, cdo.a), $$0, $$1);
   }

   protected boolean a(arh $$0, bum $$1, long $$2) {
      return $$1.dX().c(cdn.n).filter($$1x -> $$1x.a($$1)).isPresent();
   }

   protected void b(arh $$0, bum $$1, long $$2) {
      $$1.dX().b(cdn.n);
   }

   protected void c(arh $$0, bum $$1, long $$2) {
      $$1.dX().c(cdn.n).ifPresent($$1x -> $$1.K().a($$1x.a()));
   }
}
