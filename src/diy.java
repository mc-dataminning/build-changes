import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class diy extends dok implements doz {
   public static final MapCodec<diy> a = b(diy::new);
   public static final dvu b = dvt.C;
   protected static final float c = 6.5F;
   protected static final float d = 9.5F;
   protected static final fab e = dhy.a(6.5, 0.0, 6.5, 9.5, 16.0, 9.5);
   protected static final fab f = dhy.a(6.5, 6.5, 0.0, 9.5, 9.5, 16.0);
   protected static final fab g = dhy.a(0.0, 6.5, 6.5, 16.0, 9.5, 9.5);

   @Override
   public MapCodec<diy> a() {
      return a;
   }

   public diy(dvc.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(false)).b(i, jl.a.b));
   }

   @Override
   protected fab a(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      switch ((jl.a)$$0.c(i)) {
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
   public dvd a(czm $$0) {
      ere $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == erf.c;
      return super.a($$0).b(b, Boolean.valueOf($$2));
   }

   @Override
   protected dvd a(dvd $$0, jl $$1, dvd $$2, dew $$3, jg $$4, jg $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, erf.c, erf.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dve.a<dhy, dvd> $$0) {
      $$0.a(b).a(i);
   }

   @Override
   protected ere b_(dvd $$0) {
      return $$0.c(b) ? erf.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dvd $$0, ert $$1) {
      return false;
   }
}
