import com.mojang.serialization.MapCodec;

public class cyf extends cyx {
   public static final MapCodec<cyf> a = b(cyf::new);
   public static final int b = 3;
   public static final dii c = dhy.as;
   private static final int f = 4;
   private static final int g = 2;

   @Override
   public MapCodec<cyf> a() {
      return a;
   }

   public cyf(dhh.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   public void b(dhi $$0, ame $$1, ht $$2, ats $$3) {
      this.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dhi $$0, ame $$1, ht $$2, ats $$3) {
      if (($$3.a(3) == 0 || this.a($$1, $$2, 4)) && $$1.z($$2) > 11 - $$0.c(c) - $$0.b($$1, $$2) && this.e($$0, $$1, $$2)) {
         ht.a $$4 = new ht.a();

         for (hx $$5 : hx.values()) {
            $$4.a($$2, $$5);
            dhi $$6 = $$1.a_($$4);
            if ($$6.a(this) && !this.e($$6, $$1, $$4)) {
               $$1.a($$4, this, atm.a($$3, 20, 40));
            }
         }
      } else {
         $$1.a($$2, this, atm.a($$3, 20, 40));
      }
   }

   private boolean e(dhi $$0, csa $$1, ht $$2) {
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
   public void a(dhi $$0, csa $$1, ht $$2, cva $$3, ht $$4, boolean $$5) {
      if ($$3.o().a(this) && this.a($$1, $$2, 2)) {
         this.d($$0, $$1, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private boolean a(crg $$0, ht $$1, int $$2) {
      int $$3 = 0;
      ht.a $$4 = new ht.a();

      for (hx $$5 : hx.values()) {
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
   protected void a(dhj.a<cva, dhi> $$0) {
      $$0.a(c);
   }

   @Override
   public clj a(csd $$0, ht $$1, dhi $$2) {
      return clj.b;
   }
}
