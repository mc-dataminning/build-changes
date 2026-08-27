import java.util.Map;
import javax.annotation.Nullable;

public class cqm extends cmw {
   protected final cys d;
   private final ie c;

   public cqm(cys $$0, cys $$1, coy.a $$2, ie $$3) {
      super($$0, $$2);
      this.d = $$1;
      this.c = $$3;
   }

   protected boolean a(cvu $$0, dlj $$1, hz $$2) {
      return $$1.a($$0, $$2);
   }

   @Nullable
   @Override
   protected dlj c(crk $$0) {
      dlj $$1 = this.d.a($$0);
      dlj $$2 = null;
      cvu $$3 = $$0.q();
      hz $$4 = $$0.a();

      for (ie $$5 : $$0.f()) {
         if ($$5 != this.c.g()) {
            dlj $$6 = $$5 == this.c ? this.e().a($$0) : $$1;
            if ($$6 != null && this.a($$3, $$6, $$4)) {
               $$2 = $$6;
               break;
            }
         }
      }

      return $$2 != null && $$3.a($$2, $$4, eoe.a()) ? $$2 : null;
   }

   @Override
   public void a(Map<cys, coy> $$0, coy $$1) {
      super.a($$0, $$1);
      $$0.put(this.d, $$1);
   }
}
