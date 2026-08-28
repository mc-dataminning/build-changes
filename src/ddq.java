import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class ddq extends deg implements ctm {
   public static final dso a = dsn.w;
   private final dlw.a b;

   public ddq(dlw.a $$0, drw.d $$1) {
      super($$1);
      this.b = $$0;
      this.k(this.E.b().a(a, Boolean.valueOf(false)));
   }

   @Override
   protected abstract MapCodec<? extends ddq> a();

   @Override
   public dpc a(iz $$0, drx $$1) {
      return new dqo($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpc> dpd<T> a(dbt $$0, drx $$1, dpe<T> $$2) {
      if ($$0.B) {
         boolean $$3 = $$1.a(dew.gO) || $$1.a(dew.gP) || $$1.a(dew.gQ) || $$1.a(dew.gR);
         if ($$3) {
            return a($$2, dpe.p, dqo::a);
         }
      }

      return null;
   }

   public dlw.a b() {
      return this.b;
   }

   @Override
   protected boolean a(drx $$0, eof $$1) {
      return false;
   }

   @Override
   public bsw m() {
      return bsw.f;
   }

   @Override
   protected void a(dry.a<deu, drx> $$0) {
      $$0.a(a);
   }

   @Override
   public drx a(cxv $$0) {
      return this.n().a(a, Boolean.valueOf($$0.q().C($$0.a())));
   }

   @Override
   protected void a(drx $$0, dbt $$1, iz $$2, deu $$3, iz $$4, boolean $$5) {
      if (!$$1.B) {
         boolean $$6 = $$1.C($$2);
         if ($$6 != $$0.c(a)) {
            $$1.a($$2, $$0.a(a, Boolean.valueOf($$6)), 2);
         }
      }
   }
}
