import com.google.common.collect.ImmutableMap;

public class cas extends bzn<crl> {
   private final float c;

   public cas(float $$0) {
      super(ImmutableMap.of(cgy.n, cgz.c, cgy.o, cgz.c), Integer.MAX_VALUE);
      this.c = $$0;
   }

   protected boolean a(aru $$0, crl $$1) {
      crz $$2 = $$1.x();
      return $$1.bJ() && $$2 != null && !$$1.bi() && !$$1.T && $$1.g($$2) <= 16.0 && $$2.bR != null;
   }

   protected boolean a(aru $$0, crl $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(aru $$0, crl $$1, long $$2) {
      this.a($$1);
   }

   protected void c(aru $$0, crl $$1, long $$2) {
      byw<?> $$3 = $$1.ec();
      $$3.b(cgy.n);
      $$3.b(cgy.o);
   }

   protected void d(aru $$0, crl $$1, long $$2) {
      this.a($$1);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   private void a(crl $$0) {
      byw<?> $$1 = $$0.ec();
      $$1.a(cgy.n, new chb(new bzy($$0.x(), false), this.c, 2));
      $$1.a(cgy.o, new bzy($$0.x(), true));
   }
}
