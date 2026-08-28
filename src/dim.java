import com.mojang.serialization.MapCodec;

public class dim extends djf {
   public static final MapCodec<dim> a = b(dim::new);
   public static final int b = 3;
   public static final dtk c = dta.as;
   private static final int f = 4;
   private static final int g = 2;

   @Override
   public MapCodec<dim> a() {
      return a;
   }

   public dim(dsj.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   public void b(dsk $$0, dcf $$1, ja $$2, dsk $$3, boolean $$4) {
      $$1.a($$2, this, ayg.a($$1.E_(), 60, 120));
   }

   @Override
   protected void a(dsk $$0, aqm $$1, ja $$2, ayo $$3) {
      if (($$3.a(3) == 0 || this.a($$1, $$2, 4)) && $$1.A($$2) > 11 - $$0.c(c) - $$0.b($$1, $$2) && this.e($$0, $$1, $$2)) {
         ja.a $$4 = new ja.a();

         for (jf $$5 : jf.values()) {
            $$4.a($$2, $$5);
            dsk $$6 = $$1.a_($$4);
            if ($$6.a(this) && !this.e($$6, $$1, $$4)) {
               $$1.a($$4, this, ayg.a($$3, 20, 40));
            }
         }
      } else {
         $$1.a($$2, this, ayg.a($$3, 20, 40));
      }
   }

   private boolean e(dsk $$0, dcf $$1, ja $$2) {
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
   protected void a(dsk $$0, dcf $$1, ja $$2, dfh $$3, ja $$4, boolean $$5) {
      if ($$3.o().a(this) && this.a($$1, $$2, 2)) {
         this.d($$0, $$1, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private boolean a(dbl $$0, ja $$1, int $$2) {
      int $$3 = 0;
      ja.a $$4 = new ja.a();

      for (jf $$5 : jf.values()) {
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
   protected void a(dsl.a<dfh, dsk> $$0) {
      $$0.a(c);
   }

   @Override
   public cuc a(dci $$0, ja $$1, dsk $$2) {
      return cuc.l;
   }
}
