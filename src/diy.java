import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class diy extends dfh implements dmi {
   public static final MapCodec<diy> a = b(diy::new);
   private static final dtb c = dta.C;
   protected static final ewy b = dfh.a(2.0, 10.0, 2.0, 14.0, 16.0, 14.0);

   @Override
   public MapCodec<diy> a() {
      return a;
   }

   protected diy(dsj.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dsl.a<dfh, dsk> $$0) {
      $$0.a(c);
   }

   @Override
   protected eoh b_(dsk $$0) {
      return $$0.c(c) ? eoi.c.a(false) : super.b_($$0);
   }

   @Nullable
   @Override
   public dsk a(cxm $$0) {
      dsk $$1 = super.a($$0);
      if ($$1 != null) {
         eoh $$2 = $$0.q().b_($$0.a());
         return $$1.a(c, Boolean.valueOf($$2.a() == eoi.c));
      } else {
         return null;
      }
   }

   @Override
   protected boolean a(dsk $$0, dci $$1, ja $$2) {
      ja $$3 = $$2.c();
      dsk $$4 = $$1.a_($$3);
      return $$4.d($$1, $$3, jf.a);
   }

   @Override
   protected ewy a(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
      return b;
   }

   @Override
   protected dsk a(dsk $$0, jf $$1, dsk $$2, dcg $$3, ja $$4, ja $$5) {
      if ($$1 == jf.b && !this.a($$0, $$3, $$4)) {
         return dfj.a.o();
      } else {
         if ($$0.c(c)) {
            $$3.a($$4, eoi.c, eoi.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }
}
