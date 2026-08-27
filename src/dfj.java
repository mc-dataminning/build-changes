import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dfj extends dfi {
   public static final MapCodec<dfj> h = b(dfj::new);
   public static final dmy i = dda.aE;
   public static final dmv j = dfi.d;

   @Override
   public MapCodec<dfj> a() {
      return h;
   }

   protected dfj(dmd.d $$0) {
      super($$0);
      this.k(this.E.b().a(i, ih.c).a(j, Boolean.valueOf(true)));
   }

   @Override
   public String g() {
      return this.l().a();
   }

   @Override
   protected epo a(dme $$0, cvk $$1, ib $$2, epa $$3) {
      return dig.m($$0);
   }

   @Override
   protected boolean a(dme $$0, cwh $$1, ib $$2) {
      return dig.b($$1, $$2, $$0.c(i));
   }

   @Override
   protected dme a(dme $$0, ih $$1, dme $$2, cwf $$3, ib $$4, ib $$5) {
      return $$1.g() == $$0.c(i) && !$$0.a($$3, $$4) ? czh.a.o() : $$0;
   }

   @Nullable
   @Override
   public dme a(crx $$0) {
      dme $$1 = czh.cq.a($$0);
      return $$1 == null ? null : this.o().a(i, $$1.c(i));
   }

   @Override
   public void a(dme $$0, cwe $$1, ib $$2, awt $$3) {
      if ($$0.c(j)) {
         ih $$4 = $$0.c(i).g();
         double $$5 = 0.27;
         double $$6 = (double)$$2.u() + 0.5 + ($$3.j() - 0.5) * 0.2 + 0.27 * (double)$$4.j();
         double $$7 = (double)$$2.v() + 0.7 + ($$3.j() - 0.5) * 0.2 + 0.22;
         double $$8 = (double)$$2.w() + 0.5 + ($$3.j() - 0.5) * 0.2 + 0.27 * (double)$$4.l();
         $$1.a(jv.b, $$6, $$7, $$8, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected boolean a(cwe $$0, ib $$1, dme $$2) {
      ih $$3 = $$2.c(i).g();
      return $$0.b($$1.a($$3), $$3);
   }

   @Override
   protected int a(dme $$0, cvk $$1, ib $$2, ih $$3) {
      return $$0.c(j) && $$0.c(i) != $$3 ? 15 : 0;
   }

   @Override
   protected dme a(dme $$0, dfr $$1) {
      return $$0.a(i, $$1.a($$0.c(i)));
   }

   @Override
   protected dme a(dme $$0, deb $$1) {
      return $$0.a($$1.a($$0.c(i)));
   }

   @Override
   protected void a(dmf.a<czf, dme> $$0) {
      $$0.a(i, j);
   }
}
