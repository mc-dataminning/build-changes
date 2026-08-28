import java.util.List;

public class cva extends cui {
   private static final int j = 32;
   public static final int a = 120000;
   public static final int b = 0;
   public static final int c = 4;

   public cva(cui.a $$0) {
      super($$0);
   }

   @Override
   public cun a(cun $$0, dbw $$1, btn $$2) {
      if ($$2 instanceof arf $$3) {
         am.A.a($$3, $$0);
         $$3.b(awj.c.b(this));
      }

      $$0.a(1, $$2);
      if (!$$1.B) {
         $$1.a(null, $$2.dp(), avz.so, $$2.de(), 1.0F, 1.0F);
         Integer $$4 = $$0.a(km.P, Integer.valueOf(0));
         $$2.e(bsc.E);
         $$2.b(new bsa(bsc.E, 120000, $$4, false, false, true));
      }

      return $$0;
   }

   @Override
   public int b(cun $$0) {
      return 32;
   }

   @Override
   public cwi c(cun $$0) {
      return cwi.c;
   }

   @Override
   public bqt<cun> a(dbw $$0, cmv $$1, bqr $$2) {
      return cup.a($$0, $$1, $$2);
   }

   @Override
   public void a(cun $$0, cui.b $$1, List<xo> $$2, cwg $$3) {
      super.a($$0, $$1, $$2, $$3);
      Integer $$4 = $$0.a(km.P, Integer.valueOf(0));
      List<bsa> $$5 = List.of(new bsa(bsc.E, 120000, $$4, false, false, true));
      cwo.a($$5, $$2::add, 1.0F, $$1.b());
   }
}
