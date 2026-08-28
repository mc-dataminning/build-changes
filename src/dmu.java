import com.mojang.serialization.MapCodec;

public class dmu extends dff {
   public static final MapCodec<dmu> a = b(dmu::new);
   public static final int b = 6;
   public static final int c = 64;
   private static final jf[] d = jf.values();

   @Override
   public MapCodec<dmu> a() {
      return a;
   }

   protected dmu(dsg.d $$0) {
      super($$0);
   }

   @Override
   protected void b(dsh $$0, dcd $$1, ja $$2, dsh $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2);
      }
   }

   @Override
   protected void a(dsh $$0, dcd $$1, ja $$2, dff $$3, ja $$4, boolean $$5) {
      this.a($$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected void a(dcd $$0, ja $$1) {
      if (this.b($$0, $$1)) {
         $$0.a($$1, dfh.aP.o(), 2);
         $$0.a(null, $$1, avf.yW, avg.e, 1.0F, 1.0F);
      }
   }

   private boolean b(dcd $$0, ja $$1) {
      return ja.a($$1, 6, 65, ($$0x, $$1x) -> {
         for (jf $$2 : d) {
            $$1x.accept($$0x.a($$2));
         }
      }, $$2 -> {
         if ($$2.equals($$1)) {
            return true;
         } else {
            dsh $$3 = $$0.a_($$2);
            eob $$4 = $$0.b_($$2);
            if (!$$4.a(awa.a)) {
               return false;
            } else {
               if ($$3.b() instanceof dfm $$6 && !$$6.a(null, $$0, $$2, $$3).e()) {
                  return true;
               }

               if ($$3.b() instanceof djv) {
                  $$0.a($$2, dfh.a.o(), 3);
               } else {
                  if (!$$3.a(dfh.mc) && !$$3.a(dfh.md) && !$$3.a(dfh.bw) && !$$3.a(dfh.bx)) {
                     return false;
                  }

                  dpn $$7 = $$3.t() ? $$0.c_($$2) : null;
                  a($$3, $$0, $$2, $$7);
                  $$0.a($$2, dfh.a.o(), 3);
               }

               return true;
            }
         }
      }) > 1;
   }
}
