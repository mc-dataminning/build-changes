import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dsp extends dku {
   public static final MapCodec<dsp> a = b(dsp::new);
   public static final int b = 6;
   public static final int c = 64;
   private static final jo[] d = jo.values();

   @Override
   public MapCodec<dsp> a() {
      return a;
   }

   protected dsp(dyl.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dym $$0, dhp $$1, jj $$2, dym $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2);
      }
   }

   @Override
   protected void a(dym $$0, dhp $$1, jj $$2, dku $$3, @Nullable ewb $$4, boolean $$5) {
      this.a($$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected void a(dhp $$0, jj $$1) {
      if (this.b($$0, $$1)) {
         $$0.a($$1, dkw.aW.m(), 2);
         $$0.a(null, $$1, awk.zU, awl.e, 1.0F, 1.0F);
      }
   }

   private boolean b(dhp $$0, jj $$1) {
      return jj.a($$1, 6, 65, ($$0x, $$1x) -> {
         for (jo $$2 : d) {
            $$1x.accept($$0x.a($$2));
         }
      }, $$2 -> {
         if ($$2.equals($$1)) {
            return jj.b.a;
         } else {
            dym $$3 = $$0.a_($$2);
            eut $$4 = $$0.b_($$2);
            if (!$$4.a(axf.a)) {
               return jj.b.b;
            } else {
               if ($$3.b() instanceof dlc $$6 && !$$6.a(null, $$0, $$2, $$3).f()) {
                  return jj.b.a;
               }

               if ($$3.b() instanceof dpo) {
                  $$0.a($$2, dkw.a.m(), 3);
               } else {
                  if (!$$3.a(dkw.mE) && !$$3.a(dkw.mF) && !$$3.a(dkw.bD) && !$$3.a(dkw.bE)) {
                     return jj.b.b;
                  }

                  dvl $$7 = $$3.x() ? $$0.c_($$2) : null;
                  a($$3, $$0, $$2, $$7);
                  $$0.a($$2, dkw.a.m(), 3);
               }

               return jj.b.a;
            }
         }
      }) > 1;
   }
}
