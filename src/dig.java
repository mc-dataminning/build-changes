import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dig extends diw {
   public static final dxm a = dxl.B;
   private final dqr.a b;

   public dig(dqr.a $$0, dwu.d $$1) {
      super($$1);
      this.b = $$0;
      this.l(this.F.b().b(a, Boolean.valueOf(false)));
   }

   @Override
   protected abstract MapCodec<? extends dig> a();

   @Override
   public dtx a(ji $$0, dwv $$1) {
      return new dvm($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dtx> dty<T> a(dgg $$0, dwv $$1, dtz<T> $$2) {
      if ($$0.C) {
         boolean $$3 = $$1.a(djm.hl) || $$1.a(djm.hm) || $$1.a(djm.hn) || $$1.a(djm.ho);
         if ($$3) {
            return a($$2, dtz.q, dvm::a);
         }
      }

      return null;
   }

   public dqr.a b() {
      return this.b;
   }

   @Override
   protected boolean a(dwv $$0, etm $$1) {
      return false;
   }

   @Override
   protected void a(dww.a<djk, dwv> $$0) {
      $$0.a(a);
   }

   @Override
   public dwv a(dae $$0) {
      return this.m().b(a, Boolean.valueOf($$0.q().C($$0.a())));
   }

   @Override
   protected void a(dwv $$0, dgg $$1, ji $$2, djk $$3, @Nullable euf $$4, boolean $$5) {
      if (!$$1.C) {
         boolean $$6 = $$1.C($$2);
         if ($$6 != $$0.c(a)) {
            $$1.a($$2, $$0.b(a, Boolean.valueOf($$6)), 2);
         }
      }
   }
}
