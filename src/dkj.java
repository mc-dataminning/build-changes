import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import org.slf4j.Logger;

public class dkj extends dkd {
   private static final Logger f = LogUtils.getLogger();
   public static final MapCodec<dkj> e = b(dkj::new);
   private static final la g = new kz();

   @Override
   public MapCodec<dkj> a() {
      return e;
   }

   public dkj(dvc.d $$0) {
      super($$0);
   }

   @Override
   protected la a(dev $$0, cvx $$1) {
      return g;
   }

   @Override
   public dsg a(jg $$0, dvd $$1) {
      return new dta($$0, $$1);
   }

   @Override
   protected void a(arm $$0, dvd $$1, jg $$2) {
      dsz $$3 = $$0.a($$2, dsi.g).orElse(null);
      if ($$3 == null) {
         f.warn("Ignoring dispensing attempt for Dropper without matching block entity at {}", $$2);
      } else {
         kx $$4 = new kx($$0, $$2, $$1, $$3);
         int $$5 = $$3.a($$0.A);
         if ($$5 < 0) {
            $$0.c(1001, $$2, 0);
         } else {
            cvx $$6 = $$3.a($$5);
            if (!$$6.f()) {
               jl $$7 = $$0.a_($$2).c(b);
               brr $$8 = dth.a($$0, $$2.a($$7));
               cvx $$9;
               if ($$8 == null) {
                  $$9 = g.dispense($$4, $$6);
               } else {
                  $$9 = dth.a($$3, $$8, $$6.c(1), $$7.g());
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
