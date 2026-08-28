import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import org.slf4j.Logger;

public class djg extends dja {
   private static final Logger f = LogUtils.getLogger();
   public static final MapCodec<djg> e = b(djg::new);
   private static final ky g = new kx();

   @Override
   public MapCodec<djg> a() {
      return e;
   }

   public djg(dtz.d $$0) {
      super($$0);
   }

   @Override
   protected ky a(dds $$0, cvl $$1) {
      return g;
   }

   @Override
   public dre a(je $$0, dua $$1) {
      return new dry($$0, $$1);
   }

   @Override
   protected void a(arg $$0, dua $$1, je $$2) {
      drx $$3 = $$0.a($$2, drg.g).orElse(null);
      if ($$3 == null) {
         f.warn("Ignoring dispensing attempt for Dropper without matching block entity at {}", $$2);
      } else {
         kv $$4 = new kv($$0, $$2, $$1, $$3);
         int $$5 = $$3.a($$0.z);
         if ($$5 < 0) {
            $$0.c(1001, $$2, 0);
         } else {
            cvl $$6 = $$3.a($$5);
            if (!$$6.f()) {
               jj $$7 = $$0.a_($$2).c(b);
               brd $$8 = dsf.a($$0, $$2.a($$7));
               cvl $$9;
               if ($$8 == null) {
                  $$9 = g.dispense($$4, $$6);
               } else {
                  $$9 = dsf.a($$3, $$8, $$6.c(1), $$7.g());
                  if ($$9.f()) {
                     $$9 = $$6.u();
                     $$9.h(1);
                  } else {
                     $$9 = $$6.u();
                  }
               }

               $$3.a($$5, $$9);
            }
         }
      }
   }
}
