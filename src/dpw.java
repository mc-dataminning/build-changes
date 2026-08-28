import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dpw extends dpv {
   public static final MapCodec<dpw> h = b(dpw::new);
   public static final dxu<jn> i = dnk.aF;
   public static final dxo j = dpv.d;

   @Override
   public MapCodec<dpw> a() {
      return h;
   }

   protected dpw(dww.d $$0) {
      super($$0);
      this.l(this.F.b().b(i, jn.c).b(j, Boolean.valueOf(true)));
   }

   @Override
   protected fbu a(dwx $$0, dfn $$1, ji $$2, fbf $$3) {
      return dst.o($$0);
   }

   @Override
   protected boolean a(dwx $$0, dgl $$1, ji $$2) {
      return dst.b($$1, $$2, $$0.c(i));
   }

   @Override
   protected dwx a(dwx $$0, dgl $$1, dgx $$2, ji $$3, jn $$4, ji $$5, dwx $$6, azh $$7) {
      return $$4.g() == $$0.c(i) && !$$0.a($$1, $$3) ? djo.a.m() : $$0;
   }

   @Nullable
   @Override
   public dwx a(dag $$0) {
      dwx $$1 = djo.cx.a($$0);
      return $$1 == null ? null : this.m().b(i, $$1.c(i));
   }

   @Override
   public void a(dwx $$0, dgi $$1, ji $$2, azh $$3) {
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
   protected boolean a(dgi $$0, ji $$1, dwx $$2) {
      jn $$3 = $$2.c(i).g();
      return $$0.b($$1.a($$3), $$3);
   }

   @Override
   protected int a(dwx $$0, dfn $$1, ji $$2, jn $$3) {
      return $$0.c(j) && $$0.c(i) != $$3 ? 15 : 0;
   }

   @Override
   protected dwx a(dwx $$0, dqe $$1) {
      return $$0.b(i, $$1.a($$0.c(i)));
   }

   @Override
   protected dwx a(dwx $$0, dol $$1) {
      return $$0.a($$1.a($$0.c(i)));
   }

   @Override
   protected void a(dwy.a<djm, dwx> $$0) {
      $$0.a(i, j);
   }

   @Nullable
   @Override
   protected euh a(dgi $$0, dwx $$1) {
      return eud.a($$0, $$1.c(i).g(), jn.b);
   }
}
