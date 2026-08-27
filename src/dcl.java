import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import org.slf4j.Logger;

public class dcl extends dcf {
   private static final Logger e = LogUtils.getLogger();
   public static final MapCodec<dcl> d = b(dcl::new);
   private static final jo f = new jn();

   @Override
   public MapCodec<dcl> a() {
      return d;
   }

   public dcl(dmy.d $$0) {
      super($$0);
   }

   @Override
   protected jo a(cqk $$0) {
      return f;
   }

   @Override
   public dkg a(ib $$0, dmz $$1) {
      return new dkz($$0, $$1);
   }

   @Override
   protected void a(apf $$0, dmz $$1, ib $$2) {
      dky $$3 = $$0.a($$2, dki.g).orElse(null);
      if ($$3 == null) {
         e.warn("Ignoring dispensing attempt for Dropper without matching block entity at {}", $$2);
      } else {
         jl $$4 = new jl($$0, $$2, $$1, $$3);
         int $$5 = $$3.a($$0.z);
         if ($$5 < 0) {
            $$0.c(1001, $$2, 0);
         } else {
            cqk $$6 = $$3.a($$5);
            if (!$$6.b()) {
               ih $$7 = $$0.a_($$2).c(b);
               bmv $$8 = dlf.a($$0, $$2.a($$7));
               cqk $$9;
               if ($$8 == null) {
                  $$9 = f.dispense($$4, $$6);
               } else {
                  $$9 = dlf.a($$3, $$8, $$6.q().a(1), $$7.g());
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
