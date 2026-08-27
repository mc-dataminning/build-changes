import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class cxo extends cye implements coe {
   public static final dma a = dlz.w;
   private final dft.a b;

   public cxo(dft.a $$0, dli.d $$1) {
      super($$1);
      this.b = $$0;
      this.k(this.E.b().a(a, Boolean.valueOf(false)));
   }

   @Override
   protected abstract MapCodec<? extends cxo> a();

   @Override
   public dix a(hz $$0, dlj $$1) {
      return new dki($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dix> diy<T> a(cvr $$0, dlj $$1, diz<T> $$2) {
      if ($$0.B) {
         boolean $$3 = $$1.a(cyu.gO) || $$1.a(cyu.gP) || $$1.a(cyu.gQ) || $$1.a(cyu.gR);
         if ($$3) {
            return a($$2, diz.p, dki::a);
         }
      }

      return null;
   }

   public dft.a b() {
      return this.b;
   }

   @Override
   protected boolean a(dlj $$0, cux $$1, hz $$2, ehm $$3) {
      return false;
   }

   @Override
   public bnx g() {
      return bnx.f;
   }

   @Override
   protected void a(dlk.a<cys, dlj> $$0) {
      $$0.a(a);
   }

   @Override
   public dlj a(crk $$0) {
      return this.o().a(a, Boolean.valueOf($$0.q().C($$0.a())));
   }

   @Override
   protected void a(dlj $$0, cvr $$1, hz $$2, cys $$3, hz $$4, boolean $$5) {
      if (!$$1.B) {
         boolean $$6 = $$1.C($$2);
         if ($$6 != $$0.c(a)) {
            $$1.a($$2, $$0.a(a, Boolean.valueOf($$6)), 2);
         }
      }
   }
}
