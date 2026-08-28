import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djv extends dez implements dma {
   public static final MapCodec<djv> a = b(djv::new);
   public static final dst b = dss.C;

   @Override
   public MapCodec<djv> a() {
      return a;
   }

   protected djv(dsb.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)));
   }

   @Override
   protected boolean a(dsc $$0, dsc $$1, je $$2) {
      return $$1.a(dfb.ac) && $$2.o() == je.a.b;
   }

   @Nullable
   @Override
   public dsc a(cya $$0) {
      env $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == enw.c;
      return super.a($$0).a(b, Boolean.valueOf($$2));
   }

   @Override
   protected dsc a(dsc $$0, je $$1, dsc $$2, dbz $$3, iz $$4, iz $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, enw.c, enw.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected env b_(dsc $$0) {
      return $$0.c(b) ? enw.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(dsd.a<dez, dsc> $$0) {
      $$0.a(b);
   }
}
