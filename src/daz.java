import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import org.slf4j.Logger;

public class daz extends dat {
   private static final Logger e = LogUtils.getLogger();
   public static final MapCodec<daz> d = b(daz::new);
   private static final jl f = new jk();

   @Override
   public MapCodec<daz> a() {
      return d;
   }

   public daz(dle.d $$0) {
      super($$0);
   }

   @Override
   protected jl a(coz $$0) {
      return f;
   }

   @Override
   public dit a(hz $$0, dlf $$1) {
      return new djm($$0, $$1);
   }

   @Override
   protected void a(aov $$0, dlf $$1, hz $$2) {
      djl $$3 = $$0.a($$2, div.g).orElse(null);
      if ($$3 == null) {
         e.warn("Ignoring dispensing attempt for Dropper without matching block entity at {}", $$2);
      } else {
         ji $$4 = new ji($$0, $$2, $$1, $$3);
         int $$5 = $$3.a($$0.z);
         if ($$5 < 0) {
            $$0.c(1001, $$2, 0);
         } else {
            coz $$6 = $$3.a($$5);
            if (!$$6.b()) {
               ie $$7 = $$0.a_($$2).c(b);
               bln $$8 = djs.a($$0, $$2.a($$7));
               coz $$9;
               if ($$8 == null) {
                  $$9 = f.dispense($$4, $$6);
               } else {
                  $$9 = djs.a($$3, $$8, $$6.q().a(1), $$7.g());
                  if ($$9.b()) {
                     $$9 = $$6.q();
                     $$9.h(1);
                  } else {
                     $$9 = $$6.q();
                  }
               }

               $$3.a($$5, $$9);
            }
         }
      }
   }
}
