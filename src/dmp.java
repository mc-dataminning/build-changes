import com.mojang.serialization.MapCodec;

public class dmp extends dfa {
   public static final MapCodec<dmp> a = b(dmp::new);
   public static final int b = 6;
   public static final int c = 64;
   private static final je[] d = je.values();

   @Override
   public MapCodec<dmp> a() {
      return a;
   }

   protected dmp(dsc.d $$0) {
      super($$0);
   }

   @Override
   protected void b(dsd $$0, dbz $$1, iz $$2, dsd $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2);
      }
   }

   @Override
   protected void a(dsd $$0, dbz $$1, iz $$2, dfa $$3, iz $$4, boolean $$5) {
      this.a($$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected void a(dbz $$0, iz $$1) {
      if (this.b($$0, $$1)) {
         $$0.a($$1, dfc.aP.o(), 2);
         $$0.a(null, $$1, awa.yT, awb.e, 1.0F, 1.0F);
      }
   }

   private boolean b(dbz $$0, iz $$1) {
      return iz.a($$1, 6, 65, ($$0x, $$1x) -> {
         for (je $$2 : d) {
            $$1x.accept($$0x.a($$2));
         }
      }, $$2 -> {
         if ($$2.equals($$1)) {
            return true;
         } else {
            dsd $$3 = $$0.a_($$2);
            enw $$4 = $$0.b_($$2);
            if (!$$4.a(awv.a)) {
               return false;
            } else {
               if ($$3.b() instanceof dfh $$6 && !$$6.a(null, $$0, $$2, $$3).e()) {
                  return true;
               }

               if ($$3.b() instanceof djq) {
                  $$0.a($$2, dfc.a.o(), 3);
               } else {
                  if (!$$3.a(dfc.mc) && !$$3.a(dfc.md) && !$$3.a(dfc.bw) && !$$3.a(dfc.bx)) {
                     return false;
                  }

                  dpi $$7 = $$3.t() ? $$0.c_($$2) : null;
                  a($$3, $$0, $$2, $$7);
                  $$0.a($$2, dfc.a.o(), 3);
               }

               return true;
            }
         }
      }) > 1;
   }
}
