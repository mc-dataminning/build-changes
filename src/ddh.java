import com.mojang.serialization.MapCodec;

public class ddh extends ddz {
   public static final MapCodec<ddh> a = b(ddh::new);
   public static final int b = 3;
   public static final dob c = dnr.as;
   private static final int f = 4;
   private static final int g = 2;

   @Override
   public MapCodec<ddh> a() {
      return a;
   }

   public ddh(dna.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected void b(dnb $$0, apf $$1, ib $$2, axd $$3) {
      this.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dnb $$0, apf $$1, ib $$2, axd $$3) {
      if (($$3.a(3) == 0 || this.a($$1, $$2, 4)) && $$1.A($$2) > 11 - $$0.c(c) - $$0.b($$1, $$2) && this.e($$0, $$1, $$2)) {
         ib.a $$4 = new ib.a();

         for (ih $$5 : ih.values()) {
            $$4.a($$2, $$5);
            dnb $$6 = $$1.a_($$4);
            if ($$6.a(this) && !this.e($$6, $$1, $$4)) {
               $$1.a($$4, this, aww.a($$3, 20, 40));
            }
         }
      } else {
         $$1.a($$2, this, aww.a($$3, 20, 40));
      }
   }

   private boolean e(dnb $$0, cxb $$1, ib $$2) {
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
   protected void a(dnb $$0, cxb $$1, ib $$2, dac $$3, ib $$4, boolean $$5) {
      if ($$3.o().a(this) && this.a($$1, $$2, 2)) {
         this.d($$0, $$1, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private boolean a(cwh $$0, ib $$1, int $$2) {
      int $$3 = 0;
      ib.a $$4 = new ib.a();

      for (ih $$5 : ih.values()) {
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
   protected void a(dnc.a<dac, dnb> $$0) {
      $$0.a(c);
   }

   @Override
   public cqm a(cxe $$0, ib $$1, dnb $$2) {
      return cqm.h;
   }
}
