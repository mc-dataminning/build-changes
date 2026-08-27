import java.util.List;
import javax.annotation.Nullable;

public class cry extends ctd {
   public cry(crn.a $$0) {
      super($$0);
   }

   @Override
   public void a(crs $$0, @Nullable czg $$1, List<wi> $$2, cti $$3) {
      ctq $$4 = $$0.a(jr.x, ctq.a);
      $$4.a($$2::add, 0.25F, $$1 == null ? 20.0F : $$1.s().f());
   }

   @Override
   public bog<crs> a(czg $$0, cka $$1, boe $$2) {
      $$0.a(null, $$1.dr(), $$1.dt(), $$1.dx(), auo.nI, aup.g, 0.5F, 0.4F / ($$0.E_().i() * 0.4F + 0.8F));
      return super.a($$0, $$1, $$2);
   }
}
