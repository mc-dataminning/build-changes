import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmg extends dfr implements dfl, djz {
   public static final MapCodec<dmg> a = b(dmg::new);
   protected static final float b = 6.0F;
   protected static final exa c = dfi.a(2.0, 0.0, 2.0, 14.0, 12.0, 14.0);

   @Override
   public MapCodec<dmg> a() {
      return a;
   }

   protected dmg(dsk.d $$0) {
      super($$0);
   }

   @Override
   protected exa a(dsl $$0, dbm $$1, ja $$2, ewm $$3) {
      return c;
   }

   @Override
   protected boolean b(dsl $$0, dbm $$1, ja $$2) {
      return $$0.d($$1, $$2, jf.b) && !$$0.a(dfk.kJ);
   }

   @Nullable
   @Override
   public dsl a(cxn $$0) {
      eoj $$1 = $$0.q().b_($$0.a());
      return $$1.a(awc.a) && $$1.e() == 8 ? super.a($$0) : null;
   }

   @Override
   protected dsl a(dsl $$0, jf $$1, dsl $$2, dch $$3, ja $$4, ja $$5) {
      dsl $$6 = super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!$$6.i()) {
         $$3.a($$4, eok.c, eok.c.a($$3));
      }

      return $$6;
   }

   @Override
   public boolean b(dcj $$0, ja $$1, dsl $$2) {
      return true;
   }

   @Override
   public boolean a(dcg $$0, ayo $$1, ja $$2, dsl $$3) {
      return true;
   }

   @Override
   protected eoj b_(dsl $$0) {
      return eok.c.a(false);
   }

   @Override
   public void a(aqm $$0, ayo $$1, ja $$2, dsl $$3) {
      dsl $$4 = dfk.bx.o();
      dsl $$5 = $$4.a(dno.d, dth.a);
      ja $$6 = $$2.c();
      if ($$0.a_($$6).a(dfk.G)) {
         $$0.a($$2, $$4, 2);
         $$0.a($$6, $$5, 2);
      }
   }

   @Override
   public boolean a(@Nullable cml $$0, dbm $$1, ja $$2, dsl $$3, eoi $$4) {
      return false;
   }

   @Override
   public boolean a(dch $$0, ja $$1, dsl $$2, eoj $$3) {
      return false;
   }
}
