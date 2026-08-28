import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dqn extends dqm {
   public static final MapCodec<dqn> h = b(dqn::new);
   public static final dyl<jm> i = dob.aF;
   public static final dyf j = dqm.d;

   @Override
   public MapCodec<dqn> a() {
      return h;
   }

   protected dqn(dxn.d $$0) {
      super($$0);
      this.l(this.F.b().b(i, jm.c).b(j, Boolean.valueOf(true)));
   }

   @Override
   protected fcl a(dxo $$0, dge $$1, jh $$2, fbw $$3) {
      return dtk.o($$0);
   }

   @Override
   protected boolean a(dxo $$0, dhc $$1, jh $$2) {
      return dtk.b($$1, $$2, $$0.c(i));
   }

   @Override
   protected dxo a(dxo $$0, dhc $$1, dho $$2, jh $$3, jm $$4, jh $$5, dxo $$6, bac $$7) {
      return $$4.g() == $$0.c(i) && !$$0.a($$1, $$3) ? dkf.a.m() : $$0;
   }

   @Nullable
   @Override
   public dxo a(dax $$0) {
      dxo $$1 = dkf.cx.a($$0);
      return $$1 == null ? null : this.m().b(i, $$1.c(i));
   }

   @Override
   public void a(dxo $$0, dgz $$1, jh $$2, bac $$3) {
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
   protected boolean a(dgz $$0, jh $$1, dxo $$2) {
      jm $$3 = $$2.c(i).g();
      return $$0.b($$1.a($$3), $$3);
   }

   @Override
   protected int a(dxo $$0, dge $$1, jh $$2, jm $$3) {
      return $$0.c(j) && $$0.c(i) != $$3 ? 15 : 0;
   }

   @Override
   protected dxo a(dxo $$0, dqv $$1) {
      return $$0.b(i, $$1.a($$0.c(i)));
   }

   @Override
   protected dxo a(dxo $$0, dpc $$1) {
      return $$0.a($$1.a($$0.c(i)));
   }

   @Override
   protected void a(dxp.a<dkd, dxo> $$0) {
      $$0.a(i, j);
   }

   @Nullable
   @Override
   protected euy a(dgz $$0, dxo $$1) {
      return euu.a($$0, $$1.c(i).g(), jm.b);
   }
}
