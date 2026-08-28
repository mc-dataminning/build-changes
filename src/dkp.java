import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import org.slf4j.Logger;

public class dkp extends dkj {
   private static final Logger f = LogUtils.getLogger();
   public static final MapCodec<dkp> e = b(dkp::new);
   private static final lb g = new la();

   @Override
   public MapCodec<dkp> a() {
      return e;
   }

   public dkp(dvi.d $$0) {
      super($$0);
   }

   @Override
   protected lb a(dfb $$0, cwb $$1) {
      return g;
   }

   @Override
   public dsm a(jh $$0, dvj $$1) {
      return new dtg($$0, $$1);
   }

   @Override
   protected void a(arn $$0, dvj $$1, jh $$2) {
      dtf $$3 = $$0.a($$2, dso.g).orElse(null);
      if ($$3 == null) {
         f.warn("Ignoring dispensing attempt for Dropper without matching block entity at {}", $$2);
      } else {
         ky $$4 = new ky($$0, $$2, $$1, $$3);
         int $$5 = $$3.a($$0.A);
         if ($$5 < 0) {
            $$0.c(1001, $$2, 0);
         } else {
            cwb $$6 = $$3.a($$5);
            if (!$$6.f()) {
               jm $$7 = $$0.a_($$2).c(b);
               brw $$8 = dtn.a($$0, $$2.a($$7));
               cwb $$9;
               if ($$8 == null) {
                  $$9 = g.dispense($$4, $$6);
               } else {
                  $$9 = dtn.a($$3, $$8, $$6.c(1), $$7.g());
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
