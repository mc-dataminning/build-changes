import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dnn extends dhp implements djy {
   public static final MapCodec<dnn> c = b(dnn::new);
   public static final dti<dtg> d = dhp.b;
   protected static final float e = 6.0F;
   protected static final ewy f = dfh.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);

   @Override
   public MapCodec<dnn> a() {
      return c;
   }

   public dnn(dsj.d $$0) {
      super($$0);
   }

   @Override
   protected ewy a(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
      return f;
   }

   @Override
   protected boolean b(dsk $$0, dbl $$1, ja $$2) {
      return $$0.d($$1, $$2, jf.b) && !$$0.a(dfj.kJ);
   }

   @Override
   public cuc a(dci $$0, ja $$1, dsk $$2) {
      return new cuc(dfj.bw);
   }

   @Nullable
   @Override
   public dsk a(cxm $$0) {
      dsk $$1 = super.a($$0);
      if ($$1 != null) {
         eoh $$2 = $$0.q().b_($$0.a().c());
         if ($$2.a(awc.a) && $$2.e() == 8) {
            return $$1;
         }
      }

      return null;
   }

   @Override
   protected boolean a(dsk $$0, dci $$1, ja $$2) {
      if ($$0.c(d) == dtg.a) {
         dsk $$3 = $$1.a_($$2.d());
         return $$3.a(this) && $$3.c(d) == dtg.b;
      } else {
         eoh $$4 = $$1.b_($$2);
         return super.a($$0, $$1, $$2) && $$4.a(awc.a) && $$4.e() == 8;
      }
   }

   @Override
   protected eoh b_(dsk $$0) {
      return eoi.c.a(false);
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
