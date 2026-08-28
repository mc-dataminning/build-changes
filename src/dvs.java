import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dvs extends duy implements dtj {
   public static final MapCodec<dvs> a = b(dvs::new);
   public static final eaq c = eap.I;

   @Override
   protected MapCodec<? extends dvs> a() {
      return a;
   }

   protected dvs(dzy.d $$0) {
      super($$0);
      this.l(this.m().b(c, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dzz a(dcr $$0) {
      ewg $$1 = $$0.q().b_($$0.a());
      return super.a($$0).b(c, Boolean.valueOf($$1.b(ewh.c)));
   }

   @Override
   protected dzz a(dzz $$0, diy $$1, djk $$2, iu $$3, ja $$4, iu $$5, dzz $$6, azv $$7) {
      if ($$0.c(c)) {
         $$2.a($$3, ewh.c, ewh.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected ewg b_(dzz $$0) {
      return $$0.c(c) ? ewh.c.a(true) : super.b_($$0);
   }

   @Override
   protected void a(eaa.a<dma, dzz> $$0) {
      $$0.a(c);
   }
}
