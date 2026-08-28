import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dsd extends dkl {
   public static final MapCodec<dsd> a = b(dsd::new);
   public static final int b = 6;
   public static final int c = 64;
   private static final jm[] d = jm.values();

   @Override
   public MapCodec<dsd> a() {
      return a;
   }

   protected dsd(dxt.d $$0) {
      super($$0);
   }

   @Override
   protected void b(dxu $$0, dhh $$1, jh $$2, dxu $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2);
      }
   }

   @Override
   protected void a(dxu $$0, dhh $$1, jh $$2, dkl $$3, @Nullable eve $$4, boolean $$5) {
      this.a($$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected void a(dhh $$0, jh $$1) {
      if (this.b($$0, $$1)) {
         $$0.a($$1, dkn.aW.m(), 2);
         $$0.a(null, $$1, axf.zv, axg.e, 1.0F, 1.0F);
      }
   }

   private boolean b(dhh $$0, jh $$1) {
      return jh.a($$1, 6, 65, ($$0x, $$1x) -> {
         for (jm $$2 : d) {
            $$1x.accept($$0x.a($$2));
         }
      }, $$2 -> {
         if ($$2.equals($$1)) {
            return true;
         } else {
            dxu $$3 = $$0.a_($$2);
            etw $$4 = $$0.b_($$2);
            if (!$$4.a(aya.a)) {
               return false;
            } else {
               if ($$3.b() instanceof dkt $$6 && !$$6.a(null, $$0, $$2, $$3).f()) {
                  return true;
               }

               if ($$3.b() instanceof dpd) {
                  $$0.a($$2, dkn.a.m(), 3);
               } else {
                  if (!$$3.a(dkn.mx) && !$$3.a(dkn.my) && !$$3.a(dkn.bD) && !$$3.a(dkn.bE)) {
                     return false;
                  }

                  duw $$7 = $$3.x() ? $$0.c_($$2) : null;
                  a($$3, $$0, $$2, $$7);
                  $$0.a($$2, dkn.a.m(), 3);
               }

               return true;
            }
         }
      }) > 1;
   }
}
