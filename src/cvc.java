import java.util.List;

public class cvc extends cuk {
   private static final int j = 32;
   public static final int a = 120000;
   public static final int b = 0;
   public static final int c = 4;

   public cvc(cuk.a $$0) {
      super($$0);
   }

   @Override
   public cup a(cup $$0, dby $$1, btp $$2) {
      if ($$2 instanceof arg $$3) {
         am.A.a($$3, $$0);
         $$3.b(awk.c.b(this));
      }

      $$0.a(1, $$2);
      if (!$$1.B) {
         $$1.a(null, $$2.dp(), awa.so, $$2.de(), 1.0F, 1.0F);
         Integer $$4 = $$0.a(km.Q, Integer.valueOf(0));
         $$2.e(bse.E);
         $$2.b(new bsc(bse.E, 120000, $$4, false, false, true));
      }

      return $$0;
   }

   @Override
   public int b(cup $$0) {
      return 32;
   }

   @Override
   public cwk c(cup $$0) {
      return cwk.c;
   }

   @Override
   public bqv<cup> a(dby $$0, cmx $$1, bqt $$2) {
      return cur.a($$0, $$1, $$2);
   }

   @Override
   public void a(cup $$0, cuk.b $$1, List<xp> $$2, cwi $$3) {
      super.a($$0, $$1, $$2, $$3);
      Integer $$4 = $$0.a(km.Q, Integer.valueOf(0));
      List<bsc> $$5 = List.of(new bsc(bse.E, 120000, $$4, false, false, true));
      cwq.a($$5, $$2::add, 1.0F, $$1.b());
   }
}
