import java.util.List;
import javax.annotation.Nullable;

public class csa extends coa {
   public csa(cqf.a $$0) {
      super($$0);
   }

   @Override
   public cqk am_() {
      return csj.a(super.am_(), csk.E);
   }

   @Override
   public void a(cqk $$0, @Nullable cwz $$1, List<vu> $$2, csb $$3) {
      csj.a($$0, $$2, 0.125F, $$1 == null ? 20.0F : $$1.s().f());
   }

   @Override
   public String j(cqk $$0) {
      return csh.a(csj.d($$0), this.a() + ".effect.");
   }
}
