import java.util.Map;
import javax.annotation.Nullable;

public class day extends cxv {
   protected final dmr a;
   private final jb b;

   public day(dmr $$0, dmr $$1, jb $$2, czj.a $$3) {
      super($$0, $$3);
      this.a = $$1;
      this.b = $$2;
   }

   protected boolean a(djp $$0, eat $$1, iv $$2) {
      return $$1.a($$0, $$2);
   }

   @Nullable
   @Override
   protected eat c(ddg $$0) {
      eat $$1 = this.a.a($$0);
      eat $$2 = null;
      djp $$3 = $$0.q();
      iv $$4 = $$0.a();

      for (jb $$5 : $$0.f()) {
         if ($$5 != this.b.g()) {
            eat $$6 = $$5 == this.b ? this.c().a($$0) : $$1;
            if ($$6 != null && this.a($$3, $$6, $$4)) {
               $$2 = $$6;
               break;
            }
         }
      }

      return $$2 != null && $$3.a($$2, $$4, ffh.a()) ? $$2 : null;
   }

   @Override
   public void a(Map<dmr, czj> $$0, czj $$1) {
      super.a($$0, $$1);
      $$0.put(this.a, $$1);
   }
}
