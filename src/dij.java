import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import org.slf4j.Logger;

public class dij extends did {
   private static final Logger f = LogUtils.getLogger();
   public static final MapCodec<dij> e = b(dij::new);
   private static final kx g = new kw();

   @Override
   public MapCodec<dij> a() {
      return e;
   }

   public dij(dtb.d $$0) {
      super($$0);
   }

   @Override
   protected kx a(dcw $$0, cuq $$1) {
      return g;
   }

   @Override
   public dqh a(jd $$0, dtc $$1) {
      return new drb($$0, $$1);
   }

   @Override
   protected void a(aqu $$0, dtc $$1, jd $$2) {
      dra $$3 = $$0.a($$2, dqj.g).orElse(null);
      if ($$3 == null) {
         f.warn("Ignoring dispensing attempt for Dropper without matching block entity at {}", $$2);
      } else {
         ku $$4 = new ku($$0, $$2, $$1, $$3);
         int $$5 = $$3.a($$0.z);
         if ($$5 < 0) {
            $$0.c(1001, $$2, 0);
         } else {
            cuq $$6 = $$3.a($$5);
            if (!$$6.e()) {
               ji $$7 = $$0.a_($$2).c(b);
               bqk $$8 = drh.a($$0, $$2.a($$7));
               cuq $$9;
               if ($$8 == null) {
                  $$9 = g.dispense($$4, $$6);
               } else {
                  $$9 = drh.a($$3, $$8, $$6.c(1), $$7.g());
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
