import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dcu extends ddk implements csq {
   public static final drs a = drr.w;
   private final dla.a b;

   public dcu(dla.a $$0, dra.d $$1) {
      super($$1);
      this.b = $$0;
      this.k(this.E.b().a(a, Boolean.valueOf(false)));
   }

   @Override
   protected abstract MapCodec<? extends dcu> a();

   @Override
   public dog a(io $$0, drb $$1) {
      return new dps($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dog> doh<T> a(dax $$0, drb $$1, doi<T> $$2) {
      if ($$0.B) {
         boolean $$3 = $$1.a(dea.gO) || $$1.a(dea.gP) || $$1.a(dea.gQ) || $$1.a(dea.gR);
         if ($$3) {
            return a($$2, doi.p, dps::a);
         }
      }

      return null;
   }

   public dla.a b() {
      return this.b;
   }

   @Override
   protected boolean a(drb $$0, enj $$1) {
      return false;
   }

   @Override
   public bsb l() {
      return bsb.f;
   }

   @Override
   protected void a(drc.a<ddy, drb> $$0) {
      $$0.a(a);
   }

   @Override
   public drb a(cwz $$0) {
      return this.n().a(a, Boolean.valueOf($$0.q().C($$0.a())));
   }

   @Override
   protected void a(drb $$0, dax $$1, io $$2, ddy $$3, io $$4, boolean $$5) {
      if (!$$1.B) {
         boolean $$6 = $$1.C($$2);
         if ($$6 != $$0.c(a)) {
            $$1.a($$2, $$0.a(a, Boolean.valueOf($$6)), 2);
         }
      }
   }
}
