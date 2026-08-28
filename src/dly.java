import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dly extends dfj implements dfd, djr {
   public static final MapCodec<dly> a = b(dly::new);
   protected static final float b = 6.0F;
   protected static final ewl c = dfa.a(2.0, 0.0, 2.0, 14.0, 12.0, 14.0);

   @Override
   public MapCodec<dly> a() {
      return a;
   }

   protected dly(dsc.d $$0) {
      super($$0);
   }

   @Override
   protected ewl a(dsd $$0, dbf $$1, iz $$2, evx $$3) {
      return c;
   }

   @Override
   protected boolean b(dsd $$0, dbf $$1, iz $$2) {
      return $$0.d($$1, $$2, je.b) && !$$0.a(dfc.kJ);
   }

   @Nullable
   @Override
   public dsd a(cyb $$0) {
      enw $$1 = $$0.q().b_($$0.a());
      return $$1.a(awv.a) && $$1.e() == 8 ? super.a($$0) : null;
   }

   @Override
   protected dsd a(dsd $$0, je $$1, dsd $$2, dca $$3, iz $$4, iz $$5) {
      dsd $$6 = super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!$$6.i()) {
         $$3.a($$4, enx.c, enx.c.a($$3));
      }

      return $$6;
   }

   @Override
   public boolean b(dcc $$0, iz $$1, dsd $$2) {
      return true;
   }

   @Override
   public boolean a(dbz $$0, azh $$1, iz $$2, dsd $$3) {
      return true;
   }

   @Override
   protected enw b_(dsd $$0) {
      return enx.c.a(false);
   }

   @Override
   public void a(arf $$0, azh $$1, iz $$2, dsd $$3) {
      dsd $$4 = dfc.bx.o();
      dsd $$5 = $$4.a(dng.d, dsz.a);
      iz $$6 = $$2.c();
      if ($$0.a_($$6).a(dfc.G)) {
         $$0.a($$2, $$4, 2);
         $$0.a($$6, $$5, 2);
      }
   }

   @Override
   public boolean a(@Nullable cmy $$0, dbf $$1, iz $$2, dsd $$3, env $$4) {
      return false;
   }

   @Override
   public boolean a(dca $$0, iz $$1, dsd $$2, enw $$3) {
      return false;
   }
}
