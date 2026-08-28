import java.util.ArrayList;
import java.util.List;

public class cvw extends cuf {
   public static final int a = 160;

   public cvw(cuf.a $$0) {
      super($$0);
   }

   @Override
   public void a(cuk $$0, cuf.b $$1, List<xl> $$2, cwd $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.b()) {
         List<brx> $$4 = new ArrayList<>();
         cxo $$5 = $$0.a(km.G, cxo.a);

         for (cxo.a $$6 : $$5.a()) {
            $$4.add($$6.a());
         }

         cwl.a($$4, $$2::add, 1.0F, $$1.b());
      }
   }

   @Override
   public cuk a(cuk $$0, dbt $$1, btk $$2) {
      cxo $$3 = $$0.a(km.G, cxo.a);

      for (cxo.a $$4 : $$3.a()) {
         $$2.b($$4.a());
      }

      super.a($$0, $$1, $$2);
      return $$2.fP() ? $$0 : new cuk(cun.pq);
   }
}
