import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dpc extends dhm {
   public static final MapCodec<dpc> a = b(dpc::new);
   public static final int b = 6;
   public static final int c = 64;
   private static final jk[] d = jk.values();

   @Override
   public MapCodec<dpc> a() {
      return a;
   }

   protected dpc(dur.d $$0) {
      super($$0);
   }

   @Override
   protected void b(dus $$0, dej $$1, jf $$2, dus $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2);
      }
   }

   @Override
   protected void a(dus $$0, dej $$1, jf $$2, dhm $$3, @Nullable esb $$4, boolean $$5) {
      this.a($$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected void a(dej $$0, jf $$1) {
      if (this.b($$0, $$1)) {
         $$0.a($$1, dho.aP.n(), 2);
         $$0.a(null, $$1, awg.zc, awh.e, 1.0F, 1.0F);
      }
   }

   private boolean b(dej $$0, jf $$1) {
      return jf.a($$1, 6, 65, ($$0x, $$1x) -> {
         for (jk $$2 : d) {
            $$1x.accept($$0x.a($$2));
         }
      }, $$2 -> {
         if ($$2.equals($$1)) {
            return true;
         } else {
            dus $$3 = $$0.a_($$2);
            eqt $$4 = $$0.b_($$2);
            if (!$$4.a(axb.a)) {
               return false;
            } else {
               if ($$3.b() instanceof dht $$6 && !$$6.a(null, $$0, $$2, $$3).f()) {
                  return true;
               }

               if ($$3.b() instanceof dmc) {
                  $$0.a($$2, dho.a.n(), 3);
               } else {
                  if (!$$3.a(dho.mc) && !$$3.a(dho.md) && !$$3.a(dho.bw) && !$$3.a(dho.bx)) {
                     return false;
                  }

                  drv $$7 = $$3.x() ? $$0.c_($$2) : null;
                  a($$3, $$0, $$2, $$7);
                  $$0.a($$2, dho.a.n(), 3);
               }

               return true;
            }
         }
      }) > 1;
   }
}
