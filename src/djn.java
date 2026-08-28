import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djn extends dfh implements dmi {
   public static final MapCodec<djn> a = b(djn::new);
   public static final dte b = djd.aE;
   public static final dtb c = dta.C;
   protected static final float d = 3.0F;
   protected static final ewy e = dfh.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   protected static final ewy f = dfh.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final ewy g = dfh.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final ewy h = dfh.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);

   @Override
   public MapCodec<djn> a() {
      return a;
   }

   protected djn(dsj.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, jf.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected ewy a(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
      switch ((jf)$$0.c(b)) {
         case c:
            return h;
         case d:
            return g;
         case e:
            return f;
         case f:
         default:
            return e;
      }
   }

   private boolean a(dbl $$0, ja $$1, jf $$2) {
      dsk $$3 = $$0.a_($$1);
      return $$3.d($$0, $$1, $$2);
   }

   @Override
   protected boolean a(dsk $$0, dci $$1, ja $$2) {
      jf $$3 = $$0.c(b);
      return this.a($$1, $$2.a($$3.g()), $$3);
   }

   @Override
   protected dsk a(dsk $$0, jf $$1, dsk $$2, dcg $$3, ja $$4, ja $$5) {
      if ($$1.g() == $$0.c(b) && !$$0.a($$3, $$4)) {
         return dfj.a.o();
      } else {
         if ($$0.c(c)) {
            $$3.a($$4, eoi.c, eoi.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Nullable
   @Override
   public dsk a(cxm $$0) {
      if (!$$0.c()) {
         dsk $$1 = $$0.q().a_($$0.a().a($$0.k().g()));
         if ($$1.a(this) && $$1.c(b) == $$0.k()) {
            return null;
         }
      }

      dsk $$2 = this.o();
      dci $$3 = $$0.q();
      ja $$4 = $$0.a();
      eoh $$5 = $$0.q().b_($$0.a());

      for (jf $$6 : $$0.f()) {
         if ($$6.o().d()) {
            $$2 = $$2.a(b, $$6.g());
            if ($$2.a($$3, $$4)) {
               return $$2.a(c, Boolean.valueOf($$5.a() == eoi.c));
            }
         }
      }

      return null;
   }

   @Override
   protected dsk a(dsk $$0, dlu $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dsk a(dsk $$0, dke $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dsl.a<dfh, dsk> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected eoh b_(dsk $$0) {
      return $$0.c(c) ? eoi.c.a(false) : super.b_($$0);
   }
}
