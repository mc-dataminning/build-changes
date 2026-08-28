import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import org.slf4j.Logger;

public class dng extends dna {
   private static final Logger f = LogUtils.getLogger();
   public static final MapCodec<dng> e = b(dng::new);
   private static final le g = new ld();

   @Override
   public MapCodec<dng> a() {
      return e;
   }

   public dng(dyl.d $$0) {
      super($$0);
   }

   @Override
   protected le a(dhp $$0, cxy $$1) {
      return g;
   }

   @Override
   public dvl a(jj $$0, dym $$1) {
      return new dwh($$0, $$1);
   }

   @Override
   protected void a(arn $$0, dym $$1, jj $$2) {
      dwg $$3 = $$0.a($$2, dvn.g).orElse(null);
      if ($$3 == null) {
         f.warn("Ignoring dispensing attempt for Dropper without matching block entity at {}", $$2);
      } else {
         lb $$4 = new lb($$0, $$2, $$1, $$3);
         int $$5 = $$3.a($$0.A);
         if ($$5 < 0) {
            $$0.c(1001, $$2, 0);
         } else {
            cxy $$6 = $$3.a($$5);
            if (!$$6.f()) {
               jo $$7 = $$0.a_($$2).c(b);
               btj $$8 = dwo.a($$0, $$2.a($$7));
               cxy $$9;
               if ($$8 == null) {
                  $$9 = g.dispense($$4, $$6);
               } else {
                  $$9 = dwo.a($$3, $$8, $$6.c(1), $$7.g());
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
