import com.google.common.collect.ImmutableMap;

public class bon extends bks<cat> {
   private static final int c = 25;
   private static final int d = 20;

   public bon() {
      super(ImmutableMap.of(bsc.ax, bsd.a, bsc.o, bsd.b, bsc.aE, bsd.c, bsc.aC, bsd.c), cau.b);
   }

   protected void a(akn $$0, cat $$1, long $$2) {
      bkb<cat> $$3 = $$1.dM();
      $$3.a(bsc.aC, ass.a, 25L);
      $$3.b(bsc.m);
      bjb $$4 = $$1.dM().c(bsc.ax).get();
      bku.a($$1, $$4);
      $$1.b(bjn.l);
      $$1.a($$4, 20, false);
   }

   protected boolean b(akn $$0, cat $$1, long $$2) {
      return true;
   }

   protected void c(akn $$0, cat $$1, long $$2) {
      if (!$$1.dM().a(bsc.aC) && !$$1.dM().a(bsc.aE)) {
         $$1.dM().a(bsc.aE, ass.a, (long)(cau.b - 25));
         $$1.a(aoz.zJ, 3.0F, 1.0F);
      }
   }

   protected void d(akn $$0, cat $$1, long $$2) {
      if ($$1.c(bjn.l)) {
         $$1.b(bjn.a);
      }

      $$1.dM().c(bsc.ax).ifPresent($$1::j);
      $$1.dM().b(bsc.ax);
   }
}
