import java.util.Map;
import javax.annotation.Nullable;

public class cls extends cic {
   protected final cua d;
   private final hx c;

   public cls(cua $$0, cua $$1, cke.a $$2, hx $$3) {
      super($$0, $$2);
      this.d = $$1;
      this.c = $$3;
   }

   protected boolean a(crc $$0, dgb $$1, ht $$2) {
      return $$1.a($$0, $$2);
   }

   @Nullable
   @Override
   protected dgb c(cmr $$0) {
      dgb $$1 = this.d.a($$0);
      dgb $$2 = null;
      crc $$3 = $$0.q();
      ht $$4 = $$0.a();

      for (hx $$5 : $$0.f()) {
         if ($$5 != this.c.g()) {
            dgb $$6 = $$5 == this.c ? this.e().a($$0) : $$1;
            if ($$6 != null && this.a($$3, $$6, $$4)) {
               $$2 = $$6;
               break;
            }
         }
      }

      return $$2 != null && $$3.a($$2, $$4, eik.a()) ? $$2 : null;
   }

   @Override
   public void a(Map<cua, cke> $$0, cke $$1) {
      super.a($$0, $$1);
      $$0.put(this.d, $$1);
   }
}
