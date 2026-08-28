import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import org.slf4j.Logger;

public class dpd extends dox {
   private static final Logger f = LogUtils.getLogger();
   public static final MapCodec<dpd> e = b(dpd::new);
   private static final lh g = new lg();

   @Override
   public MapCodec<dpd> a() {
      return e;
   }

   public dpd(eas.d $$0) {
      super($$0);
   }

   @Override
   protected lh a(djm $$0, czn $$1) {
      return g;
   }

   @Override
   public dxr a(iv $$0, eat $$1) {
      return new dyn($$0, $$1);
   }

   @Override
   protected void a(arq $$0, eat $$1, iv $$2) {
      dym $$3 = $$0.a($$2, dxt.g).orElse(null);
      if ($$3 == null) {
         f.warn("Ignoring dispensing attempt for Dropper without matching block entity at {}", $$2);
      } else {
         le $$4 = new le($$0, $$2, $$1, $$3);
         int $$5 = $$3.a($$0.A);
         if ($$5 < 0) {
            $$0.c(1001, $$2, 0);
         } else {
            czn $$6 = $$3.a($$5);
            if (!$$6.f()) {
               jb $$7 = $$0.a_($$2).c(b);
               btz $$8 = dyu.a($$0, $$2.a($$7));
               czn $$9;
               if ($$8 == null) {
                  $$9 = g.dispense($$4, $$6);
               } else {
                  $$9 = dyu.a($$3, $$8, $$6.c(1), $$7.g());
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
