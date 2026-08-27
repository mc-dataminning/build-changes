import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import org.slf4j.Logger;

public class dbd extends dax {
   private static final Logger e = LogUtils.getLogger();
   public static final MapCodec<dbd> d = b(dbd::new);
   private static final jl f = new jk();

   @Override
   public MapCodec<dbd> a() {
      return d;
   }

   public dbd(dli.d $$0) {
      super($$0);
   }

   @Override
   protected jl a(cpd $$0) {
      return f;
   }

   @Override
   public dix a(hz $$0, dlj $$1) {
      return new djq($$0, $$1);
   }

   @Override
   protected void a(aow $$0, dlj $$1, hz $$2) {
      djp $$3 = $$0.a($$2, diz.g).orElse(null);
      if ($$3 == null) {
         e.warn("Ignoring dispensing attempt for Dropper without matching block entity at {}", $$2);
      } else {
         ji $$4 = new ji($$0, $$2, $$1, $$3);
         int $$5 = $$3.a($$0.z);
         if ($$5 < 0) {
            $$0.c(1001, $$2, 0);
         } else {
            cpd $$6 = $$3.a($$5);
            if (!$$6.b()) {
               ie $$7 = $$0.a_($$2).c(b);
               blp $$8 = djw.a($$0, $$2.a($$7));
               cpd $$9;
               if ($$8 == null) {
                  $$9 = f.dispense($$4, $$6);
               } else {
                  $$9 = djw.a($$3, $$8, $$6.q().a(1), $$7.g());
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
