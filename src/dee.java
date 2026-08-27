import com.mojang.serialization.MapCodec;

public class dee extends cwq {
   public static final MapCodec<dee> a = b(dee::new);
   public static final int b = 6;
   public static final int c = 64;
   private static final ic[] d = ic.values();

   @Override
   public MapCodec<dee> a() {
      return a;
   }

   protected dee(djg.d $$0) {
      super($$0);
   }

   @Override
   public void b(djh $$0, ctp $$1, hx $$2, djh $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2);
      }
   }

   @Override
   public void a(djh $$0, ctp $$1, hx $$2, cwq $$3, hx $$4, boolean $$5) {
      this.a($$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected void a(ctp $$0, hx $$1) {
      if (this.b($$0, $$1)) {
         $$0.a($$1, cws.aP.o(), 2);
         $$0.a(null, $$1, ars.xZ, art.e, 1.0F, 1.0F);
      }
   }

   private boolean b(ctp $$0, hx $$1) {
      return hx.a($$1, 6, 65, ($$0x, $$1x) -> {
         for (ic $$2 : d) {
            $$1x.accept($$0x.a($$2));
         }
      }, $$2 -> {
         if ($$2.equals($$1)) {
            return true;
         } else {
            djh $$3 = $$0.a_($$2);
            eer $$4 = $$0.b_($$2);
            if (!$$4.a(asm.a)) {
               return false;
            } else {
               if ($$3.b() instanceof cwx $$6 && !$$6.a(null, $$0, $$2, $$3).b()) {
                  return true;
               }

               if ($$3.b() instanceof dbf) {
                  $$0.a($$2, cws.a.o(), 3);
               } else {
                  if (!$$3.a(cws.mc) && !$$3.a(cws.md) && !$$3.a(cws.bw) && !$$3.a(cws.bx)) {
                     return false;
                  }

                  dgv $$7 = $$3.t() ? $$0.c_($$2) : null;
                  a($$3, $$0, $$2, $$7);
                  $$0.a($$2, cws.a.o(), 3);
               }

               return true;
            }
         }
      }) > 1;
   }
}
