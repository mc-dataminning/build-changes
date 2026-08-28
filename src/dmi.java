import com.mojang.serialization.MapCodec;

public class dmi extends dfa {
   public static final MapCodec<dmi> a = b(dmi::new);
   public static final int b = 2;
   public static final dtd c = dst.aE;
   private static final int d = 24000;
   private static final int e = 12000;
   private static final int f = 300;
   private static final ewl g = dfa.a(1.0, 0.0, 2.0, 15.0, 16.0, 14.0);

   @Override
   public MapCodec<dmi> a() {
      return a;
   }

   public dmi(dsc.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected void a(dse.a<dfa, dsd> $$0) {
      $$0.a(c);
   }

   @Override
   public ewl a(dsd $$0, dbf $$1, iz $$2, evx $$3) {
      return g;
   }

   public int m(dsd $$0) {
      return $$0.c(c);
   }

   private boolean n(dsd $$0) {
      return this.m($$0) == 2;
   }

   @Override
   public void a(dsd $$0, arf $$1, iz $$2, azh $$3) {
      if (!this.n($$0)) {
         $$1.a(null, $$2, awa.yv, awb.e, 0.7F, 0.9F + $$3.i() * 0.2F);
         $$1.a($$2, $$0.a(c, Integer.valueOf(this.m($$0) + 1)), 2);
      } else {
         $$1.a(null, $$2, awa.yw, awb.e, 0.7F, 0.9F + $$3.i() * 0.2F);
         $$1.b($$2, false);
         chx $$4 = btb.aR.a((dbz)$$1);
         if ($$4 != null) {
            evs $$5 = $$2.b();
            $$4.a(true);
            $$4.b($$5.a(), $$5.b(), $$5.c(), ayz.g($$1.z.i() * 360.0F), 0.0F);
            $$1.b($$4);
         }
      }
   }

   @Override
   public void b(dsd $$0, dbz $$1, iz $$2, dsd $$3, boolean $$4) {
      boolean $$5 = a($$1, $$2);
      if (!$$1.x_() && $$5) {
         $$1.c(3009, $$2, 0);
      }

      int $$6 = $$5 ? 12000 : 24000;
      int $$7 = $$6 / 3;
      $$1.a(dww.i, $$2, dww.a.a($$0));
      $$1.a($$2, this, $$7 + $$1.z.a(300));
   }

   @Override
   public boolean a(dsd $$0, eol $$1) {
      return false;
   }

   public static boolean a(dbf $$0, iz $$1) {
      return $$0.a_($$1.d()).a(awp.cs);
   }
}
