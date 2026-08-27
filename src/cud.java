import java.util.List;

public class cud extends ctl {
   private static final int j = 32;
   public static final int a = 120000;
   public static final int b = 0;
   public static final int c = 4;

   public cud(ctl.a $$0) {
      super($$0);
   }

   @Override
   public ctq a(ctq $$0, daz $$1, bsq $$2) {
      if ($$2 instanceof aqo $$3) {
         am.A.a($$3, $$0);
         $$3.b(avs.c.b(this));
      }

      $$0.a(1, $$2);
      if (!$$1.B) {
         $$1.a(null, $$2.dp(), avi.so, $$2.de(), 1.0F, 1.0F);
         Integer $$4 = $$0.a(kb.P, Integer.valueOf(0));
         $$2.e(brg.E);
         $$2.b(new bre(brg.E, 120000, $$4, false, false, true));
      }

      return $$0;
   }

   @Override
   public int b(ctq $$0) {
      return 32;
   }

   @Override
   public cvl c(ctq $$0) {
      return cvl.c;
   }

   @Override
   public bpx<ctq> a(daz $$0, cly $$1, bpv $$2) {
      return cts.a($$0, $$1, $$2);
   }

   @Override
   public void a(ctq $$0, ctl.b $$1, List<wx> $$2, cvj $$3) {
      super.a($$0, $$1, $$2, $$3);
      Integer $$4 = $$0.a(kb.P, Integer.valueOf(0));
      List<bre> $$5 = List.of(new bre(brg.E, 120000, $$4, false, false, true));
      cvr.a($$5, $$2::add, 1.0F, $$1.b());
   }
}
