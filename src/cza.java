import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import org.slf4j.Logger;

public class cza extends cyu {
   private static final Logger e = LogUtils.getLogger();
   public static final MapCodec<cza> d = b(cza::new);
   private static final jj f = new ji();

   @Override
   public MapCodec<cza> a() {
      return d;
   }

   public cza(djf.d $$0) {
      super($$0);
   }

   @Override
   protected jj a(cmx $$0) {
      return f;
   }

   @Override
   public dgu a(hx $$0, djg $$1) {
      return new dhn($$0, $$1);
   }

   @Override
   protected void a(and $$0, djg $$1, hx $$2) {
      dhm $$3 = $$0.a($$2, dgw.g).orElse(null);
      if ($$3 == null) {
         e.warn("Ignoring dispensing attempt for Dropper without matching block entity at {}", $$2);
      } else {
         jg $$4 = new jg($$0, $$2, $$1, $$3);
         int $$5 = $$3.a($$0.z);
         if ($$5 < 0) {
            $$0.c(1001, $$2, 0);
         } else {
            cmx $$6 = $$3.a($$5);
            if (!$$6.b()) {
               ic $$7 = $$0.a_($$2).c(b);
               bjt $$8 = dht.a($$0, $$2.a($$7));
               cmx $$9;
               if ($$8 == null) {
                  $$9 = f.dispense($$4, $$6);
               } else {
                  $$9 = dht.a($$3, $$8, $$6.p().a(1), $$7.g());
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
