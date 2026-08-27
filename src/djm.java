import com.mojang.serialization.MapCodec;

public class djm extends dby {
   public static final MapCodec<djm> a = b(djm::new);
   public static final int b = 6;
   public static final int c = 64;
   private static final ih[] d = ih.values();

   @Override
   public MapCodec<djm> a() {
      return a;
   }

   protected djm(doy.d $$0) {
      super($$0);
   }

   @Override
   protected void b(doz $$0, cyx $$1, ib $$2, doz $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2);
      }
   }

   @Override
   protected void a(doz $$0, cyx $$1, ib $$2, dby $$3, ib $$4, boolean $$5) {
      this.a($$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected void a(cyx $$0, ib $$1) {
      if (this.b($$0, $$1)) {
         $$0.a($$1, dca.aP.n(), 2);
         $$0.a(null, $$1, aum.yA, aun.e, 1.0F, 1.0F);
      }
   }

   private boolean b(cyx $$0, ib $$1) {
      return ib.a($$1, 6, 65, ($$0x, $$1x) -> {
         for (ih $$2 : d) {
            $$1x.accept($$0x.a($$2));
         }
      }, $$2 -> {
         if ($$2.equals($$1)) {
            return true;
         } else {
            doz $$3 = $$0.a_($$2);
            eks $$4 = $$0.b_($$2);
            if (!$$4.a(avh.a)) {
               return false;
            } else {
               if ($$3.b() instanceof dcf $$6 && !$$6.a(null, $$0, $$2, $$3).d()) {
                  return true;
               }

               if ($$3.b() instanceof dgn) {
                  $$0.a($$2, dca.a.n(), 3);
               } else {
                  if (!$$3.a(dca.mc) && !$$3.a(dca.md) && !$$3.a(dca.bw) && !$$3.a(dca.bx)) {
                     return false;
                  }

                  dmf $$7 = $$3.t() ? $$0.c_($$2) : null;
                  a($$3, $$0, $$2, $$7);
                  $$0.a($$2, dca.a.n(), 3);
               }

               return true;
            }
         }
      }) > 1;
   }
}
