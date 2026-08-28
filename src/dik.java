import com.mojang.serialization.MapCodec;

public class dik extends djd {
   public static final MapCodec<dik> a = b(dik::new);
   public static final int b = 3;
   public static final dth c = dsx.as;
   private static final int f = 4;
   private static final int g = 2;

   @Override
   public MapCodec<dik> a() {
      return a;
   }

   public dik(dsg.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   public void b(dsh $$0, dcd $$1, ja $$2, dsh $$3, boolean $$4) {
      $$1.a($$2, this, aye.a($$1.E_(), 60, 120));
   }

   @Override
   protected void a(dsh $$0, aqk $$1, ja $$2, aym $$3) {
      if (($$3.a(3) == 0 || this.a($$1, $$2, 4)) && $$1.A($$2) > 11 - $$0.c(c) - $$0.b($$1, $$2) && this.e($$0, $$1, $$2)) {
         ja.a $$4 = new ja.a();

         for (jf $$5 : jf.values()) {
            $$4.a($$2, $$5);
            dsh $$6 = $$1.a_($$4);
            if ($$6.a(this) && !this.e($$6, $$1, $$4)) {
               $$1.a($$4, this, aye.a($$3, 20, 40));
            }
         }
      } else {
         $$1.a($$2, this, aye.a($$3, 20, 40));
      }
   }

   private boolean e(dsh $$0, dcd $$1, ja $$2) {
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
   protected void a(dsh $$0, dcd $$1, ja $$2, dff $$3, ja $$4, boolean $$5) {
      if ($$3.o().a(this) && this.a($$1, $$2, 2)) {
         this.d($$0, $$1, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private boolean a(dbj $$0, ja $$1, int $$2) {
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
   protected void a(dsi.a<dff, dsh> $$0) {
      $$0.a(c);
   }

   @Override
   public cua a(dcg $$0, ja $$1, dsh $$2) {
      return cua.l;
   }
}
