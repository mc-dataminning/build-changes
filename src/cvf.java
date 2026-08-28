import java.util.List;

public class cvf extends cuj {
   private static final int j = 32;
   public static final int a = 120000;
   public static final int b = 0;
   public static final int c = 4;

   public cvf(cuj.a $$0) {
      super($$0);
   }

   @Override
   public cuo a(cuo $$0, dcu $$1, btl $$2) {
      if ($$2 instanceof aqu $$3) {
         an.A.a($$3, $$0);
         $$3.b(avy.c.b(this));
      }

      if (!$$1.B) {
         $$1.a(null, $$2.dq(), avo.sr, $$2.df(), 1.0F, 1.0F);
         Integer $$4 = $$0.a(kq.Q, Integer.valueOf(0));
         $$2.b(new bry(bsa.E, 120000, $$4, false, false, true));
      }

      $$0.a(1, $$2);
      return $$0;
   }

   @Override
   public int a(cuo $$0, btl $$1) {
      return 32;
   }

   @Override
   public cwm b(cuo $$0) {
      return cwm.c;
   }

   @Override
   public bqr<cuo> a(dcu $$0, cmv $$1, bqp $$2) {
      return cuq.a($$0, $$1, $$2);
   }

   @Override
   public void a(cuo $$0, cuj.b $$1, List<wy> $$2, cwk $$3) {
      super.a($$0, $$1, $$2, $$3);
      Integer $$4 = $$0.a(kq.Q, Integer.valueOf(0));
      List<bry> $$5 = List.of(new bry(bsa.E, 120000, $$4, false, false, true));
      cws.a($$5, $$2::add, 1.0F, $$1.b());
   }
}
