import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dgh extends dlt implements dmi {
   public static final MapCodec<dgh> a = b(dgh::new);
   public static final dtb b = dta.C;
   protected static final float c = 6.5F;
   protected static final float d = 9.5F;
   protected static final ewy e = dfh.a(6.5, 0.0, 6.5, 9.5, 16.0, 9.5);
   protected static final ewy f = dfh.a(6.5, 6.5, 0.0, 9.5, 9.5, 16.0);
   protected static final ewy g = dfh.a(0.0, 6.5, 6.5, 16.0, 9.5, 9.5);

   @Override
   public MapCodec<dgh> a() {
      return a;
   }

   public dgh(dsj.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(i, jf.a.b));
   }

   @Override
   protected ewy a(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
      switch ((jf.a)$$0.c(i)) {
         case a:
         default:
            return g;
         case c:
            return f;
         case b:
            return e;
      }
   }

   @Nullable
   @Override
   public dsk a(cxm $$0) {
      eoh $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == eoi.c;
      return super.a($$0).a(b, Boolean.valueOf($$2));
   }

   @Override
   protected dsk a(dsk $$0, jf $$1, dsk $$2, dcg $$3, ja $$4, ja $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, eoi.c, eoi.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dsl.a<dfh, dsk> $$0) {
      $$0.a(b).a(i);
   }

   @Override
   protected eoh b_(dsk $$0) {
      return $$0.c(b) ? eoi.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dsk $$0, eow $$1) {
      return false;
   }
}
