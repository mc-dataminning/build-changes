import java.util.Map;
import javax.annotation.Nullable;

public class cxk extends cuc {
   protected final dhy a;
   private final jl b;

   public cxk(dhy $$0, dhy $$1, jl $$2, cvt.a $$3) {
      super($$0, $$3);
      this.a = $$1;
      this.b = $$2;
   }

   protected boolean a(dey $$0, dvd $$1, jg $$2) {
      return $$1.a($$0, $$2);
   }

   @Nullable
   @Override
   protected dvd c(czm $$0) {
      dvd $$1 = this.a.a($$0);
      dvd $$2 = null;
      dey $$3 = $$0.q();
      jg $$4 = $$0.a();

      for (jl $$5 : $$0.f()) {
         if ($$5 != this.b.g()) {
            dvd $$6 = $$5 == this.b ? this.d().a($$0) : $$1;
            if ($$6 != null && this.a($$3, $$6, $$4)) {
               $$2 = $$6;
               break;
            }
         }
      }

      return $$2 != null && $$3.a($$2, $$4, ezm.a()) ? $$2 : null;
   }

   @Override
   public void a(Map<dhy, cvt> $$0, cvt $$1) {
      super.a($$0, $$1);
      $$0.put(this.a, $$1);
   }
}
