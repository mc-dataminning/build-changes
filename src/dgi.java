import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dgi extends dlu implements dmj {
   public static final MapCodec<dgi> a = b(dgi::new);
   public static final dtc b = dtb.C;
   protected static final float c = 6.5F;
   protected static final float d = 9.5F;
   protected static final exa e = dfi.a(6.5, 0.0, 6.5, 9.5, 16.0, 9.5);
   protected static final exa f = dfi.a(6.5, 6.5, 0.0, 9.5, 9.5, 16.0);
   protected static final exa g = dfi.a(0.0, 6.5, 6.5, 16.0, 9.5, 9.5);

   @Override
   public MapCodec<dgi> a() {
      return a;
   }

   public dgi(dsk.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(i, jf.a.b));
   }

   @Override
   protected exa a(dsl $$0, dbm $$1, ja $$2, ewm $$3) {
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
   public dsl a(cxn $$0) {
      eoj $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == eok.c;
      return super.a($$0).a(b, Boolean.valueOf($$2));
   }

   @Override
   protected dsl a(dsl $$0, jf $$1, dsl $$2, dch $$3, ja $$4, ja $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, eok.c, eok.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dsm.a<dfi, dsl> $$0) {
      $$0.a(b).a(i);
   }

   @Override
   protected eoj b_(dsl $$0) {
      return $$0.c(b) ? eok.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dsl $$0, eoy $$1) {
      return false;
   }
}
