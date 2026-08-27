import com.mojang.serialization.MapCodec;

public class dct extends cvf {
   public static final MapCodec<dct> a = b(dct::new);
   public static final int b = 6;
   public static final int c = 64;
   private static final ib[] d = ib.values();

   @Override
   public MapCodec<dct> a() {
      return a;
   }

   protected dct(dhm.d $$0) {
      super($$0);
   }

   @Override
   public void b(dhn $$0, csf $$1, hx $$2, dhn $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2);
      }
   }

   @Override
   public void a(dhn $$0, csf $$1, hx $$2, cvf $$3, hx $$4, boolean $$5) {
      this.a($$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected void a(csf $$0, hx $$1) {
      if (this.b($$0, $$1)) {
         $$0.a($$1, cvh.aP.o(), 2);
         $$0.a(null, $$1, aqv.xE, aqw.e, 1.0F, 1.0F);
      }
   }

   private boolean b(csf $$0, hx $$1) {
      return hx.a($$1, 6, 65, ($$0x, $$1x) -> {
         for (ib $$2 : d) {
            $$1x.accept($$0x.a($$2));
         }
      }, $$2 -> {
         if ($$2.equals($$1)) {
            return true;
         } else {
            dhn $$3 = $$0.a_($$2);
            ecx $$4 = $$0.b_($$2);
            if (!$$4.a(arp.a)) {
               return false;
            } else {
               if ($$3.b() instanceof cvm $$6 && !$$6.a(null, $$0, $$2, $$3).b()) {
                  return true;
               }

               if ($$3.b() instanceof czu) {
                  $$0.a($$2, cvh.a.o(), 3);
               } else {
                  if (!$$3.a(cvh.mc) && !$$3.a(cvh.md) && !$$3.a(cvh.bw) && !$$3.a(cvh.bx)) {
                     return false;
                  }

                  dfi $$7 = $$3.t() ? $$0.c_($$2) : null;
                  a($$3, $$0, $$2, $$7);
                  $$0.a($$2, cvh.a.o(), 3);
               }

               return true;
            }
         }
      }) > 1;
   }
}
