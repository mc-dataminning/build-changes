import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class cub extends cur implements ckp {
   public static final die a = did.w;
   private final dcg.a b;

   public cub(dcg.a $$0, dhm.d $$1) {
      super($$1);
      this.b = $$0;
      this.k(this.E.b().a(a, Boolean.valueOf(false)));
   }

   @Override
   protected abstract MapCodec<? extends cub> a();

   @Override
   public dfi a(hx $$0, dhn $$1) {
      return new dgt($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dfi> dfj<T> a(csf $$0, dhn $$1, dfk<T> $$2) {
      if ($$0.B) {
         boolean $$3 = $$1.a(cvh.gO) || $$1.a(cvh.gP) || $$1.a(cvh.gQ) || $$1.a(cvh.gR);
         if ($$3) {
            return a($$2, dfk.p, dgt::a);
         }
      }

      return null;
   }

   public dcg.a b() {
      return this.b;
   }

   @Override
   public boolean a(dhn $$0, crl $$1, hx $$2, edn $$3) {
      return false;
   }

   @Override
   public bla g() {
      return bla.f;
   }

   @Override
   protected void a(dho.a<cvf, dhn> $$0) {
      $$0.a(a);
   }

   @Override
   public dhn a(cnw $$0) {
      return this.o().a(a, Boolean.valueOf($$0.q().B($$0.a())));
   }

   @Override
   public void a(dhn $$0, csf $$1, hx $$2, cvf $$3, hx $$4, boolean $$5) {
      if (!$$1.B) {
         boolean $$6 = $$1.B($$2);
         if ($$6 != $$0.c(a)) {
            $$1.a($$2, $$0.a(a, Boolean.valueOf($$6)), 2);
         }
      }
   }
}
