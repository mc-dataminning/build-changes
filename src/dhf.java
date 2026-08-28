import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dhf extends dhv {
   public static final dwf a = dwe.w;
   private final dpl.a b;

   public dhf(dpl.a $$0, dvn.d $$1) {
      super($$1);
      this.b = $$0;
      this.l(this.F.b().b(a, Boolean.valueOf(false)));
   }

   @Override
   protected abstract MapCodec<? extends dhf> a();

   @Override
   public dsr a(jh $$0, dvo $$1) {
      return new duf($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dsr> dss<T> a(dff $$0, dvo $$1, dst<T> $$2) {
      if ($$0.C) {
         boolean $$3 = $$1.a(dil.gO) || $$1.a(dil.gP) || $$1.a(dil.gQ) || $$1.a(dil.gR);
         if ($$3) {
            return a($$2, dst.p, duf::a);
         }
      }

      return null;
   }

   public dpl.a b() {
      return this.b;
   }

   @Override
   protected boolean a(dvo $$0, esd $$1) {
      return false;
   }

   @Override
   protected void a(dvp.a<dij, dvo> $$0) {
      $$0.a(a);
   }

   @Override
   public dvo a(czw $$0) {
      return this.m().b(a, Boolean.valueOf($$0.q().C($$0.a())));
   }

   @Override
   protected void a(dvo $$0, dff $$1, jh $$2, dij $$3, @Nullable esw $$4, boolean $$5) {
      if (!$$1.C) {
         boolean $$6 = $$1.C($$2);
         if ($$6 != $$0.c(a)) {
            $$1.a($$2, $$0.b(a, Boolean.valueOf($$6)), 2);
         }
      }
   }
}
