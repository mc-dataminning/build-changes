import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dlm extends dra implements drp {
   public static final MapCodec<dlm> a = b(dlm::new);
   public static final dyl b = dyk.D;
   protected static final float c = 6.5F;
   protected static final float d = 9.5F;
   protected static final fcr e = dkl.a(6.5, 0.0, 6.5, 9.5, 16.0, 9.5);
   protected static final fcr f = dkl.a(6.5, 6.5, 0.0, 9.5, 9.5, 16.0);
   protected static final fcr g = dkl.a(0.0, 6.5, 6.5, 16.0, 9.5, 9.5);

   @Override
   public MapCodec<dlm> a() {
      return a;
   }

   public dlm(dxt.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(false)).b(i, jm.a.b));
   }

   @Override
   protected fcr a(dxu $$0, dgm $$1, jh $$2, fcc $$3) {
      switch ((jm.a)$$0.c(i)) {
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
   public dxu a(dbf $$0) {
      etw $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == etx.c;
      return super.a($$0).b(b, Boolean.valueOf($$2));
   }

   @Override
   protected dxu a(dxu $$0, dhk $$1, dhw $$2, jh $$3, jm $$4, jh $$5, dxu $$6, bam $$7) {
      if ($$0.c(b)) {
         $$2.a($$3, etx.c, etx.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dxv.a<dkl, dxu> $$0) {
      $$0.a(b).a(i);
   }

   @Override
   protected etw b_(dxu $$0) {
      return $$0.c(b) ? etx.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dxu $$0, eul $$1) {
      return false;
   }
}
