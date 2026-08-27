import com.mojang.serialization.MapCodec;

public class dap extends ctc {
   public static final MapCodec<dap> a = b(dap::new);
   public static final int b = 6;
   public static final int c = 64;
   private static final ha[] d = ha.values();

   @Override
   public MapCodec<dap> a() {
      return a;
   }

   protected dap(dfc.d $$0) {
      super($$0);
   }

   @Override
   public void b(dfd $$0, cqb $$1, gw $$2, dfd $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2);
      }
   }

   @Override
   public void a(dfd $$0, cqb $$1, gw $$2, ctc $$3, gw $$4, boolean $$5) {
      this.a($$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected void a(cqb $$0, gw $$1) {
      if (this.b($$0, $$1)) {
         $$0.a($$1, cte.aP.o(), 2);
         $$0.a(null, $$1, apg.xj, aph.e, 1.0F, 1.0F);
      }
   }

   private boolean b(cqb $$0, gw $$1) {
      return gw.a($$1, 6, 65, ($$0x, $$1x) -> {
         for (ha $$2 : d) {
            $$1x.accept($$0x.a($$2));
         }
      }, $$2 -> {
         if ($$2.equals($$1)) {
            return true;
         } else {
            dfd $$3 = $$0.a_($$2);
            eag $$4 = $$0.b_($$2);
            if (!$$4.a(aqa.a)) {
               return false;
            } else {
               if ($$3.b() instanceof ctj $$6 && !$$6.a(null, $$0, $$2, $$3).b()) {
                  return true;
               }

               if ($$3.b() instanceof cxq) {
                  $$0.a($$2, cte.a.o(), 3);
               } else {
                  if (!$$3.a(cte.mc) && !$$3.a(cte.md) && !$$3.a(cte.bw) && !$$3.a(cte.bx)) {
                     return false;
                  }

                  dcz $$7 = $$3.t() ? $$0.c_($$2) : null;
                  a($$3, $$0, $$2, $$7);
                  $$0.a($$2, cte.a.o(), 3);
               }

               return true;
            }
         }
      }) > 1;
   }
}
