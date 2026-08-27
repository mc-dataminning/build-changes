import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class ddc extends dha implements ddh, dkf {
   public static final MapCodec<ddc> a = b(ddc::new);
   private static final dqy f = dqx.C;
   private static final int g = 6;
   protected static final eui b = dde.a(5.0, 0.0, 9.0, 11.0, 16.0, 15.0);
   protected static final eui c = dde.a(5.0, 0.0, 1.0, 11.0, 16.0, 7.0);
   protected static final eui d = dde.a(1.0, 0.0, 5.0, 7.0, 16.0, 11.0);
   protected static final eui e = dde.a(9.0, 0.0, 5.0, 15.0, 16.0, 11.0);

   @Override
   public MapCodec<ddc> a() {
      return a;
   }

   protected ddc(dqg.d $$0) {
      super($$0);
      this.k(this.E.b().a(f, Boolean.valueOf(false)).a(aE, is.c));
   }

   @Override
   protected eui a(dqh $$0, czj $$1, in $$2, etu $$3) {
      switch ((is)$$0.c(aE)) {
         case d:
            return c;
         case c:
         default:
            return b;
         case e:
            return e;
         case f:
            return d;
      }
   }

   @Override
   protected void a(dqi.a<dde, dqh> $$0) {
      $$0.a(f, aE);
   }

   @Override
   protected ema b_(dqh $$0) {
      return $$0.c(f) ? emb.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dqh $$0, dag $$1, in $$2) {
      in $$3 = $$2.d();
      dqh $$4 = $$1.a_($$3);
      dqh $$5 = $$1.a_($$2.c());
      return ($$4.a(this) || $$4.a(avr.by)) && ($$5.a(this) || $$5.a(ddg.sD));
   }

   protected static boolean a(dae $$0, in $$1, ema $$2, is $$3) {
      dqh $$4 = ddg.sE.n().a(f, Boolean.valueOf($$2.a(emb.c))).a(aE, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   protected dqh a(dqh $$0, is $$1, dqh $$2, dae $$3, in $$4, in $$5) {
      if (($$1 == is.a || $$1 == is.b) && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      if ($$0.c(f)) {
         $$3.a($$4, emb.c, emb.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dqh $$0, aqh $$1, in $$2, ayg $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   public boolean b(dag $$0, in $$1, dqh $$2) {
      Optional<in> $$3 = l.a($$0, $$1, $$2.b(), is.b, ddg.sD);
      if ($$3.isEmpty()) {
         return false;
      } else {
         in $$4 = $$3.get().c();
         dqh $$5 = $$0.a_($$4);
         return ddb.a($$0, $$4, $$5);
      }
   }

   @Override
   public boolean a(dad $$0, ayg $$1, in $$2, dqh $$3) {
      return true;
   }

   @Override
   public void a(aqh $$0, ayg $$1, in $$2, dqh $$3) {
      Optional<in> $$4 = l.a($$0, $$2, $$3.b(), is.b, ddg.sD);
      if (!$$4.isEmpty()) {
         in $$5 = $$4.get();
         in $$6 = $$5.c();
         is $$7 = $$3.c(aE);
         a($$0, $$5, $$0.b_($$5), $$7);
         ddb.a($$0, $$6, $$0.b_($$6), $$7);
      }
   }

   @Override
   public csz a(dag $$0, in $$1, dqh $$2) {
      return new csz(ddg.sD);
   }
}
