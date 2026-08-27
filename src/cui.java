import java.util.Map;
import javax.annotation.Nullable;

public class cui extends cqx {
   protected final dde a;
   private final is b;

   public cui(dde $$0, dde $$1, csu.a $$2, is $$3) {
      super($$0, $$2);
      this.a = $$1;
      this.b = $$3;
   }

   protected boolean a(dag $$0, dqh $$1, in $$2) {
      return $$1.a($$0, $$2);
   }

   @Nullable
   @Override
   protected dqh c(cwi $$0) {
      dqh $$1 = this.a.a($$0);
      dqh $$2 = null;
      dag $$3 = $$0.q();
      in $$4 = $$0.a();

      for (is $$5 : $$0.f()) {
         if ($$5 != this.b.g()) {
            dqh $$6 = $$5 == this.b ? this.d().a($$0) : $$1;
            if ($$6 != null && this.a($$3, $$6, $$4)) {
               $$2 = $$6;
               break;
            }
         }
      }

      return $$2 != null && $$3.a($$2, $$4, etu.a()) ? $$2 : null;
   }

   @Override
   public void a(Map<dde, csu> $$0, csu $$1) {
      super.a($$0, $$1);
      $$0.put(this.a, $$1);
   }
}
