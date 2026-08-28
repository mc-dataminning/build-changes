import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import org.slf4j.Logger;

public class dmp extends dmj {
   private static final Logger f = LogUtils.getLogger();
   public static final MapCodec<dmp> e = b(dmp::new);
   private static final lb g = new la();

   @Override
   public MapCodec<dmp> a() {
      return e;
   }

   public dmp(dxn.d $$0) {
      super($$0);
   }

   @Override
   protected lb a(dgz $$0, cxg $$1) {
      return g;
   }

   @Override
   public duq a(jh $$0, dxo $$1) {
      return new dvl($$0, $$1);
   }

   @Override
   protected void a(arx $$0, dxo $$1, jh $$2) {
      dvk $$3 = $$0.a($$2, dus.g).orElse(null);
      if ($$3 == null) {
         f.warn("Ignoring dispensing attempt for Dropper without matching block entity at {}", $$2);
      } else {
         ky $$4 = new ky($$0, $$2, $$1, $$3);
         int $$5 = $$3.a($$0.A);
         if ($$5 < 0) {
            $$0.c(1001, $$2, 0);
         } else {
            cxg $$6 = $$3.a($$5);
            if (!$$6.f()) {
               jm $$7 = $$0.a_($$2).c(b);
               bst $$8 = dvs.a($$0, $$2.a($$7));
               cxg $$9;
               if ($$8 == null) {
                  $$9 = g.dispense($$4, $$6);
               } else {
                  $$9 = dvs.a($$3, $$8, $$6.c(1), $$7.g());
                  if ($$9.f()) {
                     $$9 = $$6.v();
                     $$9.h(1);
                  } else {
                     $$9 = $$6.v();
                  }
               }

               $$3.a($$5, $$9);
            }
         }
      }
   }
}
