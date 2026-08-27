import com.google.common.collect.ImmutableMap;

public class btr extends bsl<bqv> {
   public btr(int $$0, int $$1) {
      super(ImmutableMap.of(bzw.n, bzx.a), $$0, $$1);
   }

   protected boolean a(apu $$0, bqv $$1, long $$2) {
      return $$1.dP().c(bzw.n).filter($$1x -> $$1x.a($$1)).isPresent();
   }

   protected void b(apu $$0, bqv $$1, long $$2) {
      $$1.dP().b(bzw.n);
   }

   protected void c(apu $$0, bqv $$1, long $$2) {
      $$1.dP().c(bzw.n).ifPresent($$1x -> $$1.G().a($$1x.a()));
   }
}
