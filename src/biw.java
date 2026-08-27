import com.google.common.collect.ImmutableMap;

public class biw extends bhr<bgb> {
   public biw(int $$0, int $$1) {
      super(ImmutableMap.of(bpb.n, bpc.a), $$0, $$1);
   }

   protected boolean a(aif $$0, bgb $$1, long $$2) {
      return $$1.dK().c(bpb.n).filter($$1x -> $$1x.a($$1)).isPresent();
   }

   protected void b(aif $$0, bgb $$1, long $$2) {
      $$1.dK().b(bpb.n);
   }

   protected void c(aif $$0, bgb $$1, long $$2) {
      $$1.dK().c(bpb.n).ifPresent($$1x -> $$1.E().a($$1x.a()));
   }
}
