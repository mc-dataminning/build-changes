import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dqu extends dqt {
   public static final MapCodec<dqu> h = b(dqu::new);
   public static final dys<jm> i = dok.aF;
   public static final dym j = dqt.d;

   @Override
   public MapCodec<dqu> a() {
      return h;
   }

   protected dqu(dxu.d $$0) {
      super($$0);
      this.l(this.F.b().b(i, jm.c).b(j, Boolean.valueOf(true)));
   }

   @Override
   protected fcs a(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
      return dtr.o($$0);
   }

   @Override
   protected boolean a(dxv $$0, dhl $$1, jh $$2) {
      return dtr.b($$1, $$2, $$0.c(i));
   }

   @Override
   protected dxv a(dxv $$0, dhl $$1, dhx $$2, jh $$3, jm $$4, jh $$5, dxv $$6, bam $$7) {
      return $$4.g() == $$0.c(i) && !$$0.a($$1, $$3) ? dko.a.m() : $$0;
   }

   @Nullable
   @Override
   public dxv a(dbg $$0) {
      dxv $$1 = dko.cx.a($$0);
      return $$1 == null ? null : this.m().b(i, $$1.c(i));
   }

   @Override
   public void a(dxv $$0, dhi $$1, jh $$2, bam $$3) {
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
   protected boolean a(dhi $$0, jh $$1, dxv $$2) {
      jm $$3 = $$2.c(i).g();
      return $$0.b($$1.a($$3), $$3);
   }

   @Override
   protected int a(dxv $$0, dgn $$1, jh $$2, jm $$3) {
      return $$0.c(j) && $$0.c(i) != $$3 ? 15 : 0;
   }

   @Override
   protected dxv a(dxv $$0, drc $$1) {
      return $$0.b(i, $$1.a($$0.c(i)));
   }

   @Override
   protected dxv a(dxv $$0, dpl $$1) {
      return $$0.a($$1.a($$0.c(i)));
   }

   @Override
   protected void a(dxw.a<dkm, dxv> $$0) {
      $$0.a(i, j);
   }

   @Nullable
   @Override
   protected evf a(dhi $$0, dxv $$1) {
      return evb.a($$0, $$1.c(i).g(), jm.b);
   }
}
