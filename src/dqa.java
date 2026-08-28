import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import org.slf4j.Logger;

public class dqa extends dpu {
   private static final Logger f = LogUtils.getLogger();
   public static final MapCodec<dqa> e = b(dqa::new);
   private static final li g = new lh();

   @Override
   public MapCodec<dqa> a() {
      return e;
   }

   public dqa(ebp.d $$0) {
      super($$0);
   }

   @Override
   protected li a(dkj $$0, dak $$1) {
      return g;
   }

   @Override
   public dyo a(iw $$0, ebq $$1) {
      return new dzk($$0, $$1);
   }

   @Override
   protected void a(asb $$0, ebq $$1, iw $$2) {
      dzj $$3 = $$0.a($$2, dyq.g).orElse(null);
      if ($$3 == null) {
         f.warn("Ignoring dispensing attempt for Dropper without matching block entity at {}", $$2);
      } else {
         lf $$4 = new lf($$0, $$2, $$1, $$3);
         int $$5 = $$3.a($$0.A);
         if ($$5 < 0) {
            $$0.c(1001, $$2, 0);
         } else {
            dak $$6 = $$3.a($$5);
            if (!$$6.f()) {
               jc $$7 = $$0.a_($$2).c(b);
               buv $$8 = dzr.a($$0, $$2.a($$7));
               dak $$9;
               if ($$8 == null) {
                  $$9 = g.dispense($$4, $$6);
               } else {
                  $$9 = dzr.a($$3, $$8, $$6.c(1), $$7.g());
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
