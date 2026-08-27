import com.mojang.serialization.MapCodec;

public class dgt extends czf {
   public static final MapCodec<dgt> a = b(dgt::new);
   public static final int b = 6;
   public static final int c = 64;
   private static final ih[] d = ih.values();

   @Override
   public MapCodec<dgt> a() {
      return a;
   }

   protected dgt(dmd.d $$0) {
      super($$0);
   }

   @Override
   protected void b(dme $$0, cwe $$1, ib $$2, dme $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2);
      }
   }

   @Override
   protected void a(dme $$0, cwe $$1, ib $$2, czf $$3, ib $$4, boolean $$5) {
      this.a($$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected void a(cwe $$0, ib $$1) {
      if (this.b($$0, $$1)) {
         $$0.a($$1, czh.aP.o(), 2);
         $$0.a(null, $$1, atp.yp, atq.e, 1.0F, 1.0F);
      }
   }

   private boolean b(cwe $$0, ib $$1) {
      return ib.a($$1, 6, 65, ($$0x, $$1x) -> {
         for (ih $$2 : d) {
            $$1x.accept($$0x.a($$2));
         }
      }, $$2 -> {
         if ($$2.equals($$1)) {
            return true;
         } else {
            dme $$3 = $$0.a_($$2);
            ehr $$4 = $$0.b_($$2);
            if (!$$4.a(auj.a)) {
               return false;
            } else {
               if ($$3.b() instanceof czm $$6 && !$$6.a(null, $$0, $$2, $$3).b()) {
                  return true;
               }

               if ($$3.b() instanceof ddu) {
                  $$0.a($$2, czh.a.o(), 3);
               } else {
                  if (!$$3.a(czh.mc) && !$$3.a(czh.md) && !$$3.a(czh.bw) && !$$3.a(czh.bx)) {
                     return false;
                  }

                  djl $$7 = $$3.t() ? $$0.c_($$2) : null;
                  a($$3, $$0, $$2, $$7);
                  $$0.a($$2, czh.a.o(), 3);
               }

               return true;
            }
         }
      }) > 1;
   }
}
