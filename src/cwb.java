import java.util.Map;
import javax.annotation.Nullable;

public class cwb extends cso {
   protected final dfa a;
   private final je b;

   public cwb(dfa $$0, dfa $$1, cul.a $$2, je $$3) {
      super($$0, $$2);
      this.a = $$1;
      this.b = $$3;
   }

   protected boolean a(dcc $$0, dsd $$1, iz $$2) {
      return $$1.a($$0, $$2);
   }

   @Nullable
   @Override
   protected dsd c(cyb $$0) {
      dsd $$1 = this.a.a($$0);
      dsd $$2 = null;
      dcc $$3 = $$0.q();
      iz $$4 = $$0.a();

      for (je $$5 : $$0.f()) {
         if ($$5 != this.b.g()) {
            dsd $$6 = $$5 == this.b ? this.d().a($$0) : $$1;
            if ($$6 != null && this.a($$3, $$6, $$4)) {
               $$2 = $$6;
               break;
            }
         }
      }

      return $$2 != null && $$3.a($$2, $$4, evx.a()) ? $$2 : null;
   }

   @Override
   public void a(Map<dfa, cul> $$0, cul $$1) {
      super.a($$0, $$1);
      $$0.put(this.a, $$1);
   }
}
