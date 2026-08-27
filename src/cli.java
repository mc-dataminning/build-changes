import java.util.List;
import javax.annotation.Nullable;

public class cli extends cms {
   public cli(cms.a $$0) {
      super($$0);
   }

   @Override
   public void a(cmx $$0, @Nullable cto $$1, List<vf> $$2, cop $$3) {
      $$2.add(this.d().a(n.h));
   }

   public vt d() {
      return vf.c(this.a() + ".desc");
   }
}
