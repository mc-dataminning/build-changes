import com.mojang.serialization.MapCodec;

public class dho extends daa {
   public static final MapCodec<dho> a = b(dho::new);
   public static final int b = 6;
   public static final int c = 64;
   private static final ih[] d = ih.values();

   @Override
   public MapCodec<dho> a() {
      return a;
   }

   protected dho(dmy.d $$0) {
      super($$0);
   }

   @Override
   protected void b(dmz $$0, cwz $$1, ib $$2, dmz $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2);
      }
   }

   @Override
   protected void a(dmz $$0, cwz $$1, ib $$2, daa $$3, ib $$4, boolean $$5) {
      this.a($$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected void a(cwz $$0, ib $$1) {
      if (this.b($$0, $$1)) {
         $$0.a($$1, dac.aP.o(), 2);
         $$0.a(null, $$1, aty.ys, atz.e, 1.0F, 1.0F);
      }
   }

   private boolean b(cwz $$0, ib $$1) {
      return ib.a($$1, 6, 65, ($$0x, $$1x) -> {
         for (ih $$2 : d) {
            $$1x.accept($$0x.a($$2));
         }
      }, $$2 -> {
         if ($$2.equals($$1)) {
            return true;
         } else {
            dmz $$3 = $$0.a_($$2);
            ein $$4 = $$0.b_($$2);
            if (!$$4.a(aus.a)) {
               return false;
            } else {
               if ($$3.b() instanceof dah $$6 && !$$6.a(null, $$0, $$2, $$3).b()) {
                  return true;
               }

               if ($$3.b() instanceof dep) {
                  $$0.a($$2, dac.a.o(), 3);
               } else {
                  if (!$$3.a(dac.mc) && !$$3.a(dac.md) && !$$3.a(dac.bw) && !$$3.a(dac.bx)) {
                     return false;
                  }

                  dkg $$7 = $$3.t() ? $$0.c_($$2) : null;
                  a($$3, $$0, $$2, $$7);
                  $$0.a($$2, dac.a.o(), 3);
               }

               return true;
            }
         }
      }) > 1;
   }
}
