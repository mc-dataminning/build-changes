import java.util.Map;
import javax.annotation.Nullable;

public class dav extends cxs {
   protected final dmm a;
   private final jb b;

   public dav(dmm $$0, dmm $$1, jb $$2, czg.a $$3) {
      super($$0, $$3);
      this.a = $$1;
      this.b = $$2;
   }

   protected boolean a(djk $$0, eao $$1, iv $$2) {
      return $$1.a($$0, $$2);
   }

   @Nullable
   @Override
   protected eao c(ddd $$0) {
      eao $$1 = this.a.a($$0);
      eao $$2 = null;
      djk $$3 = $$0.q();
      iv $$4 = $$0.a();

      for (jb $$5 : $$0.f()) {
         if ($$5 != this.b.g()) {
            eao $$6 = $$5 == this.b ? this.c().a($$0) : $$1;
            if ($$6 != null && this.a($$3, $$6, $$4)) {
               $$2 = $$6;
               break;
            }
         }
      }

      return $$2 != null && $$3.a($$2, $$4, ffc.a()) ? $$2 : null;
   }

   @Override
   public void a(Map<dmm, czg> $$0, czg $$1) {
      super.a($$0, $$1);
      $$0.put(this.a, $$1);
   }
}
