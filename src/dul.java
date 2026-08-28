import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dul extends dmm {
   public static final MapCodec<dul> a = b(dul::new);
   public static final int b = 6;
   public static final int c = 64;
   private static final jb[] d = jb.values();

   @Override
   public MapCodec<dul> a() {
      return a;
   }

   protected dul(ean.d $$0) {
      super($$0);
   }

   @Override
   protected void a(eao $$0, djh $$1, iv $$2, eao $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2);
      }
   }

   @Override
   protected void a(eao $$0, djh $$1, iv $$2, dmm $$3, @Nullable eyd $$4, boolean $$5) {
      this.a($$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected void a(djh $$0, iv $$1) {
      if (this.b($$0, $$1)) {
         $$0.a($$1, dmo.aW.m(), 2);
         $$0.a(null, $$1, awn.Aa, awo.e, 1.0F, 1.0F);
      }
   }

   private boolean b(djh $$0, iv $$1) {
      return iv.a($$1, 6, 65, ($$0x, $$1x) -> {
         for (jb $$2 : d) {
            $$1x.accept($$0x.a($$2));
         }
      }, $$2 -> {
         if ($$2.equals($$1)) {
            return iv.b.a;
         } else {
            eao $$3 = $$0.a_($$2);
            ewv $$4 = $$0.b_($$2);
            if (!$$4.a(axh.a)) {
               return iv.b.b;
            } else {
               if ($$3.b() instanceof dmu $$6 && !$$6.a(null, $$0, $$2, $$3).f()) {
                  return iv.b.a;
               }

               if ($$3.b() instanceof dri) {
                  $$0.a($$2, dmo.a.m(), 3);
               } else {
                  if (!$$3.a(dmo.mI) && !$$3.a(dmo.mJ) && !$$3.a(dmo.bG) && !$$3.a(dmo.bH)) {
                     return iv.b.b;
                  }

                  dxm $$7 = $$3.x() ? $$0.c_($$2) : null;
                  a($$3, $$0, $$2, $$7);
                  $$0.a($$2, dmo.a.m(), 3);
               }

               return iv.b.a;
            }
         }
      }) > 1;
   }
}
