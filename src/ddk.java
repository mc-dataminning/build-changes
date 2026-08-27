import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class ddk extends czf implements dgf {
   public static final MapCodec<ddk> a = b(ddk::new);
   public static final dmy b = dda.aE;
   public static final dmv c = dmu.C;
   protected static final float d = 3.0F;
   protected static final epo e = czf.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   protected static final epo f = czf.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final epo g = czf.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final epo h = czf.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);

   @Override
   public MapCodec<ddk> a() {
      return a;
   }

   protected ddk(dmd.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ih.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected epo a(dme $$0, cvk $$1, ib $$2, epa $$3) {
      switch ((ih)$$0.c(b)) {
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

   private boolean a(cvk $$0, ib $$1, ih $$2) {
      dme $$3 = $$0.a_($$1);
      return $$3.d($$0, $$1, $$2);
   }

   @Override
   protected boolean a(dme $$0, cwh $$1, ib $$2) {
      ih $$3 = $$0.c(b);
      return this.a($$1, $$2.a($$3.g()), $$3);
   }

   @Override
   protected dme a(dme $$0, ih $$1, dme $$2, cwf $$3, ib $$4, ib $$5) {
      if ($$1.g() == $$0.c(b) && !$$0.a($$3, $$4)) {
         return czh.a.o();
      } else {
         if ($$0.c(c)) {
            $$3.a($$4, ehs.c, ehs.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Nullable
   @Override
   public dme a(crx $$0) {
      if (!$$0.c()) {
         dme $$1 = $$0.q().a_($$0.a().a($$0.k().g()));
         if ($$1.a(this) && $$1.c(b) == $$0.k()) {
            return null;
         }
      }

      dme $$2 = this.o();
      cwh $$3 = $$0.q();
      ib $$4 = $$0.a();
      ehr $$5 = $$0.q().b_($$0.a());

      for (ih $$6 : $$0.f()) {
         if ($$6.o().d()) {
            $$2 = $$2.a(b, $$6.g());
            if ($$2.a($$3, $$4)) {
               return $$2.a(c, Boolean.valueOf($$5.a() == ehs.c));
            }
         }
      }

      return null;
   }

   @Override
   protected dme a(dme $$0, dfr $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dme a(dme $$0, deb $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dmf.a<czf, dme> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected ehr c_(dme $$0) {
      return $$0.c(c) ? ehs.c.a(false) : super.c_($$0);
   }
}
