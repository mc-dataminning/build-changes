import com.google.common.collect.ImmutableMap;

public class ccw extends bza<cqm> {
   private static final int c = 25;
   private static final int d = 20;

   public ccw() {
      super(ImmutableMap.of(cgl.az, cgm.a, cgl.p, cgm.b, cgl.aG, cgm.c, cgl.aE, cgm.c), cqn.b);
   }

   protected void a(arq $$0, cqm $$1, long $$2) {
      byj<cqm> $$3 = $$1.eb();
      $$3.a(cgl.aE, bau.a, 25L);
      $$3.b(cgl.n);
      bxj $$4 = $$1.eb().c(cgl.az).get();
      bzc.a($$1, $$4);
      $$1.b(bxv.l);
      $$1.a($$4, 20, false);
   }

   protected boolean b(arq $$0, cqm $$1, long $$2) {
      return true;
   }

   protected void c(arq $$0, cqm $$1, long $$2) {
      if (!$$1.eb().a(cgl.aE) && !$$1.eb().a(cgl.aG)) {
         $$1.eb().a(cgl.aG, bau.a, (long)(cqn.b - 25));
         $$1.a(awn.CY, 3.0F, 1.0F);
      }
   }

   protected void d(arq $$0, cqm $$1, long $$2) {
      if ($$1.c(bxv.l)) {
         $$1.b(bxv.a);
      }

      $$1.eb().c(cgl.az).ifPresent($$1::i);
      $$1.eb().b(cgl.az);
   }
}
