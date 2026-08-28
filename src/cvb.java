import java.util.List;

public class cvb extends cuj {
   private static final int j = 32;
   public static final int a = 120000;
   public static final int b = 0;
   public static final int c = 4;

   public cvb(cuj.a $$0) {
      super($$0);
   }

   @Override
   public cuo a(cuo $$0, dbx $$1, bto $$2) {
      if ($$2 instanceof arf $$3) {
         am.A.a($$3, $$0);
         $$3.b(awj.c.b(this));
      }

      $$0.a(1, $$2);
      if (!$$1.B) {
         $$1.a(null, $$2.dp(), avz.so, $$2.de(), 1.0F, 1.0F);
         Integer $$4 = $$0.a(km.Q, Integer.valueOf(0));
         $$2.e(bsd.E);
         $$2.b(new bsb(bsd.E, 120000, $$4, false, false, true));
      }

      return $$0;
   }

   @Override
   public int b(cuo $$0) {
      return 32;
   }

   @Override
   public cwj c(cuo $$0) {
      return cwj.c;
   }

   @Override
   public bqu<cuo> a(dbx $$0, cmw $$1, bqs $$2) {
      return cuq.a($$0, $$1, $$2);
   }

   @Override
   public void a(cuo $$0, cuj.b $$1, List<xo> $$2, cwh $$3) {
      super.a($$0, $$1, $$2, $$3);
      Integer $$4 = $$0.a(km.Q, Integer.valueOf(0));
      List<bsb> $$5 = List.of(new bsb(bsd.E, 120000, $$4, false, false, true));
      cwp.a($$5, $$2::add, 1.0F, $$1.b());
   }
}
