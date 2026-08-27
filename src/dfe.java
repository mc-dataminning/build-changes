import com.mojang.serialization.MapCodec;

public class dfe extends cwy {
   public static final MapCodec<dfe> a = b(dfe::new);
   private static final dkp b = dkf.aT;
   private static final int c = 20;
   private static final int d = 8;

   @Override
   public MapCodec<dfe> a() {
      return a;
   }

   public dfe(djo.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Integer.valueOf(0)));
   }

   @Override
   public void a(ctx $$0, djp $$1, ely $$2, cgi $$3) {
      int $$4 = a((cty)$$0, $$1, $$2, (blw)$$3);
      if ($$3.w() instanceof anf $$6) {
         $$6.a(asd.aE);
         am.M.a($$6, $$3, $$2.e(), $$4);
      }
   }

   private static int a(cty $$0, djp $$1, ely $$2, blw $$3) {
      int $$4 = a($$2, $$2.e());
      int $$5 = $$3 instanceof cfw ? 20 : 8;
      if (!$$0.N().a($$2.a(), $$1.b())) {
         a($$0, $$1, $$4, $$2.a(), $$5);
      }

      return $$4;
   }

   private static int a(ely $$0, emc $$1) {
      ic $$2 = $$0.b();
      double $$3 = Math.abs(aup.e($$1.c) - 0.5);
      double $$4 = Math.abs(aup.e($$1.d) - 0.5);
      double $$5 = Math.abs(aup.e($$1.e) - 0.5);
      ic.a $$6 = $$2.o();
      double $$7;
      if ($$6 == ic.a.b) {
         $$7 = Math.max($$3, $$5);
      } else if ($$6 == ic.a.c) {
         $$7 = Math.max($$3, $$4);
      } else {
         $$7 = Math.max($$4, $$5);
      }

      return Math.max(1, aup.c(15.0 * aup.a((0.5 - $$7) / 0.5, 0.0, 1.0)));
   }

   private static void a(cty $$0, djp $$1, int $$2, hx $$3, int $$4) {
      $$0.a($$3, $$1.a(b, Integer.valueOf($$2)), 3);
      $$0.a($$3, $$1.b(), $$4);
   }

   @Override
   public void a(djp $$0, ane $$1, hx $$2, auw $$3) {
      if ($$0.c(b) != 0) {
         $$1.a($$2, $$0.a(b, Integer.valueOf(0)), 3);
      }
   }

   @Override
   public int a(djp $$0, ctd $$1, hx $$2, ic $$3) {
      return $$0.c(b);
   }

   @Override
   public boolean f_(djp $$0) {
      return true;
   }

   @Override
   protected void a(djq.a<cwy, djp> $$0) {
      $$0.a(b);
   }

   @Override
   public void b(djp $$0, ctx $$1, hx $$2, djp $$3, boolean $$4) {
      if (!$$1.y_() && !$$0.a($$3.b())) {
         if ($$0.c(b) > 0 && !$$1.N().a($$2, this)) {
            $$1.a($$2, $$0.a(b, Integer.valueOf(0)), 18);
         }
      }
   }
}
