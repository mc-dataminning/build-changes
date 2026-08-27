import com.mojang.serialization.MapCodec;

public class dkk extends dcv {
   public static final MapCodec<dkk> a = b(dkk::new);
   public static final int b = 6;
   public static final int c = 64;
   private static final ir[] d = ir.values();

   @Override
   public MapCodec<dkk> a() {
      return a;
   }

   protected dkk(dpx.d $$0) {
      super($$0);
   }

   @Override
   protected void b(dpy $$0, czu $$1, im $$2, dpy $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2);
      }
   }

   @Override
   protected void a(dpy $$0, czu $$1, im $$2, dcv $$3, im $$4, boolean $$5) {
      this.a($$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected void a(czu $$0, im $$1) {
      if (this.b($$0, $$1)) {
         $$0.a($$1, dcx.aP.n(), 2);
         $$0.a(null, $$1, auz.yH, ava.e, 1.0F, 1.0F);
      }
   }

   private boolean b(czu $$0, im $$1) {
      return im.a($$1, 6, 65, ($$0x, $$1x) -> {
         for (ir $$2 : d) {
            $$1x.accept($$0x.a($$2));
         }
      }, $$2 -> {
         if ($$2.equals($$1)) {
            return true;
         } else {
            dpy $$3 = $$0.a_($$2);
            elr $$4 = $$0.b_($$2);
            if (!$$4.a(avt.a)) {
               return false;
            } else {
               if ($$3.b() instanceof ddc $$6 && !$$6.a(null, $$0, $$2, $$3).d()) {
                  return true;
               }

               if ($$3.b() instanceof dhl) {
                  $$0.a($$2, dcx.a.n(), 3);
               } else {
                  if (!$$3.a(dcx.mc) && !$$3.a(dcx.md) && !$$3.a(dcx.bw) && !$$3.a(dcx.bx)) {
                     return false;
                  }

                  dnd $$7 = $$3.t() ? $$0.c_($$2) : null;
                  a($$3, $$0, $$2, $$7);
                  $$0.a($$2, dcx.a.n(), 3);
               }

               return true;
            }
         }
      }) > 1;
   }
}
