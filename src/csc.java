import java.util.List;
import javax.annotation.Nullable;

public class csc extends coc {
   public csc(cqh.a $$0) {
      super($$0);
   }

   @Override
   public cqm am_() {
      return csl.a(super.am_(), csm.E);
   }

   @Override
   public void a(cqm $$0, @Nullable cxb $$1, List<vu> $$2, csd $$3) {
      csl.a($$0, $$2, 0.125F, $$1 == null ? 20.0F : $$1.s().f());
   }

   @Override
   public String j(cqm $$0) {
      return csj.a(csl.d($$0), this.a() + ".effect.");
   }
}
