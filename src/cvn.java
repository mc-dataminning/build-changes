import com.google.common.collect.Maps;
import java.util.Map;

public class cvn extends cwl implements cxt {
   private static final Map<cvm, cvn> a = Maps.newEnumMap(cvm.class);
   private final cvm b;

   public cvn(cvm $$0, cwl.a $$1) {
      super($$1);
      this.b = $$0;
      a.put($$0, this);
   }

   @Override
   public bsj a(cwp $$0, cox $$1, bvg $$2, bsi $$3) {
      if ($$2 instanceof cht $$4 && $$4.bL() && !$$4.x() && $$4.t() != this.b) {
         $$4.dW().a($$1, $$4, awa.ih, awb.h, 1.0F, 1.0F);
         if (!$$1.dW().C) {
            $$4.b(this.b);
            $$0.h(1);
         }

         return bsj.a;
      }

      return bsj.e;
   }

   public cvm b() {
      return this.b;
   }

   public static cvn a(cvm $$0) {
      return a.get($$0);
   }

   @Override
   public boolean a(dgi $$0, dvm $$1, boolean $$2, cox $$3) {
      if ($$1.a($$0x -> $$0x.a(this.b()), $$2)) {
         $$0.a(null, $$1.aA_(), awa.ih, awb.e, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }
}
