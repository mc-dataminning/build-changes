import java.util.Map;
import javax.annotation.Nullable;

public class dad extends cxa {
   protected final dlu a;
   private final ja b;

   public dad(dlu $$0, dlu $$1, ja $$2, cyo.a $$3) {
      super($$0, $$3);
      this.a = $$1;
      this.b = $$2;
   }

   protected boolean a(dis $$0, dzo $$1, iu $$2) {
      return $$1.a($$0, $$2);
   }

   @Nullable
   @Override
   protected dzo c(dcl $$0) {
      dzo $$1 = this.a.a($$0);
      dzo $$2 = null;
      dis $$3 = $$0.q();
      iu $$4 = $$0.a();

      for (ja $$5 : $$0.f()) {
         if ($$5 != this.b.g()) {
            dzo $$6 = $$5 == this.b ? this.c().a($$0) : $$1;
            if ($$6 != null && this.a($$3, $$6, $$4)) {
               $$2 = $$6;
               break;
            }
         }
      }

      return $$2 != null && $$3.a($$2, $$4, feb.a()) ? $$2 : null;
   }

   @Override
   public void a(Map<dlu, cyo> $$0, cyo $$1) {
      super.a($$0, $$1);
      $$0.put(this.a, $$1);
   }
}
