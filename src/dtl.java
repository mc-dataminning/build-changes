import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dtl extends dvr implements dmi, drc {
   public static final MapCodec<dtl> a = b(dtl::new);
   private static final ffk b = dmf.b(12.0, 0.0, 12.0);

   @Override
   public MapCodec<dtl> a() {
      return a;
   }

   protected dtl(eag.d $$0) {
      super($$0);
   }

   @Override
   protected ffk a(eah $$0, dig $$1, iu $$2, fev $$3) {
      return b;
   }

   @Override
   protected boolean b(eah $$0, dig $$1, iu $$2) {
      return $$0.c($$1, $$2, ja.b) && !$$0.a(dmh.lp);
   }

   @Nullable
   @Override
   public eah a(dcw $$0) {
      ewo $$1 = $$0.q().b_($$0.a());
      return $$1.a(axh.a) && $$1.e() == 8 ? super.a($$0) : null;
   }

   @Override
   protected eah a(eah $$0, djd $$1, djp $$2, iu $$3, ja $$4, iu $$5, eah $$6, azv $$7) {
      eah $$8 = super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      if (!$$8.l()) {
         $$2.a($$3, ewp.c, ewp.c.a($$1));
      }

      return $$8;
   }

   @Override
   public boolean a(djd $$0, iu $$1, eah $$2) {
      return $$0.a_($$1.d()).a(dmh.J);
   }

   @Override
   public boolean a(dja $$0, azv $$1, iu $$2, eah $$3) {
      return true;
   }

   @Override
   protected ewo b_(eah $$0) {
      return ewp.c.a(false);
   }

   @Override
   public void a(arq $$0, azv $$1, iu $$2, eah $$3) {
      eah $$4 = dmh.bH.m();
      eah $$5 = $$4.b(duw.d, ebd.a);
      iu $$6 = $$2.d();
      $$0.a($$2, $$4, 2);
      $$0.a($$6, $$5, 2);
   }

   @Override
   public boolean a(@Nullable bxe $$0, dig $$1, iu $$2, eah $$3, ewn $$4) {
      return false;
   }

   @Override
   public boolean a(djb $$0, iu $$1, eah $$2, ewo $$3) {
      return false;
   }
}
