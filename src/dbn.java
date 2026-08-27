import com.mojang.serialization.MapCodec;

public class dbn extends cua {
   public static final MapCodec<dbn> a = b(dbn::new);
   public static final int b = 6;
   public static final int c = 64;
   private static final hx[] d = hx.values();

   @Override
   public MapCodec<dbn> a() {
      return a;
   }

   protected dbn(dga.d $$0) {
      super($$0);
   }

   @Override
   public void b(dgb $$0, cqz $$1, ht $$2, dgb $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2);
      }
   }

   @Override
   public void a(dgb $$0, cqz $$1, ht $$2, cua $$3, ht $$4, boolean $$5) {
      this.a($$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected void a(cqz $$0, ht $$1) {
      if (this.b($$0, $$1)) {
         $$0.a($$1, cuc.aP.o(), 2);
         $$0.a(null, $$1, aqd.xl, aqe.e, 1.0F, 1.0F);
      }
   }

   private boolean b(cqz $$0, ht $$1) {
      return ht.a($$1, 6, 65, ($$0x, $$1x) -> {
         for (hx $$2 : d) {
            $$1x.accept($$0x.a($$2));
         }
      }, $$2 -> {
         if ($$2.equals($$1)) {
            return true;
         } else {
            dgb $$3 = $$0.a_($$2);
            ebe $$4 = $$0.b_($$2);
            if (!$$4.a(aqx.a)) {
               return false;
            } else {
               if ($$3.b() instanceof cuh $$6 && !$$6.a(null, $$0, $$2, $$3).b()) {
                  return true;
               }

               if ($$3.b() instanceof cyo) {
                  $$0.a($$2, cuc.a.o(), 3);
               } else {
                  if (!$$3.a(cuc.mc) && !$$3.a(cuc.md) && !$$3.a(cuc.bw) && !$$3.a(cuc.bx)) {
                     return false;
                  }

                  ddx $$7 = $$3.t() ? $$0.c_($$2) : null;
                  a($$3, $$0, $$2, $$7);
                  $$0.a($$2, cuc.a.o(), 3);
               }

               return true;
            }
         }
      }) > 1;
   }
}
