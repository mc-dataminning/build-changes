import java.util.Map;
import javax.annotation.Nullable;

public class cuz extends crm {
   protected final ddy a;
   private final it b;

   public cuz(ddy $$0, ddy $$1, ctj.a $$2, it $$3) {
      super($$0, $$2);
      this.a = $$1;
      this.b = $$3;
   }

   protected boolean a(dba $$0, drb $$1, io $$2) {
      return $$1.a($$0, $$2);
   }

   @Nullable
   @Override
   protected drb c(cwz $$0) {
      drb $$1 = this.a.a($$0);
      drb $$2 = null;
      dba $$3 = $$0.q();
      io $$4 = $$0.a();

      for (it $$5 : $$0.f()) {
         if ($$5 != this.b.g()) {
            drb $$6 = $$5 == this.b ? this.d().a($$0) : $$1;
            if ($$6 != null && this.a($$3, $$6, $$4)) {
               $$2 = $$6;
               break;
            }
         }
      }

      return $$2 != null && $$3.a($$2, $$4, eup.a()) ? $$2 : null;
   }

   @Override
   public void a(Map<ddy, ctj> $$0, ctj $$1) {
      super.a($$0, $$1);
      $$0.put(this.a, $$1);
   }
}
