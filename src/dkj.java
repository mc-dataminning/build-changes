import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dkj extends dfm implements ddh, dkf {
   public static final MapCodec<dkj> c = b(dkj::new);
   private static final dqy g = dqx.C;
   public static final drb d = dqx.R;
   protected static final float e = 6.0F;
   protected static final eui f = dde.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<dkj> a() {
      return c;
   }

   public dkj(dqg.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, drd.b).a(g, Boolean.valueOf(false)).a(d, is.c));
   }

   @Override
   protected eui a(dqh $$0, czj $$1, in $$2, etu $$3) {
      return f;
   }

   @Override
   protected boolean b(dqh $$0, czj $$1, in $$2) {
      return $$0.a(avr.bx) || $$1.b_($$2.c()).a(emb.c) && super.b($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public dqh a(cwi $$0) {
      dqh $$1 = super.a($$0);
      return $$1 != null ? c($$0.q(), $$0.a(), $$1.a(d, $$0.g().g())) : null;
   }

   @Override
   public void a(dad $$0, in $$1, dqh $$2, bsa $$3, csz $$4) {
      if (!$$0.x_()) {
         in $$5 = $$1.c();
         dqh $$6 = dfm.c($$0, $$5, this.n().a(b, drd.a).a(d, $$2.c(d)));
         $$0.a($$5, $$6, 3);
      }
   }

   @Override
   protected ema b_(dqh $$0) {
      return $$0.c(g) ? emb.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dqh $$0, dag $$1, in $$2) {
      if ($$0.c(b) == drd.a) {
         return super.a($$0, $$1, $$2);
      } else {
         in $$3 = $$2.d();
         dqh $$4 = $$1.a_($$3);
         return this.b($$4, $$1, $$3);
      }
   }

   @Override
   protected dqh a(dqh $$0, is $$1, dqh $$2, dae $$3, in $$4, in $$5) {
      if ($$0.c(g)) {
         $$3.a($$4, emb.c, emb.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dqi.a<dde, dqh> $$0) {
      $$0.a(b, g, d);
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
   public void a(aqh $$0, ayg $$1, in $$2, dqh $$3) {
      if ($$3.c(dfm.b) == drd.b) {
         in $$4 = $$2.c();
         $$0.a($$4, $$0.b_($$4).g(), 18);
         ddb.a($$0, $$1, $$2, $$3.c(d));
      } else {
         in $$5 = $$2.d();
         this.a($$0, $$1, $$5, $$0.a_($$5));
      }
   }

   @Override
   protected dqh a(dqh $$0, djr $$1) {
      return $$0.a(d, $$1.a($$0.c(d)));
   }

   @Override
   protected dqh a(dqh $$0, dib $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected float at_() {
      return 0.1F;
   }
}
