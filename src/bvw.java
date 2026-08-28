import com.google.common.collect.ImmutableMap;

public class bvw extends buv<bte> {
   public static final int c = 100;
   private final bps d;
   private final avg e;

   public bvw(bps $$0, avg $$1) {
      super(ImmutableMap.of(ccg.n, cch.c, ccg.T, cch.a), 100);
      this.d = $$0;
      this.e = $$1;
   }

   protected boolean a(aqm $$0, bte $$1, long $$2) {
      return !$$1.aG();
   }

   protected void b(aqm $$0, bte $$1, long $$2) {
      $$1.r(true);
      $$1.b(bto.g);
   }

   protected void c(aqm $$0, bte $$1, long $$2) {
      if ($$1.aG()) {
         $$1.j($$1.du().d(0.1F, 1.0, 0.1F));
         $$0.a(null, $$1, this.e, avi.g, 2.0F, 1.0F);
      }

      $$1.r(false);
      $$1.b(bto.a);
      $$1.dV().b(ccg.T);
      $$1.dV().a(ccg.S, this.d.a($$0.z));
   }
}
