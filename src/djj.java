import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djj extends dov implements dpk {
   public static final MapCodec<djj> a = b(djj::new);
   public static final dwf b = dwe.C;
   protected static final float c = 6.5F;
   protected static final float d = 9.5F;
   protected static final fal e = dij.a(6.5, 0.0, 6.5, 9.5, 16.0, 9.5);
   protected static final fal f = dij.a(6.5, 6.5, 0.0, 9.5, 9.5, 16.0);
   protected static final fal g = dij.a(0.0, 6.5, 6.5, 16.0, 9.5, 9.5);

   @Override
   public MapCodec<djj> a() {
      return a;
   }

   public djj(dvn.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(false)).b(i, jm.a.b));
   }

   @Override
   protected fal a(dvo $$0, dek $$1, jh $$2, ezw $$3) {
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
   public dvo a(czw $$0) {
      ero $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == erp.c;
      return super.a($$0).b(b, Boolean.valueOf($$2));
   }

   @Override
   protected dvo a(dvo $$0, dfi $$1, dfu $$2, jh $$3, jm $$4, jh $$5, dvo $$6, azv $$7) {
      if ($$0.c(b)) {
         $$2.a($$3, erp.c, erp.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dvp.a<dij, dvo> $$0) {
      $$0.a(b).a(i);
   }

   @Override
   protected ero b_(dvo $$0) {
      return $$0.c(b) ? erp.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dvo $$0, esd $$1) {
      return false;
   }
}
