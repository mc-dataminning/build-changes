import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import org.slf4j.Logger;

public class cxl extends cxf {
   private static final Logger e = LogUtils.getLogger();
   public static final MapCodec<cxl> d = b(cxl::new);
   private static final je f = new jd();

   @Override
   public MapCodec<cxl> a() {
      return d;
   }

   public cxl(dhh.d $$0) {
      super($$0);
   }

   @Override
   protected je a(clj $$0) {
      return f;
   }

   @Override
   public dfd a(ht $$0, dhi $$1) {
      return new dfw($$0, $$1);
   }

   @Override
   protected void a(ame $$0, dhi $$1, ht $$2) {
      dfv $$3 = $$0.a($$2, dff.g).orElse(null);
      if ($$3 == null) {
         e.warn("Ignoring dispensing attempt for Dropper without matching block entity at {}", $$2);
      } else {
         jb $$4 = new jb($$0, $$2, $$1, $$3);
         int $$5 = $$3.a($$0.z);
         if ($$5 < 0) {
            $$0.c(1001, $$2, 0);
         } else {
            clj $$6 = $$3.a($$5);
            if (!$$6.b()) {
               hx $$7 = $$0.a_($$2).c(b);
               biq $$8 = dgc.a($$0, $$2.a($$7));
               clj $$9;
               if ($$8 == null) {
                  $$9 = f.dispense($$4, $$6);
               } else {
                  $$9 = dgc.a($$3, $$8, $$6.p().a(1), $$7.g());
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
