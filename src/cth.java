import java.util.List;
import javax.annotation.Nullable;

public class cth extends cpl {
   public cth(crn.a $$0) {
      super($$0);
   }

   @Override
   public crs x() {
      crs $$0 = super.x();
      $$0.b(jr.x, new ctq(ctr.C));
      return $$0;
   }

   @Override
   public void a(crs $$0, @Nullable czg $$1, List<wi> $$2, cti $$3) {
      ctq $$4 = $$0.a(jr.x);
      if ($$4 != null) {
         $$4.a($$2::add, 0.125F, $$1 == null ? 20.0F : $$1.s().f());
      }
   }

   @Override
   public String i(crs $$0) {
      return cto.a($$0.a(jr.x, ctq.a).f(), this.a() + ".effect.");
   }
}
