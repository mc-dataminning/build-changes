import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class dff extends djd implements dfk, dmi {
   public static final MapCodec<dff> a = b(dff::new);
   private static final dtb f = dta.C;
   private static final int g = 6;
   protected static final ewy b = dfh.a(5.0, 0.0, 9.0, 11.0, 16.0, 15.0);
   protected static final ewy c = dfh.a(5.0, 0.0, 1.0, 11.0, 16.0, 7.0);
   protected static final ewy d = dfh.a(1.0, 0.0, 5.0, 7.0, 16.0, 11.0);
   protected static final ewy e = dfh.a(9.0, 0.0, 5.0, 15.0, 16.0, 11.0);

   @Override
   public MapCodec<dff> a() {
      return a;
   }

   protected dff(dsj.d $$0) {
      super($$0);
      this.k(this.E.b().a(f, Boolean.valueOf(false)).a(aE, jf.c));
   }

   @Override
   protected ewy a(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
      switch ((jf)$$0.c(aE)) {
         case d:
            return c;
         case c:
         default:
            return b;
         case e:
            return e;
         case f:
            return d;
      }
   }

   @Override
   protected void a(dsl.a<dfh, dsk> $$0) {
      $$0.a(f, aE);
   }

   @Override
   protected eoh b_(dsk $$0) {
      return $$0.c(f) ? eoi.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dsk $$0, dci $$1, ja $$2) {
      ja $$3 = $$2.d();
      dsk $$4 = $$1.a_($$3);
      dsk $$5 = $$1.a_($$2.c());
      return ($$4.a(this) || $$4.a(avw.by)) && ($$5.a(this) || $$5.a(dfj.sD));
   }

   protected static boolean a(dcg $$0, ja $$1, eoh $$2, jf $$3) {
      dsk $$4 = dfj.sE.o().a(f, Boolean.valueOf($$2.a(eoi.c))).a(aE, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   protected dsk a(dsk $$0, jf $$1, dsk $$2, dcg $$3, ja $$4, ja $$5) {
      if (($$1 == jf.a || $$1 == jf.b) && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      if ($$0.c(f)) {
         $$3.a($$4, eoi.c, eoi.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dsk $$0, aqm $$1, ja $$2, ayo $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   public boolean b(dci $$0, ja $$1, dsk $$2) {
      Optional<ja> $$3 = l.a($$0, $$1, $$2.b(), jf.b, dfj.sD);
      if ($$3.isEmpty()) {
         return false;
      } else {
         ja $$4 = $$3.get().c();
         dsk $$5 = $$0.a_($$4);
         return dfe.a($$0, $$4, $$5);
      }
   }

   @Override
   public boolean a(dcf $$0, ayo $$1, ja $$2, dsk $$3) {
      return true;
   }

   @Override
   public void a(aqm $$0, ayo $$1, ja $$2, dsk $$3) {
      Optional<ja> $$4 = l.a($$0, $$2, $$3.b(), jf.b, dfj.sD);
      if (!$$4.isEmpty()) {
         ja $$5 = $$4.get();
         ja $$6 = $$5.c();
         jf $$7 = $$3.c(aE);
         a($$0, $$5, $$0.b_($$5), $$7);
         dfe.a($$0, $$6, $$0.b_($$6), $$7);
      }
   }

   @Override
   public cuc a(dci $$0, ja $$1, dsk $$2) {
      return new cuc(dfj.sD);
   }
}
