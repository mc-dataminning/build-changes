import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dgj extends dbn implements czi, dgf {
   public static final MapCodec<dgj> c = b(dgj::new);
   private static final dmv g = dmu.C;
   public static final dmy d = dmu.R;
   protected static final float e = 6.0F;
   protected static final epo f = czf.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<dgj> a() {
      return c;
   }

   public dgj(dmd.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dna.b).a(g, Boolean.valueOf(false)).a(d, ih.c));
   }

   @Override
   protected epo a(dme $$0, cvk $$1, ib $$2, epa $$3) {
      return f;
   }

   @Override
   protected boolean b(dme $$0, cvk $$1, ib $$2) {
      return $$0.a(aue.bw) || $$1.b_($$2.c()).a(ehs.c) && super.b($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public dme a(crx $$0) {
      dme $$1 = super.a($$0);
      return $$1 != null ? c($$0.q(), $$0.a(), $$1.a(d, $$0.g().g())) : null;
   }

   @Override
   public void a(cwe $$0, ib $$1, dme $$2, box $$3, cpq $$4) {
      if (!$$0.y_()) {
         ib $$5 = $$1.c();
         dme $$6 = dbn.c($$0, $$5, this.o().a(b, dna.a).a(d, $$2.c(d)));
         $$0.a($$5, $$6, 3);
      }
   }

   @Override
   protected ehr c_(dme $$0) {
      return $$0.c(g) ? ehs.c.a(false) : super.c_($$0);
   }

   @Override
   protected boolean a(dme $$0, cwh $$1, ib $$2) {
      if ($$0.c(b) == dna.a) {
         return super.a($$0, $$1, $$2);
      } else {
         ib $$3 = $$2.d();
         dme $$4 = $$1.a_($$3);
         return this.b($$4, $$1, $$3);
      }
   }

   @Override
   protected dme a(dme $$0, ih $$1, dme $$2, cwf $$3, ib $$4, ib $$5) {
      if ($$0.c(g)) {
         $$3.a($$4, ehs.c, ehs.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dmf.a<czf, dme> $$0) {
      $$0.a(b, g, d);
   }

   @Override
   public boolean b(cwh $$0, ib $$1, dme $$2) {
      return true;
   }

   @Override
   public boolean a(cwe $$0, awt $$1, ib $$2, dme $$3) {
      return true;
   }

   @Override
   public void a(apa $$0, awt $$1, ib $$2, dme $$3) {
      if ($$3.c(dbn.b) == dna.b) {
         ib $$4 = $$2.c();
         $$0.a($$4, $$0.b_($$4).g(), 18);
         czc.a($$0, $$1, $$2, $$3.c(d));
      } else {
         ib $$5 = $$2.d();
         this.a($$0, $$1, $$5, $$0.a_($$5));
      }
   }

   @Override
   protected dme a(dme $$0, dfr $$1) {
      return $$0.a(d, $$1.a($$0.c(d)));
   }

   @Override
   protected dme a(dme $$0, deb $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected float ax_() {
      return 0.1F;
   }
}
