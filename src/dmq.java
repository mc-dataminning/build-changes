import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dmq extends djp {
   public static final MapCodec<dmq> a = b(dmq::new);
   protected static final fcl b = dkd.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0);
   public static final List<jh> c = jh.a(-2, 0, -2, 2, 1, 2).filter($$0 -> Math.abs($$0.u()) == 2 || Math.abs($$0.w()) == 2).map(jh::j).toList();

   @Override
   public MapCodec<dmq> a() {
      return a;
   }

   protected dmq(dxn.d $$0) {
      super($$0);
   }

   public static boolean a(dgz $$0, jh $$1, jh $$2) {
      return $$0.a_($$1.a((kl)$$2)).a(axk.cy) && $$0.a_($$1.b($$2.u() / 2, $$2.v(), $$2.w() / 2)).a(axk.cz);
   }

   @Override
   protected boolean g_(dxo $$0) {
      return true;
   }

   @Override
   protected fcl a(dxo $$0, dge $$1, jh $$2, fbw $$3) {
      return b;
   }

   @Override
   public void a(dxo $$0, dgz $$1, jh $$2, bac $$3) {
      super.a($$0, $$1, $$2, $$3);

      for (jh $$4 : c) {
         if ($$3.a(16) == 0 && a($$1, $$2, $$4)) {
            $$1.a(
               ls.s,
               (double)$$2.u() + 0.5,
               (double)$$2.v() + 2.0,
               (double)$$2.w() + 0.5,
               (double)((float)$$4.u() + $$3.i()) - 0.5,
               (double)((float)$$4.v() - $$3.i() - 1.0F),
               (double)((float)$$4.w() + $$3.i()) - 0.5
            );
         }
      }
   }

   @Override
   protected dqo a_(dxo $$0) {
      return dqo.c;
   }

   @Override
   public duq a(jh $$0, dxo $$1) {
      return new dvm($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends duq> dur<T> a(dgz $$0, dxo $$1, dus<T> $$2) {
      return $$0.C ? a($$2, dus.n, dvm::a) : null;
   }

   @Override
   protected bta a(dxo $$0, dgz $$1, jh $$2, cpo $$3, fbn $$4) {
      if (!$$1.C) {
         $$3.a($$0.c($$1, $$2));
      }

      return bta.a;
   }

   @Nullable
   @Override
   protected btc b(dxo $$0, dgz $$1, jh $$2) {
      duq $$3 = $$1.c_($$2);
      if ($$3 instanceof dvm) {
         xk $$4 = ((btd)$$3).p_();
         return new bti(($$2x, $$3x, $$4x) -> new ctp($$2x, $$3x, ctg.a($$1, $$2)), $$4);
      } else {
         return null;
      }
   }

   @Override
   protected boolean a(dxo $$0, euf $$1) {
      return false;
   }
}
