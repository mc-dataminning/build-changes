import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dfy extends cyr implements dgf {
   public static final MapCodec<dfy> a = b(dfy::new);
   public static final dmv b = dmu.F;
   public static final dmv c = dmu.C;
   public static final dmv d = dmu.G;
   protected static final epo e = czf.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final double f = e.c(ih.a.b);

   @Override
   public MapCodec<dfy> a() {
      return a;
   }

   public dfy(dmd.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dmf.a<czf, dme> $$0) {
      $$0.a(b);
      $$0.a(c);
      $$0.a(d);
   }

   @Override
   public void a(cwe $$0, ib $$1, dme $$2, bof $$3) {
      if ($$0 instanceof apa $$4) {
         apb $$5 = dks.a($$3);
         if ($$5 != null) {
            $$4.a($$1, djn.L).ifPresent($$2x -> $$2x.a($$4, $$5));
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dme $$0, cwe $$1, ib $$2, dme $$3, boolean $$4) {
      if ($$1 instanceof apa $$5 && $$0.c(b) && !$$0.a($$3.b())) {
         $$5.a($$2, djn.L).ifPresent($$1x -> $$1x.a($$5));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(dme $$0, apa $$1, ib $$2, awt $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf(false)), 3);
         $$1.a($$2, djn.L).ifPresent($$1x -> $$1x.a($$1));
      }
   }

   @Override
   protected dfk b_(dme $$0) {
      return dfk.c;
   }

   @Override
   protected epo b(dme $$0, cvk $$1, ib $$2, epa $$3) {
      return e;
   }

   @Override
   protected epo f(dme $$0, cvk $$1, ib $$2) {
      return e;
   }

   @Override
   protected boolean g_(dme $$0) {
      return true;
   }

   @Nullable
   @Override
   public djl a(ib $$0, dme $$1) {
      return new dks($$0, $$1);
   }

   @Override
   protected dme a(dme $$0, ih $$1, dme $$2, cwf $$3, ib $$4, ib $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, ehs.c, ehs.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public dme a(crx $$0) {
      return this.o().a(c, Boolean.valueOf($$0.q().b_($$0.a()).a() == ehs.c));
   }

   @Override
   protected ehr c_(dme $$0) {
      return $$0.c(c) ? ehs.c.a(false) : super.c_($$0);
   }

   @Override
   protected void a(dme $$0, apa $$1, ib $$2, cpq $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, bln.a(5));
      }
   }

   @Nullable
   @Override
   public <T extends djl> djm<T> a(cwe $$0, dme $$1, djn<T> $$2) {
      return !$$0.B ? cyr.a($$2, djn.L, ($$0x, $$1x, $$2x, $$3) -> dra.c.a($$0x, $$3.gn(), $$3.go())) : null;
   }
}
