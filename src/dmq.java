import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import org.slf4j.Logger;

public class dmq extends dmk {
   private static final Logger f = LogUtils.getLogger();
   public static final MapCodec<dmq> e = b(dmq::new);
   private static final lc g = new lb();

   @Override
   public MapCodec<dmq> a() {
      return e;
   }

   public dmq(dxp.d $$0) {
      super($$0);
   }

   @Override
   protected lc a(dgz $$0, cxh $$1) {
      return g;
   }

   @Override
   public dus a(ji $$0, dxq $$1) {
      return new dvn($$0, $$1);
   }

   @Override
   protected void a(ard $$0, dxq $$1, ji $$2) {
      dvm $$3 = $$0.a($$2, duu.g).orElse(null);
      if ($$3 == null) {
         f.warn("Ignoring dispensing attempt for Dropper without matching block entity at {}", $$2);
      } else {
         kz $$4 = new kz($$0, $$2, $$1, $$3);
         int $$5 = $$3.a($$0.A);
         if ($$5 < 0) {
            $$0.c(1001, $$2, 0);
         } else {
            cxh $$6 = $$3.a($$5);
            if (!$$6.f()) {
               jn $$7 = $$0.a_($$2).c(b);
               bsr $$8 = dvu.a($$0, $$2.a($$7));
               cxh $$9;
               if ($$8 == null) {
                  $$9 = g.dispense($$4, $$6);
               } else {
                  $$9 = dvu.a($$3, $$8, $$6.c(1), $$7.g());
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
