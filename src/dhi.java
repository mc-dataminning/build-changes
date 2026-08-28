import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import org.slf4j.Logger;

public class dhi extends dhc {
   private static final Logger f = LogUtils.getLogger();
   public static final MapCodec<dhi> e = b(dhi::new);
   private static final kt g = new ks();

   @Override
   public MapCodec<dhi> a() {
      return e;
   }

   public dhi(drz.d $$0) {
      super($$0);
   }

   @Override
   protected kt a(dbw $$0, cun $$1) {
      return g;
   }

   @Override
   public dpf a(iz $$0, dsa $$1) {
      return new dpy($$0, $$1);
   }

   @Override
   protected void a(are $$0, dsa $$1, iz $$2) {
      dpx $$3 = $$0.a($$2, dph.g).orElse(null);
      if ($$3 == null) {
         f.warn("Ignoring dispensing attempt for Dropper without matching block entity at {}", $$2);
      } else {
         kq $$4 = new kq($$0, $$2, $$1, $$3);
         int $$5 = $$3.a($$0.z);
         if ($$5 < 0) {
            $$0.c(1001, $$2, 0);
         } else {
            cun $$6 = $$3.a($$5);
            if (!$$6.e()) {
               je $$7 = $$0.a_($$2).c(b);
               bql $$8 = dqe.a($$0, $$2.a($$7));
               cun $$9;
               if ($$8 == null) {
                  $$9 = g.dispense($$4, $$6);
               } else {
                  $$9 = dqe.a($$3, $$8, $$6.s().a(1), $$7.g());
                  if ($$9.e()) {
                     $$9 = $$6.s();
                     $$9.h(1);
                  } else {
                     $$9 = $$6.s();
                  }
               }

               $$3.a($$5, $$9);
            }
         }
      }
   }
}
