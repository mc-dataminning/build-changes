import java.util.List;
import javax.annotation.Nullable;

public class csy extends cpc {
   public csy(cre.a $$0) {
      super($$0);
   }

   @Override
   public crj x() {
      crj $$0 = super.x();
      $$0.b(jp.x, new cth(cti.C));
      return $$0;
   }

   @Override
   public void a(crj $$0, @Nullable cyx $$1, List<wg> $$2, csz $$3) {
      cth $$4 = $$0.a(jp.x);
      if ($$4 != null) {
         $$4.a($$2::add, 0.125F, $$1 == null ? 20.0F : $$1.s().f());
      }
   }

   @Override
   public String i(crj $$0) {
      return ctf.a($$0.a(jp.x, cth.a).f(), this.a() + ".effect.");
   }
}
