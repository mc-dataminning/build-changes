import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dkj extends djq {
   public static final MapCodec<dkj> a = b(dkj::new);
   public static final dye[] b = new dye[]{dyd.k, dyd.l, dyd.m};
   protected static final fcm c = fcj.a(dke.a(1.0, 0.0, 1.0, 15.0, 2.0, 15.0), dke.a(7.0, 0.0, 7.0, 9.0, 14.0, 9.0));

   @Override
   public MapCodec<dkj> a() {
      return a;
   }

   public dkj(dxm.d $$0) {
      super($$0);
      this.l(this.F.b().b(b[0], Boolean.valueOf(false)).b(b[1], Boolean.valueOf(false)).b(b[2], Boolean.valueOf(false)));
   }

   @Override
   protected dqn a_(dxn $$0) {
      return dqn.c;
   }

   @Override
   public dup a(jh $$0, dxn $$1) {
      return new dus($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dup> duq<T> a(dha $$0, dxn $$1, dur<T> $$2) {
      return $$0.C ? null : a($$2, dur.m, dus::a);
   }

   @Override
   protected fcm a(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
      return c;
   }

   @Override
   protected bte a(dxn $$0, dha $$1, jh $$2, cps $$3, fbo $$4) {
      if (!$$1.C && $$1.c_($$2) instanceof dus $$5) {
         $$3.a($$5);
         $$3.a(axp.aa);
      }

      return bte.a;
   }

   @Override
   public void a(dxn $$0, dha $$1, jh $$2, bam $$3) {
      double $$4 = (double)$$2.u() + 0.4 + (double)$$3.i() * 0.2;
      double $$5 = (double)$$2.v() + 0.7 + (double)$$3.i() * 0.3;
      double $$6 = (double)$$2.w() + 0.4 + (double)$$3.i() * 0.2;
      $$1.a(ls.af, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   @Override
   protected void a(dxn $$0, dha $$1, jh $$2, dxn $$3, boolean $$4) {
      bta.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected boolean c_(dxn $$0) {
      return true;
   }

   @Override
   protected int a(dxn $$0, dha $$1, jh $$2) {
      return csx.a($$1.c_($$2));
   }

   @Override
   protected void a(dxo.a<dke, dxn> $$0) {
      $$0.a(b[0], b[1], b[2]);
   }

   @Override
   protected boolean a(dxn $$0, eue $$1) {
      return false;
   }
}
