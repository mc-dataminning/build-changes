import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dpv extends dpu {
   public static final MapCodec<dpv> h = b(dpv::new);
   public static final dxt<jn> i = dnj.aF;
   public static final dxn j = dpu.d;

   @Override
   public MapCodec<dpv> a() {
      return h;
   }

   protected dpv(dwv.d $$0) {
      super($$0);
      this.l(this.F.b().b(i, jn.c).b(j, Boolean.valueOf(true)));
   }

   @Override
   protected fbt a(dww $$0, dfm $$1, ji $$2, fbe $$3) {
      return dss.o($$0);
   }

   @Override
   protected boolean a(dww $$0, dgk $$1, ji $$2) {
      return dss.b($$1, $$2, $$0.c(i));
   }

   @Override
   protected dww a(dww $$0, dgk $$1, dgw $$2, ji $$3, jn $$4, ji $$5, dww $$6, azh $$7) {
      return $$4.g() == $$0.c(i) && !$$0.a($$1, $$3) ? djn.a.m() : $$0;
   }

   @Nullable
   @Override
   public dww a(daf $$0) {
      dww $$1 = djn.cx.a($$0);
      return $$1 == null ? null : this.m().b(i, $$1.c(i));
   }

   @Override
   public void a(dww $$0, dgh $$1, ji $$2, azh $$3) {
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
   protected boolean a(dgh $$0, ji $$1, dww $$2) {
      jn $$3 = $$2.c(i).g();
      return $$0.b($$1.a($$3), $$3);
   }

   @Override
   protected int a(dww $$0, dfm $$1, ji $$2, jn $$3) {
      return $$0.c(j) && $$0.c(i) != $$3 ? 15 : 0;
   }

   @Override
   protected dww a(dww $$0, dqd $$1) {
      return $$0.b(i, $$1.a($$0.c(i)));
   }

   @Override
   protected dww a(dww $$0, dok $$1) {
      return $$0.a($$1.a($$0.c(i)));
   }

   @Override
   protected void a(dwx.a<djl, dww> $$0) {
      $$0.a(i, j);
   }

   @Nullable
   @Override
   protected eug a(dgh $$0, dww $$1) {
      return euc.a($$0, $$1.c(i).g(), jn.b);
   }
}
