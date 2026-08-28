import java.util.List;

public class cux extends cuf {
   private static final int j = 32;
   public static final int a = 120000;
   public static final int b = 0;
   public static final int c = 4;

   public cux(cuf.a $$0) {
      super($$0);
   }

   @Override
   public cuk a(cuk $$0, dbt $$1, btk $$2) {
      if ($$2 instanceof arc $$3) {
         am.A.a($$3, $$0);
         $$3.b(awg.c.b(this));
      }

      $$0.a(1, $$2);
      if (!$$1.B) {
         $$1.a(null, $$2.dp(), avw.so, $$2.de(), 1.0F, 1.0F);
         Integer $$4 = $$0.a(km.P, Integer.valueOf(0));
         $$2.e(brz.E);
         $$2.b(new brx(brz.E, 120000, $$4, false, false, true));
      }

      return $$0;
   }

   @Override
   public int b(cuk $$0) {
      return 32;
   }

   @Override
   public cwf c(cuk $$0) {
      return cwf.c;
   }

   @Override
   public bqq<cuk> a(dbt $$0, cms $$1, bqo $$2) {
      return cum.a($$0, $$1, $$2);
   }

   @Override
   public void a(cuk $$0, cuf.b $$1, List<xl> $$2, cwd $$3) {
      super.a($$0, $$1, $$2, $$3);
      Integer $$4 = $$0.a(km.P, Integer.valueOf(0));
      List<brx> $$5 = List.of(new brx(brz.E, 120000, $$4, false, false, true));
      cwl.a($$5, $$2::add, 1.0F, $$1.b());
   }
}
