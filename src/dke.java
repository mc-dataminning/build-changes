import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dke extends dfi implements dmj {
   public static final MapCodec<dke> a = b(dke::new);
   public static final dtc b = dtb.C;

   @Override
   public MapCodec<dke> a() {
      return a;
   }

   protected dke(dsk.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)));
   }

   @Override
   protected boolean a(dsl $$0, dsl $$1, jf $$2) {
      return $$1.a(dfk.ac) && $$2.o() == jf.a.b;
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
   protected eoj b_(dsl $$0) {
      return $$0.c(b) ? eok.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(dsm.a<dfi, dsl> $$0) {
      $$0.a(b);
   }
}
