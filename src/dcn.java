import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import org.slf4j.Logger;

public class dcn extends dch {
   private static final Logger e = LogUtils.getLogger();
   public static final MapCodec<dcn> d = b(dcn::new);
   private static final jo f = new jn();

   @Override
   public MapCodec<dcn> a() {
      return d;
   }

   public dcn(dna.d $$0) {
      super($$0);
   }

   @Override
   protected jo a(cqm $$0) {
      return f;
   }

   @Override
   public dki a(ib $$0, dnb $$1) {
      return new dlb($$0, $$1);
   }

   @Override
   protected void a(apf $$0, dnb $$1, ib $$2) {
      dla $$3 = $$0.a($$2, dkk.g).orElse(null);
      if ($$3 == null) {
         e.warn("Ignoring dispensing attempt for Dropper without matching block entity at {}", $$2);
      } else {
         jl $$4 = new jl($$0, $$2, $$1, $$3);
         int $$5 = $$3.a($$0.z);
         if ($$5 < 0) {
            $$0.c(1001, $$2, 0);
         } else {
            cqm $$6 = $$3.a($$5);
            if (!$$6.b()) {
               ih $$7 = $$0.a_($$2).c(b);
               bmw $$8 = dlh.a($$0, $$2.a($$7));
               cqm $$9;
               if ($$8 == null) {
                  $$9 = f.dispense($$4, $$6);
               } else {
                  $$9 = dlh.a($$3, $$8, $$6.q().a(1), $$7.g());
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
