import java.util.Map;
import javax.annotation.Nullable;

public class cog extends ckq {
   protected final cwp d;
   private final ic c;

   public cog(cwp $$0, cwp $$1, cms.a $$2, ic $$3) {
      super($$0, $$2);
      this.d = $$1;
      this.c = $$3;
   }

   protected boolean a(ctr $$0, djg $$1, hx $$2) {
      return $$1.a($$0, $$2);
   }

   @Nullable
   @Override
   protected djg c(cpg $$0) {
      djg $$1 = this.d.a($$0);
      djg $$2 = null;
      ctr $$3 = $$0.q();
      hx $$4 = $$0.a();

      for (ic $$5 : $$0.f()) {
         if ($$5 != this.c.g()) {
            djg $$6 = $$5 == this.c ? this.e().a($$0) : $$1;
            if ($$6 != null && this.a($$3, $$6, $$4)) {
               $$2 = $$6;
               break;
            }
         }
      }

      return $$2 != null && $$3.a($$2, $$4, elx.a()) ? $$2 : null;
   }

   @Override
   public void a(Map<cwp, cms> $$0, cms $$1) {
      super.a($$0, $$1);
      $$0.put(this.d, $$1);
   }
}
