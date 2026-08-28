import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class drb extends djn {
   public static final MapCodec<drb> a = b(drb::new);
   public static final int b = 8;
   public static final dxx c = dxo.aI;
   protected static final fbv[] d = new fbv[]{
      fbs.a(),
      djn.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      djn.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      djn.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      djn.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      djn.a(0.0, 0.0, 0.0, 16.0, 10.0, 16.0),
      djn.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0),
      djn.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0),
      djn.a(0.0, 0.0, 0.0, 16.0, 16.0, 16.0)
   };
   public static final int e = 5;

   @Override
   public MapCodec<drb> a() {
      return a;
   }

   protected drb(dwx.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Integer.valueOf(1)));
   }

   @Override
   protected boolean a(dwy $$0, etp $$1) {
      switch ($$1) {
         case a:
            return $$0.c(c) < 5;
         case b:
            return false;
         case c:
            return false;
         default:
            return false;
      }
   }

   @Override
   protected fbv a(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
      return d[$$0.c(c)];
   }

   @Override
   protected fbv b(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
      return d[$$0.c(c) - 1];
   }

   @Override
   protected fbv b_(dwy $$0, dfo $$1, ji $$2) {
      return d[$$0.c(c)];
   }

   @Override
   protected fbv c(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
      return d[$$0.c(c)];
   }

   @Override
   protected boolean g_(dwy $$0) {
      return true;
   }

   @Override
   protected float c(dwy $$0, dfo $$1, ji $$2) {
      return $$0.c(c) == 8 ? 0.2F : 1.0F;
   }

   @Override
   protected boolean a(dwy $$0, dgm $$1, ji $$2) {
      dwy $$3 = $$1.a_($$2.e());
      if ($$3.a(awp.cr)) {
         return false;
      } else {
         return $$3.a(awp.cs) ? true : djn.a($$3.g($$1, $$2.e()), jn.b) || $$3.a(this) && $$3.c(c) == 8;
      }
   }

   @Override
   protected dwy a(dwy $$0, dgm $$1, dgy $$2, ji $$3, jn $$4, ji $$5, dwy $$6, azh $$7) {
      return !$$0.a($$1, $$3) ? djp.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void b(dwy $$0, ard $$1, ji $$2, azh $$3) {
      if ($$1.a(dgs.b, $$2) > 11) {
         c($$0, $$1, $$2);
         $$1.a($$2, false);
      }
   }

   @Override
   protected boolean a(dwy $$0, dah $$1) {
      int $$2 = $$0.c(c);
      if (!$$1.n().a(this.j()) || $$2 >= 8) {
         return $$2 == 1;
      } else {
         return $$1.c() ? $$1.k() == jn.b : true;
      }
   }

   @Nullable
   @Override
   public dwy a(dah $$0) {
      dwy $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         int $$2 = $$1.c(c);
         return $$1.b(c, Integer.valueOf(Math.min(8, $$2 + 1)));
      } else {
         return super.a($$0);
      }
   }

   @Override
   protected void a(dwz.a<djn, dwy> $$0) {
      $$0.a(c);
   }
}
