import com.google.common.collect.ImmutableMap;

public class bzy extends byt<cqk> {
   private final float c;

   public bzy(float $$0) {
      super(ImmutableMap.of(cge.n, cgf.c, cge.o, cgf.c), Integer.MAX_VALUE);
      this.c = $$0;
   }

   protected boolean a(arq $$0, cqk $$1) {
      cqy $$2 = $$1.x();
      return $$1.bK() && $$2 != null && !$$1.bj() && !$$1.T && $$1.g($$2) <= 16.0 && $$2.bQ != null;
   }

   protected boolean a(arq $$0, cqk $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(arq $$0, cqk $$1, long $$2) {
      this.a($$1);
   }

   protected void c(arq $$0, cqk $$1, long $$2) {
      byc<?> $$3 = $$1.eb();
      $$3.b(cge.n);
      $$3.b(cge.o);
   }

   protected void d(arq $$0, cqk $$1, long $$2) {
      this.a($$1);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   private void a(cqk $$0) {
      byc<?> $$1 = $$0.eb();
      $$1.a(cge.n, new cgh(new bze($$0.x(), false), this.c, 2));
      $$1.a(cge.o, new bze($$0.x(), true));
   }
}
