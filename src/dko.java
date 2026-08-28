import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dko extends dqe implements dqt {
   public static final MapCodec<dko> a = b(dko::new);
   public static final dxp b = dxo.J;
   protected static final float c = 6.5F;
   protected static final float d = 9.5F;
   protected static final fbv e = djn.a(6.5, 0.0, 6.5, 9.5, 16.0, 9.5);
   protected static final fbv f = djn.a(6.5, 6.5, 0.0, 9.5, 9.5, 16.0);
   protected static final fbv g = djn.a(0.0, 6.5, 6.5, 16.0, 9.5, 9.5);

   @Override
   public MapCodec<dko> a() {
      return a;
   }

   public dko(dwx.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(false)).b(i, jn.a.b));
   }

   @Override
   protected fbv a(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
      switch ((jn.a)$$0.c(i)) {
         case a:
         default:
            return g;
         case c:
            return f;
         case b:
            return e;
      }
   }

   @Nullable
   @Override
   public dwy a(dah $$0) {
      eta $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == etb.c;
      return super.a($$0).b(b, Boolean.valueOf($$2));
   }

   @Override
   protected dwy a(dwy $$0, dgm $$1, dgy $$2, ji $$3, jn $$4, ji $$5, dwy $$6, azh $$7) {
      if ($$0.c(b)) {
         $$2.a($$3, etb.c, etb.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dwz.a<djn, dwy> $$0) {
      $$0.a(b).a(i);
   }

   @Override
   protected eta b_(dwy $$0) {
      return $$0.c(b) ? etb.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dwy $$0, etp $$1) {
      return false;
   }
}
