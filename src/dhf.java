import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import org.slf4j.Logger;

public class dhf extends dgz {
   private static final Logger f = LogUtils.getLogger();
   public static final MapCodec<dhf> e = b(dhf::new);
   private static final kt g = new ks();

   @Override
   public MapCodec<dhf> a() {
      return e;
   }

   public dhf(drw.d $$0) {
      super($$0);
   }

   @Override
   protected kt a(dbt $$0, cuk $$1) {
      return g;
   }

   @Override
   public dpc a(iz $$0, drx $$1) {
      return new dpv($$0, $$1);
   }

   @Override
   protected void a(arb $$0, drx $$1, iz $$2) {
      dpu $$3 = $$0.a($$2, dpe.g).orElse(null);
      if ($$3 == null) {
         f.warn("Ignoring dispensing attempt for Dropper without matching block entity at {}", $$2);
      } else {
         kq $$4 = new kq($$0, $$2, $$1, $$3);
         int $$5 = $$3.a($$0.z);
         if ($$5 < 0) {
            $$0.c(1001, $$2, 0);
         } else {
            cuk $$6 = $$3.a($$5);
            if (!$$6.e()) {
               je $$7 = $$0.a_($$2).c(b);
               bqi $$8 = dqb.a($$0, $$2.a($$7));
               cuk $$9;
               if ($$8 == null) {
                  $$9 = g.dispense($$4, $$6);
               } else {
                  $$9 = dqb.a($$3, $$8, $$6.s().a(1), $$7.g());
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
