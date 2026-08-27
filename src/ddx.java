import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class ddx extends den implements cth {
   public static final dtt a = dts.w;
   private final dms.a b;

   public ddx(dms.a $$0, dtb.d $$1) {
      super($$1);
      this.b = $$0;
      this.k(this.E.b().a(a, Boolean.valueOf(false)));
   }

   @Override
   protected abstract MapCodec<? extends ddx> a();

   @Override
   public dqc a(ir $$0, dtc $$1) {
      return new drt($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dqc> dqd<T> a(dca $$0, dtc $$1, dqe<T> $$2) {
      if ($$0.C) {
         boolean $$3 = $$1.a(dfe.hI) || $$1.a(dfe.hJ) || $$1.a(dfe.hK) || $$1.a(dfe.hL);
         if ($$3) {
            return a($$2, dqe.q, drt::a);
         }
      }

      return null;
   }

   public dms.a b() {
      return this.b;
   }

   @Override
   protected boolean a(dtc $$0, ept $$1) {
      return false;
   }

   @Override
   public bsc k() {
      return bsc.f;
   }

   @Override
   protected void a(dtd.a<dfc, dtc> $$0) {
      $$0.a(a);
   }

   @Override
   public dtc a(cyd $$0) {
      return this.n().a(a, Boolean.valueOf($$0.q().C($$0.a())));
   }

   @Override
   protected void a(dtc $$0, dca $$1, ir $$2, dfc $$3, ir $$4, boolean $$5) {
      if (!$$1.C) {
         boolean $$6 = $$1.C($$2);
         if ($$6 != $$0.c(a)) {
            $$1.a($$2, $$0.a(a, Boolean.valueOf($$6)), 2);
         }
      }
   }
}
