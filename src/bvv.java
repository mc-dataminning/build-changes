import com.google.common.collect.ImmutableMap;

public class bvv extends buu<btd> {
   public static final int c = 100;
   private final bpr d;
   private final avg e;

   public bvv(bpr $$0, avg $$1) {
      super(ImmutableMap.of(ccf.n, ccg.c, ccf.T, ccg.a), 100);
      this.d = $$0;
      this.e = $$1;
   }

   protected boolean a(aqm $$0, btd $$1, long $$2) {
      return !$$1.aF();
   }

   protected void b(aqm $$0, btd $$1, long $$2) {
      $$1.q(true);
      $$1.b(btn.g);
   }

   protected void c(aqm $$0, btd $$1, long $$2) {
      if ($$1.aF()) {
         $$1.i($$1.dt().d(0.1F, 1.0, 0.1F));
         $$0.a(null, $$1, this.e, avi.g, 2.0F, 1.0F);
      }

      $$1.q(false);
      $$1.b(btn.a);
      $$1.dU().b(ccf.T);
      $$1.dU().a(ccf.S, this.d.a($$0.z));
   }
}
