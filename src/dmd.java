import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmd extends dfo implements dfi, djw {
   public static final MapCodec<dmd> a = b(dmd::new);
   protected static final float b = 6.0F;
   protected static final ews c = dff.a(2.0, 0.0, 2.0, 14.0, 12.0, 14.0);

   @Override
   public MapCodec<dmd> a() {
      return a;
   }

   protected dmd(dsg.d $$0) {
      super($$0);
   }

   @Override
   protected ews a(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
      return c;
   }

   @Override
   protected boolean b(dsh $$0, dbj $$1, ja $$2) {
      return $$0.d($$1, $$2, jf.b) && !$$0.a(dfh.kJ);
   }

   @Nullable
   @Override
   public dsh a(cxk $$0) {
      eob $$1 = $$0.q().b_($$0.a());
      return $$1.a(awa.a) && $$1.e() == 8 ? super.a($$0) : null;
   }

   @Override
   protected dsh a(dsh $$0, jf $$1, dsh $$2, dce $$3, ja $$4, ja $$5) {
      dsh $$6 = super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!$$6.i()) {
         $$3.a($$4, eoc.c, eoc.c.a($$3));
      }

      return $$6;
   }

   @Override
   public boolean b(dcg $$0, ja $$1, dsh $$2) {
      return true;
   }

   @Override
   public boolean a(dcd $$0, aym $$1, ja $$2, dsh $$3) {
      return true;
   }

   @Override
   protected eob b_(dsh $$0) {
      return eoc.c.a(false);
   }

   @Override
   public void a(aqk $$0, aym $$1, ja $$2, dsh $$3) {
      dsh $$4 = dfh.bx.o();
      dsh $$5 = $$4.a(dnl.d, dtd.a);
      ja $$6 = $$2.c();
      if ($$0.a_($$6).a(dfh.G)) {
         $$0.a($$2, $$4, 2);
         $$0.a($$6, $$5, 2);
      }
   }

   @Override
   public boolean a(@Nullable cmh $$0, dbj $$1, ja $$2, dsh $$3, eoa $$4) {
      return false;
   }

   @Override
   public boolean a(dce $$0, ja $$1, dsh $$2, eob $$3) {
      return false;
   }
}
