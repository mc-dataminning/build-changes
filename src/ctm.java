import java.util.Map;
import javax.annotation.Nullable;

public class ctm extends cqb {
   protected final dcv a;
   private final ir b;

   public ctm(dcv $$0, dcv $$1, cry.a $$2, ir $$3) {
      super($$0, $$2);
      this.a = $$1;
      this.b = $$3;
   }

   protected boolean a(czx $$0, dpy $$1, im $$2) {
      return $$1.a($$0, $$2);
   }

   @Nullable
   @Override
   protected dpy c(cvl $$0) {
      dpy $$1 = this.a.a($$0);
      dpy $$2 = null;
      czx $$3 = $$0.q();
      im $$4 = $$0.a();

      for (ir $$5 : $$0.f()) {
         if ($$5 != this.b.g()) {
            dpy $$6 = $$5 == this.b ? this.d().a($$0) : $$1;
            if ($$6 != null && this.a($$3, $$6, $$4)) {
               $$2 = $$6;
               break;
            }
         }
      }

      return $$2 != null && $$3.a($$2, $$4, etk.a()) ? $$2 : null;
   }

   @Override
   public void a(Map<dcv, cry> $$0, cry $$1) {
      super.a($$0, $$1);
      $$0.put(this.a, $$1);
   }
}
