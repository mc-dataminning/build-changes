import com.mojang.serialization.MapCodec;

public class dpk extends dfw {
   public static final MapCodec<dpk> a = b(dpk::new);

   @Override
   public MapCodec<dpk> a() {
      return a;
   }

   public dpk(dsz.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dta $$0, dcu $$1, jd $$2, bsq $$3) {
      eww $$4 = new eww(0.25, 0.05F, 0.25);
      if ($$3 instanceof btl $$5 && $$5.b(bsa.K)) {
         $$4 = new eww(0.5, 0.25, 0.5);
      }

      $$3.a($$0, $$4);
   }
}
