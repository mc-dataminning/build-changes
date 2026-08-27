import java.util.Map;
import javax.annotation.Nullable;

public class ckq extends cha {
   protected final csx d;
   private final hc c;

   public ckq(csx $$0, csx $$1, cjc.a $$2, hc $$3) {
      super($$0, $$2);
      this.d = $$1;
      this.c = $$3;
   }

   protected boolean a(cqa $$0, dfl $$1, gw $$2) {
      return $$1.a($$0, $$2);
   }

   @Nullable
   @Override
   protected dfl c(clp $$0) {
      dfl $$1 = this.d.a($$0);
      dfl $$2 = null;
      cqa $$3 = $$0.q();
      gw $$4 = $$0.a();

      for (hc $$5 : $$0.f()) {
         if ($$5 != this.c.g()) {
            dfl $$6 = $$5 == this.c ? this.e().a($$0) : $$1;
            if ($$6 != null && this.a($$3, $$6, $$4)) {
               $$2 = $$6;
               break;
            }
         }
      }

      return $$2 != null && $$3.a($$2, $$4, ehu.a()) ? $$2 : null;
   }

   @Override
   public void a(Map<csx, cjc> $$0, cjc $$1) {
      super.a($$0, $$1);
      $$0.put(this.d, $$1);
   }
}
