import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dau extends dbk implements cql {
   public static final dpq a = dpp.w;
   private final diz.a b;

   public dau(diz.a $$0, doy.d $$1) {
      super($$1);
      this.b = $$0;
      this.k(this.E.b().a(a, Boolean.valueOf(false)));
   }

   @Override
   protected abstract MapCodec<? extends dau> a();

   @Override
   public dmf a(ib $$0, doz $$1) {
      return new dnr($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dmf> dmg<T> a(cyx $$0, doz $$1, dmh<T> $$2) {
      if ($$0.B) {
         boolean $$3 = $$1.a(dca.gO) || $$1.a(dca.gP) || $$1.a(dca.gQ) || $$1.a(dca.gR);
         if ($$3) {
            return a($$2, dmh.p, dnr::a);
         }
      }

      return null;
   }

   public diz.a b() {
      return this.b;
   }

   @Override
   protected boolean a(doz $$0, elh $$1) {
      return false;
   }

   @Override
   public bqc k() {
      return bqc.f;
   }

   @Override
   protected void a(dpa.a<dby, doz> $$0) {
      $$0.a(a);
   }

   @Override
   public doz a(cuo $$0) {
      return this.n().a(a, Boolean.valueOf($$0.q().C($$0.a())));
   }

   @Override
   protected void a(doz $$0, cyx $$1, ib $$2, dby $$3, ib $$4, boolean $$5) {
      if (!$$1.B) {
         boolean $$6 = $$1.C($$2);
         if ($$6 != $$0.c(a)) {
            $$1.a($$2, $$0.a(a, Boolean.valueOf($$6)), 2);
         }
      }
   }
}
