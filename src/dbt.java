import com.mojang.serialization.MapCodec;

public class dbt extends dcl {
   public static final MapCodec<dbt> a = b(dbt::new);
   public static final int b = 3;
   public static final dmf c = dlv.as;
   private static final int f = 4;
   private static final int g = 2;

   @Override
   public MapCodec<dbt> a() {
      return a;
   }

   public dbt(dle.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected void b(dlf $$0, aov $$1, hz $$2, awo $$3) {
      this.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dlf $$0, aov $$1, hz $$2, awo $$3) {
      if (($$3.a(3) == 0 || this.a($$1, $$2, 4)) && $$1.A($$2) > 11 - $$0.c(c) - $$0.b($$1, $$2) && this.e($$0, $$1, $$2)) {
         hz.a $$4 = new hz.a();

         for (ie $$5 : ie.values()) {
            $$4.a($$2, $$5);
            dlf $$6 = $$1.a_($$4);
            if ($$6.a(this) && !this.e($$6, $$1, $$4)) {
               $$1.a($$4, this, awh.a($$3, 20, 40));
            }
         }
      } else {
         $$1.a($$2, this, awh.a($$3, 20, 40));
      }
   }

   private boolean e(dlf $$0, cvn $$1, hz $$2) {
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
   protected void a(dlf $$0, cvn $$1, hz $$2, cyo $$3, hz $$4, boolean $$5) {
      if ($$3.o().a(this) && this.a($$1, $$2, 2)) {
         this.d($$0, $$1, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private boolean a(cut $$0, hz $$1, int $$2) {
      int $$3 = 0;
      hz.a $$4 = new hz.a();

      for (ie $$5 : ie.values()) {
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
   protected void a(dlg.a<cyo, dlf> $$0) {
      $$0.a(c);
   }

   @Override
   public coz a(cvq $$0, hz $$1, dlf $$2) {
      return coz.h;
   }
}
