import java.util.Map;
import javax.annotation.Nullable;

public class cms extends cjc {
   protected final cva d;
   private final hx c;

   public cms(cva $$0, cva $$1, cle.a $$2, hx $$3) {
      super($$0, $$2);
      this.d = $$1;
      this.c = $$3;
   }

   protected boolean a(csd $$0, dhi $$1, ht $$2) {
      return $$1.a($$0, $$2);
   }

   @Nullable
   @Override
   protected dhi c(cnr $$0) {
      dhi $$1 = this.d.a($$0);
      dhi $$2 = null;
      csd $$3 = $$0.q();
      ht $$4 = $$0.a();

      for (hx $$5 : $$0.f()) {
         if ($$5 != this.c.g()) {
            dhi $$6 = $$5 == this.c ? this.e().a($$0) : $$1;
            if ($$6 != null && this.a($$3, $$6, $$4)) {
               $$2 = $$6;
               break;
            }
         }
      }

      return $$2 != null && $$3.a($$2, $$4, ejz.a()) ? $$2 : null;
   }

   @Override
   public void a(Map<cva, cle> $$0, cle $$1) {
      super.a($$0, $$1);
      $$0.put(this.d, $$1);
   }
}
