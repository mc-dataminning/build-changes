import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dsr extends dsq {
   public static final MapCodec<dsr> f = b(dsr::new);
   public static final ebf<ja> g = dqg.e;
   public static final eay h = dsq.b;

   @Override
   public MapCodec<dsr> a() {
      return f;
   }

   protected dsr(eag.d $$0) {
      super($$0);
      this.l(this.C.b().b(g, ja.c).b(h, Boolean.valueOf(true)));
   }

   @Override
   protected ffk a(eah $$0, dig $$1, iu $$2, fev $$3) {
      return dvy.o($$0);
   }

   @Override
   protected boolean a(eah $$0, djd $$1, iu $$2) {
      return dvy.b($$1, $$2, $$0.c(g));
   }

   @Override
   protected eah a(eah $$0, djd $$1, djp $$2, iu $$3, ja $$4, iu $$5, eah $$6, azv $$7) {
      return $$4.g() == $$0.c(g) && !$$0.a($$1, $$3) ? dmh.a.m() : $$0;
   }

   @Nullable
   @Override
   public eah a(dcw $$0) {
      eah $$1 = dmh.cA.a($$0);
      return $$1 == null ? null : this.m().b(g, $$1.c(g));
   }

   @Override
   public void a(eah $$0, dja $$1, iu $$2, azv $$3) {
      if ($$0.c(h)) {
         ja $$4 = $$0.c(g).g();
         double $$5 = 0.27;
         double $$6 = (double)$$2.u() + 0.5 + ($$3.j() - 0.5) * 0.2 + 0.27 * (double)$$4.j();
         double $$7 = (double)$$2.v() + 0.7 + ($$3.j() - 0.5) * 0.2 + 0.22;
         double $$8 = (double)$$2.w() + 0.5 + ($$3.j() - 0.5) * 0.2 + 0.27 * (double)$$4.l();
         $$1.a(ls.b, $$6, $$7, $$8, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected boolean a(dja $$0, iu $$1, eah $$2) {
      ja $$3 = $$2.c(g).g();
      return $$0.b($$1.a($$3), $$3);
   }

   @Override
   protected int a(eah $$0, dig $$1, iu $$2, ja $$3) {
      return $$0.c(h) && $$0.c(g) != $$3 ? 15 : 0;
   }

   @Override
   protected eah a(eah $$0, dsz $$1) {
      return $$0.b(g, $$1.a($$0.c(g)));
   }

   @Override
   protected eah a(eah $$0, dri $$1) {
      return $$0.a($$1.a($$0.c(g)));
   }

   @Override
   protected void a(eai.a<dmf, eah> $$0) {
      $$0.a(g, h);
   }

   @Nullable
   @Override
   protected exw a(dja $$0, eah $$1) {
      return exs.a($$0, $$1.c(g).g(), ja.b);
   }
}
