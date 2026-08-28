import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dlx extends dfi implements dfc, djq {
   public static final MapCodec<dlx> a = b(dlx::new);
   protected static final float b = 6.0F;
   protected static final ewk c = dez.a(2.0, 0.0, 2.0, 14.0, 12.0, 14.0);

   @Override
   public MapCodec<dlx> a() {
      return a;
   }

   protected dlx(dsb.d $$0) {
      super($$0);
   }

   @Override
   protected ewk a(dsc $$0, dbe $$1, iz $$2, evw $$3) {
      return c;
   }

   @Override
   protected boolean b(dsc $$0, dbe $$1, iz $$2) {
      return $$0.d($$1, $$2, je.b) && !$$0.a(dfb.kJ);
   }

   @Nullable
   @Override
   public dsc a(cya $$0) {
      env $$1 = $$0.q().b_($$0.a());
      return $$1.a(awv.a) && $$1.e() == 8 ? super.a($$0) : null;
   }

   @Override
   protected dsc a(dsc $$0, je $$1, dsc $$2, dbz $$3, iz $$4, iz $$5) {
      dsc $$6 = super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!$$6.i()) {
         $$3.a($$4, enw.c, enw.c.a($$3));
      }

      return $$6;
   }

   @Override
   public boolean b(dcb $$0, iz $$1, dsc $$2) {
      return true;
   }

   @Override
   public boolean a(dby $$0, azh $$1, iz $$2, dsc $$3) {
      return true;
   }

   @Override
   protected env b_(dsc $$0) {
      return enw.c.a(false);
   }

   @Override
   public void a(arf $$0, azh $$1, iz $$2, dsc $$3) {
      dsc $$4 = dfb.bx.o();
      dsc $$5 = $$4.a(dnf.d, dsy.a);
      iz $$6 = $$2.c();
      if ($$0.a_($$6).a(dfb.G)) {
         $$0.a($$2, $$4, 2);
         $$0.a($$6, $$5, 2);
      }
   }

   @Override
   public boolean a(@Nullable cmx $$0, dbe $$1, iz $$2, dsc $$3, enu $$4) {
      return false;
   }

   @Override
   public boolean a(dbz $$0, iz $$1, dsc $$2, env $$3) {
      return false;
   }
}
