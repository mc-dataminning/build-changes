import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import org.slf4j.Logger;

public class cxd extends cwx {
   private static final Logger e = LogUtils.getLogger();
   public static final MapCodec<cxd> d = b(cxd::new);
   private static final je f = new jd();

   @Override
   public MapCodec<cxd> a() {
      return d;
   }

   public cxd(dgv.d $$0) {
      super($$0);
   }

   @Override
   protected je a(clb $$0) {
      return f;
   }

   @Override
   public der a(ht $$0, dgw $$1) {
      return new dfk($$0, $$1);
   }

   @Override
   protected void a(ama $$0, dgw $$1, ht $$2) {
      dfj $$3 = $$0.a($$2, det.g).orElse(null);
      if ($$3 == null) {
         e.warn("Ignoring dispensing attempt for Dropper without matching block entity at {}", $$2);
      } else {
         jb $$4 = new jb($$0, $$2, $$1, $$3);
         int $$5 = $$3.a($$0.z);
         if ($$5 < 0) {
            $$0.c(1001, $$2, 0);
         } else {
            clb $$6 = $$3.a($$5);
            if (!$$6.b()) {
               hx $$7 = $$0.a_($$2).c(b);
               bij $$8 = dfq.a($$0, $$2.a($$7));
               clb $$9;
               if ($$8 == null) {
                  $$9 = f.dispense($$4, $$6);
               } else {
                  $$9 = dfq.a($$3, $$8, $$6.p().a(1), $$7.g());
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
