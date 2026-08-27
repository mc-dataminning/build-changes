import com.mojang.serialization.MapCodec;

public class dch extends cut {
   public static final MapCodec<dch> a = b(dch::new);
   public static final int b = 6;
   public static final int c = 64;
   private static final hx[] d = hx.values();

   @Override
   public MapCodec<dch> a() {
      return a;
   }

   protected dch(dgv.d $$0) {
      super($$0);
   }

   @Override
   public void b(dgw $$0, crs $$1, ht $$2, dgw $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2);
      }
   }

   @Override
   public void a(dgw $$0, crs $$1, ht $$2, cut $$3, ht $$4, boolean $$5) {
      this.a($$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected void a(crs $$0, ht $$1) {
      if (this.b($$0, $$1)) {
         $$0.a($$1, cuv.aP.o(), 2);
         $$0.a(null, $$1, aqn.xn, aqo.e, 1.0F, 1.0F);
      }
   }

   private boolean b(crs $$0, ht $$1) {
      return ht.a($$1, 6, 65, ($$0x, $$1x) -> {
         for (hx $$2 : d) {
            $$1x.accept($$0x.a($$2));
         }
      }, $$2 -> {
         if ($$2.equals($$1)) {
            return true;
         } else {
            dgw $$3 = $$0.a_($$2);
            ecg $$4 = $$0.b_($$2);
            if (!$$4.a(arh.a)) {
               return false;
            } else {
               if ($$3.b() instanceof cva $$6 && !$$6.a(null, $$0, $$2, $$3).b()) {
                  return true;
               }

               if ($$3.b() instanceof czi) {
                  $$0.a($$2, cuv.a.o(), 3);
               } else {
                  if (!$$3.a(cuv.mc) && !$$3.a(cuv.md) && !$$3.a(cuv.bw) && !$$3.a(cuv.bx)) {
                     return false;
                  }

                  der $$7 = $$3.t() ? $$0.c_($$2) : null;
                  a($$3, $$0, $$2, $$7);
                  $$0.a($$2, cuv.a.o(), 3);
               }

               return true;
            }
         }
      }) > 1;
   }
}
