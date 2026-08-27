import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import org.slf4j.Logger;

public class dgl extends dgf {
   private static final Logger f = LogUtils.getLogger();
   public static final MapCodec<dgl> e = b(dgl::new);
   private static final ki g = new kh();

   @Override
   public MapCodec<dgl> a() {
      return e;
   }

   public dgl(drc.d $$0) {
      super($$0);
   }

   @Override
   protected ki a(ctq $$0) {
      return g;
   }

   @Override
   public doi a(io $$0, drd $$1) {
      return new dpb($$0, $$1);
   }

   @Override
   protected void a(aqn $$0, drd $$1, io $$2) {
      dpa $$3 = $$0.a($$2, dok.g).orElse(null);
      if ($$3 == null) {
         f.warn("Ignoring dispensing attempt for Dropper without matching block entity at {}", $$2);
      } else {
         kf $$4 = new kf($$0, $$2, $$1, $$3);
         int $$5 = $$3.a($$0.z);
         if ($$5 < 0) {
            $$0.c(1001, $$2, 0);
         } else {
            ctq $$6 = $$3.a($$5);
            if (!$$6.e()) {
               it $$7 = $$0.a_($$2).c(b);
               bpp $$8 = dph.a($$0, $$2.a($$7));
               ctq $$9;
               if ($$8 == null) {
                  $$9 = g.dispense($$4, $$6);
               } else {
                  $$9 = dph.a($$3, $$8, $$6.s().a(1), $$7.g());
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
