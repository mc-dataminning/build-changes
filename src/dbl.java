import java.util.Map;
import javax.annotation.Nullable;

public class dbl extends cyi {
   protected final dne a;
   private final jc b;

   public dbl(dne $$0, dne $$1, jc $$2, czw.a $$3) {
      super($$0, $$3);
      this.a = $$1;
      this.b = $$2;
   }

   protected boolean a(dkc $$0, ebg $$1, iw $$2) {
      return $$1.a($$0, $$2);
   }

   @Nullable
   @Override
   protected ebg c(ddt $$0) {
      ebg $$1 = this.a.a($$0);
      ebg $$2 = null;
      dkc $$3 = $$0.q();
      iw $$4 = $$0.a();

      for (jc $$5 : $$0.f()) {
         if ($$5 != this.b.g()) {
            ebg $$6 = $$5 == this.b ? this.c().a($$0) : $$1;
            if ($$6 != null && this.a($$3, $$6, $$4)) {
               $$2 = $$6;
               break;
            }
         }
      }

      return $$2 != null && $$3.a($$2, $$4, ffx.a()) ? $$2 : null;
   }

   @Override
   public void a(Map<dne, czw> $$0, czw $$1) {
      super.a($$0, $$1);
      $$0.put(this.a, $$1);
   }
}
