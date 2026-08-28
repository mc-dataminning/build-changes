import java.util.Map;
import javax.annotation.Nullable;

public class cvv extends csi {
   protected final deu a;
   private final je b;

   public cvv(deu $$0, deu $$1, cuf.a $$2, je $$3) {
      super($$0, $$2);
      this.a = $$1;
      this.b = $$3;
   }

   protected boolean a(dbw $$0, drx $$1, iz $$2) {
      return $$1.a($$0, $$2);
   }

   @Nullable
   @Override
   protected drx c(cxv $$0) {
      drx $$1 = this.a.a($$0);
      drx $$2 = null;
      dbw $$3 = $$0.q();
      iz $$4 = $$0.a();

      for (je $$5 : $$0.f()) {
         if ($$5 != this.b.g()) {
            drx $$6 = $$5 == this.b ? this.d().a($$0) : $$1;
            if ($$6 != null && this.a($$3, $$6, $$4)) {
               $$2 = $$6;
               break;
            }
         }
      }

      return $$2 != null && $$3.a($$2, $$4, evr.a()) ? $$2 : null;
   }

   @Override
   public void a(Map<deu, cuf> $$0, cuf $$1) {
      super.a($$0, $$1);
      $$0.put(this.a, $$1);
   }
}
