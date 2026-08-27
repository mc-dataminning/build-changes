import java.util.List;
import javax.annotation.Nullable;

public class cwh extends crx {
   public cwh(cuc.a $$0) {
      super($$0);
   }

   @Override
   public cuh v() {
      cuh $$0 = super.v();
      $$0.b(ke.E, new cwr(cws.E));
      return $$0;
   }

   @Override
   public void a(cuh $$0, @Nullable dca $$1, List<xe> $$2, cwi $$3) {
      cwr $$4 = $$0.a(ke.E);
      if ($$4 != null) {
         $$4.a($$2::add, 0.125F, $$1 == null ? 20.0F : $$1.s().f());
      }
   }

   @Override
   public String i(cuh $$0) {
      return cwp.a($$0.a(ke.E, cwr.a).f(), this.a() + ".effect.");
   }
}
