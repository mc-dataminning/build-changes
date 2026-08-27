import com.mojang.serialization.MapCodec;

public class dgg extends cys {
   public static final MapCodec<dgg> a = b(dgg::new);
   public static final int b = 6;
   public static final int c = 64;
   private static final ie[] d = ie.values();

   @Override
   public MapCodec<dgg> a() {
      return a;
   }

   protected dgg(dli.d $$0) {
      super($$0);
   }

   @Override
   protected void b(dlj $$0, cvr $$1, hz $$2, dlj $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2);
      }
   }

   @Override
   protected void a(dlj $$0, cvr $$1, hz $$2, cys $$3, hz $$4, boolean $$5) {
      this.a($$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected void a(cvr $$0, hz $$1) {
      if (this.b($$0, $$1)) {
         $$0.a($$1, cyu.aP.o(), 2);
         $$0.a(null, $$1, atl.yp, atm.e, 1.0F, 1.0F);
      }
   }

   private boolean b(cvr $$0, hz $$1) {
      return hz.a($$1, 6, 65, ($$0x, $$1x) -> {
         for (ie $$2 : d) {
            $$1x.accept($$0x.a($$2));
         }
      }, $$2 -> {
         if ($$2.equals($$1)) {
            return true;
         } else {
            dlj $$3 = $$0.a_($$2);
            egw $$4 = $$0.b_($$2);
            if (!$$4.a(auf.a)) {
               return false;
            } else {
               if ($$3.b() instanceof cyz $$6 && !$$6.a(null, $$0, $$2, $$3).b()) {
                  return true;
               }

               if ($$3.b() instanceof ddh) {
                  $$0.a($$2, cyu.a.o(), 3);
               } else {
                  if (!$$3.a(cyu.mc) && !$$3.a(cyu.md) && !$$3.a(cyu.bw) && !$$3.a(cyu.bx)) {
                     return false;
                  }

                  dix $$7 = $$3.t() ? $$0.c_($$2) : null;
                  a($$3, $$0, $$2, $$7);
                  $$0.a($$2, cyu.a.o(), 3);
               }

               return true;
            }
         }
      }) > 1;
   }
}
