import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import org.slf4j.Logger;

public class dpo extends dpi {
   private static final Logger f = LogUtils.getLogger();
   public static final MapCodec<dpo> e = b(dpo::new);
   private static final lh g = new lg();

   @Override
   public MapCodec<dpo> a() {
      return e;
   }

   public dpo(ebd.d $$0) {
      super($$0);
   }

   @Override
   protected lh a(djx $$0, czy $$1) {
      return g;
   }

   @Override
   public dyc a(iv $$0, ebe $$1) {
      return new dyy($$0, $$1);
   }

   @Override
   protected void a(ars $$0, ebe $$1, iv $$2) {
      dyx $$3 = $$0.a($$2, dye.g).orElse(null);
      if ($$3 == null) {
         f.warn("Ignoring dispensing attempt for Dropper without matching block entity at {}", $$2);
      } else {
         le $$4 = new le($$0, $$2, $$1, $$3);
         int $$5 = $$3.a($$0.A);
         if ($$5 < 0) {
            $$0.c(1001, $$2, 0);
         } else {
            czy $$6 = $$3.a($$5);
            if (!$$6.f()) {
               jb $$7 = $$0.a_($$2).c(b);
               buk $$8 = dzf.a($$0, $$2.a($$7));
               czy $$9;
               if ($$8 == null) {
                  $$9 = g.dispense($$4, $$6);
               } else {
                  $$9 = dzf.a($$3, $$8, $$6.c(1), $$7.g());
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
