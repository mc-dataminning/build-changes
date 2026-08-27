import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import org.slf4j.Logger;

public class dfg extends dfa {
   private static final Logger e = LogUtils.getLogger();
   public static final MapCodec<dfg> d = b(dfg::new);
   private static final kh f = new kg();

   @Override
   public MapCodec<dfg> a() {
      return d;
   }

   public dfg(dpx.d $$0) {
      super($$0);
   }

   @Override
   protected kh a(csd $$0) {
      return f;
   }

   @Override
   public dnd a(im $$0, dpy $$1) {
      return new dnw($$0, $$1);
   }

   @Override
   protected void a(aqe $$0, dpy $$1, im $$2) {
      dnv $$3 = $$0.a($$2, dnf.g).orElse(null);
      if ($$3 == null) {
         e.warn("Ignoring dispensing attempt for Dropper without matching block entity at {}", $$2);
      } else {
         ke $$4 = new ke($$0, $$2, $$1, $$3);
         int $$5 = $$3.a($$0.z);
         if ($$5 < 0) {
            $$0.c(1001, $$2, 0);
         } else {
            csd $$6 = $$3.a($$5);
            if (!$$6.d()) {
               ir $$7 = $$0.a_($$2).c(b);
               boj $$8 = doc.a($$0, $$2.a($$7));
               csd $$9;
               if ($$8 == null) {
                  $$9 = f.dispense($$4, $$6);
               } else {
                  $$9 = doc.a($$3, $$8, $$6.r().a(1), $$7.g());
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
