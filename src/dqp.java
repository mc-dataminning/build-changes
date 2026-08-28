import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dqp extends djw implements djp, dof {
   public static final MapCodec<dqp> a = b(dqp::new);
   protected static final float b = 6.0F;
   protected static final fbu c = djm.a(2.0, 0.0, 2.0, 14.0, 12.0, 14.0);

   @Override
   public MapCodec<dqp> a() {
      return a;
   }

   protected dqp(dww.d $$0) {
      super($$0);
   }

   @Override
   protected fbu a(dwx $$0, dfn $$1, ji $$2, fbf $$3) {
      return c;
   }

   @Override
   protected boolean b(dwx $$0, dfn $$1, ji $$2) {
      return $$0.c($$1, $$2, jn.b) && !$$0.a(djo.ll);
   }

   @Nullable
   @Override
   public dwx a(dag $$0) {
      esz $$1 = $$0.q().b_($$0.a());
      return $$1.a(awv.a) && $$1.e() == 8 ? super.a($$0) : null;
   }

   @Override
   protected dwx a(dwx $$0, dgl $$1, dgx $$2, ji $$3, jn $$4, ji $$5, dwx $$6, azh $$7) {
      dwx $$8 = super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      if (!$$8.l()) {
         $$2.a($$3, eta.c, eta.c.a($$1));
      }

      return $$8;
   }

   @Override
   public boolean a(dgl $$0, ji $$1, dwx $$2) {
      return $$0.a_($$1.d()).a(djo.J);
   }

   @Override
   public boolean a(dgi $$0, azh $$1, ji $$2, dwx $$3) {
      return true;
   }

   @Override
   protected esz b_(dwx $$0) {
      return eta.c.a(false);
   }

   @Override
   public void a(arc $$0, azh $$1, ji $$2, dwx $$3) {
      dwx $$4 = djo.bE.m();
      dwx $$5 = $$4.b(drx.d, dxs.a);
      ji $$6 = $$2.d();
      $$0.a($$2, $$4, 2);
      $$0.a($$6, $$5, 2);
   }

   @Override
   public boolean a(@Nullable cox $$0, dfn $$1, ji $$2, dwx $$3, esy $$4) {
      return false;
   }

   @Override
   public boolean a(dgj $$0, ji $$1, dwx $$2, esz $$3) {
      return false;
   }
}
