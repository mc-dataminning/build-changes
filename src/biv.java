import com.google.common.collect.ImmutableMap;

public class biv extends bhr<byb> {
   private final float c;

   public biv(float $$0) {
      super(ImmutableMap.of(bpb.m, bpc.c, bpb.n, bpc.c), Integer.MAX_VALUE);
      this.c = $$0;
   }

   protected boolean a(aif $$0, byb $$1) {
      byo $$2 = $$1.fY();
      return $$1.bs() && $$2 != null && !$$1.aV() && !$$1.S && $$1.f($$2) <= 16.0 && $$2.bR != null;
   }

   protected boolean a(aif $$0, byb $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(aif $$0, byb $$1, long $$2) {
      this.a($$1);
   }

   protected void c(aif $$0, byb $$1, long $$2) {
      bha<?> $$3 = $$1.dK();
      $$3.b(bpb.m);
      $$3.b(bpb.n);
   }

   protected void d(aif $$0, byb $$1, long $$2) {
      this.a($$1);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   private void a(byb $$0) {
      bha<?> $$1 = $$0.dK();
      $$1.a(bpb.m, new bpe(new bic($$0.fY(), false), this.c, 2));
      $$1.a(bpb.n, new bic($$0.fY(), true));
   }
}
