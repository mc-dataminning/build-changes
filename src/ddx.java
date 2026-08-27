import com.mojang.serialization.MapCodec;

public class ddx extends cwj {
   public static final MapCodec<ddx> a = b(ddx::new);
   public static final int b = 6;
   public static final int c = 64;
   private static final ic[] d = ic.values();

   @Override
   public MapCodec<ddx> a() {
      return a;
   }

   protected ddx(diz.d $$0) {
      super($$0);
   }

   @Override
   public void b(dja $$0, cti $$1, hx $$2, dja $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2);
      }
   }

   @Override
   public void a(dja $$0, cti $$1, hx $$2, cwj $$3, hx $$4, boolean $$5) {
      this.a($$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected void a(cti $$0, hx $$1) {
      if (this.b($$0, $$1)) {
         $$0.a($$1, cwl.aP.o(), 2);
         $$0.a(null, $$1, arm.xZ, arn.e, 1.0F, 1.0F);
      }
   }

   private boolean b(cti $$0, hx $$1) {
      return hx.a($$1, 6, 65, ($$0x, $$1x) -> {
         for (ic $$2 : d) {
            $$1x.accept($$0x.a($$2));
         }
      }, $$2 -> {
         if ($$2.equals($$1)) {
            return true;
         } else {
            dja $$3 = $$0.a_($$2);
            eek $$4 = $$0.b_($$2);
            if (!$$4.a(asg.a)) {
               return false;
            } else {
               if ($$3.b() instanceof cwq $$6 && !$$6.a(null, $$0, $$2, $$3).b()) {
                  return true;
               }

               if ($$3.b() instanceof day) {
                  $$0.a($$2, cwl.a.o(), 3);
               } else {
                  if (!$$3.a(cwl.mc) && !$$3.a(cwl.md) && !$$3.a(cwl.bw) && !$$3.a(cwl.bx)) {
                     return false;
                  }

                  dgo $$7 = $$3.t() ? $$0.c_($$2) : null;
                  a($$3, $$0, $$2, $$7);
                  $$0.a($$2, cwl.a.o(), 3);
               }

               return true;
            }
         }
      }) > 1;
   }
}
