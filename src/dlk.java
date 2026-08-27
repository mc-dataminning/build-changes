import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dlk extends dfm implements dhv {
   public static final MapCodec<dlk> c = b(dlk::new);
   public static final drf<drd> d = dfm.b;
   protected static final float e = 6.0F;
   protected static final eui f = dde.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);

   @Override
   public MapCodec<dlk> a() {
      return c;
   }

   public dlk(dqg.d $$0) {
      super($$0);
   }

   @Override
   protected eui a(dqh $$0, czj $$1, in $$2, etu $$3) {
      return f;
   }

   @Override
   protected boolean b(dqh $$0, czj $$1, in $$2) {
      return $$0.d($$1, $$2, is.b) && !$$0.a(ddg.kJ);
   }

   @Override
   public csz a(dag $$0, in $$1, dqh $$2) {
      return new csz(ddg.bw);
   }

   @Nullable
   @Override
   public dqh a(cwi $$0) {
      dqh $$1 = super.a($$0);
      if ($$1 != null) {
         ema $$2 = $$0.q().b_($$0.a().c());
         if ($$2.a(avw.a) && $$2.e() == 8) {
            return $$1;
         }
      }

      return null;
   }

   @Override
   protected boolean a(dqh $$0, dag $$1, in $$2) {
      if ($$0.c(d) == drd.a) {
         dqh $$3 = $$1.a_($$2.d());
         return $$3.a(this) && $$3.c(d) == drd.b;
      } else {
         ema $$4 = $$1.b_($$2);
         return super.a($$0, $$1, $$2) && $$4.a(avw.a) && $$4.e() == 8;
      }
   }

   @Override
   protected ema b_(dqh $$0) {
      return emb.c.a(false);
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
