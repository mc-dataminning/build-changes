import java.util.Map;
import javax.annotation.Nullable;

public class daj extends cxg {
   protected final dma a;
   private final ja b;

   public daj(dma $$0, dma $$1, ja $$2, cyu.a $$3) {
      super($$0, $$3);
      this.a = $$1;
      this.b = $$2;
   }

   protected boolean a(diy $$0, dzz $$1, iu $$2) {
      return $$1.a($$0, $$2);
   }

   @Nullable
   @Override
   protected dzz c(dcr $$0) {
      dzz $$1 = this.a.a($$0);
      dzz $$2 = null;
      diy $$3 = $$0.q();
      iu $$4 = $$0.a();

      for (ja $$5 : $$0.f()) {
         if ($$5 != this.b.g()) {
            dzz $$6 = $$5 == this.b ? this.c().a($$0) : $$1;
            if ($$6 != null && this.a($$3, $$6, $$4)) {
               $$2 = $$6;
               break;
            }
         }
      }

      return $$2 != null && $$3.a($$2, $$4, fen.a()) ? $$2 : null;
   }

   @Override
   public void a(Map<dma, cyu> $$0, cyu $$1) {
      super.a($$0, $$1);
      $$0.put(this.a, $$1);
   }
}
