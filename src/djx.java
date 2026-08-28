import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import org.slf4j.Logger;

public class djx extends djr {
   private static final Logger f = LogUtils.getLogger();
   public static final MapCodec<djx> e = b(djx::new);
   private static final kz g = new ky();

   @Override
   public MapCodec<djx> a() {
      return e;
   }

   public djx(dur.d $$0) {
      super($$0);
   }

   @Override
   protected kz a(dej $$0, cvs $$1) {
      return g;
   }

   @Override
   public drv a(jf $$0, dus $$1) {
      return new dsp($$0, $$1);
   }

   @Override
   protected void a(arj $$0, dus $$1, jf $$2) {
      dso $$3 = $$0.a($$2, drx.g).orElse(null);
      if ($$3 == null) {
         f.warn("Ignoring dispensing attempt for Dropper without matching block entity at {}", $$2);
      } else {
         kw $$4 = new kw($$0, $$2, $$1, $$3);
         int $$5 = $$3.a($$0.z);
         if ($$5 < 0) {
            $$0.c(1001, $$2, 0);
         } else {
            cvs $$6 = $$3.a($$5);
            if (!$$6.f()) {
               jk $$7 = $$0.a_($$2).c(b);
               brl $$8 = dsw.a($$0, $$2.a($$7));
               cvs $$9;
               if ($$8 == null) {
                  $$9 = g.dispense($$4, $$6);
               } else {
                  $$9 = dsw.a($$3, $$8, $$6.c(1), $$7.g());
                  if ($$9.f()) {
                     $$9 = $$6.u();
                     $$9.h(1);
                  } else {
                     $$9 = $$6.u();
                  }
               }

               $$3.a($$5, $$9);
            }
         }
      }
   }
}
