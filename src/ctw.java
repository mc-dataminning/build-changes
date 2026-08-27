import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class ctw extends cum implements ckk {
   public static final dhz a = dhy.w;
   private final dcb.a b;

   public ctw(dcb.a $$0, dhh.d $$1) {
      super($$1);
      this.b = $$0;
      this.k(this.E.b().a(a, Boolean.valueOf(false)));
   }

   @Override
   protected abstract MapCodec<? extends ctw> a();

   @Override
   public dfd a(ht $$0, dhi $$1) {
      return new dgo($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dfd> dfe<T> a(csa $$0, dhi $$1, dff<T> $$2) {
      if ($$0.B) {
         boolean $$3 = $$1.a(cvc.gO) || $$1.a(cvc.gP) || $$1.a(cvc.gQ) || $$1.a(cvc.gR);
         if ($$3) {
            return a($$2, dff.p, dgo::a);
         }
      }

      return null;
   }

   public dcb.a b() {
      return this.b;
   }

   @Override
   public boolean a(dhi $$0, crg $$1, ht $$2, edi $$3) {
      return false;
   }

   @Override
   public bkv g() {
      return bkv.f;
   }

   @Override
   protected void a(dhj.a<cva, dhi> $$0) {
      $$0.a(a);
   }

   @Override
   public dhi a(cnr $$0) {
      return this.o().a(a, Boolean.valueOf($$0.q().B($$0.a())));
   }

   @Override
   public void a(dhi $$0, csa $$1, ht $$2, cva $$3, ht $$4, boolean $$5) {
      if (!$$1.B) {
         boolean $$6 = $$1.B($$2);
         if ($$6 != $$0.c(a)) {
            $$1.a($$2, $$0.a(a, Boolean.valueOf($$6)), 2);
         }
      }
   }
}
