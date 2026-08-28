import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dee extends deu implements ctf {
   public static final dtc a = dtb.w;
   private final dmk.a b;

   public dee(dmk.a $$0, dsk.d $$1) {
      super($$1);
      this.b = $$0;
      this.k(this.E.b().a(a, Boolean.valueOf(false)));
   }

   @Override
   protected abstract MapCodec<? extends dee> a();

   @Override
   public dpq a(ja $$0, dsl $$1) {
      return new drd($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpq> dpr<T> a(dcg $$0, dsl $$1, dps<T> $$2) {
      if ($$0.B) {
         boolean $$3 = $$1.a(dfk.gO) || $$1.a(dfk.gP) || $$1.a(dfk.gQ) || $$1.a(dfk.gR);
         if ($$3) {
            return a($$2, dps.p, drd::a);
         }
      }

      return null;
   }

   public dmk.a b() {
      return this.b;
   }

   @Override
   protected boolean a(dsl $$0, eoy $$1) {
      return false;
   }

   @Override
   public bso m() {
      return bso.f;
   }

   @Override
   protected void a(dsm.a<dfi, dsl> $$0) {
      $$0.a(a);
   }

   @Override
   public dsl a(cxn $$0) {
      return this.o().a(a, Boolean.valueOf($$0.q().C($$0.a())));
   }

   @Override
   protected void a(dsl $$0, dcg $$1, ja $$2, dfi $$3, ja $$4, boolean $$5) {
      if (!$$1.B) {
         boolean $$6 = $$1.C($$2);
         if ($$6 != $$0.c(a)) {
            $$1.a($$2, $$0.a(a, Boolean.valueOf($$6)), 2);
         }
      }
   }
}
