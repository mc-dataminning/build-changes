import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dkm extends dqc implements dqr {
   public static final MapCodec<dkm> a = b(dkm::new);
   public static final dxn b = dxm.J;
   protected static final float c = 6.5F;
   protected static final float d = 9.5F;
   protected static final fbt e = djl.a(6.5, 0.0, 6.5, 9.5, 16.0, 9.5);
   protected static final fbt f = djl.a(6.5, 6.5, 0.0, 9.5, 9.5, 16.0);
   protected static final fbt g = djl.a(0.0, 6.5, 6.5, 16.0, 9.5, 9.5);

   @Override
   public MapCodec<dkm> a() {
      return a;
   }

   public dkm(dwv.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(false)).b(i, jn.a.b));
   }

   @Override
   protected fbt a(dww $$0, dfm $$1, ji $$2, fbe $$3) {
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
   public dww a(daf $$0) {
      esy $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == esz.c;
      return super.a($$0).b(b, Boolean.valueOf($$2));
   }

   @Override
   protected dww a(dww $$0, dgk $$1, dgw $$2, ji $$3, jn $$4, ji $$5, dww $$6, azh $$7) {
      if ($$0.c(b)) {
         $$2.a($$3, esz.c, esz.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dwx.a<djl, dww> $$0) {
      $$0.a(b).a(i);
   }

   @Override
   protected esy b_(dww $$0) {
      return $$0.c(b) ? esz.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dww $$0, etn $$1) {
      return false;
   }
}
