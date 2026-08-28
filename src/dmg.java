import com.mojang.serialization.MapCodec;

public class dmg extends dey {
   public static final MapCodec<dmg> a = b(dmg::new);
   public static final int b = 2;
   public static final dtb c = dsr.aE;
   private static final int d = 24000;
   private static final int e = 12000;
   private static final int f = 300;
   private static final ewj g = dey.a(1.0, 0.0, 2.0, 15.0, 16.0, 14.0);

   @Override
   public MapCodec<dmg> a() {
      return a;
   }

   public dmg(dsa.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected void a(dsc.a<dey, dsb> $$0) {
      $$0.a(c);
   }

   @Override
   public ewj a(dsb $$0, dbd $$1, iz $$2, evv $$3) {
      return g;
   }

   public int m(dsb $$0) {
      return $$0.c(c);
   }

   private boolean n(dsb $$0) {
      return this.m($$0) == 2;
   }

   @Override
   public void a(dsb $$0, are $$1, iz $$2, azg $$3) {
      if (!this.n($$0)) {
         $$1.a(null, $$2, avz.yv, awa.e, 0.7F, 0.9F + $$3.i() * 0.2F);
         $$1.a($$2, $$0.a(c, Integer.valueOf(this.m($$0) + 1)), 2);
      } else {
         $$1.a(null, $$2, avz.yw, awa.e, 0.7F, 0.9F + $$3.i() * 0.2F);
         $$1.b($$2, false);
         chv $$4 = bsz.aR.a((dbx)$$1);
         if ($$4 != null) {
            evq $$5 = $$2.b();
            $$4.a(true);
            $$4.b($$5.a(), $$5.b(), $$5.c(), ayy.g($$1.z.i() * 360.0F), 0.0F);
            $$1.b($$4);
         }
      }
   }

   @Override
   public void b(dsb $$0, dbx $$1, iz $$2, dsb $$3, boolean $$4) {
      boolean $$5 = a($$1, $$2);
      if (!$$1.x_() && $$5) {
         $$1.c(3009, $$2, 0);
      }

      int $$6 = $$5 ? 12000 : 24000;
      int $$7 = $$6 / 3;
      $$1.a(dwu.i, $$2, dwu.a.a($$0));
      $$1.a($$2, this, $$7 + $$1.z.a(300));
   }

   @Override
   public boolean a(dsb $$0, eoj $$1) {
      return false;
   }

   public static boolean a(dbd $$0, iz $$1) {
      return $$0.a_($$1.d()).a(awo.cs);
   }
}
