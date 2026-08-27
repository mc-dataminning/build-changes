import com.mojang.serialization.MapCodec;

public class dcf extends cua {
   public static final MapCodec<dcf> a = b(dcf::new);
   private static final dhb b = dgr.aT;
   private static final int c = 20;
   private static final int d = 8;

   @Override
   public MapCodec<dcf> a() {
      return a;
   }

   public dcf(dga.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Integer.valueOf(0)));
   }

   @Override
   public void a(cqz $$0, dgb $$1, eib $$2, cdp $$3) {
      int $$4 = a((cra)$$0, $$1, $$2, (bjt)$$3);
      if ($$3.v() instanceof alr $$6) {
         $$6.a(aqn.aE);
         al.L.a($$6, $$3, $$2.e(), $$4);
      }
   }

   private static int a(cra $$0, dgb $$1, eib $$2, bjt $$3) {
      int $$4 = a($$2, $$2.e());
      int $$5 = $$3 instanceof cdd ? 20 : 8;
      if (!$$0.L().a($$2.a(), $$1.b())) {
         a($$0, $$1, $$4, $$2.a(), $$5);
      }

      return $$4;
   }

   private static int a(eib $$0, eif $$1) {
      hx $$2 = $$0.b();
      double $$3 = Math.abs(asy.e($$1.c) - 0.5);
      double $$4 = Math.abs(asy.e($$1.d) - 0.5);
      double $$5 = Math.abs(asy.e($$1.e) - 0.5);
      hx.a $$6 = $$2.o();
      double $$7;
      if ($$6 == hx.a.b) {
         $$7 = Math.max($$3, $$5);
      } else if ($$6 == hx.a.c) {
         $$7 = Math.max($$3, $$4);
      } else {
         $$7 = Math.max($$4, $$5);
      }

      return Math.max(1, asy.c(15.0 * asy.a((0.5 - $$7) / 0.5, 0.0, 1.0)));
   }

   private static void a(cra $$0, dgb $$1, int $$2, ht $$3, int $$4) {
      $$0.a($$3, $$1.a(b, Integer.valueOf($$2)), 3);
      $$0.a($$3, $$1.b(), $$4);
   }

   @Override
   public void a(dgb $$0, alq $$1, ht $$2, ate $$3) {
      if ($$0.c(b) != 0) {
         $$1.a($$2, $$0.a(b, Integer.valueOf(0)), 3);
      }
   }

   @Override
   public int a(dgb $$0, cqf $$1, ht $$2, hx $$3) {
      return $$0.c(b);
   }

   @Override
   public boolean f_(dgb $$0) {
      return true;
   }

   @Override
   protected void a(dgc.a<cua, dgb> $$0) {
      $$0.a(b);
   }

   @Override
   public void b(dgb $$0, cqz $$1, ht $$2, dgb $$3, boolean $$4) {
      if (!$$1.x_() && !$$0.a($$3.b())) {
         if ($$0.c(b) > 0 && !$$1.L().a($$2, this)) {
            $$1.a($$2, $$0.a(b, Integer.valueOf(0)), 18);
         }
      }
   }
}
