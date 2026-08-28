import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dji extends djy {
   public static final dym a = dyl.x;
   private final drr.a b;

   public dji(drr.a $$0, dxu.d $$1) {
      super($$1);
      this.b = $$0;
      this.l(this.F.b().b(a, Boolean.valueOf(false)));
   }

   @Override
   protected abstract MapCodec<? extends dji> a();

   @Override
   public dux a(jh $$0, dxv $$1) {
      return new dwm($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dux> duy<T> a(dhi $$0, dxv $$1, duz<T> $$2) {
      if ($$0.C) {
         boolean $$3 = $$1.a(dko.he) || $$1.a(dko.hf) || $$1.a(dko.hg) || $$1.a(dko.hh);
         if ($$3) {
            return a($$2, duz.q, dwm::a);
         }
      }

      return null;
   }

   public drr.a b() {
      return this.b;
   }

   @Override
   protected boolean a(dxv $$0, eum $$1) {
      return false;
   }

   @Override
   protected void a(dxw.a<dkm, dxv> $$0) {
      $$0.a(a);
   }

   @Override
   public dxv a(dbg $$0) {
      return this.m().b(a, Boolean.valueOf($$0.q().C($$0.a())));
   }

   @Override
   protected void a(dxv $$0, dhi $$1, jh $$2, dkm $$3, @Nullable evf $$4, boolean $$5) {
      if (!$$1.C) {
         boolean $$6 = $$1.C($$2);
         if ($$6 != $$0.c(a)) {
            $$1.a($$2, $$0.b(a, Boolean.valueOf($$6)), 2);
         }
      }
   }
}
