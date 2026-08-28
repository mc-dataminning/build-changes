import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dtf extends dvj implements dmd, dqw {
   public static final MapCodec<dtf> a = b(dtf::new);
   private static final ffc b = dma.b(12.0, 0.0, 12.0);

   @Override
   public MapCodec<dtf> a() {
      return a;
   }

   protected dtf(dzy.d $$0) {
      super($$0);
   }

   @Override
   protected ffc a(dzz $$0, dib $$1, iu $$2, fen $$3) {
      return b;
   }

   @Override
   protected boolean b(dzz $$0, dib $$1, iu $$2) {
      return $$0.c($$1, $$2, ja.b) && !$$0.a(dmc.lm);
   }

   @Nullable
   @Override
   public dzz a(dcr $$0) {
      ewg $$1 = $$0.q().b_($$0.a());
      return $$1.a(axh.a) && $$1.e() == 8 ? super.a($$0) : null;
   }

   @Override
   protected dzz a(dzz $$0, diy $$1, djk $$2, iu $$3, ja $$4, iu $$5, dzz $$6, azv $$7) {
      dzz $$8 = super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      if (!$$8.l()) {
         $$2.a($$3, ewh.c, ewh.c.a($$1));
      }

      return $$8;
   }

   @Override
   public boolean a(diy $$0, iu $$1, dzz $$2) {
      return $$0.a_($$1.d()).a(dmc.J);
   }

   @Override
   public boolean a(div $$0, azv $$1, iu $$2, dzz $$3) {
      return true;
   }

   @Override
   protected ewg b_(dzz $$0) {
      return ewh.c.a(false);
   }

   @Override
   public void a(arq $$0, azv $$1, iu $$2, dzz $$3) {
      dzz $$4 = dmc.bF.m();
      dzz $$5 = $$4.b(duo.d, eav.a);
      iu $$6 = $$2.d();
      $$0.a($$2, $$4, 2);
      $$0.a($$6, $$5, 2);
   }

   @Override
   public boolean a(@Nullable bxc $$0, dib $$1, iu $$2, dzz $$3, ewf $$4) {
      return false;
   }

   @Override
   public boolean a(diw $$0, iu $$1, dzz $$2, ewg $$3) {
      return false;
   }
}
