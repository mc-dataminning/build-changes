import java.util.List;
import javax.annotation.Nullable;

public class cgy extends cjc {
   private final aqj<dco> a;

   public cgy(aqj<dco> $$0, cjc.a $$1) {
      super($$1);
      this.a = $$0;
   }

   public aqj<dco> b() {
      return this.a;
   }

   @Override
   public void a(cjh $$0, @Nullable cpx $$1, List<tn> $$2, cky $$3) {
      $$2.add(this.d().a(n.h));
   }

   public ua d() {
      return tn.c(this.a() + ".desc");
   }
}
