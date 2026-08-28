import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import org.slf4j.Logger;

public class dor extends dol {
   private static final Logger f = LogUtils.getLogger();
   public static final MapCodec<dor> e = b(dor::new);
   private static final lg g = new lf();

   @Override
   public MapCodec<dor> a() {
      return e;
   }

   public dor(eag.d $$0) {
      super($$0);
   }

   @Override
   protected lg a(dja $$0, czd $$1) {
      return g;
   }

   @Override
   public dxf a(iu $$0, eah $$1) {
      return new dyb($$0, $$1);
   }

   @Override
   protected void a(arq $$0, eah $$1, iu $$2) {
      dya $$3 = $$0.a($$2, dxh.g).orElse(null);
      if ($$3 == null) {
         f.warn("Ignoring dispensing attempt for Dropper without matching block entity at {}", $$2);
      } else {
         ld $$4 = new ld($$0, $$2, $$1, $$3);
         int $$5 = $$3.a($$0.A);
         if ($$5 < 0) {
            $$0.c(1001, $$2, 0);
         } else {
            czd $$6 = $$3.a($$5);
            if (!$$6.f()) {
               ja $$7 = $$0.a_($$2).c(b);
               btw $$8 = dyi.a($$0, $$2.a($$7));
               czd $$9;
               if ($$8 == null) {
                  $$9 = g.dispense($$4, $$6);
               } else {
                  $$9 = dyi.a($$3, $$8, $$6.c(1), $$7.g());
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
