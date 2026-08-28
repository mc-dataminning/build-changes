import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djo extends dfh implements dmi {
   public static final MapCodec<djo> a = b(djo::new);
   public static final dtb b = dta.j;
   public static final dtb c = dta.C;
   protected static final ewy d = ewv.a(dfh.a(5.0, 0.0, 5.0, 11.0, 7.0, 11.0), dfh.a(6.0, 7.0, 6.0, 10.0, 9.0, 10.0));
   protected static final ewy e = ewv.a(dfh.a(5.0, 1.0, 5.0, 11.0, 8.0, 11.0), dfh.a(6.0, 8.0, 6.0, 10.0, 10.0, 10.0));

   @Override
   public MapCodec<djo> a() {
      return a;
   }

   public djo(dsj.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dsk a(cxm $$0) {
      eoh $$1 = $$0.q().b_($$0.a());

      for (jf $$2 : $$0.f()) {
         if ($$2.o() == jf.a.b) {
            dsk $$3 = this.o().a(b, Boolean.valueOf($$2 == jf.b));
            if ($$3.a((dci)$$0.q(), $$0.a())) {
               return $$3.a(c, Boolean.valueOf($$1.a() == eoi.c));
            }
         }
      }

      return null;
   }

   @Override
   protected ewy a(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
      return $$0.c(b) ? e : d;
   }

   @Override
   protected void a(dsl.a<dfh, dsk> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected boolean a(dsk $$0, dci $$1, ja $$2) {
      jf $$3 = m($$0).g();
      return dfh.a($$1, $$2.a($$3), $$3.g());
   }

   protected static jf m(dsk $$0) {
      return $$0.c(b) ? jf.a : jf.b;
   }

   @Override
   protected dsk a(dsk $$0, jf $$1, dsk $$2, dcg $$3, ja $$4, ja $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, eoi.c, eoi.c.a($$3));
      }

      return m($$0).g() == $$1 && !$$0.a($$3, $$4) ? dfj.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected eoh b_(dsk $$0) {
      return $$0.c(c) ? eoi.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dsk $$0, eow $$1) {
      return false;
   }
}
