import com.mojang.serialization.MapCodec;

public class dca extends cut {
   public static final MapCodec<dca> a = b(dca::new);
   public static final int b = 2;
   public static final dhw c = dhm.aE;
   private static final int d = 24000;
   private static final int e = 12000;
   private static final int f = 300;
   private static final ekb g = cut.a(1.0, 0.0, 2.0, 15.0, 16.0, 14.0);

   @Override
   public MapCodec<dca> a() {
      return a;
   }

   public dca(dgv.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected void a(dgx.a<cut, dgw> $$0) {
      $$0.a(c);
   }

   @Override
   public ekb a(dgw $$0, cqy $$1, ht $$2, ejn $$3) {
      return g;
   }

   public int h(dgw $$0) {
      return $$0.c(c);
   }

   private boolean n(dgw $$0) {
      return this.h($$0) == 2;
   }

   @Override
   public void a(dgw $$0, ama $$1, ht $$2, ato $$3) {
      if (!this.n($$0)) {
         $$1.a(null, $$2, aqn.wP, aqo.e, 0.7F, 0.9F + $$3.i() * 0.2F);
         $$1.a($$2, $$0.a(c, Integer.valueOf(this.h($$0) + 1)), 2);
      } else {
         $$1.a(null, $$2, aqn.wQ, aqo.e, 0.7F, 0.9F + $$3.i() * 0.2F);
         $$1.b($$2, false);
         byv $$4 = bkm.aN.a((crs)$$1);
         if ($$4 != null) {
            eji $$5 = $$2.b();
            $$4.a(true);
            $$4.b($$5.a(), $$5.b(), $$5.c(), ati.g($$1.z.i() * 360.0F), 0.0F);
            $$1.b($$4);
         }
      }
   }

   @Override
   public void b(dgw $$0, crs $$1, ht $$2, dgw $$3, boolean $$4) {
      boolean $$5 = a($$1, $$2);
      if (!$$1.x_() && $$5) {
         $$1.c(3009, $$2, 0);
      }

      int $$6 = $$5 ? 12000 : 24000;
      int $$7 = $$6 / 3;
      $$1.a(dlg.i, $$2, dlg.a.a($$0));
      $$1.a($$2, this, $$7 + $$1.z.a(300));
   }

   @Override
   public boolean a(dgw $$0, cqy $$1, ht $$2, ecw $$3) {
      return false;
   }

   public static boolean a(cqy $$0, ht $$1) {
      return $$0.a_($$1.d()).a(arc.ck);
   }
}
