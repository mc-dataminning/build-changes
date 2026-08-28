import java.util.List;

public class cun extends ctv {
   private static final int j = 32;
   public static final int a = 120000;
   public static final int b = 0;
   public static final int c = 4;

   public cun(ctv.a $$0) {
      super($$0);
   }

   @Override
   public cua a(cua $$0, dcd $$1, bsy $$2) {
      if ($$2 instanceof aql $$3) {
         am.A.a($$3, $$0);
         $$3.b(avp.c.b(this));
      }

      if (!$$1.B) {
         $$1.a(null, $$2.dp(), avf.sr, $$2.de(), 1.0F, 1.0F);
         Integer $$4 = $$0.a(kn.Q, Integer.valueOf(0));
         $$2.e(brn.E);
         $$2.b(new brl(brn.E, 120000, $$4, false, false, true));
      }

      $$0.a(1, $$2);
      return $$0;
   }

   @Override
   public int a(cua $$0, bsy $$1) {
      return 32;
   }

   @Override
   public cvv b(cua $$0) {
      return cvv.c;
   }

   @Override
   public bqe<cua> a(dcd $$0, cmh $$1, bqc $$2) {
      return cuc.a($$0, $$1, $$2);
   }

   @Override
   public void a(cua $$0, ctv.b $$1, List<wu> $$2, cvt $$3) {
      super.a($$0, $$1, $$2, $$3);
      Integer $$4 = $$0.a(kn.Q, Integer.valueOf(0));
      List<brl> $$5 = List.of(new brl(brn.E, 120000, $$4, false, false, true));
      cwb.a($$5, $$2::add, 1.0F, $$1.b());
   }
}
