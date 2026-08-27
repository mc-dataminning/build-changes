import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dfv extends dby<doh> implements dkf {
   public static final MapCodec<dfv> b = b(dfv::new);
   public static final drb c = dha.aE;
   public static final dqy d = dqx.C;
   protected static final eui e = dde.a(1.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   private static final wu f = wu.c("container.enderchest");

   @Override
   public MapCodec<dfv> a() {
      return b;
   }

   protected dfv(dqg.d $$0) {
      super($$0, () -> dno.d);
      this.k(this.E.b().a(c, is.c).a(d, Boolean.valueOf(false)));
   }

   @Override
   public dfl.c<? extends dnt> a(dqh $$0, dad $$1, in $$2, boolean $$3) {
      return dfl.b::b;
   }

   @Override
   protected eui a(dqh $$0, czj $$1, in $$2, etu $$3) {
      return e;
   }

   @Override
   protected djk a_(dqh $$0) {
      return djk.b;
   }

   @Override
   public dqh a(cwi $$0) {
      ema $$1 = $$0.q().b_($$0.a());
      return this.n().a(c, $$0.g().g()).a(d, Boolean.valueOf($$1.a() == emb.c));
   }

   @Override
   protected bpm a(dqh $$0, dad $$1, in $$2, clh $$3, etl $$4) {
      cpq $$5 = $$3.gn();
      dnm $$6 = $$1.c_($$2);
      if ($$5 != null && $$6 instanceof doh) {
         in $$7 = $$2.c();
         if ($$1.a_($$7).g($$1, $$7)) {
            return bpm.a($$1.B);
         } else if ($$1.B) {
            return bpm.a;
         } else {
            doh $$8 = (doh)$$6;
            $$5.a($$8);
            $$3.a(new bpw(($$1x, $$2x, $$3x) -> cok.a($$1x, $$2x, $$5), f));
            $$3.a(avm.aj);
            cjy.a($$3, true);
            return bpm.b;
         }
      } else {
         return bpm.a($$1.B);
      }
   }

   @Override
   public dnm a(in $$0, dqh $$1) {
      return new doh($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dnm> dnn<T> a(dad $$0, dqh $$1, dno<T> $$2) {
      return $$0.B ? a($$2, dno.d, doh::a) : null;
   }

   @Override
   public void a(dqh $$0, dad $$1, in $$2, ayg $$3) {
      for (int $$4 = 0; $$4 < 3; $$4++) {
         int $$5 = $$3.a(2) * 2 - 1;
         int $$6 = $$3.a(2) * 2 - 1;
         double $$7 = (double)$$2.u() + 0.5 + 0.25 * (double)$$5;
         double $$8 = (double)((float)$$2.v() + $$3.i());
         double $$9 = (double)$$2.w() + 0.5 + 0.25 * (double)$$6;
         double $$10 = (double)($$3.i() * (float)$$5);
         double $$11 = ((double)$$3.i() - 0.5) * 0.125;
         double $$12 = (double)($$3.i() * (float)$$6);
         $$1.a(kx.Z, $$7, $$8, $$9, $$10, $$11, $$12);
      }
   }

   @Override
   protected dqh a(dqh $$0, djr $$1) {
      return $$0.a(c, $$1.a($$0.c(c)));
   }

   @Override
   protected dqh a(dqh $$0, dib $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dqi.a<dde, dqh> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected ema b_(dqh $$0) {
      return $$0.c(d) ? emb.c.a(false) : super.b_($$0);
   }

   @Override
   protected dqh a(dqh $$0, is $$1, dqh $$2, dae $$3, in $$4, in $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, emb.c, emb.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dqh $$0, emp $$1) {
      return false;
   }

   @Override
   protected void a(dqh $$0, aqh $$1, in $$2, ayg $$3) {
      dnm $$4 = $$1.c_($$2);
      if ($$4 instanceof doh) {
         ((doh)$$4).b();
      }
   }
}
