import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dca extends dcq implements csb {
   public static final dqy a = dqx.w;
   private final dkg.a b;

   public dca(dkg.a $$0, dqg.d $$1) {
      super($$1);
      this.b = $$0;
      this.k(this.E.b().a(a, Boolean.valueOf(false)));
   }

   @Override
   protected abstract MapCodec<? extends dca> a();

   @Override
   public dnm a(in $$0, dqh $$1) {
      return new doy($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dnm> dnn<T> a(dad $$0, dqh $$1, dno<T> $$2) {
      if ($$0.B) {
         boolean $$3 = $$1.a(ddg.gO) || $$1.a(ddg.gP) || $$1.a(ddg.gQ) || $$1.a(ddg.gR);
         if ($$3) {
            return a($$2, dno.p, doy::a);
         }
      }

      return null;
   }

   public dkg.a b() {
      return this.b;
   }

   @Override
   protected boolean a(dqh $$0, emp $$1) {
      return false;
   }

   @Override
   public bro k() {
      return bro.f;
   }

   @Override
   protected void a(dqi.a<dde, dqh> $$0) {
      $$0.a(a);
   }

   @Override
   public dqh a(cwi $$0) {
      return this.n().a(a, Boolean.valueOf($$0.q().C($$0.a())));
   }

   @Override
   protected void a(dqh $$0, dad $$1, in $$2, dde $$3, in $$4, boolean $$5) {
      if (!$$1.B) {
         boolean $$6 = $$1.C($$2);
         if ($$6 != $$0.c(a)) {
            $$1.a($$2, $$0.a(a, Boolean.valueOf($$6)), 2);
         }
      }
   }
}
