import java.util.Map;
import javax.annotation.Nullable;

public class cxo extends cuh {
   protected final die a;
   private final jm b;

   public cxo(die $$0, die $$1, jm $$2, cvx.a $$3) {
      super($$0, $$3);
      this.a = $$1;
      this.b = $$2;
   }

   protected boolean a(dfe $$0, dvj $$1, jh $$2) {
      return $$1.a($$0, $$2);
   }

   @Nullable
   @Override
   protected dvj c(czs $$0) {
      dvj $$1 = this.a.a($$0);
      dvj $$2 = null;
      dfe $$3 = $$0.q();
      jh $$4 = $$0.a();

      for (jm $$5 : $$0.f()) {
         if ($$5 != this.b.g()) {
            dvj $$6 = $$5 == this.b ? this.d().a($$0) : $$1;
            if ($$6 != null && this.a($$3, $$6, $$4)) {
               $$2 = $$6;
               break;
            }
         }
      }

      return $$2 != null && $$3.a($$2, $$4, ezs.a()) ? $$2 : null;
   }

   @Override
   public void a(Map<die, cvx> $$0, cvx $$1) {
      super.a($$0, $$1);
      $$0.put(this.a, $$1);
   }
}
