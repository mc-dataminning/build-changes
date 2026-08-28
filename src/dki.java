import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dki extends djp {
   public static final MapCodec<dki> a = b(dki::new);
   public static final dyf[] b = new dyf[]{dye.o, dye.p, dye.q};
   protected static final fcl c = fci.a(dkd.a(1.0, 0.0, 1.0, 15.0, 2.0, 15.0), dkd.a(7.0, 0.0, 7.0, 9.0, 14.0, 9.0));

   @Override
   public MapCodec<dki> a() {
      return a;
   }

   public dki(dxn.d $$0) {
      super($$0);
      this.l(this.F.b().b(b[0], Boolean.valueOf(false)).b(b[1], Boolean.valueOf(false)).b(b[2], Boolean.valueOf(false)));
   }

   @Override
   protected dqo a_(dxo $$0) {
      return dqo.c;
   }

   @Override
   public duq a(jh $$0, dxo $$1) {
      return new dut($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends duq> dur<T> a(dgz $$0, dxo $$1, dus<T> $$2) {
      return $$0.C ? null : a($$2, dus.m, dut::a);
   }

   @Override
   protected fcl a(dxo $$0, dge $$1, jh $$2, fbw $$3) {
      return c;
   }

   @Override
   protected bta a(dxo $$0, dgz $$1, jh $$2, cpo $$3, fbn $$4) {
      if (!$$1.C && $$1.c_($$2) instanceof dut $$5) {
         $$3.a($$5);
         $$3.a(axf.aa);
      }

      return bta.a;
   }

   @Override
   public void a(dxo $$0, dgz $$1, jh $$2, bac $$3) {
      double $$4 = (double)$$2.u() + 0.4 + (double)$$3.i() * 0.2;
      double $$5 = (double)$$2.v() + 0.7 + (double)$$3.i() * 0.3;
      double $$6 = (double)$$2.w() + 0.4 + (double)$$3.i() * 0.2;
      $$1.a(ls.ag, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   @Override
   protected void a(dxo $$0, dgz $$1, jh $$2, dxo $$3, boolean $$4) {
      bsw.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected boolean c_(dxo $$0) {
      return true;
   }

   @Override
   protected int a(dxo $$0, dgz $$1, jh $$2) {
      return cst.a($$1.c_($$2));
   }

   @Override
   protected void a(dxp.a<dkd, dxo> $$0) {
      $$0.a(b[0], b[1], b[2]);
   }

   @Override
   protected boolean a(dxo $$0, euf $$1) {
      return false;
   }
}
