import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dng extends djn implements dqt {
   public static final MapCodec<dng> a = b(dng::new);
   private static final dxp c = dxo.J;
   protected static final fbv b = djn.a(2.0, 10.0, 2.0, 14.0, 16.0, 14.0);

   @Override
   public MapCodec<dng> a() {
      return a;
   }

   protected dng(dwx.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dwz.a<djn, dwy> $$0) {
      $$0.a(c);
   }

   @Override
   protected eta b_(dwy $$0) {
      return $$0.c(c) ? etb.c.a(false) : super.b_($$0);
   }

   @Nullable
   @Override
   public dwy a(dah $$0) {
      dwy $$1 = super.a($$0);
      if ($$1 != null) {
         eta $$2 = $$0.q().b_($$0.a());
         return $$1.b(c, Boolean.valueOf($$2.a() == etb.c));
      } else {
         return null;
      }
   }

   @Override
   protected boolean a(dwy $$0, dgm $$1, ji $$2) {
      ji $$3 = $$2.d();
      dwy $$4 = $$1.a_($$3);
      return $$4.c($$1, $$3, jn.a);
   }

   @Override
   protected fbv a(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
      return b;
   }

   @Override
   protected dwy a(dwy $$0, dgm $$1, dgy $$2, ji $$3, jn $$4, ji $$5, dwy $$6, azh $$7) {
      if ($$4 == jn.b && !this.a($$0, $$1, $$3)) {
         return djp.a.m();
      } else {
         if ($$0.c(c)) {
            $$2.a($$3, etb.c, etb.c.a($$1));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }
}
