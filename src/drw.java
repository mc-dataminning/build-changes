import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class drw extends dke {
   public static final MapCodec<drw> a = b(drw::new);
   public static final int b = 6;
   public static final int c = 64;
   private static final jm[] d = jm.values();

   @Override
   public MapCodec<drw> a() {
      return a;
   }

   protected drw(dxm.d $$0) {
      super($$0);
   }

   @Override
   protected void b(dxn $$0, dha $$1, jh $$2, dxn $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2);
      }
   }

   @Override
   protected void a(dxn $$0, dha $$1, jh $$2, dke $$3, @Nullable eux $$4, boolean $$5) {
      this.a($$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected void a(dha $$0, jh $$1) {
      if (this.b($$0, $$1)) {
         $$0.a($$1, dkg.aW.m(), 2);
         $$0.a(null, $$1, axf.zu, axg.e, 1.0F, 1.0F);
      }
   }

   private boolean b(dha $$0, jh $$1) {
      return jh.a($$1, 6, 65, ($$0x, $$1x) -> {
         for (jm $$2 : d) {
            $$1x.accept($$0x.a($$2));
         }
      }, $$2 -> {
         if ($$2.equals($$1)) {
            return true;
         } else {
            dxn $$3 = $$0.a_($$2);
            etp $$4 = $$0.b_($$2);
            if (!$$4.a(aya.a)) {
               return false;
            } else {
               if ($$3.b() instanceof dkm $$6 && !$$6.a(null, $$0, $$2, $$3).f()) {
                  return true;
               }

               if ($$3.b() instanceof dow) {
                  $$0.a($$2, dkg.a.m(), 3);
               } else {
                  if (!$$3.a(dkg.mx) && !$$3.a(dkg.my) && !$$3.a(dkg.bD) && !$$3.a(dkg.bE)) {
                     return false;
                  }

                  dup $$7 = $$3.x() ? $$0.c_($$2) : null;
                  a($$3, $$0, $$2, $$7);
                  $$0.a($$2, dkg.a.m(), 3);
               }

               return true;
            }
         }
      }) > 1;
   }
}
