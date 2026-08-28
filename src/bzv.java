import com.google.common.collect.ImmutableMap;

public class bzv extends byq<cqe> {
   private final float c;

   public bzv(float $$0) {
      super(ImmutableMap.of(cgb.n, cgc.c, cgb.o, cgc.c), Integer.MAX_VALUE);
      this.c = $$0;
   }

   protected boolean a(aro $$0, cqe $$1) {
      cqs $$2 = $$1.x();
      return $$1.bK() && $$2 != null && !$$1.bj() && !$$1.T && $$1.g($$2) <= 16.0 && $$2.bQ != null;
   }

   protected boolean a(aro $$0, cqe $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(aro $$0, cqe $$1, long $$2) {
      this.a($$1);
   }

   protected void c(aro $$0, cqe $$1, long $$2) {
      bxz<?> $$3 = $$1.eb();
      $$3.b(cgb.n);
      $$3.b(cgb.o);
   }

   protected void d(aro $$0, cqe $$1, long $$2) {
      this.a($$1);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   private void a(cqe $$0) {
      bxz<?> $$1 = $$0.eb();
      $$1.a(cgb.n, new cge(new bzb($$0.x(), false), this.c, 2));
      $$1.a(cgb.o, new bzb($$0.x(), true));
   }
}
