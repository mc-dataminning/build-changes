import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class deb extends der implements ctc {
   public static final dsy a = dsx.w;
   private final dmh.a b;

   public deb(dmh.a $$0, dsg.d $$1) {
      super($$1);
      this.b = $$0;
      this.k(this.E.b().a(a, Boolean.valueOf(false)));
   }

   @Override
   protected abstract MapCodec<? extends deb> a();

   @Override
   public dpn a(ja $$0, dsh $$1) {
      return new dqz($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpn> dpo<T> a(dcd $$0, dsh $$1, dpp<T> $$2) {
      if ($$0.B) {
         boolean $$3 = $$1.a(dfh.gO) || $$1.a(dfh.gP) || $$1.a(dfh.gQ) || $$1.a(dfh.gR);
         if ($$3) {
            return a($$2, dpp.p, dqz::a);
         }
      }

      return null;
   }

   public dmh.a b() {
      return this.b;
   }

   @Override
   protected boolean a(dsh $$0, eoq $$1) {
      return false;
   }

   @Override
   public bsk m() {
      return bsk.f;
   }

   @Override
   protected void a(dsi.a<dff, dsh> $$0) {
      $$0.a(a);
   }

   @Override
   public dsh a(cxk $$0) {
      return this.o().a(a, Boolean.valueOf($$0.q().C($$0.a())));
   }

   @Override
   protected void a(dsh $$0, dcd $$1, ja $$2, dff $$3, ja $$4, boolean $$5) {
      if (!$$1.B) {
         boolean $$6 = $$1.C($$2);
         if ($$6 != $$0.c(a)) {
            $$1.a($$2, $$0.a(a, Boolean.valueOf($$6)), 2);
         }
      }
   }
}
