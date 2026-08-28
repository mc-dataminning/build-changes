import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class ddt extends dej implements ctp {
   public static final dsr a = dsq.w;
   private final dlz.a b;

   public ddt(dlz.a $$0, drz.d $$1) {
      super($$1);
      this.b = $$0;
      this.k(this.E.b().a(a, Boolean.valueOf(false)));
   }

   @Override
   protected abstract MapCodec<? extends ddt> a();

   @Override
   public dpf a(iz $$0, dsa $$1) {
      return new dqr($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpf> dpg<T> a(dbw $$0, dsa $$1, dph<T> $$2) {
      if ($$0.B) {
         boolean $$3 = $$1.a(dez.gO) || $$1.a(dez.gP) || $$1.a(dez.gQ) || $$1.a(dez.gR);
         if ($$3) {
            return a($$2, dph.p, dqr::a);
         }
      }

      return null;
   }

   public dlz.a b() {
      return this.b;
   }

   @Override
   protected boolean a(dsa $$0, eoi $$1) {
      return false;
   }

   @Override
   public bsz m() {
      return bsz.f;
   }

   @Override
   protected void a(dsb.a<dex, dsa> $$0) {
      $$0.a(a);
   }

   @Override
   public dsa a(cxy $$0) {
      return this.o().a(a, Boolean.valueOf($$0.q().C($$0.a())));
   }

   @Override
   protected void a(dsa $$0, dbw $$1, iz $$2, dex $$3, iz $$4, boolean $$5) {
      if (!$$1.B) {
         boolean $$6 = $$1.C($$2);
         if ($$6 != $$0.c(a)) {
            $$1.a($$2, $$0.a(a, Boolean.valueOf($$6)), 2);
         }
      }
   }
}
