import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dtx extends dma {
   public static final MapCodec<dtx> a = b(dtx::new);
   public static final int b = 6;
   public static final int c = 64;
   private static final ja[] d = ja.values();

   @Override
   public MapCodec<dtx> a() {
      return a;
   }

   protected dtx(dzy.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dzz $$0, div $$1, iu $$2, dzz $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2);
      }
   }

   @Override
   protected void a(dzz $$0, div $$1, iu $$2, dma $$3, @Nullable exo $$4, boolean $$5) {
      this.a($$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected void a(div $$0, iu $$1) {
      if (this.b($$0, $$1)) {
         $$0.a($$1, dmc.aW.m(), 2);
         $$0.a(null, $$1, awn.zX, awo.e, 1.0F, 1.0F);
      }
   }

   private boolean b(div $$0, iu $$1) {
      return iu.a($$1, 6, 65, ($$0x, $$1x) -> {
         for (ja $$2 : d) {
            $$1x.accept($$0x.a($$2));
         }
      }, $$2 -> {
         if ($$2.equals($$1)) {
            return iu.b.a;
         } else {
            dzz $$3 = $$0.a_($$2);
            ewg $$4 = $$0.b_($$2);
            if (!$$4.a(axh.a)) {
               return iu.b.b;
            } else {
               if ($$3.b() instanceof dmi $$6 && !$$6.a(null, $$0, $$2, $$3).f()) {
                  return iu.b.a;
               }

               if ($$3.b() instanceof dqv) {
                  $$0.a($$2, dmc.a.m(), 3);
               } else {
                  if (!$$3.a(dmc.mF) && !$$3.a(dmc.mG) && !$$3.a(dmc.bE) && !$$3.a(dmc.bF)) {
                     return iu.b.b;
                  }

                  dwx $$7 = $$3.x() ? $$0.c_($$2) : null;
                  a($$3, $$0, $$2, $$7);
                  $$0.a($$2, dmc.a.m(), 3);
               }

               return iu.b.a;
            }
         }
      }) > 1;
   }
}
