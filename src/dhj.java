import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import org.slf4j.Logger;

public class dhj extends dhd {
   private static final Logger f = LogUtils.getLogger();
   public static final MapCodec<dhj> e = b(dhj::new);
   private static final kt g = new ks();

   @Override
   public MapCodec<dhj> a() {
      return e;
   }

   public dhj(dsa.d $$0) {
      super($$0);
   }

   @Override
   protected kt a(dbx $$0, cuo $$1) {
      return g;
   }

   @Override
   public dpg a(iz $$0, dsb $$1) {
      return new dpz($$0, $$1);
   }

   @Override
   protected void a(are $$0, dsb $$1, iz $$2) {
      dpy $$3 = $$0.a($$2, dpi.g).orElse(null);
      if ($$3 == null) {
         f.warn("Ignoring dispensing attempt for Dropper without matching block entity at {}", $$2);
      } else {
         kq $$4 = new kq($$0, $$2, $$1, $$3);
         int $$5 = $$3.a($$0.z);
         if ($$5 < 0) {
            $$0.c(1001, $$2, 0);
         } else {
            cuo $$6 = $$3.a($$5);
            if (!$$6.e()) {
               je $$7 = $$0.a_($$2).c(b);
               bqm $$8 = dqf.a($$0, $$2.a($$7));
               cuo $$9;
               if ($$8 == null) {
                  $$9 = g.dispense($$4, $$6);
               } else {
                  $$9 = dqf.a($$3, $$8, $$6.s().a(1), $$7.g());
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
