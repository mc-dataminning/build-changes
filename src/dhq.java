import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import org.slf4j.Logger;

public class dhq extends dhk {
   private static final Logger f = LogUtils.getLogger();
   public static final MapCodec<dhq> e = b(dhq::new);
   private static final ku g = new kt();

   @Override
   public MapCodec<dhq> a() {
      return e;
   }

   public dhq(dsg.d $$0) {
      super($$0);
   }

   @Override
   protected ku a(dcd $$0, cua $$1) {
      return g;
   }

   @Override
   public dpn a(ja $$0, dsh $$1) {
      return new dqg($$0, $$1);
   }

   @Override
   protected void a(aqk $$0, dsh $$1, ja $$2) {
      dqf $$3 = $$0.a($$2, dpp.g).orElse(null);
      if ($$3 == null) {
         f.warn("Ignoring dispensing attempt for Dropper without matching block entity at {}", $$2);
      } else {
         kr $$4 = new kr($$0, $$2, $$1, $$3);
         int $$5 = $$3.a($$0.z);
         if ($$5 < 0) {
            $$0.c(1001, $$2, 0);
         } else {
            cua $$6 = $$3.a($$5);
            if (!$$6.e()) {
               jf $$7 = $$0.a_($$2).c(b);
               bpw $$8 = dqm.a($$0, $$2.a($$7));
               cua $$9;
               if ($$8 == null) {
                  $$9 = g.dispense($$4, $$6);
               } else {
                  $$9 = dqm.a($$3, $$8, $$6.s().a(1), $$7.g());
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
