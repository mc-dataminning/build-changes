import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dts extends dvy implements dmp, drj {
   public static final MapCodec<dts> a = b(dts::new);
   private static final ffr b = dmm.b(12.0, 0.0, 12.0);

   @Override
   public MapCodec<dts> a() {
      return a;
   }

   protected dts(ean.d $$0) {
      super($$0);
   }

   @Override
   protected ffr a(eao $$0, din $$1, iv $$2, ffc $$3) {
      return b;
   }

   @Override
   protected boolean b(eao $$0, din $$1, iv $$2) {
      return $$0.c($$1, $$2, jb.b) && !$$0.a(dmo.lp);
   }

   @Nullable
   @Override
   public eao a(ddd $$0) {
      ewv $$1 = $$0.q().b_($$0.a());
      return $$1.a(axh.a) && $$1.e() == 8 ? super.a($$0) : null;
   }

   @Override
   protected eao a(eao $$0, djk $$1, djw $$2, iv $$3, jb $$4, iv $$5, eao $$6, azv $$7) {
      eao $$8 = super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      if (!$$8.l()) {
         $$2.a($$3, eww.c, eww.c.a($$1));
      }

      return $$8;
   }

   @Override
   public boolean a(djk $$0, iv $$1, eao $$2) {
      return $$0.a_($$1.d()).a(dmo.J);
   }

   @Override
   public boolean a(djh $$0, azv $$1, iv $$2, eao $$3) {
      return true;
   }

   @Override
   protected ewv b_(eao $$0) {
      return eww.c.a(false);
   }

   @Override
   public void a(arq $$0, azv $$1, iv $$2, eao $$3) {
      eao $$4 = dmo.bH.m();
      eao $$5 = $$4.b(dvd.d, ebk.a);
      iv $$6 = $$2.d();
      $$0.a($$2, $$4, 2);
      $$0.a($$6, $$5, 2);
   }

   @Override
   public boolean a(@Nullable bxj $$0, din $$1, iv $$2, eao $$3, ewu $$4) {
      return false;
   }

   @Override
   public boolean a(dji $$0, iv $$1, eao $$2, ewv $$3) {
      return false;
   }
}
