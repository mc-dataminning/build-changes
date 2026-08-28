import java.util.List;

public class cuq extends cty {
   private static final int j = 32;
   public static final int a = 120000;
   public static final int b = 0;
   public static final int c = 4;

   public cuq(cty.a $$0) {
      super($$0);
   }

   @Override
   public cud a(cud $$0, dcg $$1, btc $$2) {
      if ($$2 instanceof aqn $$3) {
         am.A.a($$3, $$0);
         $$3.b(avr.c.b(this));
      }

      if (!$$1.B) {
         $$1.a(null, $$2.dr(), avh.sr, $$2.dg(), 1.0F, 1.0F);
         Integer $$4 = $$0.a(kn.Q, Integer.valueOf(0));
         $$2.e(brr.E);
         $$2.b(new brp(brr.E, 120000, $$4, false, false, true));
      }

      $$0.a(1, $$2);
      return $$0;
   }

   @Override
   public int a(cud $$0, btc $$1) {
      return 32;
   }

   @Override
   public cvy b(cud $$0) {
      return cvy.c;
   }

   @Override
   public bqi<cud> a(dcg $$0, cml $$1, bqg $$2) {
      return cuf.a($$0, $$1, $$2);
   }

   @Override
   public void a(cud $$0, cty.b $$1, List<wu> $$2, cvw $$3) {
      super.a($$0, $$1, $$2, $$3);
      Integer $$4 = $$0.a(kn.Q, Integer.valueOf(0));
      List<brp> $$5 = List.of(new brp(brr.E, 120000, $$4, false, false, true));
      cwe.a($$5, $$2::add, 1.0F, $$1.b());
   }
}
