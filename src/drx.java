import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class drx extends drh implements dsl {
   public static final MapCodec<drx> c = b(drx::new);
   private static final double g = 0.14;
   private static final fgw h = dno.b(16.0, 0.0, 9.0);

   @Override
   public MapCodec<drx> a() {
      return c;
   }

   protected drx(ebp.d $$0) {
      super($$0, jc.b, h, true, 0.14);
   }

   @Override
   protected boolean h(ebq $$0) {
      return $$0.a(dnq.J);
   }

   @Override
   protected dno b() {
      return dnq.mJ;
   }

   @Override
   protected boolean o(ebq $$0) {
      return !$$0.a(dnq.lp);
   }

   @Override
   public boolean a(@Nullable byf $$0, djn $$1, iw $$2, ebq $$3, exz $$4) {
      return false;
   }

   @Override
   public boolean a(dkk $$0, iw $$1, ebq $$2, eya $$3) {
      return false;
   }

   @Override
   protected int a(bai $$0) {
      return 1;
   }

   @Nullable
   @Override
   public ebq a(ded $$0) {
      eya $$1 = $$0.q().b_($$0.a());
      return $$1.a(axs.a) && $$1.e() == 8 ? super.a($$0) : null;
   }

   @Override
   protected eya b_(ebq $$0) {
      return eyb.c.a(false);
   }
}
