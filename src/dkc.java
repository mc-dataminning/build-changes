import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dkc extends ddn implements ddh, dhv {
   public static final MapCodec<dkc> a = b(dkc::new);
   protected static final float b = 6.0F;
   protected static final eui c = dde.a(2.0, 0.0, 2.0, 14.0, 12.0, 14.0);

   @Override
   public MapCodec<dkc> a() {
      return a;
   }

   protected dkc(dqg.d $$0) {
      super($$0);
   }

   @Override
   protected eui a(dqh $$0, czj $$1, in $$2, etu $$3) {
      return c;
   }

   @Override
   protected boolean b(dqh $$0, czj $$1, in $$2) {
      return $$0.d($$1, $$2, is.b) && !$$0.a(ddg.kJ);
   }

   @Nullable
   @Override
   public dqh a(cwi $$0) {
      ema $$1 = $$0.q().b_($$0.a());
      return $$1.a(avw.a) && $$1.e() == 8 ? super.a($$0) : null;
   }

   @Override
   protected dqh a(dqh $$0, is $$1, dqh $$2, dae $$3, in $$4, in $$5) {
      dqh $$6 = super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!$$6.i()) {
         $$3.a($$4, emb.c, emb.c.a($$3));
      }

      return $$6;
   }

   @Override
   public boolean b(dag $$0, in $$1, dqh $$2) {
      return true;
   }

   @Override
   public boolean a(dad $$0, ayg $$1, in $$2, dqh $$3) {
      return true;
   }

   @Override
   protected ema b_(dqh $$0) {
      return emb.c.a(false);
   }

   @Override
   public void a(aqh $$0, ayg $$1, in $$2, dqh $$3) {
      dqh $$4 = ddg.bx.n();
      dqh $$5 = $$4.a(dlk.d, drd.a);
      in $$6 = $$2.c();
      if ($$0.a_($$6).a(ddg.G)) {
         $$0.a($$2, $$4, 2);
         $$0.a($$6, $$5, 2);
      }
   }

   @Override
   public boolean a(@Nullable clh $$0, czj $$1, in $$2, dqh $$3, elz $$4) {
      return false;
   }

   @Override
   public boolean a(dae $$0, in $$1, dqh $$2, ema $$3) {
      return false;
   }
}
