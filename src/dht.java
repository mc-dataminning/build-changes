import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import org.slf4j.Logger;

public class dht extends dhn {
   private static final Logger f = LogUtils.getLogger();
   public static final MapCodec<dht> e = b(dht::new);
   private static final ku g = new kt();

   @Override
   public MapCodec<dht> a() {
      return e;
   }

   public dht(dsk.d $$0) {
      super($$0);
   }

   @Override
   protected ku a(dcg $$0, cud $$1) {
      return g;
   }

   @Override
   public dpq a(ja $$0, dsl $$1) {
      return new dqk($$0, $$1);
   }

   @Override
   protected void a(aqm $$0, dsl $$1, ja $$2) {
      dqj $$3 = $$0.a($$2, dps.g).orElse(null);
      if ($$3 == null) {
         f.warn("Ignoring dispensing attempt for Dropper without matching block entity at {}", $$2);
      } else {
         kr $$4 = new kr($$0, $$2, $$1, $$3);
         int $$5 = $$3.a($$0.z);
         if ($$5 < 0) {
            $$0.c(1001, $$2, 0);
         } else {
            cud $$6 = $$3.a($$5);
            if (!$$6.e()) {
               jf $$7 = $$0.a_($$2).c(b);
               bqa $$8 = dqq.a($$0, $$2.a($$7));
               cud $$9;
               if ($$8 == null) {
                  $$9 = g.dispense($$4, $$6);
               } else {
                  $$9 = dqq.a($$3, $$8, $$6.c(1), $$7.g());
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
