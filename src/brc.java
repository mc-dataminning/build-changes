import com.google.common.collect.ImmutableMap;

public class brc extends bpw<boi> {
   public brc(int $$0, int $$1) {
      super(ImmutableMap.of(bxh.n, bxi.a), $$0, $$1);
   }

   protected boolean a(aov $$0, boi $$1, long $$2) {
      return $$1.dO().c(bxh.n).filter($$1x -> $$1x.a($$1)).isPresent();
   }

   protected void b(aov $$0, boi $$1, long $$2) {
      $$1.dO().b(bxh.n);
   }

   protected void c(aov $$0, boi $$1, long $$2) {
      $$1.dO().c(bxh.n).ifPresent($$1x -> $$1.I().a($$1x.a()));
   }
}
