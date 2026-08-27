import com.mojang.serialization.MapCodec;

public class dew extends cwq {
   public static final MapCodec<dew> a = b(dew::new);
   private static final dkh b = djx.aT;
   private static final int c = 20;
   private static final int d = 8;

   @Override
   public MapCodec<dew> a() {
      return a;
   }

   public dew(djg.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Integer.valueOf(0)));
   }

   @Override
   public void a(ctp $$0, djh $$1, elp $$2, cga $$3) {
      int $$4 = a((ctq)$$0, $$1, $$2, (blv)$$3);
      if ($$3.w() instanceof ane $$6) {
         $$6.a(asc.aE);
         am.M.a($$6, $$3, $$2.e(), $$4);
      }
   }

   private static int a(ctq $$0, djh $$1, elp $$2, blv $$3) {
      int $$4 = a($$2, $$2.e());
      int $$5 = $$3 instanceof cfo ? 20 : 8;
      if (!$$0.N().a($$2.a(), $$1.b())) {
         a($$0, $$1, $$4, $$2.a(), $$5);
      }

      return $$4;
   }

   private static int a(elp $$0, elt $$1) {
      ic $$2 = $$0.b();
      double $$3 = Math.abs(auo.e($$1.c) - 0.5);
      double $$4 = Math.abs(auo.e($$1.d) - 0.5);
      double $$5 = Math.abs(auo.e($$1.e) - 0.5);
      ic.a $$6 = $$2.o();
      double $$7;
      if ($$6 == ic.a.b) {
         $$7 = Math.max($$3, $$5);
      } else if ($$6 == ic.a.c) {
         $$7 = Math.max($$3, $$4);
      } else {
         $$7 = Math.max($$4, $$5);
      }

      return Math.max(1, auo.c(15.0 * auo.a((0.5 - $$7) / 0.5, 0.0, 1.0)));
   }

   private static void a(ctq $$0, djh $$1, int $$2, hx $$3, int $$4) {
      $$0.a($$3, $$1.a(b, Integer.valueOf($$2)), 3);
      $$0.a($$3, $$1.b(), $$4);
   }

   @Override
   public void a(djh $$0, and $$1, hx $$2, auv $$3) {
      if ($$0.c(b) != 0) {
         $$1.a($$2, $$0.a(b, Integer.valueOf(0)), 3);
      }
   }

   @Override
   public int a(djh $$0, csv $$1, hx $$2, ic $$3) {
      return $$0.c(b);
   }

   @Override
   public boolean f_(djh $$0) {
      return true;
   }

   @Override
   protected void a(dji.a<cwq, djh> $$0) {
      $$0.a(b);
   }

   @Override
   public void b(djh $$0, ctp $$1, hx $$2, djh $$3, boolean $$4) {
      if (!$$1.y_() && !$$0.a($$3.b())) {
         if ($$0.c(b) > 0 && !$$1.N().a($$2, this)) {
            $$1.a($$2, $$0.a(b, Integer.valueOf(0)), 18);
         }
      }
   }
}
