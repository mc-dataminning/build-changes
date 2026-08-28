import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class ddu extends dek implements ctq {
   public static final dss a = dsr.w;
   private final dma.a b;

   public ddu(dma.a $$0, dsa.d $$1) {
      super($$1);
      this.b = $$0;
      this.k(this.E.b().a(a, Boolean.valueOf(false)));
   }

   @Override
   protected abstract MapCodec<? extends ddu> a();

   @Override
   public dpg a(iz $$0, dsb $$1) {
      return new dqs($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpg> dph<T> a(dbx $$0, dsb $$1, dpi<T> $$2) {
      if ($$0.B) {
         boolean $$3 = $$1.a(dfa.gO) || $$1.a(dfa.gP) || $$1.a(dfa.gQ) || $$1.a(dfa.gR);
         if ($$3) {
            return a($$2, dpi.p, dqs::a);
         }
      }

      return null;
   }

   public dma.a b() {
      return this.b;
   }

   @Override
   protected boolean a(dsb $$0, eoj $$1) {
      return false;
   }

   @Override
   public bta m() {
      return bta.f;
   }

   @Override
   protected void a(dsc.a<dey, dsb> $$0) {
      $$0.a(a);
   }

   @Override
   public dsb a(cxz $$0) {
      return this.o().a(a, Boolean.valueOf($$0.q().C($$0.a())));
   }

   @Override
   protected void a(dsb $$0, dbx $$1, iz $$2, dey $$3, iz $$4, boolean $$5) {
      if (!$$1.B) {
         boolean $$6 = $$1.C($$2);
         if ($$6 != $$0.c(a)) {
            $$1.a($$2, $$0.a(a, Boolean.valueOf($$6)), 2);
         }
      }
   }
}
