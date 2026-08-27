import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import org.slf4j.Logger;

public class des extends dem {
   private static final Logger e = LogUtils.getLogger();
   public static final MapCodec<des> d = b(des::new);
   private static final jz f = new jy();

   @Override
   public MapCodec<des> a() {
      return d;
   }

   public des(dph.d $$0) {
      super($$0);
   }

   @Override
   protected jz a(crs $$0) {
      return f;
   }

   @Override
   public dmo a(id $$0, dpi $$1) {
      return new dnh($$0, $$1);
   }

   @Override
   protected void a(apu $$0, dpi $$1, id $$2) {
      dng $$3 = $$0.a($$2, dmq.g).orElse(null);
      if ($$3 == null) {
         e.warn("Ignoring dispensing attempt for Dropper without matching block entity at {}", $$2);
      } else {
         jw $$4 = new jw($$0, $$2, $$1, $$3);
         int $$5 = $$3.a($$0.z);
         if ($$5 < 0) {
            $$0.c(1001, $$2, 0);
         } else {
            crs $$6 = $$3.a($$5);
            if (!$$6.d()) {
               ij $$7 = $$0.a_($$2).c(b);
               bny $$8 = dnn.a($$0, $$2.a($$7));
               crs $$9;
               if ($$8 == null) {
                  $$9 = f.dispense($$4, $$6);
               } else {
                  $$9 = dnn.a($$3, $$8, $$6.r().a(1), $$7.g());
                  if ($$9.d()) {
                     $$9 = $$6.r();
                     $$9.g(1);
                  } else {
                     $$9 = $$6.r();
                  }
               }

               $$3.a($$5, $$9);
            }
         }
      }
   }
}
