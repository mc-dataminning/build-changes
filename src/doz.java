import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class doz extends dhj {
   public static final MapCodec<doz> a = b(doz::new);
   public static final int b = 6;
   public static final int c = 64;
   private static final jj[] d = jj.values();

   @Override
   public MapCodec<doz> a() {
      return a;
   }

   protected doz(dun.d $$0) {
      super($$0);
   }

   @Override
   protected void b(duo $$0, deg $$1, je $$2, duo $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2);
      }
   }

   @Override
   protected void a(duo $$0, deg $$1, je $$2, dhj $$3, @Nullable erx $$4, boolean $$5) {
      this.a($$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected void a(deg $$0, je $$1) {
      if (this.b($$0, $$1)) {
         $$0.a($$1, dhl.aP.o(), 2);
         $$0.a(null, $$1, awe.zc, awf.e, 1.0F, 1.0F);
      }
   }

   private boolean b(deg $$0, je $$1) {
      return je.a($$1, 6, 65, ($$0x, $$1x) -> {
         for (jj $$2 : d) {
            $$1x.accept($$0x.a($$2));
         }
      }, $$2 -> {
         if ($$2.equals($$1)) {
            return true;
         } else {
            duo $$3 = $$0.a_($$2);
            eqp $$4 = $$0.b_($$2);
            if (!$$4.a(awz.a)) {
               return false;
            } else {
               if ($$3.b() instanceof dhq $$6 && !$$6.a(null, $$0, $$2, $$3).f()) {
                  return true;
               }

               if ($$3.b() instanceof dlz) {
                  $$0.a($$2, dhl.a.o(), 3);
               } else {
                  if (!$$3.a(dhl.mc) && !$$3.a(dhl.md) && !$$3.a(dhl.bw) && !$$3.a(dhl.bx)) {
                     return false;
                  }

                  drs $$7 = $$3.x() ? $$0.c_($$2) : null;
                  a($$3, $$0, $$2, $$7);
                  $$0.a($$2, dhl.a.o(), 3);
               }

               return true;
            }
         }
      }) > 1;
   }
}
