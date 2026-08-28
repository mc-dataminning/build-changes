import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import org.slf4j.Logger;

public class dog extends doa {
   private static final Logger f = LogUtils.getLogger();
   public static final MapCodec<dog> e = b(dog::new);
   private static final lg g = new lf();

   @Override
   public MapCodec<dog> a() {
      return e;
   }

   public dog(dzn.d $$0) {
      super($$0);
   }

   @Override
   protected lg a(dip $$0, cys $$1) {
      return g;
   }

   @Override
   public dwn a(iu $$0, dzo $$1) {
      return new dxj($$0, $$1);
   }

   @Override
   protected void a(aro $$0, dzo $$1, iu $$2) {
      dxi $$3 = $$0.a($$2, dwp.g).orElse(null);
      if ($$3 == null) {
         f.warn("Ignoring dispensing attempt for Dropper without matching block entity at {}", $$2);
      } else {
         ld $$4 = new ld($$0, $$2, $$1, $$3);
         int $$5 = $$3.a($$0.A);
         if ($$5 < 0) {
            $$0.c(1001, $$2, 0);
         } else {
            cys $$6 = $$3.a($$5);
            if (!$$6.f()) {
               ja $$7 = $$0.a_($$2).c(b);
               btr $$8 = dxq.a($$0, $$2.a($$7));
               cys $$9;
               if ($$8 == null) {
                  $$9 = g.dispense($$4, $$6);
               } else {
                  $$9 = dxq.a($$3, $$8, $$6.c(1), $$7.g());
                  if ($$9.f()) {
                     $$9 = $$6.v();
                     $$9.h(1);
                  } else {
                     $$9 = $$6.v();
                  }
               }

               $$3.a($$5, $$9);
            }
         }
      }
   }
}
