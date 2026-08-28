import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmf extends dfq implements dfk, djy {
   public static final MapCodec<dmf> a = b(dmf::new);
   protected static final float b = 6.0F;
   protected static final ewy c = dfh.a(2.0, 0.0, 2.0, 14.0, 12.0, 14.0);

   @Override
   public MapCodec<dmf> a() {
      return a;
   }

   protected dmf(dsj.d $$0) {
      super($$0);
   }

   @Override
   protected ewy a(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
      return c;
   }

   @Override
   protected boolean b(dsk $$0, dbl $$1, ja $$2) {
      return $$0.d($$1, $$2, jf.b) && !$$0.a(dfj.kJ);
   }

   @Nullable
   @Override
   public dsk a(cxm $$0) {
      eoh $$1 = $$0.q().b_($$0.a());
      return $$1.a(awc.a) && $$1.e() == 8 ? super.a($$0) : null;
   }

   @Override
   protected dsk a(dsk $$0, jf $$1, dsk $$2, dcg $$3, ja $$4, ja $$5) {
      dsk $$6 = super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!$$6.i()) {
         $$3.a($$4, eoi.c, eoi.c.a($$3));
      }

      return $$6;
   }

   @Override
   public boolean b(dci $$0, ja $$1, dsk $$2) {
      return true;
   }

   @Override
   public boolean a(dcf $$0, ayo $$1, ja $$2, dsk $$3) {
      return true;
   }

   @Override
   protected eoh b_(dsk $$0) {
      return eoi.c.a(false);
   }

   @Override
   public void a(aqm $$0, ayo $$1, ja $$2, dsk $$3) {
      dsk $$4 = dfj.bx.o();
      dsk $$5 = $$4.a(dnn.d, dtg.a);
      ja $$6 = $$2.c();
      if ($$0.a_($$6).a(dfj.G)) {
         $$0.a($$2, $$4, 2);
         $$0.a($$6, $$5, 2);
      }
   }

   @Override
   public boolean a(@Nullable cmk $$0, dbl $$1, ja $$2, dsk $$3, eog $$4) {
      return false;
   }

   @Override
   public boolean a(dcg $$0, ja $$1, dsk $$2, eoh $$3) {
      return false;
   }
}
