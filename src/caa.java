import com.google.common.collect.ImmutableMap;

public class caa extends byv<cqo> {
   private final float c;

   public caa(float $$0) {
      super(ImmutableMap.of(cgg.n, cgh.c, cgg.o, cgh.c), Integer.MAX_VALUE);
      this.c = $$0;
   }

   protected boolean a(arq $$0, cqo $$1) {
      crc $$2 = $$1.x();
      return $$1.bK() && $$2 != null && !$$1.bj() && !$$1.T && $$1.g($$2) <= 16.0 && $$2.bR != null;
   }

   protected boolean a(arq $$0, cqo $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(arq $$0, cqo $$1, long $$2) {
      this.a($$1);
   }

   protected void c(arq $$0, cqo $$1, long $$2) {
      bye<?> $$3 = $$1.ec();
      $$3.b(cgg.n);
      $$3.b(cgg.o);
   }

   protected void d(arq $$0, cqo $$1, long $$2) {
      this.a($$1);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   private void a(cqo $$0) {
      bye<?> $$1 = $$0.ec();
      $$1.a(cgg.n, new cgj(new bzg($$0.x(), false), this.c, 2));
      $$1.a(cgg.o, new bzg($$0.x(), true));
   }
}
