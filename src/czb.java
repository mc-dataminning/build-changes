import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import org.slf4j.Logger;

public class czb extends cyv {
   private static final Logger e = LogUtils.getLogger();
   public static final MapCodec<czb> d = b(czb::new);
   private static final jj f = new ji();

   @Override
   public MapCodec<czb> a() {
      return d;
   }

   public czb(djg.d $$0) {
      super($$0);
   }

   @Override
   protected jj a(cmy $$0) {
      return f;
   }

   @Override
   public dgv a(hx $$0, djh $$1) {
      return new dho($$0, $$1);
   }

   @Override
   protected void a(and $$0, djh $$1, hx $$2) {
      dhn $$3 = $$0.a($$2, dgx.g).orElse(null);
      if ($$3 == null) {
         e.warn("Ignoring dispensing attempt for Dropper without matching block entity at {}", $$2);
      } else {
         jg $$4 = new jg($$0, $$2, $$1, $$3);
         int $$5 = $$3.a($$0.z);
         if ($$5 < 0) {
            $$0.c(1001, $$2, 0);
         } else {
            cmy $$6 = $$3.a($$5);
            if (!$$6.b()) {
               ic $$7 = $$0.a_($$2).c(b);
               bju $$8 = dhu.a($$0, $$2.a($$7));
               cmy $$9;
               if ($$8 == null) {
                  $$9 = f.dispense($$4, $$6);
               } else {
                  $$9 = dhu.a($$3, $$8, $$6.p().a(1), $$7.g());
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
