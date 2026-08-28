import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dod extends dnl implements dma {
   public static final MapCodec<dod> a = b(dod::new);
   public static final dst c = dss.C;

   @Override
   protected MapCodec<? extends dod> a() {
      return a;
   }

   protected dod(dsb.d $$0) {
      super($$0);
      this.k(this.o().a(c, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dsc a(cya $$0) {
      env $$1 = $$0.q().b_($$0.a());
      return super.a($$0).a(c, Boolean.valueOf($$1.b(enw.c)));
   }

   @Override
   protected dsc a(dsc $$0, je $$1, dsc $$2, dbz $$3, iz $$4, iz $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, enw.c, enw.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected env b_(dsc $$0) {
      return $$0.c(c) ? enw.c.a(true) : super.b_($$0);
   }

   @Override
   protected void a(dsd.a<dez, dsc> $$0) {
      $$0.a(c);
   }
}
