import com.mojang.serialization.MapCodec;

public class cze extends czw {
   public static final MapCodec<cze> a = b(cze::new);
   public static final int b = 3;
   public static final djp c = djf.as;
   private static final int f = 4;
   private static final int g = 2;

   @Override
   public MapCodec<cze> a() {
      return a;
   }

   public cze(dio.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   public void b(dip $$0, amp $$1, hv $$2, auf $$3) {
      this.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dip $$0, amp $$1, hv $$2, auf $$3) {
      if (($$3.a(3) == 0 || this.a($$1, $$2, 4)) && $$1.z($$2) > 11 - $$0.c(c) - $$0.b($$1, $$2) && this.e($$0, $$1, $$2)) {
         hv.a $$4 = new hv.a();

         for (ia $$5 : ia.values()) {
            $$4.a($$2, $$5);
            dip $$6 = $$1.a_($$4);
            if ($$6.a(this) && !this.e($$6, $$1, $$4)) {
               $$1.a($$4, this, aty.a($$3, 20, 40));
            }
         }
      } else {
         $$1.a($$2, this, aty.a($$3, 20, 40));
      }
   }

   private boolean e(dip $$0, csy $$1, hv $$2) {
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
   public void a(dip $$0, csy $$1, hv $$2, cvz $$3, hv $$4, boolean $$5) {
      if ($$3.o().a(this) && this.a($$1, $$2, 2)) {
         this.d($$0, $$1, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private boolean a(cse $$0, hv $$1, int $$2) {
      int $$3 = 0;
      hv.a $$4 = new hv.a();

      for (ia $$5 : ia.values()) {
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
   protected void a(diq.a<cvz, dip> $$0) {
      $$0.a(c);
   }

   @Override
   public cmh a(ctb $$0, hv $$1, dip $$2) {
      return cmh.f;
   }
}
