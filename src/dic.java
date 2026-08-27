import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dic extends dib {
   public static final MapCodec<dic> h = b(dic::new);
   public static final dpt i = dft.aE;
   public static final dpq j = dib.d;

   @Override
   public MapCodec<dic> a() {
      return h;
   }

   protected dic(doy.d $$0) {
      super($$0);
      this.k(this.E.b().a(i, ih.c).a(j, Boolean.valueOf(true)));
   }

   @Override
   public String g() {
      return this.p().a();
   }

   @Override
   protected est a(doz $$0, cyd $$1, ib $$2, esf $$3) {
      return dkz.m($$0);
   }

   @Override
   protected boolean a(doz $$0, cza $$1, ib $$2) {
      return dkz.b($$1, $$2, $$0.c(i));
   }

   @Override
   protected doz a(doz $$0, ih $$1, doz $$2, cyy $$3, ib $$4, ib $$5) {
      return $$1.g() == $$0.c(i) && !$$0.a($$3, $$4) ? dca.a.n() : $$0;
   }

   @Nullable
   @Override
   public doz a(cuo $$0) {
      doz $$1 = dca.cq.a($$0);
      return $$1 == null ? null : this.n().a(i, $$1.c(i));
   }

   @Override
   public void a(doz $$0, cyx $$1, ib $$2, axr $$3) {
      if ($$0.c(j)) {
         ih $$4 = $$0.c(i).g();
         double $$5 = 0.27;
         double $$6 = (double)$$2.u() + 0.5 + ($$3.j() - 0.5) * 0.2 + 0.27 * (double)$$4.j();
         double $$7 = (double)$$2.v() + 0.7 + ($$3.j() - 0.5) * 0.2 + 0.22;
         double $$8 = (double)$$2.w() + 0.5 + ($$3.j() - 0.5) * 0.2 + 0.27 * (double)$$4.l();
         $$1.a(kf.b, $$6, $$7, $$8, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected boolean a(cyx $$0, ib $$1, doz $$2) {
      ih $$3 = $$2.c(i).g();
      return $$0.b($$1.a($$3), $$3);
   }

   @Override
   protected int a(doz $$0, cyd $$1, ib $$2, ih $$3) {
      return $$0.c(j) && $$0.c(i) != $$3 ? 15 : 0;
   }

   @Override
   protected doz a(doz $$0, dik $$1) {
      return $$0.a(i, $$1.a($$0.c(i)));
   }

   @Override
   protected doz a(doz $$0, dgu $$1) {
      return $$0.a($$1.a($$0.c(i)));
   }

   @Override
   protected void a(dpa.a<dby, doz> $$0) {
      $$0.a(i, j);
   }
}
