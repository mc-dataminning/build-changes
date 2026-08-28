import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dqt extends dqs {
   public static final MapCodec<dqt> h = b(dqt::new);
   public static final dyr<jm> i = doj.aF;
   public static final dyl j = dqs.d;

   @Override
   public MapCodec<dqt> a() {
      return h;
   }

   protected dqt(dxt.d $$0) {
      super($$0);
      this.l(this.F.b().b(i, jm.c).b(j, Boolean.valueOf(true)));
   }

   @Override
   protected fcr a(dxu $$0, dgm $$1, jh $$2, fcc $$3) {
      return dtq.o($$0);
   }

   @Override
   protected boolean a(dxu $$0, dhk $$1, jh $$2) {
      return dtq.b($$1, $$2, $$0.c(i));
   }

   @Override
   protected dxu a(dxu $$0, dhk $$1, dhw $$2, jh $$3, jm $$4, jh $$5, dxu $$6, bam $$7) {
      return $$4.g() == $$0.c(i) && !$$0.a($$1, $$3) ? dkn.a.m() : $$0;
   }

   @Nullable
   @Override
   public dxu a(dbf $$0) {
      dxu $$1 = dkn.cx.a($$0);
      return $$1 == null ? null : this.m().b(i, $$1.c(i));
   }

   @Override
   public void a(dxu $$0, dhh $$1, jh $$2, bam $$3) {
      if ($$0.c(j)) {
         jm $$4 = $$0.c(i).g();
         double $$5 = 0.27;
         double $$6 = (double)$$2.u() + 0.5 + ($$3.j() - 0.5) * 0.2 + 0.27 * (double)$$4.j();
         double $$7 = (double)$$2.v() + 0.7 + ($$3.j() - 0.5) * 0.2 + 0.22;
         double $$8 = (double)$$2.w() + 0.5 + ($$3.j() - 0.5) * 0.2 + 0.27 * (double)$$4.l();
         $$1.a(ln.b, $$6, $$7, $$8, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected boolean a(dhh $$0, jh $$1, dxu $$2) {
      jm $$3 = $$2.c(i).g();
      return $$0.b($$1.a($$3), $$3);
   }

   @Override
   protected int a(dxu $$0, dgm $$1, jh $$2, jm $$3) {
      return $$0.c(j) && $$0.c(i) != $$3 ? 15 : 0;
   }

   @Override
   protected dxu a(dxu $$0, drb $$1) {
      return $$0.b(i, $$1.a($$0.c(i)));
   }

   @Override
   protected dxu a(dxu $$0, dpk $$1) {
      return $$0.a($$1.a($$0.c(i)));
   }

   @Override
   protected void a(dxv.a<dkl, dxu> $$0) {
      $$0.a(i, j);
   }

   @Nullable
   @Override
   protected eve a(dhh $$0, dxu $$1) {
      return eva.a($$0, $$1.c(i).g(), jm.b);
   }
}
