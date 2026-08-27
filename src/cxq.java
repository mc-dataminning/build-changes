import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import org.slf4j.Logger;

public class cxq extends cxk {
   private static final Logger e = LogUtils.getLogger();
   public static final MapCodec<cxq> d = b(cxq::new);
   private static final ji f = new jh();

   @Override
   public MapCodec<cxq> a() {
      return d;
   }

   public cxq(dhm.d $$0) {
      super($$0);
   }

   @Override
   protected ji a(clo $$0) {
      return f;
   }

   @Override
   public dfi a(hx $$0, dhn $$1) {
      return new dgb($$0, $$1);
   }

   @Override
   protected void a(ami $$0, dhn $$1, hx $$2) {
      dga $$3 = $$0.a($$2, dfk.g).orElse(null);
      if ($$3 == null) {
         e.warn("Ignoring dispensing attempt for Dropper without matching block entity at {}", $$2);
      } else {
         jf $$4 = new jf($$0, $$2, $$1, $$3);
         int $$5 = $$3.a($$0.z);
         if ($$5 < 0) {
            $$0.c(1001, $$2, 0);
         } else {
            clo $$6 = $$3.a($$5);
            if (!$$6.b()) {
               ib $$7 = $$0.a_($$2).c(b);
               biu $$8 = dgh.a($$0, $$2.a($$7));
               clo $$9;
               if ($$8 == null) {
                  $$9 = f.dispense($$4, $$6);
               } else {
                  $$9 = dgh.a($$3, $$8, $$6.p().a(1), $$7.g());
                  if ($$9.b()) {
                     $$9 = $$6.p();
                     $$9.h(1);
                  } else {
                     $$9 = $$6.p();
                  }
               }

               $$3.a($$5, $$9);
            }
         }
      }
   }
}
