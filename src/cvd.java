import java.util.List;

public class cvd extends cul {
   private static final int j = 32;
   public static final int a = 120000;
   public static final int b = 0;
   public static final int c = 4;

   public cvd(cul.a $$0) {
      super($$0);
   }

   @Override
   public cuq a(cuq $$0, dbz $$1, btq $$2) {
      if ($$2 instanceof arg $$3) {
         am.A.a($$3, $$0);
         $$3.b(awk.c.b(this));
      }

      $$0.a(1, $$2);
      if (!$$1.B) {
         $$1.a(null, $$2.dp(), awa.so, $$2.de(), 1.0F, 1.0F);
         Integer $$4 = $$0.a(km.Q, Integer.valueOf(0));
         $$2.e(bsf.E);
         $$2.b(new bsd(bsf.E, 120000, $$4, false, false, true));
      }

      return $$0;
   }

   @Override
   public int b(cuq $$0) {
      return 32;
   }

   @Override
   public cwl c(cuq $$0) {
      return cwl.c;
   }

   @Override
   public bqw<cuq> a(dbz $$0, cmy $$1, bqu $$2) {
      return cus.a($$0, $$1, $$2);
   }

   @Override
   public void a(cuq $$0, cul.b $$1, List<xp> $$2, cwj $$3) {
      super.a($$0, $$1, $$2, $$3);
      Integer $$4 = $$0.a(km.Q, Integer.valueOf(0));
      List<bsd> $$5 = List.of(new bsd(bsf.E, 120000, $$4, false, false, true));
      cwr.a($$5, $$2::add, 1.0F, $$1.b());
   }
}
