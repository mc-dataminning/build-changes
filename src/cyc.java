import java.util.Map;
import javax.annotation.Nullable;

public class cyc extends cuv {
   protected final djm b;
   private final jn c;

   public cyc(djm $$0, djm $$1, jn $$2, cwl.a $$3) {
      super($$0, $$3);
      this.b = $$1;
      this.c = $$2;
   }

   protected boolean a(dgl $$0, dwx $$1, ji $$2) {
      return $$1.a($$0, $$2);
   }

   @Nullable
   @Override
   protected dwx c(dag $$0) {
      dwx $$1 = this.b.a($$0);
      dwx $$2 = null;
      dgl $$3 = $$0.q();
      ji $$4 = $$0.a();

      for (jn $$5 : $$0.f()) {
         if ($$5 != this.c.g()) {
            dwx $$6 = $$5 == this.c ? this.d().a($$0) : $$1;
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
      $$0.put(this.b, $$1);
   }
}
