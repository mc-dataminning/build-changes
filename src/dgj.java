import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import org.slf4j.Logger;

public class dgj extends dgd {
   private static final Logger f = LogUtils.getLogger();
   public static final MapCodec<dgj> e = b(dgj::new);
   private static final ki g = new kh();

   @Override
   public MapCodec<dgj> a() {
      return e;
   }

   public dgj(dra.d $$0) {
      super($$0);
   }

   @Override
   protected ki a(cto $$0) {
      return g;
   }

   @Override
   public dog a(io $$0, drb $$1) {
      return new doz($$0, $$1);
   }

   @Override
   protected void a(aqm $$0, drb $$1, io $$2) {
      doy $$3 = $$0.a($$2, doi.g).orElse(null);
      if ($$3 == null) {
         f.warn("Ignoring dispensing attempt for Dropper without matching block entity at {}", $$2);
      } else {
         kf $$4 = new kf($$0, $$2, $$1, $$3);
         int $$5 = $$3.a($$0.z);
         if ($$5 < 0) {
            $$0.c(1001, $$2, 0);
         } else {
            cto $$6 = $$3.a($$5);
            if (!$$6.e()) {
               it $$7 = $$0.a_($$2).c(b);
               bpn $$8 = dpf.a($$0, $$2.a($$7));
               cto $$9;
               if ($$8 == null) {
                  $$9 = g.dispense($$4, $$6);
               } else {
                  $$9 = dpf.a($$3, $$8, $$6.s().a(1), $$7.g());
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
