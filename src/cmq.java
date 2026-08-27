import java.util.List;
import javax.annotation.Nullable;

public class cmq extends cou {
   private final auo<dik> a;

   public cmq(auo<dik> $$0, cou.a $$1) {
      super($$1);
      this.a = $$0;
   }

   public auo<dik> b() {
      return this.a;
   }

   @Override
   public void a(coz $$0, @Nullable cvn $$1, List<vq> $$2, cqq $$3) {
      $$2.add(this.d().a(n.h));
   }

   public we d() {
      return vq.c(this.a() + ".desc");
   }
}
