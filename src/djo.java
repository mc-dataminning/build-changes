import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djo extends dfi implements dmj {
   public static final MapCodec<djo> a = b(djo::new);
   public static final dtf b = dje.aE;
   public static final dtc c = dtb.C;
   protected static final float d = 3.0F;
   protected static final exa e = dfi.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   protected static final exa f = dfi.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final exa g = dfi.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final exa h = dfi.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);

   @Override
   public MapCodec<djo> a() {
      return a;
   }

   protected djo(dsk.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, jf.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected exa a(dsl $$0, dbm $$1, ja $$2, ewm $$3) {
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

   private boolean a(dbm $$0, ja $$1, jf $$2) {
      dsl $$3 = $$0.a_($$1);
      return $$3.d($$0, $$1, $$2);
   }

   @Override
   protected boolean a(dsl $$0, dcj $$1, ja $$2) {
      jf $$3 = $$0.c(b);
      return this.a($$1, $$2.a($$3.g()), $$3);
   }

   @Override
   protected dsl a(dsl $$0, jf $$1, dsl $$2, dch $$3, ja $$4, ja $$5) {
      if ($$1.g() == $$0.c(b) && !$$0.a($$3, $$4)) {
         return dfk.a.o();
      } else {
         if ($$0.c(c)) {
            $$3.a($$4, eok.c, eok.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Nullable
   @Override
   public dsl a(cxn $$0) {
      if (!$$0.c()) {
         dsl $$1 = $$0.q().a_($$0.a().a($$0.k().g()));
         if ($$1.a(this) && $$1.c(b) == $$0.k()) {
            return null;
         }
      }

      dsl $$2 = this.o();
      dcj $$3 = $$0.q();
      ja $$4 = $$0.a();
      eoj $$5 = $$0.q().b_($$0.a());

      for (jf $$6 : $$0.f()) {
         if ($$6.o().d()) {
            $$2 = $$2.a(b, $$6.g());
            if ($$2.a($$3, $$4)) {
               return $$2.a(c, Boolean.valueOf($$5.a() == eok.c));
            }
         }
      }

      return null;
   }

   @Override
   protected dsl a(dsl $$0, dlv $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dsl a(dsl $$0, dkf $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dsm.a<dfi, dsl> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected eoj b_(dsl $$0) {
      return $$0.c(c) ? eok.c.a(false) : super.b_($$0);
   }
}
