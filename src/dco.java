import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dco extends dde implements dkf {
   public static final dqy d = dqx.C;
   private static final eui a = dde.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);

   protected dco(dqg.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, Boolean.valueOf(true)));
   }

   @Override
   protected abstract MapCodec<? extends dco> a();

   protected void a(dqh $$0, dae $$1, in $$2) {
      if (!e($$0, $$1, $$2)) {
         $$1.a($$2, this, 60 + $$1.E_().a(40));
      }
   }

   protected static boolean e(dqh $$0, czj $$1, in $$2) {
      if ($$0.c(d)) {
         return true;
      } else {
         for (is $$3 : is.values()) {
            if ($$1.b_($$2.a($$3)).a(avw.a)) {
               return true;
            }
         }

         return false;
      }
   }

   @Nullable
   @Override
   public dqh a(cwi $$0) {
      ema $$1 = $$0.q().b_($$0.a());
      return this.n().a(d, Boolean.valueOf($$1.a(avw.a) && $$1.e() == 8));
   }

   @Override
   protected eui a(dqh $$0, czj $$1, in $$2, etu $$3) {
      return a;
   }

   @Override
   protected dqh a(dqh $$0, is $$1, dqh $$2, dae $$3, in $$4, in $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, emb.c, emb.c.a($$3));
      }

      return $$1 == is.a && !this.a($$0, (dag)$$3, $$4) ? ddg.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dqh $$0, dag $$1, in $$2) {
      in $$3 = $$2.d();
      return $$1.a_($$3).d($$1, $$3, is.b);
   }

   @Override
   protected void a(dqi.a<dde, dqh> $$0) {
      $$0.a(d);
   }

   @Override
   protected ema b_(dqh $$0) {
      return $$0.c(d) ? emb.c.a(false) : super.b_($$0);
   }
}
