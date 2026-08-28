import java.util.Map;
import javax.annotation.Nullable;

public class dbj extends cyg {
   protected final dnc a;
   private final jb b;

   public dbj(dnc $$0, dnc $$1, jb $$2, czu.a $$3) {
      super($$0, $$3);
      this.a = $$1;
      this.b = $$2;
   }

   protected boolean a(dka $$0, ebe $$1, iv $$2) {
      return $$1.a($$0, $$2);
   }

   @Nullable
   @Override
   protected ebe c(ddr $$0) {
      ebe $$1 = this.a.a($$0);
      ebe $$2 = null;
      dka $$3 = $$0.q();
      iv $$4 = $$0.a();

      for (jb $$5 : $$0.f()) {
         if ($$5 != this.b.g()) {
            ebe $$6 = $$5 == this.b ? this.c().a($$0) : $$1;
            if ($$6 != null && this.a($$3, $$6, $$4)) {
               $$2 = $$6;
               break;
            }
         }
      }

      return $$2 != null && $$3.a($$2, $$4, ffv.a()) ? $$2 : null;
   }

   @Override
   public void a(Map<dnc, czu> $$0, czu $$1) {
      super.a($$0, $$1);
      $$0.put(this.a, $$1);
   }
}
