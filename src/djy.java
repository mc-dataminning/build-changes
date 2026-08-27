import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djy extends dcq implements dkf {
   public static final MapCodec<djy> a = b(djy::new);
   public static final dqy b = dqx.F;
   public static final dqy c = dqx.C;
   public static final dqy d = dqx.G;
   protected static final eui e = dde.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final double f = e.c(is.a.b);

   @Override
   public MapCodec<djy> a() {
      return a;
   }

   public djy(dqg.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dqi.a<dde, dqh> $$0) {
      $$0.a(b);
      $$0.a(c);
      $$0.a(d);
   }

   @Override
   public void a(dad $$0, in $$1, dqh $$2, brh $$3) {
      if ($$0 instanceof aqh $$4) {
         aqi $$5 = dou.a($$3);
         if ($$5 != null) {
            $$4.a($$1, dno.L).ifPresent($$2x -> $$2x.a($$4, $$5));
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dqh $$0, dad $$1, in $$2, dqh $$3, boolean $$4) {
      if ($$1 instanceof aqh $$5 && $$0.c(b) && !$$0.a($$3.b())) {
         $$5.a($$2, dno.L).ifPresent($$1x -> $$1x.a($$5));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(dqh $$0, aqh $$1, in $$2, ayg $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf(false)), 3);
         $$1.a($$2, dno.L).ifPresent($$1x -> $$1x.a($$1));
      }
   }

   @Override
   protected djk a_(dqh $$0) {
      return djk.c;
   }

   @Override
   protected eui b(dqh $$0, czj $$1, in $$2, etu $$3) {
      return e;
   }

   @Override
   protected eui f(dqh $$0, czj $$1, in $$2) {
      return e;
   }

   @Override
   protected boolean f_(dqh $$0) {
      return true;
   }

   @Nullable
   @Override
   public dnm a(in $$0, dqh $$1) {
      return new dou($$0, $$1);
   }

   @Override
   protected dqh a(dqh $$0, is $$1, dqh $$2, dae $$3, in $$4, in $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, emb.c, emb.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public dqh a(cwi $$0) {
      return this.n().a(c, Boolean.valueOf($$0.q().b_($$0.a()).a() == emb.c));
   }

   @Override
   protected ema b_(dqh $$0) {
      return $$0.c(c) ? emb.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(dqh $$0, aqh $$1, in $$2, csz $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, boo.a(5));
      }
   }

   @Nullable
   @Override
   public <T extends dnm> dnn<T> a(dad $$0, dqh $$1, dno<T> $$2) {
      return !$$0.B ? dcq.a($$2, dno.L, ($$0x, $$1x, $$2x, $$3) -> dvj.c.a($$0x, $$3.gr(), $$3.gs())) : null;
   }
}
