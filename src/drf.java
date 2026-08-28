import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class drf extends djl {
   public static final MapCodec<drf> a = b(drf::new);
   public static final int b = 6;
   public static final int c = 64;
   private static final jn[] d = jn.values();

   @Override
   public MapCodec<drf> a() {
      return a;
   }

   protected drf(dwv.d $$0) {
      super($$0);
   }

   @Override
   protected void b(dww $$0, dgh $$1, ji $$2, dww $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2);
      }
   }

   @Override
   protected void a(dww $$0, dgh $$1, ji $$2, djl $$3, @Nullable eug $$4, boolean $$5) {
      this.a($$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected void a(dgh $$0, ji $$1) {
      if (this.b($$0, $$1)) {
         $$0.a($$1, djn.aW.m(), 2);
         $$0.a(null, $$1, awa.zK, awb.e, 1.0F, 1.0F);
      }
   }

   private boolean b(dgh $$0, ji $$1) {
      return ji.a($$1, 6, 65, ($$0x, $$1x) -> {
         for (jn $$2 : d) {
            $$1x.accept($$0x.a($$2));
         }
      }, $$2 -> {
         if ($$2.equals($$1)) {
            return ji.b.a;
         } else {
            dww $$3 = $$0.a_($$2);
            esy $$4 = $$0.b_($$2);
            if (!$$4.a(awv.a)) {
               return ji.b.b;
            } else {
               if ($$3.b() instanceof djt $$6 && !$$6.a(null, $$0, $$2, $$3).f()) {
                  return ji.b.a;
               }

               if ($$3.b() instanceof dod) {
                  $$0.a($$2, djn.a.m(), 3);
               } else {
                  if (!$$3.a(djn.mE) && !$$3.a(djn.mF) && !$$3.a(djn.bD) && !$$3.a(djn.bE)) {
                     return ji.b.b;
                  }

                  dty $$7 = $$3.x() ? $$0.c_($$2) : null;
                  a($$3, $$0, $$2, $$7);
                  $$0.a($$2, djn.a.m(), 3);
               }

               return ji.b.a;
            }
         }
      }) > 1;
   }
}
