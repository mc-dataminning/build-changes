import com.mojang.serialization.MapCodec;

public class did extends diw {
   public static final MapCodec<did> a = b(did::new);
   public static final int b = 3;
   public static final dtb c = dsr.as;
   private static final int f = 4;
   private static final int g = 2;

   @Override
   public MapCodec<did> a() {
      return a;
   }

   public did(dsa.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected void b(dsb $$0, are $$1, iz $$2, azg $$3) {
      this.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dsb $$0, are $$1, iz $$2, azg $$3) {
      if (($$3.a(3) == 0 || this.a($$1, $$2, 4)) && $$1.A($$2) > 11 - $$0.c(c) - $$0.b($$1, $$2) && this.e($$0, $$1, $$2)) {
         iz.a $$4 = new iz.a();

         for (je $$5 : je.values()) {
            $$4.a($$2, $$5);
            dsb $$6 = $$1.a_($$4);
            if ($$6.a(this) && !this.e($$6, $$1, $$4)) {
               $$1.a($$4, this, ayy.a($$3, 20, 40));
            }
         }
      } else {
         $$1.a($$2, this, ayy.a($$3, 20, 40));
      }
   }

   private boolean e(dsb $$0, dbx $$1, iz $$2) {
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
   protected void a(dsb $$0, dbx $$1, iz $$2, dey $$3, iz $$4, boolean $$5) {
      if ($$3.o().a(this) && this.a($$1, $$2, 2)) {
         this.d($$0, $$1, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private boolean a(dbd $$0, iz $$1, int $$2) {
      int $$3 = 0;
      iz.a $$4 = new iz.a();

      for (je $$5 : je.values()) {
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
   protected void a(dsc.a<dey, dsb> $$0) {
      $$0.a(c);
   }

   @Override
   public cuo a(dca $$0, iz $$1, dsb $$2) {
      return cuo.l;
   }
}
