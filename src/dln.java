import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dln extends dky implements dma {
   public static final MapCodec<dln> c = b(dln::new);
   protected static final ezm g = dhj.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0);
   private static final double h = 0.14;

   @Override
   public MapCodec<dln> a() {
      return c;
   }

   protected dln(dun.d $$0) {
      super($$0, jj.b, g, true, 0.14);
   }

   @Override
   protected boolean h(duo $$0) {
      return $$0.a(dhl.G);
   }

   @Override
   protected dhj b() {
      return dhl.md;
   }

   @Override
   protected boolean o(duo $$0) {
      return !$$0.a(dhl.kJ);
   }

   @Override
   public boolean a(@Nullable cnu $$0, ddl $$1, je $$2, duo $$3, eqo $$4) {
      return false;
   }

   @Override
   public boolean a(deh $$0, je $$1, duo $$2, eqp $$3) {
      return false;
   }

   @Override
   protected int a(azl $$0) {
      return 1;
   }

   @Nullable
   @Override
   public duo a(czk $$0) {
      eqp $$1 = $$0.q().b_($$0.a());
      return $$1.a(awz.a) && $$1.e() == 8 ? super.a($$0) : null;
   }

   @Override
   protected eqp b_(duo $$0) {
      return eqq.c.a(false);
   }
}
