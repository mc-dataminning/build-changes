import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

public class cva extends ctj {
   public static final int a = 160;

   public cva(ctj.a $$0) {
      super($$0);
   }

   @Override
   public void a(cto $$0, @Nullable dax $$1, List<wx> $$2, cvh $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.b()) {
         List<brc> $$4 = new ArrayList<>();
         cws $$5 = $$0.a(kb.G, cws.a);

         for (cws.a $$6 : $$5.a()) {
            $$4.add($$6.a());
         }

         cvp.a($$4, $$2::add, 1.0F, $$1 == null ? 20.0F : $$1.s().f());
      }
   }

   @Override
   public cto a(cto $$0, dax $$1, bso $$2) {
      cws $$3 = $$0.a(kb.G, cws.a);

      for (cws.a $$4 : $$3.a()) {
         $$2.b($$4.a());
      }

      super.a($$0, $$1, $$2);
      return $$2.fP() ? $$0 : new cto(ctr.pq);
   }
}
