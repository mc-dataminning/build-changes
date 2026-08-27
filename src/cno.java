import java.util.List;
import javax.annotation.Nullable;

public class cno extends coy {
   public cno(coy.a $$0) {
      super($$0);
   }

   @Override
   public void a(cpd $$0, @Nullable cvr $$1, List<vq> $$2, cqu $$3) {
      $$2.add(this.d().a(n.h));
   }

   public we d() {
      return vq.c(this.a() + ".desc");
   }
}
