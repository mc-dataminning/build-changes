import com.mojang.serialization.MapCodec;

public class dil extends dje {
   public static final MapCodec<dil> a = b(dil::new);
   public static final int b = 3;
   public static final duc c = dts.as;
   private static final int f = 4;
   private static final int g = 2;

   @Override
   public MapCodec<dil> a() {
      return a;
   }

   public dil(dtb.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected void b(dtc $$0, aqt $$1, ir $$2, ayt $$3) {
      this.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dtc $$0, aqt $$1, ir $$2, ayt $$3) {
      if (($$3.a(3) == 0 || this.a($$1, $$2, 4)) && $$1.A($$2) > 11 - $$0.c(c) - $$0.b($$1, $$2) && this.e($$0, $$1, $$2)) {
         ir.a $$4 = new ir.a();

         for (iw $$5 : iw.values()) {
            $$4.a($$2, $$5);
            dtc $$6 = $$1.a_($$4);
            if ($$6.a(this) && !this.e($$6, $$1, $$4)) {
               $$1.a($$4, this, aym.a($$3, 20, 40));
            }
         }
      } else {
         $$1.a($$2, this, aym.a($$3, 20, 40));
      }
   }

   private boolean e(dtc $$0, dca $$1, ir $$2) {
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
   protected void a(dtc $$0, dca $$1, ir $$2, dfc $$3, ir $$4, boolean $$5) {
      if ($$3.n().a(this) && this.a($$1, $$2, 2)) {
         this.d($$0, $$1, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private boolean a(dbg $$0, ir $$1, int $$2) {
      int $$3 = 0;
      ir.a $$4 = new ir.a();

      for (iw $$5 : iw.values()) {
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
   protected void a(dtd.a<dfc, dtc> $$0) {
      $$0.a(c);
   }

   @Override
   public cuh a(dcd $$0, ir $$1, dtc $$2) {
      return cuh.i;
   }
}
