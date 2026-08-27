import com.mojang.serialization.MapCodec;

public class ddn extends cvz {
   public static final MapCodec<ddn> a = b(ddn::new);
   public static final int b = 6;
   public static final int c = 64;
   private static final ia[] d = ia.values();

   @Override
   public MapCodec<ddn> a() {
      return a;
   }

   protected ddn(dio.d $$0) {
      super($$0);
   }

   @Override
   public void b(dip $$0, csy $$1, hv $$2, dip $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2);
      }
   }

   @Override
   public void a(dip $$0, csy $$1, hv $$2, cvz $$3, hv $$4, boolean $$5) {
      this.a($$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected void a(csy $$0, hv $$1) {
      if (this.b($$0, $$1)) {
         $$0.a($$1, cwb.aP.o(), 2);
         $$0.a(null, $$1, arc.xZ, ard.e, 1.0F, 1.0F);
      }
   }

   private boolean b(csy $$0, hv $$1) {
      return hv.a($$1, 6, 65, ($$0x, $$1x) -> {
         for (ia $$2 : d) {
            $$1x.accept($$0x.a($$2));
         }
      }, $$2 -> {
         if ($$2.equals($$1)) {
            return true;
         } else {
            dip $$3 = $$0.a_($$2);
            edz $$4 = $$0.b_($$2);
            if (!$$4.a(arw.a)) {
               return false;
            } else {
               if ($$3.b() instanceof cwg $$6 && !$$6.a(null, $$0, $$2, $$3).b()) {
                  return true;
               }

               if ($$3.b() instanceof dao) {
                  $$0.a($$2, cwb.a.o(), 3);
               } else {
                  if (!$$3.a(cwb.mc) && !$$3.a(cwb.md) && !$$3.a(cwb.bw) && !$$3.a(cwb.bx)) {
                     return false;
                  }

                  dgd $$7 = $$3.t() ? $$0.c_($$2) : null;
                  a($$3, $$0, $$2, $$7);
                  $$0.a($$2, cwb.a.o(), 3);
               }

               return true;
            }
         }
      }) > 1;
   }
}
