import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import org.slf4j.Logger;

public class dbq extends dbk {
   private static final Logger e = LogUtils.getLogger();
   public static final MapCodec<dbq> d = b(dbq::new);
   private static final jn f = new jm();

   @Override
   public MapCodec<dbq> a() {
      return d;
   }

   public dbq(dmd.d $$0) {
      super($$0);
   }

   @Override
   protected jn a(cpq $$0) {
      return f;
   }

   @Override
   public djl a(ib $$0, dme $$1) {
      return new dke($$0, $$1);
   }

   @Override
   protected void a(apa $$0, dme $$1, ib $$2) {
      dkd $$3 = $$0.a($$2, djn.g).orElse(null);
      if ($$3 == null) {
         e.warn("Ignoring dispensing attempt for Dropper without matching block entity at {}", $$2);
      } else {
         jk $$4 = new jk($$0, $$2, $$1, $$3);
         int $$5 = $$3.a($$0.z);
         if ($$5 < 0) {
            $$0.c(1001, $$2, 0);
         } else {
            cpq $$6 = $$3.a($$5);
            if (!$$6.b()) {
               ih $$7 = $$0.a_($$2).c(b);
               bme $$8 = dkk.a($$0, $$2.a($$7));
               cpq $$9;
               if ($$8 == null) {
                  $$9 = f.dispense($$4, $$6);
               } else {
                  $$9 = dkk.a($$3, $$8, $$6.q().a(1), $$7.g());
                  if ($$9.b()) {
                     $$9 = $$6.q();
                     $$9.h(1);
                  } else {
                     $$9 = $$6.q();
                  }
               }

               $$3.a($$5, $$9);
            }
         }
      }
   }
}
