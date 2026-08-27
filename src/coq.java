import java.util.Map;
import javax.annotation.Nullable;

public class coq extends cla {
   protected final cwy d;
   private final ic c;

   public coq(cwy $$0, cwy $$1, cnb.a $$2, ic $$3) {
      super($$0, $$2);
      this.d = $$1;
      this.c = $$3;
   }

   protected boolean a(cua $$0, djp $$1, hx $$2) {
      return $$1.a($$0, $$2);
   }

   @Nullable
   @Override
   protected djp c(cpp $$0) {
      djp $$1 = this.d.a($$0);
      djp $$2 = null;
      cua $$3 = $$0.q();
      hx $$4 = $$0.a();

      for (ic $$5 : $$0.f()) {
         if ($$5 != this.c.g()) {
            djp $$6 = $$5 == this.c ? this.e().a($$0) : $$1;
            if ($$6 != null && this.a($$3, $$6, $$4)) {
               $$2 = $$6;
               break;
            }
         }
      }

      return $$2 != null && $$3.a($$2, $$4, emh.a()) ? $$2 : null;
   }

   @Override
   public void a(Map<cwy, cnb> $$0, cnb $$1) {
      super.a($$0, $$1);
      $$0.put(this.d, $$1);
   }
}
