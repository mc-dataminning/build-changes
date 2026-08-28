import com.mojang.serialization.MapCodec;

public class dpr extends dhj {
   public static final MapCodec<dpr> a = b(dpr::new);
   private static final dvo b = dve.aT;
   private static final int c = 20;
   private static final int d = 8;

   @Override
   public MapCodec<dpr> a() {
      return a;
   }

   public dpr(dun.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Integer.valueOf(0)));
   }

   @Override
   protected void a(deg $$0, duo $$1, eyo $$2, coo $$3) {
      int $$4 = a((deh)$$0, $$1, $$2, (bto)$$3);
      if ($$3.s() instanceof ari $$6) {
         $$6.a(awo.aE);
         an.M.a($$6, $$3, $$2.g(), $$4);
      }
   }

   private static int a(deh $$0, duo $$1, eyo $$2, bto $$3) {
      int $$4 = a($$2, $$2.g());
      int $$5 = $$3 instanceof cob ? 20 : 8;
      if (!$$0.R().a($$2.b(), $$1.b())) {
         a($$0, $$1, $$4, $$2.b(), $$5);
      }

      return $$4;
   }

   private static int a(eyo $$0, eys $$1) {
      jj $$2 = $$0.c();
      double $$3 = Math.abs(azd.e($$1.d) - 0.5);
      double $$4 = Math.abs(azd.e($$1.e) - 0.5);
      double $$5 = Math.abs(azd.e($$1.f) - 0.5);
      jj.a $$6 = $$2.o();
      double $$7;
      if ($$6 == jj.a.b) {
         $$7 = Math.max($$3, $$5);
      } else if ($$6 == jj.a.c) {
         $$7 = Math.max($$3, $$4);
      } else {
         $$7 = Math.max($$4, $$5);
      }

      return Math.max(1, azd.c(15.0 * azd.a((0.5 - $$7) / 0.5, 0.0, 1.0)));
   }

   private static void a(deh $$0, duo $$1, int $$2, je $$3, int $$4) {
      $$0.a($$3, $$1.b(b, Integer.valueOf($$2)), 3);
      $$0.a($$3, $$1.b(), $$4);
   }

   @Override
   protected void a(duo $$0, arh $$1, je $$2, azl $$3) {
      if ($$0.c(b) != 0) {
         $$1.a($$2, $$0.b(b, Integer.valueOf(0)), 3);
      }
   }

   @Override
   protected int a(duo $$0, ddl $$1, je $$2, jj $$3) {
      return $$0.c(b);
   }

   @Override
   protected boolean f_(duo $$0) {
      return true;
   }

   @Override
   protected void a(dup.a<dhj, duo> $$0) {
      $$0.a(b);
   }

   @Override
   protected void b(duo $$0, deg $$1, je $$2, duo $$3, boolean $$4) {
      if (!$$1.w_() && !$$0.a($$3.b())) {
         if ($$0.c(b) > 0 && !$$1.R().a($$2, this)) {
            $$1.a($$2, $$0.b(b, Integer.valueOf(0)), 18);
         }
      }
   }
}
