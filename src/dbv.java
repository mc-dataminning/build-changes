import java.util.Map;
import javax.annotation.Nullable;

public class dbv extends cys {
   protected final dno a;
   private final jc b;

   public dbv(dno $$0, dno $$1, jc $$2, dag.a $$3) {
      super($$0, $$3);
      this.a = $$1;
      this.b = $$2;
   }

   protected boolean a(dkm $$0, ebq $$1, iw $$2) {
      return $$1.a($$0, $$2);
   }

   @Nullable
   @Override
   protected ebq c(ded $$0) {
      ebq $$1 = this.a.a($$0);
      ebq $$2 = null;
      dkm $$3 = $$0.q();
      iw $$4 = $$0.a();

      for (jc $$5 : $$0.f()) {
         if ($$5 != this.b.g()) {
            ebq $$6 = $$5 == this.b ? this.c().a($$0) : $$1;
            if ($$6 != null && this.a($$3, $$6, $$4)) {
               $$2 = $$6;
               break;
            }
         }
      }

      return $$2 != null && $$3.a($$2, $$4, fgh.a()) ? $$2 : null;
   }

   @Override
   public void a(Map<dno, dag> $$0, dag $$1) {
      super.a($$0, $$1);
      $$0.put(this.a, $$1);
   }
}
