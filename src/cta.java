import java.util.Map;
import javax.annotation.Nullable;

public class cta extends cpq {
   protected final dch a;
   private final ij b;

   public cta(dch $$0, dch $$1, crn.a $$2, ij $$3) {
      super($$0, $$2);
      this.a = $$1;
      this.b = $$3;
   }

   protected boolean a(czj $$0, dpi $$1, id $$2) {
      return $$1.a($$0, $$2);
   }

   @Nullable
   @Override
   protected dpi c(cux $$0) {
      dpi $$1 = this.a.a($$0);
      dpi $$2 = null;
      czj $$3 = $$0.q();
      id $$4 = $$0.a();

      for (ij $$5 : $$0.f()) {
         if ($$5 != this.b.g()) {
            dpi $$6 = $$5 == this.b ? this.d().a($$0) : $$1;
            if ($$6 != null && this.a($$3, $$6, $$4)) {
               $$2 = $$6;
               break;
            }
         }
      }

      return $$2 != null && $$3.a($$2, $$4, eso.a()) ? $$2 : null;
   }

   @Override
   public void a(Map<dch, crn> $$0, crn $$1) {
      super.a($$0, $$1);
      $$0.put(this.a, $$1);
   }
}
