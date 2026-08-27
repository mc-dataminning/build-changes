import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import org.slf4j.Logger;

public class dfp extends dfj {
   private static final Logger e = LogUtils.getLogger();
   public static final MapCodec<dfp> d = b(dfp::new);
   private static final ki f = new kh();

   @Override
   public MapCodec<dfp> a() {
      return d;
   }

   public dfp(dqg.d $$0) {
      super($$0);
   }

   @Override
   protected ki a(csz $$0) {
      return f;
   }

   @Override
   public dnm a(in $$0, dqh $$1) {
      return new dof($$0, $$1);
   }

   @Override
   protected void a(aqh $$0, dqh $$1, in $$2) {
      doe $$3 = $$0.a($$2, dno.g).orElse(null);
      if ($$3 == null) {
         e.warn("Ignoring dispensing attempt for Dropper without matching block entity at {}", $$2);
      } else {
         kf $$4 = new kf($$0, $$2, $$1, $$3);
         int $$5 = $$3.a($$0.z);
         if ($$5 < 0) {
            $$0.c(1001, $$2, 0);
         } else {
            csz $$6 = $$3.a($$5);
            if (!$$6.d()) {
               is $$7 = $$0.a_($$2).c(b);
               bpf $$8 = dol.a($$0, $$2.a($$7));
               csz $$9;
               if ($$8 == null) {
                  $$9 = f.dispense($$4, $$6);
               } else {
                  $$9 = dol.a($$3, $$8, $$6.r().a(1), $$7.g());
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
