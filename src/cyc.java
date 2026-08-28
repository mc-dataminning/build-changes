import java.util.Map;
import javax.annotation.Nullable;

public class cyc extends cuv {
   protected final djm a;
   private final jn b;

   public cyc(djm $$0, djm $$1, jn $$2, cwl.a $$3) {
      super($$0, $$3);
      this.a = $$1;
      this.b = $$2;
   }

   protected boolean a(dgl $$0, dwx $$1, ji $$2) {
      return $$1.a($$0, $$2);
   }

   @Nullable
   @Override
   protected dwx c(dag $$0) {
      dwx $$1 = this.a.a($$0);
      dwx $$2 = null;
      dgl $$3 = $$0.q();
      ji $$4 = $$0.a();

      for (jn $$5 : $$0.f()) {
         if ($$5 != this.b.g()) {
            dwx $$6 = $$5 == this.b ? this.d().a($$0) : $$1;
            if ($$6 != null && this.a($$3, $$6, $$4)) {
               $$2 = $$6;
               break;
            }
         }
      }

      return $$2 != null && $$3.a($$2, $$4, fbf.a()) ? $$2 : null;
   }

   @Override
   public void a(Map<djm, cwl> $$0, cwl $$1) {
      super.a($$0, $$1);
      $$0.put(this.a, $$1);
   }
}
