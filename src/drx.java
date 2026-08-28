import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class drx extends dkd {
   public static final MapCodec<drx> a = b(drx::new);
   public static final int b = 6;
   public static final int c = 64;
   private static final jm[] d = jm.values();

   @Override
   public MapCodec<drx> a() {
      return a;
   }

   protected drx(dxn.d $$0) {
      super($$0);
   }

   @Override
   protected void b(dxo $$0, dgz $$1, jh $$2, dxo $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2);
      }
   }

   @Override
   protected void a(dxo $$0, dgz $$1, jh $$2, dkd $$3, @Nullable euy $$4, boolean $$5) {
      this.a($$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected void a(dgz $$0, jh $$1) {
      if (this.b($$0, $$1)) {
         $$0.a($$1, dkf.aW.m(), 2);
         $$0.a(null, $$1, awv.zL, aww.e, 1.0F, 1.0F);
      }
   }

   private boolean b(dgz $$0, jh $$1) {
      return jh.a($$1, 6, 65, ($$0x, $$1x) -> {
         for (jm $$2 : d) {
            $$1x.accept($$0x.a($$2));
         }
      }, $$2 -> {
         if ($$2.equals($$1)) {
            return jh.b.a;
         } else {
            dxo $$3 = $$0.a_($$2);
            etq $$4 = $$0.b_($$2);
            if (!$$4.a(axq.a)) {
               return jh.b.b;
            } else {
               if ($$3.b() instanceof dkl $$6 && !$$6.a(null, $$0, $$2, $$3).f()) {
                  return jh.b.a;
               }

               if ($$3.b() instanceof dov) {
                  $$0.a($$2, dkf.a.m(), 3);
               } else {
                  if (!$$3.a(dkf.mE) && !$$3.a(dkf.mF) && !$$3.a(dkf.bD) && !$$3.a(dkf.bE)) {
                     return jh.b.b;
                  }

                  duq $$7 = $$3.x() ? $$0.c_($$2) : null;
                  a($$3, $$0, $$2, $$7);
                  $$0.a($$2, dkf.a.m(), 3);
               }

               return jh.b.a;
            }
         }
      }) > 1;
   }
}
