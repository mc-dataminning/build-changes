import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dgi extends dgy implements cuv {
   public static final dvj a = dvi.w;
   private final dop.a b;

   public dgi(dop.a $$0, dur.d $$1) {
      super($$1);
      this.b = $$0;
      this.l(this.F.b().b(a, Boolean.valueOf(false)));
   }

   @Override
   protected abstract MapCodec<? extends dgi> a();

   @Override
   public drv a(jf $$0, dus $$1) {
      return new dtj($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends drv> drw<T> a(dej $$0, dus $$1, drx<T> $$2) {
      if ($$0.B) {
         boolean $$3 = $$1.a(dho.gO) || $$1.a(dho.gP) || $$1.a(dho.gQ) || $$1.a(dho.gR);
         if ($$3) {
            return a($$2, drx.p, dtj::a);
         }
      }

      return null;
   }

   public dop.a b() {
      return this.b;
   }

   @Override
   protected boolean a(dus $$0, eri $$1) {
      return false;
   }

   @Override
   public btz l() {
      return btz.f;
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      $$0.a(a);
   }

   @Override
   public dus a(czn $$0) {
      return this.n().b(a, Boolean.valueOf($$0.q().C($$0.a())));
   }

   @Override
   protected void a(dus $$0, dej $$1, jf $$2, dhm $$3, @Nullable esb $$4, boolean $$5) {
      if (!$$1.B) {
         boolean $$6 = $$1.C($$2);
         if ($$6 != $$0.c(a)) {
            $$1.a($$2, $$0.b(a, Boolean.valueOf($$6)), 2);
         }
      }
   }
}
