import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmd extends dhy implements doz {
   public static final MapCodec<dmd> a = b(dmd::new);
   public static final dvx b = dlt.aF;
   public static final dvu c = dvt.C;
   protected static final float d = 3.0F;
   protected static final fab e = dhy.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   protected static final fab f = dhy.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final fab g = dhy.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final fab h = dhy.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);

   @Override
   public MapCodec<dmd> a() {
      return a;
   }

   protected dmd(dvc.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jl.c).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected fab a(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      switch ((jl)$$0.c(b)) {
         case c:
            return h;
         case d:
            return g;
         case e:
            return f;
         case f:
         default:
            return e;
      }
   }

   private boolean a(dea $$0, jg $$1, jl $$2) {
      dvd $$3 = $$0.a_($$1);
      return $$3.c($$0, $$1, $$2);
   }

   @Override
   protected boolean a(dvd $$0, dey $$1, jg $$2) {
      jl $$3 = $$0.c(b);
      return this.a($$1, $$2.a($$3.g()), $$3);
   }

   @Override
   protected dvd a(dvd $$0, jl $$1, dvd $$2, dew $$3, jg $$4, jg $$5) {
      if ($$1.g() == $$0.c(b) && !$$0.a($$3, $$4)) {
         return dia.a.m();
      } else {
         if ($$0.c(c)) {
            $$3.a($$4, erf.c, erf.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Nullable
   @Override
   public dvd a(czm $$0) {
      if (!$$0.c()) {
         dvd $$1 = $$0.q().a_($$0.a().a($$0.k().g()));
         if ($$1.a(this) && $$1.c(b) == $$0.k()) {
            return null;
         }
      }

      dvd $$2 = this.m();
      dey $$3 = $$0.q();
      jg $$4 = $$0.a();
      ere $$5 = $$0.q().b_($$0.a());

      for (jl $$6 : $$0.f()) {
         if ($$6.o().d()) {
            $$2 = $$2.b(b, $$6.g());
            if ($$2.a($$3, $$4)) {
               return $$2.b(c, Boolean.valueOf($$5.a() == erf.c));
            }
         }
      }

      return null;
   }

   @Override
   protected dvd a(dvd $$0, dol $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dvd a(dvd $$0, dmu $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dve.a<dhy, dvd> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected ere b_(dvd $$0) {
      return $$0.c(c) ? erf.c.a(false) : super.b_($$0);
   }
}
