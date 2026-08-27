import com.mojang.serialization.MapCodec;

public class czv extends dan {
   public static final MapCodec<czv> a = b(czv::new);
   public static final int b = 3;
   public static final dkh c = djx.as;
   private static final int f = 4;
   private static final int g = 2;

   @Override
   public MapCodec<czv> a() {
      return a;
   }

   public czv(djg.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   public void b(djh $$0, and $$1, hx $$2, auv $$3) {
      this.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(djh $$0, and $$1, hx $$2, auv $$3) {
      if (($$3.a(3) == 0 || this.a($$1, $$2, 4)) && $$1.A($$2) > 11 - $$0.c(c) - $$0.b($$1, $$2) && this.e($$0, $$1, $$2)) {
         hx.a $$4 = new hx.a();

         for (ic $$5 : ic.values()) {
            $$4.a($$2, $$5);
            djh $$6 = $$1.a_($$4);
            if ($$6.a(this) && !this.e($$6, $$1, $$4)) {
               $$1.a($$4, this, auo.a($$3, 20, 40));
            }
         }
      } else {
         $$1.a($$2, this, auo.a($$3, 20, 40));
      }
   }

   private boolean e(djh $$0, ctp $$1, hx $$2) {
      int $$3 = $$0.c(c);
      if ($$3 < 3) {
         $$1.a($$2, $$0.a(c, Integer.valueOf($$3 + 1)), 2);
         return false;
      } else {
         this.d($$0, $$1, $$2);
         return true;
      }
   }

   @Override
   public void a(djh $$0, ctp $$1, hx $$2, cwq $$3, hx $$4, boolean $$5) {
      if ($$3.o().a(this) && this.a($$1, $$2, 2)) {
         this.d($$0, $$1, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private boolean a(csv $$0, hx $$1, int $$2) {
      int $$3 = 0;
      hx.a $$4 = new hx.a();

      for (ic $$5 : ic.values()) {
         $$4.a($$1, $$5);
         if ($$0.a_($$4).a(this)) {
            if (++$$3 >= $$2) {
               return false;
            }
         }
      }

      return true;
   }

   @Override
   protected void a(dji.a<cwq, djh> $$0) {
      $$0.a(c);
   }

   @Override
   public cmy a(cts $$0, hx $$1, djh $$2) {
      return cmy.f;
   }
}
