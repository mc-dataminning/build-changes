import com.google.common.collect.ImmutableMap;

public class byd extends bwx<bvg> {
   public byd(int $$0, int $$1) {
      super(ImmutableMap.of(cei.n, cej.a), $$0, $$1);
   }

   protected boolean a(arq $$0, bvg $$1, long $$2) {
      return $$1.ee().c(cei.n).filter($$1x -> $$1x.a($$1)).isPresent();
   }

   protected void b(arq $$0, bvg $$1, long $$2) {
      $$1.ee().b(cei.n);
   }

   protected void c(arq $$0, bvg $$1, long $$2) {
      $$1.ee().c(cei.n).ifPresent($$1x -> $$1.K().a($$1x.a()));
   }
}
