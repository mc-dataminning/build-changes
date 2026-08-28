import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import org.slf4j.Logger;

public class dlb extends dkv {
   private static final Logger f = LogUtils.getLogger();
   public static final MapCodec<dlb> e = b(dlb::new);
   private static final lb g = new la();

   @Override
   public MapCodec<dlb> a() {
      return e;
   }

   public dlb(dvu.d $$0) {
      super($$0);
   }

   @Override
   protected lb a(dfm $$0, cwm $$1) {
      return g;
   }

   @Override
   public dsy a(jh $$0, dvv $$1) {
      return new dts($$0, $$1);
   }

   @Override
   protected void a(arp $$0, dvv $$1, jh $$2) {
      dtr $$3 = $$0.a($$2, dta.g).orElse(null);
      if ($$3 == null) {
         f.warn("Ignoring dispensing attempt for Dropper without matching block entity at {}", $$2);
      } else {
         ky $$4 = new ky($$0, $$2, $$1, $$3);
         int $$5 = $$3.a($$0.A);
         if ($$5 < 0) {
            $$0.c(1001, $$2, 0);
         } else {
            cwm $$6 = $$3.a($$5);
            if (!$$6.f()) {
               jm $$7 = $$0.a_($$2).c(b);
               bsd $$8 = dtz.a($$0, $$2.a($$7));
               cwm $$9;
               if ($$8 == null) {
                  $$9 = g.dispense($$4, $$6);
               } else {
                  $$9 = dtz.a($$3, $$8, $$6.c(1), $$7.g());
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
