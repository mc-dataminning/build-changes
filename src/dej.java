import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import org.slf4j.Logger;

public class dej extends ded {
   private static final Logger e = LogUtils.getLogger();
   public static final MapCodec<dej> d = b(dej::new);
   private static final jx f = new jw();

   @Override
   public MapCodec<dej> a() {
      return d;
   }

   public dej(doy.d $$0) {
      super($$0);
   }

   @Override
   protected jx a(crj $$0) {
      return f;
   }

   @Override
   public dmf a(ib $$0, doz $$1) {
      return new dmy($$0, $$1);
   }

   @Override
   protected void a(aps $$0, doz $$1, ib $$2) {
      dmx $$3 = $$0.a($$2, dmh.g).orElse(null);
      if ($$3 == null) {
         e.warn("Ignoring dispensing attempt for Dropper without matching block entity at {}", $$2);
      } else {
         ju $$4 = new ju($$0, $$2, $$1, $$3);
         int $$5 = $$3.a($$0.z);
         if ($$5 < 0) {
            $$0.c(1001, $$2, 0);
         } else {
            crj $$6 = $$3.a($$5);
            if (!$$6.d()) {
               ih $$7 = $$0.a_($$2).c(b);
               bnt $$8 = dne.a($$0, $$2.a($$7));
               crj $$9;
               if ($$8 == null) {
                  $$9 = f.dispense($$4, $$6);
               } else {
                  $$9 = dne.a($$3, $$8, $$6.r().a(1), $$7.g());
                  if ($$9.d()) {
                     $$9 = $$6.r();
                     $$9.g(1);
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
