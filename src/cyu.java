import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import org.slf4j.Logger;

public class cyu extends cyo {
   private static final Logger e = LogUtils.getLogger();
   public static final MapCodec<cyu> d = b(cyu::new);
   private static final jj f = new ji();

   @Override
   public MapCodec<cyu> a() {
      return d;
   }

   public cyu(diz.d $$0) {
      super($$0);
   }

   @Override
   protected jj a(cmr $$0) {
      return f;
   }

   @Override
   public dgo a(hx $$0, dja $$1) {
      return new dhh($$0, $$1);
   }

   @Override
   protected void a(amz $$0, dja $$1, hx $$2) {
      dhg $$3 = $$0.a($$2, dgq.g).orElse(null);
      if ($$3 == null) {
         e.warn("Ignoring dispensing attempt for Dropper without matching block entity at {}", $$2);
      } else {
         jg $$4 = new jg($$0, $$2, $$1, $$3);
         int $$5 = $$3.a($$0.z);
         if ($$5 < 0) {
            $$0.c(1001, $$2, 0);
         } else {
            cmr $$6 = $$3.a($$5);
            if (!$$6.b()) {
               ic $$7 = $$0.a_($$2).c(b);
               bjo $$8 = dhn.a($$0, $$2.a($$7));
               cmr $$9;
               if ($$8 == null) {
                  $$9 = f.dispense($$4, $$6);
               } else {
                  $$9 = dhn.a($$3, $$8, $$6.p().a(1), $$7.g());
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
