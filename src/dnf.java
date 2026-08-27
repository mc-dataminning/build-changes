import com.mojang.serialization.MapCodec;

public class dnf extends dfc {
   public static final MapCodec<dnf> a = b(dnf::new);
   public static final int b = 6;
   public static final int c = 64;
   private static final iw[] d = iw.values();

   @Override
   public MapCodec<dnf> a() {
      return a;
   }

   protected dnf(dtb.d $$0) {
      super($$0);
   }

   @Override
   protected void b(dtc $$0, dca $$1, ir $$2, dtc $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2);
      }
   }

   @Override
   protected void a(dtc $$0, dca $$1, ir $$2, dfc $$3, ir $$4, boolean $$5) {
      this.a($$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected void a(dca $$0, ir $$1) {
      if (this.b($$0, $$1)) {
         $$0.a($$1, dfe.bx.n(), 2);
         $$0.a(null, $$1, avo.zr, avq.e, 1.0F, 1.0F);
      }
   }

   private boolean b(dca $$0, ir $$1) {
      return ir.a($$1, 6, 65, ($$0x, $$1x) -> {
         for (iw $$2 : d) {
            $$1x.accept($$0x.a($$2));
         }
      }, $$2 -> {
         if ($$2.equals($$1)) {
            return true;
         } else {
            dtc $$3 = $$0.a_($$2);
            epe $$4 = $$0.b_($$2);
            if (!$$4.a(awj.a)) {
               return false;
            } else {
               if ($$3.b() instanceof dfj $$6 && !$$6.a(null, $$0, $$2, $$3).d()) {
                  return true;
               }

               if ($$3.b() instanceof djw) {
                  $$0.a($$2, dfe.a.n(), 3);
               } else {
                  if (!$$3.a(dfe.na) && !$$3.a(dfe.nb) && !$$3.a(dfe.cg) && !$$3.a(dfe.ch)) {
                     return false;
                  }

                  dqc $$7 = $$3.t() ? $$0.c_($$2) : null;
                  a($$3, $$0, $$2, $$7);
                  $$0.a($$2, dfe.a.n(), 3);
               }

               return true;
            }
         }
      }) > 1;
   }
}
