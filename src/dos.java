import com.mojang.serialization.MapCodec;

public class dos extends dhj {
   public static final MapCodec<dos> a = b(dos::new);
   public static final int b = 2;
   public static final dvo c = dve.aE;
   private static final int d = 24000;
   private static final int e = 12000;
   private static final int f = 300;
   private static final ezm g = dhj.a(1.0, 0.0, 2.0, 15.0, 16.0, 14.0);

   @Override
   public MapCodec<dos> a() {
      return a;
   }

   public dos(dun.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected void a(dup.a<dhj, duo> $$0) {
      $$0.a(c);
   }

   @Override
   public ezm a(duo $$0, ddl $$1, je $$2, eyx $$3) {
      return g;
   }

   public int o(duo $$0) {
      return $$0.c(c);
   }

   private boolean q(duo $$0) {
      return this.o($$0) == 2;
   }

   @Override
   public void a(duo $$0, arh $$1, je $$2, azl $$3) {
      if (!this.q($$0)) {
         $$1.a(null, $$2, awe.yE, awf.e, 0.7F, 0.9F + $$3.i() * 0.2F);
         $$1.a($$2, $$0.b(c, Integer.valueOf(this.o($$0) + 1)), 2);
      } else {
         $$1.a(null, $$2, awe.yF, awf.e, 0.7F, 0.9F + $$3.i() * 0.2F);
         $$1.b($$2, false);
         cir $$4 = btv.aR.a($$1, btu.e);
         if ($$4 != null) {
            eys $$5 = $$2.b();
            $$4.a(true);
            $$4.b($$5.a(), $$5.b(), $$5.c(), azd.g($$1.z.i() * 360.0F), 0.0F);
            $$1.b($$4);
         }
      }
   }

   @Override
   public void b(duo $$0, deg $$1, je $$2, duo $$3, boolean $$4) {
      boolean $$5 = a($$1, $$2);
      if (!$$1.w_() && $$5) {
         $$1.c(3009, $$2, 0);
      }

      int $$6 = $$5 ? 12000 : 24000;
      int $$7 = $$6 / 3;
      $$1.a(dzl.i, $$2, dzl.a.a($$0));
      $$1.a($$2, this, $$7 + $$1.z.a(300));
   }

   @Override
   public boolean a(duo $$0, ere $$1) {
      return false;
   }

   public static boolean a(ddl $$0, je $$1) {
      return $$0.a_($$1.e()).a(awt.ct);
   }
}
