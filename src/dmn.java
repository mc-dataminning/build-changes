import com.mojang.serialization.MapCodec;

public class dmn extends dey {
   public static final MapCodec<dmn> a = b(dmn::new);
   public static final int b = 6;
   public static final int c = 64;
   private static final je[] d = je.values();

   @Override
   public MapCodec<dmn> a() {
      return a;
   }

   protected dmn(dsa.d $$0) {
      super($$0);
   }

   @Override
   protected void b(dsb $$0, dbx $$1, iz $$2, dsb $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2);
      }
   }

   @Override
   protected void a(dsb $$0, dbx $$1, iz $$2, dey $$3, iz $$4, boolean $$5) {
      this.a($$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected void a(dbx $$0, iz $$1) {
      if (this.b($$0, $$1)) {
         $$0.a($$1, dfa.aP.o(), 2);
         $$0.a(null, $$1, avz.yT, awa.e, 1.0F, 1.0F);
      }
   }

   private boolean b(dbx $$0, iz $$1) {
      return iz.a($$1, 6, 65, ($$0x, $$1x) -> {
         for (je $$2 : d) {
            $$1x.accept($$0x.a($$2));
         }
      }, $$2 -> {
         if ($$2.equals($$1)) {
            return true;
         } else {
            dsb $$3 = $$0.a_($$2);
            enu $$4 = $$0.b_($$2);
            if (!$$4.a(awu.a)) {
               return false;
            } else {
               if ($$3.b() instanceof dff $$6 && !$$6.a(null, $$0, $$2, $$3).e()) {
                  return true;
               }

               if ($$3.b() instanceof djo) {
                  $$0.a($$2, dfa.a.o(), 3);
               } else {
                  if (!$$3.a(dfa.mc) && !$$3.a(dfa.md) && !$$3.a(dfa.bw) && !$$3.a(dfa.bx)) {
                     return false;
                  }

                  dpg $$7 = $$3.t() ? $$0.c_($$2) : null;
                  a($$3, $$0, $$2, $$7);
                  $$0.a($$2, dfa.a.o(), 3);
               }

               return true;
            }
         }
      }) > 1;
   }
}
