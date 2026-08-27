import com.mojang.serialization.MapCodec;

public class dgc extends cyo {
   public static final MapCodec<dgc> a = b(dgc::new);
   public static final int b = 6;
   public static final int c = 64;
   private static final ie[] d = ie.values();

   @Override
   public MapCodec<dgc> a() {
      return a;
   }

   protected dgc(dle.d $$0) {
      super($$0);
   }

   @Override
   protected void b(dlf $$0, cvn $$1, hz $$2, dlf $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2);
      }
   }

   @Override
   protected void a(dlf $$0, cvn $$1, hz $$2, cyo $$3, hz $$4, boolean $$5) {
      this.a($$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected void a(cvn $$0, hz $$1) {
      if (this.b($$0, $$1)) {
         $$0.a($$1, cyq.aP.o(), 2);
         $$0.a(null, $$1, atk.yo, atl.e, 1.0F, 1.0F);
      }
   }

   private boolean b(cvn $$0, hz $$1) {
      return hz.a($$1, 6, 65, ($$0x, $$1x) -> {
         for (ie $$2 : d) {
            $$1x.accept($$0x.a($$2));
         }
      }, $$2 -> {
         if ($$2.equals($$1)) {
            return true;
         } else {
            dlf $$3 = $$0.a_($$2);
            egp $$4 = $$0.b_($$2);
            if (!$$4.a(aue.a)) {
               return false;
            } else {
               if ($$3.b() instanceof cyv $$6 && !$$6.a(null, $$0, $$2, $$3).b()) {
                  return true;
               }

               if ($$3.b() instanceof ddd) {
                  $$0.a($$2, cyq.a.o(), 3);
               } else {
                  if (!$$3.a(cyq.mc) && !$$3.a(cyq.md) && !$$3.a(cyq.bw) && !$$3.a(cyq.bx)) {
                     return false;
                  }

                  dit $$7 = $$3.t() ? $$0.c_($$2) : null;
                  a($$3, $$0, $$2, $$7);
                  $$0.a($$2, cyq.a.o(), 3);
               }

               return true;
            }
         }
      }) > 1;
   }
}
