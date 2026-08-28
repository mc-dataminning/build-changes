import com.google.common.collect.ImmutableMap;

public class bxz extends bwt<bvc> {
   public bxz(int $$0, int $$1) {
      super(ImmutableMap.of(cee.n, cef.a), $$0, $$1);
   }

   protected boolean a(arn $$0, bvc $$1, long $$2) {
      return $$1.ed().c(cee.n).filter($$1x -> $$1x.a($$1)).isPresent();
   }

   protected void b(arn $$0, bvc $$1, long $$2) {
      $$1.ed().b(cee.n);
   }

   protected void c(arn $$0, bvc $$1, long $$2) {
      $$1.ed().c(cee.n).ifPresent($$1x -> $$1.K().a($$1x.a()));
   }
}
