import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dqv extends dqf implements drj {
   public static final MapCodec<dqv> c = b(dqv::new);
   private static final double g = 0.14;
   private static final ffr h = dmm.b(16.0, 0.0, 9.0);

   @Override
   public MapCodec<dqv> a() {
      return c;
   }

   protected dqv(ean.d $$0) {
      super($$0, jb.b, h, true, 0.14);
   }

   @Override
   protected boolean h(eao $$0) {
      return $$0.a(dmo.J);
   }

   @Override
   protected dmm b() {
      return dmo.mJ;
   }

   @Override
   protected boolean o(eao $$0) {
      return !$$0.a(dmo.lp);
   }

   @Override
   public boolean a(@Nullable bxj $$0, din $$1, iv $$2, eao $$3, ewu $$4) {
      return false;
   }

   @Override
   public boolean a(dji $$0, iv $$1, eao $$2, ewv $$3) {
      return false;
   }

   @Override
   protected int a(azv $$0) {
      return 1;
   }

   @Nullable
   @Override
   public eao a(ddd $$0) {
      ewv $$1 = $$0.q().b_($$0.a());
      return $$1.a(axh.a) && $$1.e() == 8 ? super.a($$0) : null;
   }

   @Override
   protected ewv b_(eao $$0) {
      return eww.c.a(false);
   }
}
