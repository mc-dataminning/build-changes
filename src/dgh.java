import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dgh extends czf implements dgf {
   public static final MapCodec<dgh> a = b(dgh::new);
   public static final dnc<dnm> b = dmu.bh;
   public static final dmv c = dmu.C;
   protected static final epo d = czf.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   protected static final epo e = czf.a(0.0, 8.0, 0.0, 16.0, 16.0, 16.0);

   @Override
   public MapCodec<? extends dgh> a() {
      return a;
   }

   public dgh(dmd.d $$0) {
      super($$0);
      this.k(this.o().a(b, dnm.b).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected boolean g_(dme $$0) {
      return $$0.c(b) != dnm.c;
   }

   @Override
   protected void a(dmf.a<czf, dme> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected epo a(dme $$0, cvk $$1, ib $$2, epa $$3) {
      dnm $$4 = $$0.c(b);
      switch ($$4) {
         case c:
            return epl.b();
         case a:
            return e;
         default:
            return d;
      }
   }

   @Nullable
   @Override
   public dme a(crx $$0) {
      ib $$1 = $$0.a();
      dme $$2 = $$0.q().a_($$1);
      if ($$2.a(this)) {
         return $$2.a(b, dnm.c).a(c, Boolean.valueOf(false));
      } else {
         ehr $$3 = $$0.q().b_($$1);
         dme $$4 = this.o().a(b, dnm.b).a(c, Boolean.valueOf($$3.a() == ehs.c));
         ih $$5 = $$0.k();
         return $$5 != ih.a && ($$5 == ih.b || !($$0.l().d - (double)$$1.v() > 0.5)) ? $$4 : $$4.a(b, dnm.a);
      }
   }

   @Override
   protected boolean a(dme $$0, crx $$1) {
      cpq $$2 = $$1.n();
      dnm $$3 = $$0.c(b);
      if ($$3 == dnm.c || !$$2.a(this.l())) {
         return false;
      } else if ($$1.c()) {
         boolean $$4 = $$1.l().d - (double)$$1.a().v() > 0.5;
         ih $$5 = $$1.k();
         return $$3 == dnm.b ? $$5 == ih.b || $$4 && $$5.o().d() : $$5 == ih.a || !$$4 && $$5.o().d();
      } else {
         return true;
      }
   }

   @Override
   protected ehr c_(dme $$0) {
      return $$0.c(c) ? ehs.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(cwf $$0, ib $$1, dme $$2, ehr $$3) {
      return $$2.c(b) != dnm.c ? dgf.super.a($$0, $$1, $$2, $$3) : false;
   }

   @Override
   public boolean a(@Nullable cia $$0, cvk $$1, ib $$2, dme $$3, ehq $$4) {
      return $$3.c(b) != dnm.c ? dgf.super.a($$0, $$1, $$2, $$3, $$4) : false;
   }

   @Override
   protected dme a(dme $$0, ih $$1, dme $$2, cwf $$3, ib $$4, ib $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, ehs.c, ehs.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dme $$0, cvk $$1, ib $$2, eih $$3) {
      switch ($$3) {
         case a:
            return false;
         case b:
            return $$1.b_($$2).a(auj.a);
         case c:
            return false;
         default:
            return false;
      }
   }
}
