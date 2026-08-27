import com.mojang.serialization.MapCodec;

public class dbx extends dcp {
   public static final MapCodec<dbx> a = b(dbx::new);
   public static final int b = 3;
   public static final dmj c = dlz.as;
   private static final int f = 4;
   private static final int g = 2;

   @Override
   public MapCodec<dbx> a() {
      return a;
   }

   public dbx(dli.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected void b(dlj $$0, aow $$1, hz $$2, awp $$3) {
      this.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dlj $$0, aow $$1, hz $$2, awp $$3) {
      if (($$3.a(3) == 0 || this.a($$1, $$2, 4)) && $$1.A($$2) > 11 - $$0.c(c) - $$0.b($$1, $$2) && this.e($$0, $$1, $$2)) {
         hz.a $$4 = new hz.a();

         for (ie $$5 : ie.values()) {
            $$4.a($$2, $$5);
            dlj $$6 = $$1.a_($$4);
            if ($$6.a(this) && !this.e($$6, $$1, $$4)) {
               $$1.a($$4, this, awi.a($$3, 20, 40));
            }
         }
      } else {
         $$1.a($$2, this, awi.a($$3, 20, 40));
      }
   }

   private boolean e(dlj $$0, cvr $$1, hz $$2) {
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
   protected void a(dlj $$0, cvr $$1, hz $$2, cys $$3, hz $$4, boolean $$5) {
      if ($$3.o().a(this) && this.a($$1, $$2, 2)) {
         this.d($$0, $$1, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private boolean a(cux $$0, hz $$1, int $$2) {
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
   protected void a(dlk.a<cys, dlj> $$0) {
      $$0.a(c);
   }

   @Override
   public cpd a(cvu $$0, hz $$1, dlj $$2) {
      return cpd.h;
   }
}
