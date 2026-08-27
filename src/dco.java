import com.mojang.serialization.MapCodec;

public class dco extends cva {
   public static final MapCodec<dco> a = b(dco::new);
   public static final int b = 6;
   public static final int c = 64;
   private static final hx[] d = hx.values();

   @Override
   public MapCodec<dco> a() {
      return a;
   }

   protected dco(dhh.d $$0) {
      super($$0);
   }

   @Override
   public void b(dhi $$0, csa $$1, ht $$2, dhi $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2);
      }
   }

   @Override
   public void a(dhi $$0, csa $$1, ht $$2, cva $$3, ht $$4, boolean $$5) {
      this.a($$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected void a(csa $$0, ht $$1) {
      if (this.b($$0, $$1)) {
         $$0.a($$1, cvc.aP.o(), 2);
         $$0.a(null, $$1, aqr.xE, aqs.e, 1.0F, 1.0F);
      }
   }

   private boolean b(csa $$0, ht $$1) {
      return ht.a($$1, 6, 65, ($$0x, $$1x) -> {
         for (hx $$2 : d) {
            $$1x.accept($$0x.a($$2));
         }
      }, $$2 -> {
         if ($$2.equals($$1)) {
            return true;
         } else {
            dhi $$3 = $$0.a_($$2);
            ecs $$4 = $$0.b_($$2);
            if (!$$4.a(arl.a)) {
               return false;
            } else {
               if ($$3.b() instanceof cvh $$6 && !$$6.a(null, $$0, $$2, $$3).b()) {
                  return true;
               }

               if ($$3.b() instanceof czp) {
                  $$0.a($$2, cvc.a.o(), 3);
               } else {
                  if (!$$3.a(cvc.mc) && !$$3.a(cvc.md) && !$$3.a(cvc.bw) && !$$3.a(cvc.bx)) {
                     return false;
                  }

                  dfd $$7 = $$3.t() ? $$0.c_($$2) : null;
                  a($$3, $$0, $$2, $$7);
                  $$0.a($$2, cvc.a.o(), 3);
               }

               return true;
            }
         }
      }) > 1;
   }
}
