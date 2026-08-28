import com.mojang.serialization.MapCodec;

public class dmx extends dfi {
   public static final MapCodec<dmx> a = b(dmx::new);
   public static final int b = 6;
   public static final int c = 64;
   private static final jf[] d = jf.values();

   @Override
   public MapCodec<dmx> a() {
      return a;
   }

   protected dmx(dsk.d $$0) {
      super($$0);
   }

   @Override
   protected void b(dsl $$0, dcg $$1, ja $$2, dsl $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2);
      }
   }

   @Override
   protected void a(dsl $$0, dcg $$1, ja $$2, dfi $$3, ja $$4, boolean $$5) {
      this.a($$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected void a(dcg $$0, ja $$1) {
      if (this.b($$0, $$1)) {
         $$0.a($$1, dfk.aP.o(), 2);
         $$0.a(null, $$1, avh.yW, avi.e, 1.0F, 1.0F);
      }
   }

   private boolean b(dcg $$0, ja $$1) {
      return ja.a($$1, 6, 65, ($$0x, $$1x) -> {
         for (jf $$2 : d) {
            $$1x.accept($$0x.a($$2));
         }
      }, $$2 -> {
         if ($$2.equals($$1)) {
            return true;
         } else {
            dsl $$3 = $$0.a_($$2);
            eoj $$4 = $$0.b_($$2);
            if (!$$4.a(awc.a)) {
               return false;
            } else {
               if ($$3.b() instanceof dfp $$6 && !$$6.a(null, $$0, $$2, $$3).e()) {
                  return true;
               }

               if ($$3.b() instanceof djy) {
                  $$0.a($$2, dfk.a.o(), 3);
               } else {
                  if (!$$3.a(dfk.mc) && !$$3.a(dfk.md) && !$$3.a(dfk.bw) && !$$3.a(dfk.bx)) {
                     return false;
                  }

                  dpq $$7 = $$3.t() ? $$0.c_($$2) : null;
                  a($$3, $$0, $$2, $$7);
                  $$0.a($$2, dfk.a.o(), 3);
               }

               return true;
            }
         }
      }) > 1;
   }
}
