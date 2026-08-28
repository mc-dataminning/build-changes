import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dpu extends dpt {
   public static final MapCodec<dpu> h = b(dpu::new);
   public static final dxs<jn> i = dni.aF;
   public static final dxm j = dpt.d;

   @Override
   public MapCodec<dpu> a() {
      return h;
   }

   protected dpu(dwu.d $$0) {
      super($$0);
      this.l(this.F.b().b(i, jn.c).b(j, Boolean.valueOf(true)));
   }

   @Override
   protected fbs a(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
      return dsr.o($$0);
   }

   @Override
   protected boolean a(dwv $$0, dgj $$1, ji $$2) {
      return dsr.b($$1, $$2, $$0.c(i));
   }

   @Override
   protected dwv a(dwv $$0, dgj $$1, dgv $$2, ji $$3, jn $$4, ji $$5, dwv $$6, azg $$7) {
      return $$4.g() == $$0.c(i) && !$$0.a($$1, $$3) ? djm.a.m() : $$0;
   }

   @Nullable
   @Override
   public dwv a(dae $$0) {
      dwv $$1 = djm.cx.a($$0);
      return $$1 == null ? null : this.m().b(i, $$1.c(i));
   }

   @Override
   public void a(dwv $$0, dgg $$1, ji $$2, azg $$3) {
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
   protected boolean a(dgg $$0, ji $$1, dwv $$2) {
      jn $$3 = $$2.c(i).g();
      return $$0.b($$1.a($$3), $$3);
   }

   @Override
   protected int a(dwv $$0, dfl $$1, ji $$2, jn $$3) {
      return $$0.c(j) && $$0.c(i) != $$3 ? 15 : 0;
   }

   @Override
   protected dwv a(dwv $$0, dqc $$1) {
      return $$0.b(i, $$1.a($$0.c(i)));
   }

   @Override
   protected dwv a(dwv $$0, doj $$1) {
      return $$0.a($$1.a($$0.c(i)));
   }

   @Override
   protected void a(dww.a<djk, dwv> $$0) {
      $$0.a(i, j);
   }

   @Nullable
   @Override
   protected euf a(dgg $$0, dwv $$1) {
      return eub.a($$0, $$1.c(i).g(), jn.b);
   }
}
