import java.util.Map;
import javax.annotation.Nullable;

public class cwa extends csn {
   protected final dez a;
   private final je b;

   public cwa(dez $$0, dez $$1, cuk.a $$2, je $$3) {
      super($$0, $$2);
      this.a = $$1;
      this.b = $$3;
   }

   protected boolean a(dcb $$0, dsc $$1, iz $$2) {
      return $$1.a($$0, $$2);
   }

   @Nullable
   @Override
   protected dsc c(cya $$0) {
      dsc $$1 = this.a.a($$0);
      dsc $$2 = null;
      dcb $$3 = $$0.q();
      iz $$4 = $$0.a();

      for (je $$5 : $$0.f()) {
         if ($$5 != this.b.g()) {
            dsc $$6 = $$5 == this.b ? this.d().a($$0) : $$1;
            if ($$6 != null && this.a($$3, $$6, $$4)) {
               $$2 = $$6;
               break;
            }
         }
      }

      return $$2 != null && $$3.a($$2, $$4, evw.a()) ? $$2 : null;
   }

   @Override
   public void a(Map<dez, cuk> $$0, cuk $$1) {
      super.a($$0, $$1);
      $$0.put(this.a, $$1);
   }
}
