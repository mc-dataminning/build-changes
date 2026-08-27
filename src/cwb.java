import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

public class cwb extends cuc {
   public static final int a = 160;

   public cwb(cuc.a $$0) {
      super($$0);
   }

   @Override
   public void a(cuh $$0, @Nullable dca $$1, List<xe> $$2, cwi $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.b()) {
         List<brh> $$4 = new ArrayList<>();
         cxv $$5 = $$0.a(ke.F, cxv.a);

         for (cxv.a $$6 : $$5.a()) {
            $$4.add($$6.a());
         }

         cwr.a($$4, $$2::add, 1.0F, $$1 == null ? 20.0F : $$1.s().f());
      }
   }

   @Override
   public cuh a(cuh $$0, dca $$1, bso $$2) {
      cxv $$3 = $$0.a(ke.F, cxv.a);

      for (cxv.a $$4 : $$3.a()) {
         $$2.b($$4.a());
      }

      super.a($$0, $$1, $$2);
      return $$2.fY() ? $$0 : new cuh(cuk.qJ);
   }
}
