import java.util.Map;
import javax.annotation.Nullable;

public class ckg extends cgq {
   protected final csl d;
   private final ha c;

   public ckg(csl $$0, csl $$1, cis.a $$2, ha $$3) {
      super($$0, $$2);
      this.d = $$1;
      this.c = $$3;
   }

   protected boolean a(cpo $$0, dez $$1, gu $$2) {
      return $$1.a($$0, $$2);
   }

   @Nullable
   @Override
   protected dez c(clf $$0) {
      dez $$1 = this.d.a($$0);
      dez $$2 = null;
      cpo $$3 = $$0.q();
      gu $$4 = $$0.a();

      for (ha $$5 : $$0.f()) {
         if ($$5 != this.c.g()) {
            dez $$6 = $$5 == this.c ? this.e().a($$0) : $$1;
            if ($$6 != null && this.a($$3, $$6, $$4)) {
               $$2 = $$6;
               break;
            }
         }
      }

      return $$2 != null && $$3.a($$2, $$4, ehi.a()) ? $$2 : null;
   }

   @Override
   public void a(Map<csl, cis> $$0, cis $$1) {
      super.a($$0, $$1);
      $$0.put(this.d, $$1);
   }
}
