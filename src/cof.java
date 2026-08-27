import java.util.List;
import javax.annotation.Nullable;

public class cof extends cqh {
   private final avd<djz> a;

   public cof(avd<djz> $$0, cqh.a $$1) {
      super($$1);
      this.a = $$0;
   }

   public avd<djz> b() {
      return this.a;
   }

   @Override
   public void a(cqm $$0, @Nullable cxb $$1, List<vu> $$2, csd $$3) {
      $$2.add(this.c().a(n.h));
   }

   public wi c() {
      return vu.c(this.a() + ".desc");
   }
}
