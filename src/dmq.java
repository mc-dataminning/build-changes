import com.mojang.serialization.MapCodec;

public class dmq extends dfb {
   public static final MapCodec<dmq> a = b(dmq::new);
   public static final int b = 6;
   public static final int c = 64;
   private static final je[] d = je.values();

   @Override
   public MapCodec<dmq> a() {
      return a;
   }

   protected dmq(dsd.d $$0) {
      super($$0);
   }

   @Override
   protected void b(dse $$0, dca $$1, iz $$2, dse $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2);
      }
   }

   @Override
   protected void a(dse $$0, dca $$1, iz $$2, dfb $$3, iz $$4, boolean $$5) {
      this.a($$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected void a(dca $$0, iz $$1) {
      if (this.b($$0, $$1)) {
         $$0.a($$1, dfd.aP.o(), 2);
         $$0.a(null, $$1, awa.yT, awb.e, 1.0F, 1.0F);
      }
   }

   private boolean b(dca $$0, iz $$1) {
      return iz.a($$1, 6, 65, ($$0x, $$1x) -> {
         for (je $$2 : d) {
            $$1x.accept($$0x.a($$2));
         }
      }, $$2 -> {
         if ($$2.equals($$1)) {
            return true;
         } else {
            dse $$3 = $$0.a_($$2);
            enx $$4 = $$0.b_($$2);
            if (!$$4.a(awv.a)) {
               return false;
            } else {
               if ($$3.b() instanceof dfi $$6 && !$$6.a(null, $$0, $$2, $$3).e()) {
                  return true;
               }

               if ($$3.b() instanceof djr) {
                  $$0.a($$2, dfd.a.o(), 3);
               } else {
                  if (!$$3.a(dfd.mc) && !$$3.a(dfd.md) && !$$3.a(dfd.bw) && !$$3.a(dfd.bx)) {
                     return false;
                  }

                  dpj $$7 = $$3.t() ? $$0.c_($$2) : null;
                  a($$3, $$0, $$2, $$7);
                  $$0.a($$2, dfd.a.o(), 3);
               }

               return true;
            }
         }
      }) > 1;
   }
}
