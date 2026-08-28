import java.util.Map;
import javax.annotation.Nullable;

public class cwz extends ctl {
   protected final dgv a;
   private final jj b;

   public cwz(dgv $$0, dgv $$1, cvg.a $$2, jj $$3) {
      super($$0, $$2);
      this.a = $$1;
      this.b = $$3;
   }

   protected boolean a(ddv $$0, dua $$1, je $$2) {
      return $$1.a($$0, $$2);
   }

   @Nullable
   @Override
   protected dua c(cyw $$0) {
      dua $$1 = this.a.a($$0);
      dua $$2 = null;
      ddv $$3 = $$0.q();
      je $$4 = $$0.a();

      for (jj $$5 : $$0.f()) {
         if ($$5 != this.b.g()) {
            dua $$6 = $$5 == this.b ? this.d().a($$0) : $$1;
            if ($$6 != null && this.a($$3, $$6, $$4)) {
               $$2 = $$6;
               break;
            }
         }
      }

      return $$2 != null && $$3.a($$2, $$4, eyj.a()) ? $$2 : null;
   }

   @Override
   public void a(Map<dgv, cvg> $$0, cvg $$1) {
      super.a($$0, $$1);
      $$0.put(this.a, $$1);
   }
}
