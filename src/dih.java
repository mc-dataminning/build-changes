import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import org.slf4j.Logger;

public class dih extends dib {
   private static final Logger f = LogUtils.getLogger();
   public static final MapCodec<dih> e = b(dih::new);
   private static final kx g = new kw();

   @Override
   public MapCodec<dih> a() {
      return e;
   }

   public dih(dsz.d $$0) {
      super($$0);
   }

   @Override
   protected kx a(dcu $$0, cuo $$1) {
      return g;
   }

   @Override
   public dqf a(jd $$0, dta $$1) {
      return new dqz($$0, $$1);
   }

   @Override
   protected void a(aqt $$0, dta $$1, jd $$2) {
      dqy $$3 = $$0.a($$2, dqh.g).orElse(null);
      if ($$3 == null) {
         f.warn("Ignoring dispensing attempt for Dropper without matching block entity at {}", $$2);
      } else {
         ku $$4 = new ku($$0, $$2, $$1, $$3);
         int $$5 = $$3.a($$0.z);
         if ($$5 < 0) {
            $$0.c(1001, $$2, 0);
         } else {
            cuo $$6 = $$3.a($$5);
            if (!$$6.e()) {
               ji $$7 = $$0.a_($$2).c(b);
               bqj $$8 = drf.a($$0, $$2.a($$7));
               cuo $$9;
               if ($$8 == null) {
                  $$9 = g.dispense($$4, $$6);
               } else {
                  $$9 = drf.a($$3, $$8, $$6.c(1), $$7.g());
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
