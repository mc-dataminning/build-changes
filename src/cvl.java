import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import org.slf4j.Logger;

public class cvl extends cvf {
   private static final Logger e = LogUtils.getLogger();
   public static final MapCodec<cvl> d = b(cvl::new);
   private static final ih f = new ig();

   @Override
   public MapCodec<cvl> a() {
      return d;
   }

   public cvl(dfc.d $$0) {
      super($$0);
   }

   @Override
   protected ih a(cjl $$0) {
      return f;
   }

   @Override
   public dcz a(gw $$0, dfd $$1) {
      return new ddr($$0, $$1);
   }

   @Override
   protected void a(akt $$0, dfd $$1, gw $$2) {
      ddq $$3 = $$0.a($$2, ddb.g).orElse(null);
      if ($$3 == null) {
         e.warn("Ignoring dispensing attempt for Dropper without matching block entity at {}", $$2);
      } else {
         id $$4 = new id($$0, $$2, $$1, $$3);
         int $$5 = $$3.a($$0.z);
         if ($$5 < 0) {
            $$0.c(1001, $$2, 0);
         } else {
            cjl $$6 = $$3.a($$5);
            if (!$$6.b()) {
               ha $$7 = $$0.a_($$2).c(b);
               bgx $$8 = ddx.a($$0, $$2.a($$7));
               cjl $$9;
               if ($$8 == null) {
                  $$9 = f.dispense($$4, $$6);
               } else {
                  $$9 = ddx.a($$3, $$8, $$6.p().a(1), $$7.g());
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
