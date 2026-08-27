import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class cvc extends cuw {
   private static final Logger c = LogUtils.getLogger();
   private static final ih d = new ig();

   public cvc(dfi.d $$0) {
      super($$0);
   }

   @Override
   protected ih a(cjf $$0) {
      return d;
   }

   @Override
   public dcv a(gw $$0, dfj $$1) {
      return new ddn($$0, $$1);
   }

   @Override
   protected void a(akq $$0, dfj $$1, gw $$2) {
      ddm $$3 = $$0.a($$2, dcx.g).orElse(null);
      if ($$3 == null) {
         c.warn("Ignoring dispensing attempt for Dropper without matching block entity at {}", $$2);
      } else {
         id $$4 = new id($$0, $$2, $$1, $$3);
         int $$5 = $$3.a($$0.z);
         if ($$5 < 0) {
            $$0.c(1001, $$2, 0);
         } else {
            cjf $$6 = $$3.a($$5);
            if (!$$6.b()) {
               ha $$7 = $$0.a_($$2).c(a);
               bgr $$8 = ddt.a($$0, $$2.a($$7));
               cjf $$9;
               if ($$8 == null) {
                  $$9 = d.dispense($$4, $$6);
               } else {
                  $$9 = ddt.a($$3, $$8, $$6.p().a(1), $$7.g());
                  if ($$9.b()) {
                     $$9 = $$6.p();
                     $$9.h(1);
                  } else {
                     $$9 = $$6.p();
                  }
               }

               $$3.a($$5, $$9);
            }
         }
      }
   }
}
