import com.mojang.serialization.MapCodec;

public class cwl extends cvz {
   public static final MapCodec<cwl> a = b(cwl::new);
   public static final int b = 6;
   public static final djp c = djf.ay;
   public static final int d = b(0);
   protected static final float e = 1.0F;
   protected static final float f = 2.0F;
   protected static final elu[] g = new elu[]{
      cvz.a(1.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      cvz.a(3.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      cvz.a(5.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      cvz.a(7.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      cvz.a(9.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      cvz.a(11.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      cvz.a(13.0, 0.0, 1.0, 15.0, 8.0, 15.0)
   };

   @Override
   public MapCodec<cwl> a() {
      return a;
   }

   protected cwl(dio.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   public elu a(dip $$0, cse $$1, hv $$2, elg $$3) {
      return g[$$0.c(c)];
   }

   @Override
   public bjl a(dip $$0, csy $$1, hv $$2, cer $$3, bjk $$4, ekx $$5) {
      cmh $$6 = $$3.b($$4);
      cmc $$7 = $$6.d();
      if ($$6.a(arz.ai) && $$0.c(c) == 0) {
         cvz $$8 = cvz.a($$7);
         if ($$8 instanceof cwo) {
            if (!$$3.f()) {
               $$6.h(1);
            }

            $$1.a(null, $$2, arc.cT, ard.e, 1.0F, 1.0F);
            $$1.b($$2, cwp.a($$8));
            $$1.a($$3, dmz.c, $$2);
            $$3.b(arm.c.b($$7));
            return bjl.a;
         }
      }

      if ($$1.B) {
         if (a($$1, $$2, $$0, $$3).a()) {
            return bjl.a;
         }

         if ($$6.b()) {
            return bjl.b;
         }
      }

      return a($$1, $$2, $$0, $$3);
   }

   protected static bjl a(csz $$0, hv $$1, dip $$2, cer $$3) {
      if (!$$3.t(false)) {
         return bjl.d;
      } else {
         $$3.a(arm.U);
         $$3.gc().a(2, 0.1F);
         int $$4 = $$2.c(c);
         $$0.a($$3, dmz.m, $$1);
         if ($$4 < 6) {
            $$0.a($$1, $$2.a(c, Integer.valueOf($$4 + 1)), 3);
         } else {
            $$0.a($$1, false);
            $$0.a($$3, dmz.f, $$1);
         }

         return bjl.a;
      }
   }

   @Override
   public dip a(dip $$0, ia $$1, dip $$2, csz $$3, hv $$4, hv $$5) {
      return $$1 == ia.a && !$$0.a($$3, $$4) ? cwb.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dip $$0, ctb $$1, hv $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   protected void a(diq.a<cvz, dip> $$0) {
      $$0.a(c);
   }

   @Override
   public int a(dip $$0, csy $$1, hv $$2) {
      return b($$0.c(c));
   }

   public static int b(int $$0) {
      return (7 - $$0) * 2;
   }

   @Override
   public boolean d_(dip $$0) {
      return true;
   }

   @Override
   public boolean a(dip $$0, cse $$1, hv $$2, eep $$3) {
      return false;
   }
}
