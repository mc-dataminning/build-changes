import com.google.common.collect.ImmutableMap;

public class bsu extends bhr<bss> {
   public bsu() {
      super(ImmutableMap.of(bpb.M, bpc.a, bpb.y, bpc.a), 200);
   }

   protected boolean a(aif $$0, bss $$1) {
      return $$1.aY();
   }

   protected boolean a(aif $$0, bss $$1, long $$2) {
      return $$1.aY() && $$1.dK().a(bpb.M);
   }

   protected void b(aif $$0, bss $$1, long $$2) {
      bha<bss> $$3 = $$1.dK();
      $$3.b(bpb.m);
      $$3.b(bpb.n);
      $$1.b(new bfa(bfc.j, 200, 0));
   }
}
