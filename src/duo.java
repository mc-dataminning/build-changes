import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class duo extends doj implements dqw {
   public static final MapCodec<duo> c = b(duo::new);
   public static final eax<eav> d = doj.b;
   private static final ffc e = dma.b(12.0, 0.0, 16.0);

   @Override
   public MapCodec<duo> a() {
      return c;
   }

   public duo(dzy.d $$0) {
      super($$0);
   }

   @Override
   protected ffc a(dzz $$0, dib $$1, iu $$2, fen $$3) {
      return e;
   }

   @Override
   protected boolean b(dzz $$0, dib $$1, iu $$2) {
      return $$0.c($$1, $$2, ja.b) && !$$0.a(dmc.lm);
   }

   @Override
   protected cyy a(diy $$0, iu $$1, dzz $$2, boolean $$3) {
      return new cyy(dmc.bE);
   }

   @Nullable
   @Override
   public dzz a(dcr $$0) {
      dzz $$1 = super.a($$0);
      if ($$1 != null) {
         ewg $$2 = $$0.q().b_($$0.a().d());
         if ($$2.a(axh.a) && $$2.e() == 8) {
            return $$1;
         }
      }

      return null;
   }

   @Override
   protected boolean a(dzz $$0, diy $$1, iu $$2) {
      if ($$0.c(d) == eav.a) {
         dzz $$3 = $$1.a_($$2.e());
         return $$3.a(this) && $$3.c(d) == eav.b;
      } else {
         ewg $$4 = $$1.b_($$2);
         return super.a($$0, $$1, $$2) && $$4.a(axh.a) && $$4.e() == 8;
      }
   }

   @Override
   protected ewg b_(dzz $$0) {
      return ewh.c.a(false);
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
