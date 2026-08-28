import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class ddv extends del implements ctr {
   public static final dst a = dss.w;
   private final dmb.a b;

   public ddv(dmb.a $$0, dsb.d $$1) {
      super($$1);
      this.b = $$0;
      this.k(this.E.b().a(a, Boolean.valueOf(false)));
   }

   @Override
   protected abstract MapCodec<? extends ddv> a();

   @Override
   public dph a(iz $$0, dsc $$1) {
      return new dqt($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dph> dpi<T> a(dby $$0, dsc $$1, dpj<T> $$2) {
      if ($$0.B) {
         boolean $$3 = $$1.a(dfb.gO) || $$1.a(dfb.gP) || $$1.a(dfb.gQ) || $$1.a(dfb.gR);
         if ($$3) {
            return a($$2, dpj.p, dqt::a);
         }
      }

      return null;
   }

   public dmb.a b() {
      return this.b;
   }

   @Override
   protected boolean a(dsc $$0, eok $$1) {
      return false;
   }

   @Override
   public btb m() {
      return btb.f;
   }

   @Override
   protected void a(dsd.a<dez, dsc> $$0) {
      $$0.a(a);
   }

   @Override
   public dsc a(cya $$0) {
      return this.o().a(a, Boolean.valueOf($$0.q().C($$0.a())));
   }

   @Override
   protected void a(dsc $$0, dby $$1, iz $$2, dez $$3, iz $$4, boolean $$5) {
      if (!$$1.B) {
         boolean $$6 = $$1.C($$2);
         if ($$6 != $$0.c(a)) {
            $$1.a($$2, $$0.a(a, Boolean.valueOf($$6)), 2);
         }
      }
   }
}
