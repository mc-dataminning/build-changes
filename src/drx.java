import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class drx extends dle implements dkx, dpp {
   public static final MapCodec<drx> a = b(drx::new);
   private static final fdo b = dku.b(12.0, 0.0, 12.0);

   @Override
   public MapCodec<drx> a() {
      return a;
   }

   protected drx(dyl.d $$0) {
      super($$0);
   }

   @Override
   protected fdo a(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return b;
   }

   @Override
   protected boolean b(dym $$0, dgv $$1, jj $$2) {
      return $$0.c($$1, $$2, jo.b) && !$$0.a(dkw.ll);
   }

   @Nullable
   @Override
   public dym a(dbn $$0) {
      eut $$1 = $$0.q().b_($$0.a());
      return $$1.a(axf.a) && $$1.e() == 8 ? super.a($$0) : null;
   }

   @Override
   protected dym a(dym $$0, dhs $$1, die $$2, jj $$3, jo $$4, jj $$5, dym $$6, azs $$7) {
      dym $$8 = super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      if (!$$8.l()) {
         $$2.a($$3, euu.c, euu.c.a($$1));
      }

      return $$8;
   }

   @Override
   public boolean a(dhs $$0, jj $$1, dym $$2) {
      return $$0.a_($$1.d()).a(dkw.J);
   }

   @Override
   public boolean a(dhp $$0, azs $$1, jj $$2, dym $$3) {
      return true;
   }

   @Override
   protected eut b_(dym $$0) {
      return euu.c.a(false);
   }

   @Override
   public void a(arn $$0, azs $$1, jj $$2, dym $$3) {
      dym $$4 = dkw.bE.m();
      dym $$5 = $$4.b(dtg.d, dzi.a);
      jj $$6 = $$2.d();
      $$0.a($$2, $$4, 2);
      $$0.a($$6, $$5, 2);
   }

   @Override
   public boolean a(@Nullable bwr $$0, dgv $$1, jj $$2, dym $$3, eus $$4) {
      return false;
   }

   @Override
   public boolean a(dhq $$0, jj $$1, dym $$2, eut $$3) {
      return false;
   }
}
