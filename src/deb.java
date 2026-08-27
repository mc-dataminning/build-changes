import com.mojang.serialization.MapCodec;

public class deb extends cwi implements cwc {
   public static final MapCodec<deb> a = b(deb::new);
   private static final float d = 0.003F;
   public static final int b = 3;
   public static final djp c = djf.as;
   private static final elu e = cvz.a(3.0, 0.0, 3.0, 13.0, 8.0, 13.0);
   private static final elu f = cvz.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   @Override
   public MapCodec<deb> a() {
      return a;
   }

   public deb(dio.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   public cmh a(ctb $$0, hv $$1, dip $$2) {
      return new cmh(cmk.wi);
   }

   @Override
   public elu a(dip $$0, cse $$1, hv $$2, elg $$3) {
      if ($$0.c(c) == 0) {
         return e;
      } else {
         return $$0.c(c) < 3 ? f : super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public boolean e_(dip $$0) {
      return $$0.c(c) < 3;
   }

   @Override
   public void b(dip $$0, amp $$1, hv $$2, auf $$3) {
      int $$4 = $$0.c(c);
      if ($$4 < 3 && $$3.a(5) == 0 && $$1.b($$2.c(), 0) >= 9) {
         dip $$5 = $$0.a(c, Integer.valueOf($$4 + 1));
         $$1.a($$2, $$5, 2);
         $$1.a(dmz.c, $$2, dmz.a.a($$5));
      }
   }

   @Override
   public void a(dip $$0, csy $$1, hv $$2, blf $$3) {
      if ($$3 instanceof blv && $$3.ai() != blj.O && $$3.ai() != blj.h) {
         $$3.a($$0, new elb(0.8F, 0.75, 0.8F));
         if (!$$1.B && $$0.c(c) > 0 && ($$3.ac != $$3.dr() || $$3.ae != $$3.dx())) {
            double $$4 = Math.abs($$3.dr() - $$3.ac);
            double $$5 = Math.abs($$3.dx() - $$3.ae);
            if ($$4 >= 0.003F || $$5 >= 0.003F) {
               $$3.a($$1.ah().s(), 1.0F);
            }
         }
      }
   }

   @Override
   public bjl a(dip $$0, csy $$1, hv $$2, cer $$3, bjk $$4, ekx $$5) {
      int $$6 = $$0.c(c);
      boolean $$7 = $$6 == 3;
      if (!$$7 && $$3.b($$4).a(cmk.rv)) {
         return bjl.d;
      } else if ($$6 > 1) {
         int $$8 = 1 + $$1.z.a(2);
         a($$1, $$2, new cmh(cmk.wi, $$8 + ($$7 ? 1 : 0)));
         $$1.a(null, $$2, arc.yv, ard.e, 1.0F, 0.8F + $$1.z.i() * 0.4F);
         dip $$9 = $$0.a(c, Integer.valueOf(1));
         $$1.a($$2, $$9, 2);
         $$1.a(dmz.c, $$2, dmz.a.a($$3, $$9));
         return bjl.a($$1.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   protected void a(diq.a<cvz, dip> $$0) {
      $$0.a(c);
   }

   @Override
   public boolean b(ctb $$0, hv $$1, dip $$2) {
      return $$2.c(c) < 3;
   }

   @Override
   public boolean a(csy $$0, auf $$1, hv $$2, dip $$3) {
      return true;
   }

   @Override
   public void a(amp $$0, auf $$1, hv $$2, dip $$3) {
      int $$4 = Math.min(3, $$3.c(c) + 1);
      $$0.a($$2, $$3.a(c, Integer.valueOf($$4)), 2);
   }
}
