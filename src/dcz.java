import com.mojang.serialization.MapCodec;

public class dcz extends cut {
   public static final MapCodec<dcz> a = b(dcz::new);
   private static final dhw b = dhm.aT;
   private static final int c = 20;
   private static final int d = 8;

   @Override
   public MapCodec<dcz> a() {
      return a;
   }

   public dcz(dgv.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Integer.valueOf(0)));
   }

   @Override
   public void a(crs $$0, dgw $$1, eje $$2, cee $$3) {
      int $$4 = a((crt)$$0, $$1, $$2, (bki)$$3);
      if ($$3.v() instanceof amb $$6) {
         $$6.a(aqx.aE);
         al.L.a($$6, $$3, $$2.e(), $$4);
      }
   }

   private static int a(crt $$0, dgw $$1, eje $$2, bki $$3) {
      int $$4 = a($$2, $$2.e());
      int $$5 = $$3 instanceof cds ? 20 : 8;
      if (!$$0.L().a($$2.a(), $$1.b())) {
         a($$0, $$1, $$4, $$2.a(), $$5);
      }

      return $$4;
   }

   private static int a(eje $$0, eji $$1) {
      hx $$2 = $$0.b();
      double $$3 = Math.abs(ati.e($$1.c) - 0.5);
      double $$4 = Math.abs(ati.e($$1.d) - 0.5);
      double $$5 = Math.abs(ati.e($$1.e) - 0.5);
      hx.a $$6 = $$2.o();
      double $$7;
      if ($$6 == hx.a.b) {
         $$7 = Math.max($$3, $$5);
      } else if ($$6 == hx.a.c) {
         $$7 = Math.max($$3, $$4);
      } else {
         $$7 = Math.max($$4, $$5);
      }

      return Math.max(1, ati.c(15.0 * ati.a((0.5 - $$7) / 0.5, 0.0, 1.0)));
   }

   private static void a(crt $$0, dgw $$1, int $$2, ht $$3, int $$4) {
      $$0.a($$3, $$1.a(b, Integer.valueOf($$2)), 3);
      $$0.a($$3, $$1.b(), $$4);
   }

   @Override
   public void a(dgw $$0, ama $$1, ht $$2, ato $$3) {
      if ($$0.c(b) != 0) {
         $$1.a($$2, $$0.a(b, Integer.valueOf(0)), 3);
      }
   }

   @Override
   public int a(dgw $$0, cqy $$1, ht $$2, hx $$3) {
      return $$0.c(b);
   }

   @Override
   public boolean f_(dgw $$0) {
      return true;
   }

   @Override
   protected void a(dgx.a<cut, dgw> $$0) {
      $$0.a(b);
   }

   @Override
   public void b(dgw $$0, crs $$1, ht $$2, dgw $$3, boolean $$4) {
      if (!$$1.x_() && !$$0.a($$3.b())) {
         if ($$0.c(b) > 0 && !$$1.L().a($$2, this)) {
            $$1.a($$2, $$0.a(b, Integer.valueOf(0)), 18);
         }
      }
   }
}
