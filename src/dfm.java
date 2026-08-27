import com.mojang.serialization.MapCodec;

public class dfm extends dge {
   public static final MapCodec<dfm> a = b(dfm::new);
   public static final int b = 3;
   public static final dqi c = dpy.as;
   private static final int f = 4;
   private static final int g = 2;

   @Override
   public MapCodec<dfm> a() {
      return a;
   }

   public dfm(dph.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected void b(dpi $$0, apu $$1, id $$2, axt $$3) {
      this.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dpi $$0, apu $$1, id $$2, axt $$3) {
      if (($$3.a(3) == 0 || this.a($$1, $$2, 4)) && $$1.A($$2) > 11 - $$0.c(c) - $$0.b($$1, $$2) && this.e($$0, $$1, $$2)) {
         id.a $$4 = new id.a();

         for (ij $$5 : ij.values()) {
            $$4.a($$2, $$5);
            dpi $$6 = $$1.a_($$4);
            if ($$6.a(this) && !this.e($$6, $$1, $$4)) {
               $$1.a($$4, this, axm.a($$3, 20, 40));
            }
         }
      } else {
         $$1.a($$2, this, axm.a($$3, 20, 40));
      }
   }

   private boolean e(dpi $$0, czg $$1, id $$2) {
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
   protected void a(dpi $$0, czg $$1, id $$2, dch $$3, id $$4, boolean $$5) {
      if ($$3.n().a(this) && this.a($$1, $$2, 2)) {
         this.d($$0, $$1, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private boolean a(cym $$0, id $$1, int $$2) {
      int $$3 = 0;
      id.a $$4 = new id.a();

      for (ij $$5 : ij.values()) {
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
   protected void a(dpj.a<dch, dpi> $$0) {
      $$0.a(c);
   }

   @Override
   public crs a(czj $$0, id $$1, dpi $$2) {
      return crs.i;
   }
}
