import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import org.slf4j.Logger;

public class cyk extends cye {
   private static final Logger e = LogUtils.getLogger();
   public static final MapCodec<cyk> d = b(cyk::new);
   private static final jh f = new jg();

   @Override
   public MapCodec<cyk> a() {
      return d;
   }

   public cyk(dio.d $$0) {
      super($$0);
   }

   @Override
   protected jh a(cmh $$0) {
      return f;
   }

   @Override
   public dgd a(hv $$0, dip $$1) {
      return new dgw($$0, $$1);
   }

   @Override
   protected void a(amp $$0, dip $$1, hv $$2) {
      dgv $$3 = $$0.a($$2, dgf.g).orElse(null);
      if ($$3 == null) {
         e.warn("Ignoring dispensing attempt for Dropper without matching block entity at {}", $$2);
      } else {
         je $$4 = new je($$0, $$2, $$1, $$3);
         int $$5 = $$3.a($$0.z);
         if ($$5 < 0) {
            $$0.c(1001, $$2, 0);
         } else {
            cmh $$6 = $$3.a($$5);
            if (!$$6.b()) {
               ia $$7 = $$0.a_($$2).c(b);
               bje $$8 = dhc.a($$0, $$2.a($$7));
               cmh $$9;
               if ($$8 == null) {
                  $$9 = f.dispense($$4, $$6);
               } else {
                  $$9 = dhc.a($$3, $$8, $$6.p().a(1), $$7.g());
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
