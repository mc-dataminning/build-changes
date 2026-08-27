import com.mojang.serialization.MapCodec;

public class dep extends cwj {
   public static final MapCodec<dep> a = b(dep::new);
   private static final dka b = djq.aT;
   private static final int c = 20;
   private static final int d = 8;

   @Override
   public MapCodec<dep> a() {
      return a;
   }

   public dep(diz.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Integer.valueOf(0)));
   }

   @Override
   public void a(cti $$0, dja $$1, eli $$2, cft $$3) {
      int $$4 = a((ctj)$$0, $$1, $$2, (blp)$$3);
      if ($$3.w() instanceof ana $$6) {
         $$6.a(arw.aE);
         am.M.a($$6, $$3, $$2.e(), $$4);
      }
   }

   private static int a(ctj $$0, dja $$1, eli $$2, blp $$3) {
      int $$4 = a($$2, $$2.e());
      int $$5 = $$3 instanceof cfh ? 20 : 8;
      if (!$$0.N().a($$2.a(), $$1.b())) {
         a($$0, $$1, $$4, $$2.a(), $$5);
      }

      return $$4;
   }

   private static int a(eli $$0, elm $$1) {
      ic $$2 = $$0.b();
      double $$3 = Math.abs(aui.e($$1.c) - 0.5);
      double $$4 = Math.abs(aui.e($$1.d) - 0.5);
      double $$5 = Math.abs(aui.e($$1.e) - 0.5);
      ic.a $$6 = $$2.o();
      double $$7;
      if ($$6 == ic.a.b) {
         $$7 = Math.max($$3, $$5);
      } else if ($$6 == ic.a.c) {
         $$7 = Math.max($$3, $$4);
      } else {
         $$7 = Math.max($$4, $$5);
      }

      return Math.max(1, aui.c(15.0 * aui.a((0.5 - $$7) / 0.5, 0.0, 1.0)));
   }

   private static void a(ctj $$0, dja $$1, int $$2, hx $$3, int $$4) {
      $$0.a($$3, $$1.a(b, Integer.valueOf($$2)), 3);
      $$0.a($$3, $$1.b(), $$4);
   }

   @Override
   public void a(dja $$0, amz $$1, hx $$2, aup $$3) {
      if ($$0.c(b) != 0) {
         $$1.a($$2, $$0.a(b, Integer.valueOf(0)), 3);
      }
   }

   @Override
   public int a(dja $$0, cso $$1, hx $$2, ic $$3) {
      return $$0.c(b);
   }

   @Override
   public boolean f_(dja $$0) {
      return true;
   }

   @Override
   protected void a(djb.a<cwj, dja> $$0) {
      $$0.a(b);
   }

   @Override
   public void b(dja $$0, cti $$1, hx $$2, dja $$3, boolean $$4) {
      if (!$$1.y_() && !$$0.a($$3.b())) {
         if ($$0.c(b) > 0 && !$$1.N().a($$2, this)) {
            $$1.a($$2, $$0.a(b, Integer.valueOf(0)), 18);
         }
      }
   }
}
