import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dqm extends dql {
   public static final MapCodec<dqm> h = b(dqm::new);
   public static final dyk<jm> i = doc.aF;
   public static final dye j = dql.d;

   @Override
   public MapCodec<dqm> a() {
      return h;
   }

   protected dqm(dxm.d $$0) {
      super($$0);
      this.l(this.F.b().b(i, jm.c).b(j, Boolean.valueOf(true)));
   }

   @Override
   protected fcm a(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
      return dtj.o($$0);
   }

   @Override
   protected boolean a(dxn $$0, dhd $$1, jh $$2) {
      return dtj.b($$1, $$2, $$0.c(i));
   }

   @Override
   protected dxn a(dxn $$0, dhd $$1, dhp $$2, jh $$3, jm $$4, jh $$5, dxn $$6, bam $$7) {
      return $$4.g() == $$0.c(i) && !$$0.a($$1, $$3) ? dkg.a.m() : $$0;
   }

   @Nullable
   @Override
   public dxn a(dbb $$0) {
      dxn $$1 = dkg.cx.a($$0);
      return $$1 == null ? null : this.m().b(i, $$1.c(i));
   }

   @Override
   public void a(dxn $$0, dha $$1, jh $$2, bam $$3) {
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
   protected boolean a(dha $$0, jh $$1, dxn $$2) {
      jm $$3 = $$2.c(i).g();
      return $$0.b($$1.a($$3), $$3);
   }

   @Override
   protected int a(dxn $$0, dgf $$1, jh $$2, jm $$3) {
      return $$0.c(j) && $$0.c(i) != $$3 ? 15 : 0;
   }

   @Override
   protected dxn a(dxn $$0, dqu $$1) {
      return $$0.b(i, $$1.a($$0.c(i)));
   }

   @Override
   protected dxn a(dxn $$0, dpd $$1) {
      return $$0.a($$1.a($$0.c(i)));
   }

   @Override
   protected void a(dxo.a<dke, dxn> $$0) {
      $$0.a(i, j);
   }

   @Nullable
   @Override
   protected eux a(dha $$0, dxn $$1) {
      return eut.a($$0, $$1.c(i).g(), jm.b);
   }
}
