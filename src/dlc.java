import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dlc extends dez {
   public static final MapCodec<dlc> a = b(dlc::new);
   public static final dst b = dld.d;

   @Override
   public MapCodec<dlc> a() {
      return a;
   }

   public dlc(dsb.d $$0) {
      super($$0);
      this.k(this.o().a(b, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dsc a(cya $$0) {
      return this.o().a(b, Boolean.valueOf($$0.q().C($$0.a())));
   }

   @Override
   protected void a(dsc $$0, dby $$1, iz $$2, dez $$3, iz $$4, boolean $$5) {
      if (!$$1.B) {
         boolean $$6 = $$0.c(b);
         if ($$6 != $$1.C($$2)) {
            if ($$6) {
               $$1.a($$2, this, 4);
            } else {
               $$1.a($$2, $$0.a(b), 2);
            }
         }
      }
   }

   @Override
   protected void a(dsc $$0, arf $$1, iz $$2, azh $$3) {
      if ($$0.c(b) && !$$1.C($$2)) {
         $$1.a($$2, $$0.a(b), 2);
      }
   }

   @Override
   protected void a(dsd.a<dez, dsc> $$0) {
      $$0.a(b);
   }
}
