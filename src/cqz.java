import java.util.Map;
import javax.annotation.Nullable;

public class cqz extends cnl {
   protected final czf d;
   private final ih c;

   public cqz(czf $$0, czf $$1, cpl.a $$2, ih $$3) {
      super($$0, $$2);
      this.d = $$1;
      this.c = $$3;
   }

   protected boolean a(cwh $$0, dme $$1, ib $$2) {
      return $$1.a($$0, $$2);
   }

   @Nullable
   @Override
   protected dme c(crx $$0) {
      dme $$1 = this.d.a($$0);
      dme $$2 = null;
      cwh $$3 = $$0.q();
      ib $$4 = $$0.a();

      for (ih $$5 : $$0.f()) {
         if ($$5 != this.c.g()) {
            dme $$6 = $$5 == this.c ? this.d().a($$0) : $$1;
            if ($$6 != null && this.a($$3, $$6, $$4)) {
               $$2 = $$6;
               break;
            }
         }
      }

      return $$2 != null && $$3.a($$2, $$4, epa.a()) ? $$2 : null;
   }

   @Override
   public void a(Map<czf, cpl> $$0, cpl $$1) {
      super.a($$0, $$1);
      $$0.put(this.d, $$1);
   }
}
