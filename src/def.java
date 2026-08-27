import com.mojang.serialization.MapCodec;

public class def extends cvz {
   public static final MapCodec<def> a = b(def::new);
   private static final djp b = djf.aT;
   private static final int c = 20;
   private static final int d = 8;

   @Override
   public MapCodec<def> a() {
      return a;
   }

   public def(dio.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Integer.valueOf(0)));
   }

   @Override
   public void a(csy $$0, dip $$1, ekx $$2, cfj $$3) {
      int $$4 = a((csz)$$0, $$1, $$2, (blf)$$3);
      if ($$3.w() instanceof amq $$6) {
         $$6.a(arm.aE);
         am.M.a($$6, $$3, $$2.e(), $$4);
      }
   }

   private static int a(csz $$0, dip $$1, ekx $$2, blf $$3) {
      int $$4 = a($$2, $$2.e());
      int $$5 = $$3 instanceof cex ? 20 : 8;
      if (!$$0.M().a($$2.a(), $$1.b())) {
         a($$0, $$1, $$4, $$2.a(), $$5);
      }

      return $$4;
   }

   private static int a(ekx $$0, elb $$1) {
      ia $$2 = $$0.b();
      double $$3 = Math.abs(aty.e($$1.c) - 0.5);
      double $$4 = Math.abs(aty.e($$1.d) - 0.5);
      double $$5 = Math.abs(aty.e($$1.e) - 0.5);
      ia.a $$6 = $$2.o();
      double $$7;
      if ($$6 == ia.a.b) {
         $$7 = Math.max($$3, $$5);
      } else if ($$6 == ia.a.c) {
         $$7 = Math.max($$3, $$4);
      } else {
         $$7 = Math.max($$4, $$5);
      }

      return Math.max(1, aty.c(15.0 * aty.a((0.5 - $$7) / 0.5, 0.0, 1.0)));
   }

   private static void a(csz $$0, dip $$1, int $$2, hv $$3, int $$4) {
      $$0.a($$3, $$1.a(b, Integer.valueOf($$2)), 3);
      $$0.a($$3, $$1.b(), $$4);
   }

   @Override
   public void a(dip $$0, amp $$1, hv $$2, auf $$3) {
      if ($$0.c(b) != 0) {
         $$1.a($$2, $$0.a(b, Integer.valueOf(0)), 3);
      }
   }

   @Override
   public int a(dip $$0, cse $$1, hv $$2, ia $$3) {
      return $$0.c(b);
   }

   @Override
   public boolean f_(dip $$0) {
      return true;
   }

   @Override
   protected void a(diq.a<cvz, dip> $$0) {
      $$0.a(b);
   }

   @Override
   public void b(dip $$0, csy $$1, hv $$2, dip $$3, boolean $$4) {
      if (!$$1.y_() && !$$0.a($$3.b())) {
         if ($$0.c(b) > 0 && !$$1.M().a($$2, this)) {
            $$1.a($$2, $$0.a(b, Integer.valueOf(0)), 18);
         }
      }
   }
}
