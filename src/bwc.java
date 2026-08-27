import com.google.common.collect.ImmutableMap;

public class bwc extends bsg<cix> {
   private static final int c = 25;
   private static final int d = 20;

   public bwc() {
      super(ImmutableMap.of(bzr.ay, bzs.a, bzr.o, bzs.b, bzr.aF, bzs.c, bzr.aD, bzs.c), ciy.b);
   }

   protected void a(aps $$0, cix $$1, long $$2) {
      brp<cix> $$3 = $$1.dP();
      $$3.a(bzr.aD, aym.a, 25L);
      $$3.b(bzr.m);
      bqo $$4 = $$1.dP().c(bzr.ay).get();
      bsi.a($$1, $$4);
      $$1.b(bqz.l);
      $$1.a($$4, 20, false);
   }

   protected boolean b(aps $$0, cix $$1, long $$2) {
      return true;
   }

   protected void c(aps $$0, cix $$1, long $$2) {
      if (!$$1.dP().a(bzr.aD) && !$$1.dP().a(bzr.aF)) {
         $$1.dP().a(bzr.aF, aym.a, (long)(ciy.b - 25));
         $$1.a(aum.Bx, 3.0F, 1.0F);
      }
   }

   protected void d(aps $$0, cix $$1, long $$2) {
      if ($$1.c(bqz.l)) {
         $$1.b(bqz.a);
      }

      $$1.dP().c(bzr.ay).ifPresent($$1::j);
      $$1.dP().b(bzr.ay);
   }
}
