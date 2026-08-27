import java.util.Map;
import javax.annotation.Nullable;

public class crt extends cof {
   protected final daa d;
   private final ih c;

   public crt(daa $$0, daa $$1, cqf.a $$2, ih $$3) {
      super($$0, $$2);
      this.d = $$1;
      this.c = $$3;
   }

   protected boolean a(cxc $$0, dmz $$1, ib $$2) {
      return $$1.a($$0, $$2);
   }

   @Nullable
   @Override
   protected dmz c(css $$0) {
      dmz $$1 = this.d.a($$0);
      dmz $$2 = null;
      cxc $$3 = $$0.q();
      ib $$4 = $$0.a();

      for (ih $$5 : $$0.f()) {
         if ($$5 != this.c.g()) {
            dmz $$6 = $$5 == this.c ? this.d().a($$0) : $$1;
            if ($$6 != null && this.a($$3, $$6, $$4)) {
               $$2 = $$6;
               break;
            }
         }
      }

      return $$2 != null && $$3.a($$2, $$4, epw.a()) ? $$2 : null;
   }

   @Override
   public void a(Map<daa, cqf> $$0, cqf $$1) {
      super.a($$0, $$1);
      $$0.put(this.d, $$1);
   }
}
