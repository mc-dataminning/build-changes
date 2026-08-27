import java.util.List;
import javax.annotation.Nullable;

public class cup extends cqs {
   public cup(csu.a $$0) {
      super($$0);
   }

   @Override
   public csz v() {
      csz $$0 = super.v();
      $$0.b(ka.E, new cuy(cuz.C));
      return $$0;
   }

   @Override
   public void a(csz $$0, @Nullable dad $$1, List<wu> $$2, cuq $$3) {
      cuy $$4 = $$0.a(ka.E);
      if ($$4 != null) {
         $$4.a($$2::add, 0.125F, $$1 == null ? 20.0F : $$1.s().f());
      }
   }

   @Override
   public String i(csz $$0) {
      return cuw.a($$0.a(ka.E, cuy.a).f(), this.a() + ".effect.");
   }
}
