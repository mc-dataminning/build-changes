import com.google.common.collect.Maps;
import java.util.Map;

public class ctk extends cul implements cvs {
   private static final Map<ctj, ctk> a = Maps.newEnumMap(ctj.class);
   private final ctj b;

   public ctk(ctj $$0, cul.a $$1) {
      super($$1);
      this.b = $$0;
      a.put($$0, this);
   }

   @Override
   public bqv a(cuq $$0, cmy $$1, btq $$2, bqu $$3) {
      if ($$2 instanceof cgc $$4 && $$4.bD() && !$$4.y() && $$4.u() != this.b) {
         $$4.dP().a($$1, $$4, awa.hM, awb.h, 1.0F, 1.0F);
         if (!$$1.dP().B) {
            $$4.b(this.b);
            $$0.h(1);
         }

         return bqv.a($$1.dP().B);
      }

      return bqv.e;
   }

   public ctj c() {
      return this.b;
   }

   public static ctk a(ctj $$0) {
      return a.get($$0);
   }

   @Override
   public boolean a(dbz $$0, dqs $$1, boolean $$2, cmy $$3) {
      if ($$1.a($$0x -> $$0x.a(this.c()), $$2)) {
         $$0.a(null, $$1.ay_(), awa.hM, awb.e, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }
}
