import com.google.common.collect.ImmutableMap;

public class bxy extends bwx<bvg> {
   public static final int c = 100;
   private final brs d;
   private final awn e;

   public bxy(brs $$0, awn $$1) {
      super(ImmutableMap.of(cei.n, cej.c, cei.T, cej.a), 100);
      this.d = $$0;
      this.e = $$1;
   }

   protected boolean a(arq $$0, bvg $$1, long $$2) {
      return !$$1.aL();
   }

   protected void b(arq $$0, bvg $$1, long $$2) {
      $$1.r(true);
      $$1.b(bvq.g);
   }

   protected void c(arq $$0, bvg $$1, long $$2) {
      if ($$1.aL()) {
         $$1.h($$1.dB().d(0.1F, 1.0, 0.1F));
         $$0.a(null, $$1, this.e, awp.g, 2.0F, 1.0F);
      }

      $$1.r(false);
      $$1.b(bvq.a);
      $$1.ee().b(cei.T);
      $$1.ee().a(cei.S, this.d.a($$0.A));
   }
}
