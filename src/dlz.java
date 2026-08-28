import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dlz extends dfk implements dfe, djs {
   public static final MapCodec<dlz> a = b(dlz::new);
   protected static final float b = 6.0F;
   protected static final ewm c = dfb.a(2.0, 0.0, 2.0, 14.0, 12.0, 14.0);

   @Override
   public MapCodec<dlz> a() {
      return a;
   }

   protected dlz(dsd.d $$0) {
      super($$0);
   }

   @Override
   protected ewm a(dse $$0, dbg $$1, iz $$2, evy $$3) {
      return c;
   }

   @Override
   protected boolean b(dse $$0, dbg $$1, iz $$2) {
      return $$0.d($$1, $$2, je.b) && !$$0.a(dfd.kJ);
   }

   @Nullable
   @Override
   public dse a(cyc $$0) {
      enx $$1 = $$0.q().b_($$0.a());
      return $$1.a(awv.a) && $$1.e() == 8 ? super.a($$0) : null;
   }

   @Override
   protected dse a(dse $$0, je $$1, dse $$2, dcb $$3, iz $$4, iz $$5) {
      dse $$6 = super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!$$6.i()) {
         $$3.a($$4, eny.c, eny.c.a($$3));
      }

      return $$6;
   }

   @Override
   public boolean b(dcd $$0, iz $$1, dse $$2) {
      return true;
   }

   @Override
   public boolean a(dca $$0, azh $$1, iz $$2, dse $$3) {
      return true;
   }

   @Override
   protected enx b_(dse $$0) {
      return eny.c.a(false);
   }

   @Override
   public void a(arf $$0, azh $$1, iz $$2, dse $$3) {
      dse $$4 = dfd.bx.o();
      dse $$5 = $$4.a(dnh.d, dta.a);
      iz $$6 = $$2.c();
      if ($$0.a_($$6).a(dfd.G)) {
         $$0.a($$2, $$4, 2);
         $$0.a($$6, $$5, 2);
      }
   }

   @Override
   public boolean a(@Nullable cmz $$0, dbg $$1, iz $$2, dse $$3, enw $$4) {
      return false;
   }

   @Override
   public boolean a(dcb $$0, iz $$1, dse $$2, enx $$3) {
      return false;
   }
}
