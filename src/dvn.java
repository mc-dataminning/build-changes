import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dvn extends dno {
   public static final MapCodec<dvn> a = b(dvn::new);
   public static final int b = 6;
   public static final int c = 64;
   private static final jc[] d = jc.values();

   @Override
   public MapCodec<dvn> a() {
      return a;
   }

   protected dvn(ebp.d $$0) {
      super($$0);
   }

   @Override
   protected void a(ebq $$0, dkj $$1, iw $$2, ebq $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2);
      }
   }

   @Override
   protected void a(ebq $$0, dkj $$1, iw $$2, dno $$3, @Nullable ezi $$4, boolean $$5) {
      this.a($$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected void a(dkj $$0, iw $$1) {
      if (this.b($$0, $$1)) {
         $$0.a($$1, dnq.aW.m(), 2);
         $$0.a(null, $$1, awy.Aa, awz.e, 1.0F, 1.0F);
      }
   }

   private boolean b(dkj $$0, iw $$1) {
      return iw.a($$1, 6, 65, ($$0x, $$1x) -> {
         for (jc $$2 : d) {
            $$1x.accept($$0x.a($$2));
         }
      }, $$2 -> {
         if ($$2.equals($$1)) {
            return iw.b.a;
         } else {
            ebq $$3 = $$0.a_($$2);
            eya $$4 = $$0.b_($$2);
            if (!$$4.a(axs.a)) {
               return iw.b.b;
            } else {
               if ($$3.b() instanceof dnw $$6 && !$$6.a(null, $$0, $$2, $$3).f()) {
                  return iw.b.a;
               }

               if ($$3.b() instanceof dsk) {
                  $$0.a($$2, dnq.a.m(), 3);
               } else {
                  if (!$$3.a(dnq.mI) && !$$3.a(dnq.mJ) && !$$3.a(dnq.bG) && !$$3.a(dnq.bH)) {
                     return iw.b.b;
                  }

                  dyo $$7 = $$3.x() ? $$0.c_($$2) : null;
                  a($$3, $$0, $$2, $$7);
                  $$0.a($$2, dnq.a.m(), 3);
               }

               return iw.b.a;
            }
         }
      }) > 1;
   }
}
