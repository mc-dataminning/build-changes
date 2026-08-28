import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dpx extends dpw {
   public static final MapCodec<dpx> h = b(dpx::new);
   public static final dxv<jn> i = dnl.aF;
   public static final dxp j = dpw.d;

   @Override
   public MapCodec<dpx> a() {
      return h;
   }

   protected dpx(dwx.d $$0) {
      super($$0);
      this.l(this.F.b().b(i, jn.c).b(j, Boolean.valueOf(true)));
   }

   @Override
   protected fbv a(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
      return dsu.o($$0);
   }

   @Override
   protected boolean a(dwy $$0, dgm $$1, ji $$2) {
      return dsu.b($$1, $$2, $$0.c(i));
   }

   @Override
   protected dwy a(dwy $$0, dgm $$1, dgy $$2, ji $$3, jn $$4, ji $$5, dwy $$6, azh $$7) {
      return $$4.g() == $$0.c(i) && !$$0.a($$1, $$3) ? djp.a.m() : $$0;
   }

   @Nullable
   @Override
   public dwy a(dah $$0) {
      dwy $$1 = djp.cx.a($$0);
      return $$1 == null ? null : this.m().b(i, $$1.c(i));
   }

   @Override
   public void a(dwy $$0, dgj $$1, ji $$2, azh $$3) {
      if ($$0.c(j)) {
         jn $$4 = $$0.c(i).g();
         double $$5 = 0.27;
         double $$6 = (double)$$2.u() + 0.5 + ($$3.j() - 0.5) * 0.2 + 0.27 * (double)$$4.j();
         double $$7 = (double)$$2.v() + 0.7 + ($$3.j() - 0.5) * 0.2 + 0.22;
         double $$8 = (double)$$2.w() + 0.5 + ($$3.j() - 0.5) * 0.2 + 0.27 * (double)$$4.l();
         $$1.a(lo.b, $$6, $$7, $$8, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected boolean a(dgj $$0, ji $$1, dwy $$2) {
      jn $$3 = $$2.c(i).g();
      return $$0.b($$1.a($$3), $$3);
   }

   @Override
   protected int a(dwy $$0, dfo $$1, ji $$2, jn $$3) {
      return $$0.c(j) && $$0.c(i) != $$3 ? 15 : 0;
   }

   @Override
   protected dwy a(dwy $$0, dqf $$1) {
      return $$0.b(i, $$1.a($$0.c(i)));
   }

   @Override
   protected dwy a(dwy $$0, dom $$1) {
      return $$0.a($$1.a($$0.c(i)));
   }

   @Override
   protected void a(dwz.a<djn, dwy> $$0) {
      $$0.a(i, j);
   }

   @Nullable
   @Override
   protected eui a(dgj $$0, dwy $$1) {
      return eue.a($$0, $$1.c(i).g(), jn.b);
   }
}
