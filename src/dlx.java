import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import org.slf4j.Logger;

public class dlx extends dlr {
   private static final Logger f = LogUtils.getLogger();
   public static final MapCodec<dlx> e = b(dlx::new);
   private static final lc g = new lb();

   @Override
   public MapCodec<dlx> a() {
      return e;
   }

   public dlx(dwv.d $$0) {
      super($$0);
   }

   @Override
   protected lc a(dgh $$0, cwo $$1) {
      return g;
   }

   @Override
   public dty a(ji $$0, dww $$1) {
      return new dut($$0, $$1);
   }

   @Override
   protected void a(ard $$0, dww $$1, ji $$2) {
      dus $$3 = $$0.a($$2, dua.g).orElse(null);
      if ($$3 == null) {
         f.warn("Ignoring dispensing attempt for Dropper without matching block entity at {}", $$2);
      } else {
         kz $$4 = new kz($$0, $$2, $$1, $$3);
         int $$5 = $$3.a($$0.A);
         if ($$5 < 0) {
            $$0.c(1001, $$2, 0);
         } else {
            cwo $$6 = $$3.a($$5);
            if (!$$6.f()) {
               jn $$7 = $$0.a_($$2).c(b);
               bsc $$8 = dva.a($$0, $$2.a($$7));
               cwo $$9;
               if ($$8 == null) {
                  $$9 = g.dispense($$4, $$6);
               } else {
                  $$9 = dva.a($$3, $$8, $$6.c(1), $$7.g());
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
