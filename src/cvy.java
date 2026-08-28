import java.util.Map;
import javax.annotation.Nullable;

public class cvy extends csl {
   protected final dex a;
   private final je b;

   public cvy(dex $$0, dex $$1, cui.a $$2, je $$3) {
      super($$0, $$2);
      this.a = $$1;
      this.b = $$3;
   }

   protected boolean a(dbz $$0, dsa $$1, iz $$2) {
      return $$1.a($$0, $$2);
   }

   @Nullable
   @Override
   protected dsa c(cxy $$0) {
      dsa $$1 = this.a.a($$0);
      dsa $$2 = null;
      dbz $$3 = $$0.q();
      iz $$4 = $$0.a();

      for (je $$5 : $$0.f()) {
         if ($$5 != this.b.g()) {
            dsa $$6 = $$5 == this.b ? this.d().a($$0) : $$1;
            if ($$6 != null && this.a($$3, $$6, $$4)) {
               $$2 = $$6;
               break;
            }
         }
      }

      return $$2 != null && $$3.a($$2, $$4, evu.a()) ? $$2 : null;
   }

   @Override
   public void a(Map<dex, cui> $$0, cui $$1) {
      super.a($$0, $$1);
      $$0.put(this.a, $$1);
   }
}
