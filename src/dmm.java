import com.mojang.serialization.MapCodec;

public class dmm extends dex {
   public static final MapCodec<dmm> a = b(dmm::new);
   public static final int b = 6;
   public static final int c = 64;
   private static final je[] d = je.values();

   @Override
   public MapCodec<dmm> a() {
      return a;
   }

   protected dmm(drz.d $$0) {
      super($$0);
   }

   @Override
   protected void b(dsa $$0, dbw $$1, iz $$2, dsa $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2);
      }
   }

   @Override
   protected void a(dsa $$0, dbw $$1, iz $$2, dex $$3, iz $$4, boolean $$5) {
      this.a($$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected void a(dbw $$0, iz $$1) {
      if (this.b($$0, $$1)) {
         $$0.a($$1, dez.aP.o(), 2);
         $$0.a(null, $$1, avz.yT, awa.e, 1.0F, 1.0F);
      }
   }

   private boolean b(dbw $$0, iz $$1) {
      return iz.a($$1, 6, 65, ($$0x, $$1x) -> {
         for (je $$2 : d) {
            $$1x.accept($$0x.a($$2));
         }
      }, $$2 -> {
         if ($$2.equals($$1)) {
            return true;
         } else {
            dsa $$3 = $$0.a_($$2);
            ent $$4 = $$0.b_($$2);
            if (!$$4.a(awu.a)) {
               return false;
            } else {
               if ($$3.b() instanceof dfe $$6 && !$$6.a(null, $$0, $$2, $$3).e()) {
                  return true;
               }

               if ($$3.b() instanceof djn) {
                  $$0.a($$2, dez.a.o(), 3);
               } else {
                  if (!$$3.a(dez.mc) && !$$3.a(dez.md) && !$$3.a(dez.bw) && !$$3.a(dez.bx)) {
                     return false;
                  }

                  dpf $$7 = $$3.t() ? $$0.c_($$2) : null;
                  a($$3, $$0, $$2, $$7);
                  $$0.a($$2, dez.a.o(), 3);
               }

               return true;
            }
         }
      }) > 1;
   }
}
