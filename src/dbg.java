import com.mojang.serialization.MapCodec;

public class dbg extends cua {
   public static final MapCodec<dbg> a = b(dbg::new);
   public static final int b = 2;
   public static final dhb c = dgr.aE;
   private static final int d = 24000;
   private static final int e = 12000;
   private static final int f = 300;
   private static final eiy g = cua.a(1.0, 0.0, 2.0, 15.0, 16.0, 14.0);

   @Override
   public MapCodec<dbg> a() {
      return a;
   }

   public dbg(dga.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected void a(dgc.a<cua, dgb> $$0) {
      $$0.a(c);
   }

   @Override
   public eiy a(dgb $$0, cqf $$1, ht $$2, eik $$3) {
      return g;
   }

   public int h(dgb $$0) {
      return $$0.c(c);
   }

   private boolean n(dgb $$0) {
      return this.h($$0) == 2;
   }

   @Override
   public void a(dgb $$0, alq $$1, ht $$2, ate $$3) {
      if (!this.n($$0)) {
         $$1.a(null, $$2, aqd.wN, aqe.e, 0.7F, 0.9F + $$3.i() * 0.2F);
         $$1.a($$2, $$0.a(c, Integer.valueOf(this.h($$0) + 1)), 2);
      } else {
         $$1.a(null, $$2, aqd.wO, aqe.e, 0.7F, 0.9F + $$3.i() * 0.2F);
         $$1.b($$2, false);
         byg $$4 = bjx.aN.a((cqz)$$1);
         if ($$4 != null) {
            eif $$5 = $$2.b();
            $$4.a(true);
            $$4.b($$5.a(), $$5.b(), $$5.c(), asy.g($$1.z.i() * 360.0F), 0.0F);
            $$1.b($$4);
         }
      }
   }

   @Override
   public void b(dgb $$0, cqz $$1, ht $$2, dgb $$3, boolean $$4) {
      boolean $$5 = a($$1, $$2);
      if (!$$1.x_() && $$5) {
         $$1.c(3009, $$2, 0);
      }

      int $$6 = $$5 ? 12000 : 24000;
      int $$7 = $$6 / 3;
      $$1.a(dkl.i, $$2, dkl.a.a($$0));
      $$1.a($$2, this, $$7 + $$1.z.a(300));
   }

   @Override
   public boolean a(dgb $$0, cqf $$1, ht $$2, ebu $$3) {
      return false;
   }

   public static boolean a(cqf $$0, ht $$1) {
      return $$0.a_($$1.d()).a(aqs.ck);
   }
}
