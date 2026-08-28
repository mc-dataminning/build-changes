import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class duv extends dlz {
   public static final MapCodec<duv> c = b(duv::new);

   @Override
   public MapCodec<duv> a() {
      return c;
   }

   protected duv(ebf.d $$0) {
      super($$0);
   }

   @Override
   public dye a(iw $$0, ebg $$1) {
      return new dzv($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dye> dyf<T> a(djz $$0, ebg $$1, dyg<T> $$2) {
      return a($$0, $$2, dyg.C);
   }

   @Override
   protected void a(djz $$0, iw $$1, crz $$2) {
      dye $$3 = $$0.c_($$1);
      if ($$3 instanceof dzv) {
         $$2.a((buv)$$3);
         $$2.a(axb.at);
      }
   }

   @Override
   public void a(ebg $$0, djz $$1, iw $$2, azz $$3) {
      if ($$0.c(b)) {
         double $$4 = (double)$$2.u() + 0.5;
         double $$5 = (double)$$2.v();
         double $$6 = (double)$$2.w() + 0.5;
         if ($$3.j() < 0.1) {
            $$1.a($$4, $$5, $$6, awr.zo, aws.e, 1.0F, 1.0F, false);
         }

         $$1.a(lz.ah, $$4, $$5 + 1.1, $$6, 0.0, 0.0, 0.0);
      }
   }
}
