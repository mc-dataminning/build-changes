import java.util.Map;
import javax.annotation.Nullable;

public class cyx extends cvq {
   protected final dke a;
   private final jm b;

   public cyx(dke $$0, dke $$1, jm $$2, cxg.a $$3) {
      super($$0, $$3);
      this.a = $$1;
      this.b = $$2;
   }

   protected boolean a(dhd $$0, dxn $$1, jh $$2) {
      return $$1.a($$0, $$2);
   }

   @Nullable
   @Override
   protected dxn c(dbb $$0) {
      dxn $$1 = this.a.a($$0);
      dxn $$2 = null;
      dhd $$3 = $$0.q();
      jh $$4 = $$0.a();

      for (jm $$5 : $$0.f()) {
         if ($$5 != this.b.g()) {
            dxn $$6 = $$5 == this.b ? this.d().a($$0) : $$1;
            if ($$6 != null && this.a($$3, $$6, $$4)) {
               $$2 = $$6;
               break;
            }
         }
      }

      return $$2 != null && $$3.a($$2, $$4, fbx.a()) ? $$2 : null;
   }

   @Override
   public void a(Map<dke, cxg> $$0, cxg $$1) {
      super.a($$0, $$1);
      $$0.put(this.a, $$1);
   }
}
