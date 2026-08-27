import com.mojang.serialization.MapCodec;

public class cwf extends cwy {
   public static final MapCodec<cwf> a = b(cwf::new);
   public static final int b = 3;
   public static final dgd c = dft.as;
   private static final int f = 4;
   private static final int g = 2;

   @Override
   public MapCodec<cwf> a() {
      return a;
   }

   public cwf(dfc.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   public void b(dfd $$0, akt $$1, gw $$2, ash $$3) {
      this.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dfd $$0, akt $$1, gw $$2, ash $$3) {
      if (($$3.a(3) == 0 || this.a($$1, $$2, 4)) && $$1.z($$2) > 11 - $$0.c(c) - $$0.b($$1, $$2) && this.e($$0, $$1, $$2)) {
         gw.a $$4 = new gw.a();

         for (ha $$5 : ha.values()) {
            $$4.a($$2, $$5);
            dfd $$6 = $$1.a_($$4);
            if ($$6.a(this) && !this.e($$6, $$1, $$4)) {
               $$1.a($$4, this, asb.a($$3, 20, 40));
            }
         }
      } else {
         $$1.a($$2, this, asb.a($$3, 20, 40));
      }
   }

   private boolean e(dfd $$0, cqb $$1, gw $$2) {
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
   public void a(dfd $$0, cqb $$1, gw $$2, ctc $$3, gw $$4, boolean $$5) {
      if ($$3.o().a(this) && this.a($$1, $$2, 2)) {
         this.d($$0, $$1, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private boolean a(cph $$0, gw $$1, int $$2) {
      int $$3 = 0;
      gw.a $$4 = new gw.a();

      for (ha $$5 : ha.values()) {
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
   protected void a(dfe.a<ctc, dfd> $$0) {
      $$0.a(c);
   }

   @Override
   public cjl a(cqe $$0, gw $$1, dfd $$2) {
      return cjl.b;
   }
}
