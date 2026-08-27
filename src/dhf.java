import com.mojang.serialization.MapCodec;

public class dhf extends dhy {
   public static final MapCodec<dhf> a = b(dhf::new);
   public static final int b = 3;
   public static final dsd c = drt.as;
   private static final int f = 4;
   private static final int g = 2;

   @Override
   public MapCodec<dhf> a() {
      return a;
   }

   public dhf(drc.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected void b(drd $$0, aqn $$1, io $$2, aym $$3) {
      this.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(drd $$0, aqn $$1, io $$2, aym $$3) {
      if (($$3.a(3) == 0 || this.a($$1, $$2, 4)) && $$1.A($$2) > 11 - $$0.c(c) - $$0.b($$1, $$2) && this.e($$0, $$1, $$2)) {
         io.a $$4 = new io.a();

         for (it $$5 : it.values()) {
            $$4.a($$2, $$5);
            drd $$6 = $$1.a_($$4);
            if ($$6.a(this) && !this.e($$6, $$1, $$4)) {
               $$1.a($$4, this, ayf.a($$3, 20, 40));
            }
         }
      } else {
         $$1.a($$2, this, ayf.a($$3, 20, 40));
      }
   }

   private boolean e(drd $$0, daz $$1, io $$2) {
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
   protected void a(drd $$0, daz $$1, io $$2, dea $$3, io $$4, boolean $$5) {
      if ($$3.n().a(this) && this.a($$1, $$2, 2)) {
         this.d($$0, $$1, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private boolean a(daf $$0, io $$1, int $$2) {
      int $$3 = 0;
      io.a $$4 = new io.a();

      for (it $$5 : it.values()) {
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
   protected void a(dre.a<dea, drd> $$0) {
      $$0.a(c);
   }

   @Override
   public ctq a(dbc $$0, io $$1, drd $$2) {
      return ctq.i;
   }
}
