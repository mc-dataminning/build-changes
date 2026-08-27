import java.util.Map;
import javax.annotation.Nullable;

public class ckh extends cgr {
   protected final csm d;
   private final ha c;

   public ckh(csm $$0, csm $$1, cit.a $$2, ha $$3) {
      super($$0, $$2);
      this.d = $$1;
      this.c = $$3;
   }

   protected boolean a(cpp $$0, dfa $$1, gu $$2) {
      return $$1.a($$0, $$2);
   }

   @Nullable
   @Override
   protected dfa c(clg $$0) {
      dfa $$1 = this.d.a($$0);
      dfa $$2 = null;
      cpp $$3 = $$0.q();
      gu $$4 = $$0.a();

      for (ha $$5 : $$0.f()) {
         if ($$5 != this.c.g()) {
            dfa $$6 = $$5 == this.c ? this.e().a($$0) : $$1;
            if ($$6 != null && this.a($$3, $$6, $$4)) {
               $$2 = $$6;
               break;
            }
         }
      }

      return $$2 != null && $$3.a($$2, $$4, ehj.a()) ? $$2 : null;
   }

   @Override
   public void a(Map<csm, cit> $$0, cit $$1) {
      super.a($$0, $$1);
      $$0.put(this.d, $$1);
   }
}
