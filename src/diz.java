import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class diz extends dfi implements dmj {
   public static final MapCodec<diz> a = b(diz::new);
   private static final dtc c = dtb.C;
   protected static final exa b = dfi.a(2.0, 10.0, 2.0, 14.0, 16.0, 14.0);

   @Override
   public MapCodec<diz> a() {
      return a;
   }

   protected diz(dsk.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dsm.a<dfi, dsl> $$0) {
      $$0.a(c);
   }

   @Override
   protected eoj b_(dsl $$0) {
      return $$0.c(c) ? eok.c.a(false) : super.b_($$0);
   }

   @Nullable
   @Override
   public dsl a(cxn $$0) {
      dsl $$1 = super.a($$0);
      if ($$1 != null) {
         eoj $$2 = $$0.q().b_($$0.a());
         return $$1.a(c, Boolean.valueOf($$2.a() == eok.c));
      } else {
         return null;
      }
   }

   @Override
   protected boolean a(dsl $$0, dcj $$1, ja $$2) {
      ja $$3 = $$2.c();
      dsl $$4 = $$1.a_($$3);
      return $$4.d($$1, $$3, jf.a);
   }

   @Override
   protected exa a(dsl $$0, dbm $$1, ja $$2, ewm $$3) {
      return b;
   }

   @Override
   protected dsl a(dsl $$0, jf $$1, dsl $$2, dch $$3, ja $$4, ja $$5) {
      if ($$1 == jf.b && !this.a($$0, $$3, $$4)) {
         return dfk.a.o();
      } else {
         if ($$0.c(c)) {
            $$3.a($$4, eok.c, eok.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }
}
