import com.mojang.serialization.MapCodec;

public class dmj extends deu {
   public static final MapCodec<dmj> a = b(dmj::new);
   public static final int b = 6;
   public static final int c = 64;
   private static final je[] d = je.values();

   @Override
   public MapCodec<dmj> a() {
      return a;
   }

   protected dmj(drw.d $$0) {
      super($$0);
   }

   @Override
   protected void b(drx $$0, dbt $$1, iz $$2, drx $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2);
      }
   }

   @Override
   protected void a(drx $$0, dbt $$1, iz $$2, deu $$3, iz $$4, boolean $$5) {
      this.a($$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected void a(dbt $$0, iz $$1) {
      if (this.b($$0, $$1)) {
         $$0.a($$1, dew.aP.n(), 2);
         $$0.a(null, $$1, avw.yT, avx.e, 1.0F, 1.0F);
      }
   }

   private boolean b(dbt $$0, iz $$1) {
      return iz.a($$1, 6, 65, ($$0x, $$1x) -> {
         for (je $$2 : d) {
            $$1x.accept($$0x.a($$2));
         }
      }, $$2 -> {
         if ($$2.equals($$1)) {
            return true;
         } else {
            drx $$3 = $$0.a_($$2);
            enq $$4 = $$0.b_($$2);
            if (!$$4.a(awr.a)) {
               return false;
            } else {
               if ($$3.b() instanceof dfb $$6 && !$$6.a(null, $$0, $$2, $$3).e()) {
                  return true;
               }

               if ($$3.b() instanceof djk) {
                  $$0.a($$2, dew.a.n(), 3);
               } else {
                  if (!$$3.a(dew.mc) && !$$3.a(dew.md) && !$$3.a(dew.bw) && !$$3.a(dew.bx)) {
                     return false;
                  }

                  dpc $$7 = $$3.t() ? $$0.c_($$2) : null;
                  a($$3, $$0, $$2, $$7);
                  $$0.a($$2, dew.a.n(), 3);
               }

               return true;
            }
         }
      }) > 1;
   }
}
