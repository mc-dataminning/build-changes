import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class ddx extends den implements ctt {
   public static final dsv a = dsu.w;
   private final dmd.a b;

   public ddx(dmd.a $$0, dsd.d $$1) {
      super($$1);
      this.b = $$0;
      this.k(this.E.b().a(a, Boolean.valueOf(false)));
   }

   @Override
   protected abstract MapCodec<? extends ddx> a();

   @Override
   public dpj a(iz $$0, dse $$1) {
      return new dqv($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpj> dpk<T> a(dca $$0, dse $$1, dpl<T> $$2) {
      if ($$0.B) {
         boolean $$3 = $$1.a(dfd.gO) || $$1.a(dfd.gP) || $$1.a(dfd.gQ) || $$1.a(dfd.gR);
         if ($$3) {
            return a($$2, dpl.p, dqv::a);
         }
      }

      return null;
   }

   public dmd.a b() {
      return this.b;
   }

   @Override
   protected boolean a(dse $$0, eom $$1) {
      return false;
   }

   @Override
   public btd m() {
      return btd.f;
   }

   @Override
   protected void a(dsf.a<dfb, dse> $$0) {
      $$0.a(a);
   }

   @Override
   public dse a(cyc $$0) {
      return this.o().a(a, Boolean.valueOf($$0.q().C($$0.a())));
   }

   @Override
   protected void a(dse $$0, dca $$1, iz $$2, dfb $$3, iz $$4, boolean $$5) {
      if (!$$1.B) {
         boolean $$6 = $$1.C($$2);
         if ($$6 != $$0.c(a)) {
            $$1.a($$2, $$0.a(a, Boolean.valueOf($$6)), 2);
         }
      }
   }
}
