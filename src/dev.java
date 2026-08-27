import com.mojang.serialization.MapCodec;

public class dev extends cwp {
   public static final MapCodec<dev> a = b(dev::new);
   private static final dkg b = djw.aT;
   private static final int c = 20;
   private static final int d = 8;

   @Override
   public MapCodec<dev> a() {
      return a;
   }

   public dev(djf.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Integer.valueOf(0)));
   }

   @Override
   public void a(cto $$0, djg $$1, elo $$2, cfz $$3) {
      int $$4 = a((ctp)$$0, $$1, $$2, (blu)$$3);
      if ($$3.w() instanceof ane $$6) {
         $$6.a(asb.aE);
         am.M.a($$6, $$3, $$2.e(), $$4);
      }
   }

   private static int a(ctp $$0, djg $$1, elo $$2, blu $$3) {
      int $$4 = a($$2, $$2.e());
      int $$5 = $$3 instanceof cfn ? 20 : 8;
      if (!$$0.N().a($$2.a(), $$1.b())) {
         a($$0, $$1, $$4, $$2.a(), $$5);
      }

      return $$4;
   }

   private static int a(elo $$0, els $$1) {
      ic $$2 = $$0.b();
      double $$3 = Math.abs(aun.e($$1.c) - 0.5);
      double $$4 = Math.abs(aun.e($$1.d) - 0.5);
      double $$5 = Math.abs(aun.e($$1.e) - 0.5);
      ic.a $$6 = $$2.o();
      double $$7;
      if ($$6 == ic.a.b) {
         $$7 = Math.max($$3, $$5);
      } else if ($$6 == ic.a.c) {
         $$7 = Math.max($$3, $$4);
      } else {
         $$7 = Math.max($$4, $$5);
      }

      return Math.max(1, aun.c(15.0 * aun.a((0.5 - $$7) / 0.5, 0.0, 1.0)));
   }

   private static void a(ctp $$0, djg $$1, int $$2, hx $$3, int $$4) {
      $$0.a($$3, $$1.a(b, Integer.valueOf($$2)), 3);
      $$0.a($$3, $$1.b(), $$4);
   }

   @Override
   public void a(djg $$0, and $$1, hx $$2, auu $$3) {
      if ($$0.c(b) != 0) {
         $$1.a($$2, $$0.a(b, Integer.valueOf(0)), 3);
      }
   }

   @Override
   public int a(djg $$0, csu $$1, hx $$2, ic $$3) {
      return $$0.c(b);
   }

   @Override
   public boolean f_(djg $$0) {
      return true;
   }

   @Override
   protected void a(djh.a<cwp, djg> $$0) {
      $$0.a(b);
   }

   @Override
   public void b(djg $$0, cto $$1, hx $$2, djg $$3, boolean $$4) {
      if (!$$1.y_() && !$$0.a($$3.b())) {
         if ($$0.c(b) > 0 && !$$1.N().a($$2, this)) {
            $$1.a($$2, $$0.a(b, Integer.valueOf(0)), 18);
         }
      }
   }
}
