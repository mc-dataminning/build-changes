import java.util.List;

public class cve extends cum {
   private static final int j = 32;
   public static final int a = 120000;
   public static final int b = 0;
   public static final int c = 4;

   public cve(cum.a $$0) {
      super($$0);
   }

   @Override
   public cur a(cur $$0, dca $$1, btr $$2) {
      if ($$2 instanceof arg $$3) {
         am.A.a($$3, $$0);
         $$3.b(awk.c.b(this));
      }

      $$0.a(1, $$2);
      if (!$$1.B) {
         $$1.a(null, $$2.dp(), awa.so, $$2.de(), 1.0F, 1.0F);
         Integer $$4 = $$0.a(km.Q, Integer.valueOf(0));
         $$2.e(bsg.E);
         $$2.b(new bse(bsg.E, 120000, $$4, false, false, true));
      }

      return $$0;
   }

   @Override
   public int b(cur $$0) {
      return 32;
   }

   @Override
   public cwm c(cur $$0) {
      return cwm.c;
   }

   @Override
   public bqx<cur> a(dca $$0, cmz $$1, bqv $$2) {
      return cut.a($$0, $$1, $$2);
   }

   @Override
   public void a(cur $$0, cum.b $$1, List<xp> $$2, cwk $$3) {
      super.a($$0, $$1, $$2, $$3);
      Integer $$4 = $$0.a(km.Q, Integer.valueOf(0));
      List<bse> $$5 = List.of(new bse(bsg.E, 120000, $$4, false, false, true));
      cws.a($$5, $$2::add, 1.0F, $$1.b());
   }
}
