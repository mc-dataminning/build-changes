import java.util.List;

public class cvh extends cul {
   private static final int j = 32;
   public static final int a = 120000;
   public static final int b = 0;
   public static final int c = 4;

   public cvh(cul.a $$0) {
      super($$0);
   }

   @Override
   public cuq a(cuq $$0, dcw $$1, btn $$2) {
      if ($$2 instanceof aqv $$3) {
         an.A.a($$3, $$0);
         $$3.b(avz.c.b(this));
      }

      if (!$$1.B) {
         $$1.a(null, $$2.dp(), avp.sr, $$2.df(), 1.0F, 1.0F);
         Integer $$4 = $$0.a(kq.Q, Integer.valueOf(0));
         $$2.b(new brz(bsb.E, 120000, $$4, false, false, true));
      }

      $$0.a(1, $$2);
      return $$0;
   }

   @Override
   public int a(cuq $$0, btn $$1) {
      return 32;
   }

   @Override
   public cwo b(cuq $$0) {
      return cwo.c;
   }

   @Override
   public bqs<cuq> a(dcw $$0, cmx $$1, bqq $$2) {
      return cus.a($$0, $$1, $$2);
   }

   @Override
   public void a(cuq $$0, cul.b $$1, List<wz> $$2, cwm $$3) {
      super.a($$0, $$1, $$2, $$3);
      Integer $$4 = $$0.a(kq.Q, Integer.valueOf(0));
      List<brz> $$5 = List.of(new brz(bsb.E, 120000, $$4, false, false, true));
      cwu.a($$5, $$2::add, 1.0F, $$1.b());
   }
}
