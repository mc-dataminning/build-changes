import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dah extends crw {
   public static final MapCodec<dah> c = b(dah::new);

   @Override
   public MapCodec<dah> a() {
      return c;
   }

   protected dah(dfc.d $$0) {
      super($$0);
   }

   @Override
   public dcz a(gw $$0, dfd $$1) {
      return new dek($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dcz> dda<T> a(cqb $$0, dfd $$1, ddb<T> $$2) {
      return a($$0, $$2, ddb.B);
   }

   @Override
   protected void a(cqb $$0, gw $$1, cca $$2) {
      dcz $$3 = $$0.c_($$1);
      if ($$3 instanceof dek) {
         $$2.a((bhh)$$3);
         $$2.a(apq.at);
      }
   }

   @Override
   public void a(dfd $$0, cqb $$1, gw $$2, ash $$3) {
      if ($$0.c(b)) {
         double $$4 = (double)$$2.u() + 0.5;
         double $$5 = (double)$$2.v();
         double $$6 = (double)$$2.w() + 0.5;
         if ($$3.j() < 0.1) {
            $$1.a($$4, $$5, $$6, apg.wx, aph.e, 1.0F, 1.0F, false);
         }

         $$1.a(iv.Z, $$4, $$5 + 1.1, $$6, 0.0, 0.0, 0.0);
      }
   }
}
