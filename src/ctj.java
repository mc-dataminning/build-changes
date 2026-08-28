import com.google.common.collect.Maps;
import java.util.Map;

public class ctj extends cul implements cvv {
   private static final Map<cti, ctj> a = Maps.newEnumMap(cti.class);
   private final cti b;

   public ctj(cti $$0, cul.a $$1) {
      super($$1);
      this.b = $$0;
      a.put($$0, this);
   }

   @Override
   public bqr a(cuq $$0, cmx $$1, btn $$2, bqq $$3) {
      if ($$2 instanceof cga $$4 && $$4.bE() && !$$4.x() && $$4.t() != this.b) {
         $$4.dO().a($$1, $$4, avp.hM, avq.h, 1.0F, 1.0F);
         if (!$$1.dO().B) {
            $$4.b(this.b);
            $$0.h(1);
         }

         return bqr.a($$1.dO().B);
      }

      return bqr.e;
   }

   public cti c() {
      return this.b;
   }

   public static ctj a(cti $$0) {
      return a.get($$0);
   }

   @Override
   public boolean a(dcw $$0, drs $$1, boolean $$2, cmx $$3) {
      if ($$1.a($$0x -> $$0x.a(this.c()), $$2)) {
         $$0.a(null, $$1.aD_(), avp.hM, avq.e, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }
}
