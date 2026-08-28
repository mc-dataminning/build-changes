import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class ded extends det implements cte {
   public static final dtb a = dta.w;
   private final dmj.a b;

   public ded(dmj.a $$0, dsj.d $$1) {
      super($$1);
      this.b = $$0;
      this.k(this.E.b().a(a, Boolean.valueOf(false)));
   }

   @Override
   protected abstract MapCodec<? extends ded> a();

   @Override
   public dpp a(ja $$0, dsk $$1) {
      return new drc($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpp> dpq<T> a(dcf $$0, dsk $$1, dpr<T> $$2) {
      if ($$0.B) {
         boolean $$3 = $$1.a(dfj.gO) || $$1.a(dfj.gP) || $$1.a(dfj.gQ) || $$1.a(dfj.gR);
         if ($$3) {
            return a($$2, dpr.p, drc::a);
         }
      }

      return null;
   }

   public dmj.a b() {
      return this.b;
   }

   @Override
   protected boolean a(dsk $$0, eow $$1) {
      return false;
   }

   @Override
   public bsn m() {
      return bsn.f;
   }

   @Override
   protected void a(dsl.a<dfh, dsk> $$0) {
      $$0.a(a);
   }

   @Override
   public dsk a(cxm $$0) {
      return this.o().a(a, Boolean.valueOf($$0.q().C($$0.a())));
   }

   @Override
   protected void a(dsk $$0, dcf $$1, ja $$2, dfh $$3, ja $$4, boolean $$5) {
      if (!$$1.B) {
         boolean $$6 = $$1.C($$2);
         if ($$6 != $$0.c(a)) {
            $$1.a($$2, $$0.a(a, Boolean.valueOf($$6)), 2);
         }
      }
   }
}
