import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dpt extends die {
   public static final MapCodec<dpt> a = b(dpt::new);
   public static final int b = 6;
   public static final int c = 64;
   private static final jm[] d = jm.values();

   @Override
   public MapCodec<dpt> a() {
      return a;
   }

   protected dpt(dvi.d $$0) {
      super($$0);
   }

   @Override
   protected void b(dvj $$0, dfb $$1, jh $$2, dvj $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2);
      }
   }

   @Override
   protected void a(dvj $$0, dfb $$1, jh $$2, die $$3, @Nullable ess $$4, boolean $$5) {
      this.a($$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected void a(dfb $$0, jh $$1) {
      if (this.b($$0, $$1)) {
         $$0.a($$1, dig.aP.m(), 2);
         $$0.a(null, $$1, awl.za, awm.e, 1.0F, 1.0F);
      }
   }

   private boolean b(dfb $$0, jh $$1) {
      return jh.a($$1, 6, 65, ($$0x, $$1x) -> {
         for (jm $$2 : d) {
            $$1x.accept($$0x.a($$2));
         }
      }, $$2 -> {
         if ($$2.equals($$1)) {
            return true;
         } else {
            dvj $$3 = $$0.a_($$2);
            erk $$4 = $$0.b_($$2);
            if (!$$4.a(axg.a)) {
               return false;
            } else {
               if ($$3.b() instanceof dil $$6 && !$$6.a(null, $$0, $$2, $$3).f()) {
                  return true;
               }

               if ($$3.b() instanceof dmt) {
                  $$0.a($$2, dig.a.m(), 3);
               } else {
                  if (!$$3.a(dig.mc) && !$$3.a(dig.md) && !$$3.a(dig.bw) && !$$3.a(dig.bx)) {
                     return false;
                  }

                  dsm $$7 = $$3.x() ? $$0.c_($$2) : null;
                  a($$3, $$0, $$2, $$7);
                  $$0.a($$2, dig.a.m(), 3);
               }

               return true;
            }
         }
      }) > 1;
   }
}
