import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

public class cuj extends csu {
   public static final int a = 160;

   public cuj(csu.a $$0) {
      super($$0);
   }

   @Override
   public void a(csz $$0, @Nullable dad $$1, List<wu> $$2, cuq $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.b()) {
         List<bqt> $$4 = new ArrayList<>();
         cwb $$5 = $$0.a(ka.F, cwb.a);

         for (cwb.a $$6 : $$5.a()) {
            $$4.add($$6.a());
         }

         cuy.a($$4, $$2::add, 1.0F, $$1 == null ? 20.0F : $$1.s().f());
      }
   }

   @Override
   public csz a(csz $$0, dad $$1, bsa $$2) {
      cwb $$3 = $$0.a(ka.F, cwb.a);

      for (cwb.a $$4 : $$3.a()) {
         $$2.b($$4.a());
      }

      super.a($$0, $$1, $$2);
      return $$2.fN() ? $$0 : new csz(ctc.pq);
   }
}
