import com.google.common.collect.ImmutableMap;

public class bvo extends buj<cll> {
   private final float c;

   public bvo(float $$0) {
      super(ImmutableMap.of(cbu.m, cbv.c, cbu.n, cbv.c), Integer.MAX_VALUE);
      this.c = $$0;
   }

   protected boolean a(aqn $$0, cll $$1) {
      cly $$2 = $$1.gp();
      return $$1.bD() && $$2 != null && !$$1.be() && !$$1.U && $$1.g($$2) <= 16.0 && $$2.cb != null;
   }

   protected boolean a(aqn $$0, cll $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(aqn $$0, cll $$1, long $$2) {
      this.a($$1);
   }

   protected void c(aqn $$0, cll $$1, long $$2) {
      bts<?> $$3 = $$1.dS();
      $$3.b(cbu.m);
      $$3.b(cbu.n);
   }

   protected void d(aqn $$0, cll $$1, long $$2) {
      this.a($$1);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   private void a(cll $$0) {
      bts<?> $$1 = $$0.dS();
      $$1.a(cbu.m, new cbx(new buu($$0.gp(), false), this.c, 2));
      $$1.a(cbu.n, new buu($$0.gp(), true));
   }
}
