import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import org.slf4j.Logger;

public class dju extends djo {
   private static final Logger f = LogUtils.getLogger();
   public static final MapCodec<dju> e = b(dju::new);
   private static final ky g = new kx();

   @Override
   public MapCodec<dju> a() {
      return e;
   }

   public dju(dun.d $$0) {
      super($$0);
   }

   @Override
   protected ky a(deg $$0, cvp $$1) {
      return g;
   }

   @Override
   public drs a(je $$0, duo $$1) {
      return new dsm($$0, $$1);
   }

   @Override
   protected void a(arh $$0, duo $$1, je $$2) {
      dsl $$3 = $$0.a($$2, dru.g).orElse(null);
      if ($$3 == null) {
         f.warn("Ignoring dispensing attempt for Dropper without matching block entity at {}", $$2);
      } else {
         kv $$4 = new kv($$0, $$2, $$1, $$3);
         int $$5 = $$3.a($$0.z);
         if ($$5 < 0) {
            $$0.c(1001, $$2, 0);
         } else {
            cvp $$6 = $$3.a($$5);
            if (!$$6.f()) {
               jj $$7 = $$0.a_($$2).c(b);
               bri $$8 = dst.a($$0, $$2.a($$7));
               cvp $$9;
               if ($$8 == null) {
                  $$9 = g.dispense($$4, $$6);
               } else {
                  $$9 = dst.a($$3, $$8, $$6.c(1), $$7.g());
                  if ($$9.f()) {
                     $$9 = $$6.u();
                     $$9.h(1);
                  } else {
                     $$9 = $$6.u();
                  }
               }

               $$3.a($$5, $$9);
            }
         }
      }
   }
}
