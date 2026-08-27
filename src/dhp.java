import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import org.slf4j.Logger;

public class dhp extends dhi {
   private static final Logger e = LogUtils.getLogger();
   public static final MapCodec<dhp> d = b(dhp::new);
   private static final km f = new kl();

   @Override
   public MapCodec<dhp> a() {
      return d;
   }

   public dhp(dtb.d $$0) {
      super($$0);
   }

   @Override
   protected km a(cuh $$0) {
      return f;
   }

   @Override
   public dqc a(ir $$0, dtc $$1) {
      return new dqv($$0, $$1);
   }

   @Override
   protected void a(aqt $$0, dtc $$1, ir $$2) {
      dqu $$3 = $$0.a($$2, dqe.h).orElse(null);
      if ($$3 == null) {
         e.warn("Ignoring dispensing attempt for Dropper without matching block entity at {}", $$2);
      } else {
         kj $$4 = new kj($$0, $$2, $$1, $$3);
         int $$5 = $$3.a($$0.A);
         if ($$5 < 0) {
            $$0.c(1001, $$2, 0);
         } else {
            cuh $$6 = $$3.a($$5);
            if (!$$6.d()) {
               iw $$7 = $$0.a_($$2).c(b);
               bpt $$8 = drc.a($$0, $$2.a($$7));
               cuh $$9;
               if ($$8 == null) {
                  $$9 = f.dispense($$4, $$6);
               } else {
                  $$9 = drc.a($$3, $$8, $$6.r().a(1), $$7.g());
                  if ($$9.d()) {
                     $$9 = $$6.r();
                     $$9.h(1);
                  } else {
                     $$9 = $$6.r();
                  }
               }

               $$3.a($$5, $$9);
            }
         }
      }
   }
}
