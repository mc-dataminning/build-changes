import com.mojang.serialization.MapCodec;

public class dkt extends dde {
   public static final MapCodec<dkt> a = b(dkt::new);
   public static final int b = 6;
   public static final int c = 64;
   private static final is[] d = is.values();

   @Override
   public MapCodec<dkt> a() {
      return a;
   }

   protected dkt(dqg.d $$0) {
      super($$0);
   }

   @Override
   protected void b(dqh $$0, dad $$1, in $$2, dqh $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2);
      }
   }

   @Override
   protected void a(dqh $$0, dad $$1, in $$2, dde $$3, in $$4, boolean $$5) {
      this.a($$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected void a(dad $$0, in $$1) {
      if (this.b($$0, $$1)) {
         $$0.a($$1, ddg.aP.n(), 2);
         $$0.a(null, $$1, avc.yI, avd.e, 1.0F, 1.0F);
      }
   }

   private boolean b(dad $$0, in $$1) {
      return in.a($$1, 6, 65, ($$0x, $$1x) -> {
         for (is $$2 : d) {
            $$1x.accept($$0x.a($$2));
         }
      }, $$2 -> {
         if ($$2.equals($$1)) {
            return true;
         } else {
            dqh $$3 = $$0.a_($$2);
            ema $$4 = $$0.b_($$2);
            if (!$$4.a(avw.a)) {
               return false;
            } else {
               if ($$3.b() instanceof ddl $$6 && !$$6.a(null, $$0, $$2, $$3).d()) {
                  return true;
               }

               if ($$3.b() instanceof dhu) {
                  $$0.a($$2, ddg.a.n(), 3);
               } else {
                  if (!$$3.a(ddg.mc) && !$$3.a(ddg.md) && !$$3.a(ddg.bw) && !$$3.a(ddg.bx)) {
                     return false;
                  }

                  dnm $$7 = $$3.t() ? $$0.c_($$2) : null;
                  a($$3, $$0, $$2, $$7);
                  $$0.a($$2, ddg.a.n(), 3);
               }

               return true;
            }
         }
      }) > 1;
   }
}
