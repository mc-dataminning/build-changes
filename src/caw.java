import com.google.common.collect.ImmutableMap;

public class caw extends bxa<cnw> {
   private static final int c = 25;
   private static final int d = 20;

   public caw() {
      super(ImmutableMap.of(cel.ay, cem.a, cel.o, cem.b, cel.aF, cem.c, cel.aD, cem.c), cnx.b);
   }

   protected void a(arp $$0, cnw $$1, long $$2) {
      bwj<cnw> $$3 = $$1.eb();
      $$3.a(cel.aD, bas.a, 25L);
      $$3.b(cel.m);
      bvh $$4 = $$1.eb().c(cel.ay).get();
      bxc.a($$1, $$4);
      $$1.b(bvt.l);
      $$1.a($$4, 20, false);
   }

   protected boolean b(arp $$0, cnw $$1, long $$2) {
      return true;
   }

   protected void c(arp $$0, cnw $$1, long $$2) {
      if (!$$1.eb().a(cel.aD) && !$$1.eb().a(cel.aF)) {
         $$1.eb().a(cel.aF, bas.a, (long)(cnx.b - 25));
         $$1.a(awn.BY, 3.0F, 1.0F);
      }
   }

   protected void d(arp $$0, cnw $$1, long $$2) {
      if ($$1.c(bvt.l)) {
         $$1.b(bvt.a);
      }

      $$1.eb().c(cel.ay).ifPresent($$1::j);
      $$1.eb().b(cel.ay);
   }
}
